package com.logikdev.swagger.springmvcdoclet.parser;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Predicate;
import com.logikdev.swagger.springmvcdoclet.DocletOptions;
import com.sun.javadoc.AnnotationDesc;
import com.sun.javadoc.AnnotationValue;
import com.sun.javadoc.Parameter;
import com.sun.javadoc.Type;

public class AnnotationHelper {
    private static final String SPRING_MVC_ANNOTATION_PACKAGE = "org.springframework.web.bind.annotation";
    private static final String SPRING_MVC_PATH = "org.springframework.web.bind.annotation.RequestMapping";      // @RequestMapping
    private static final String SPRING_MVC_PATH_PARAM = "org.springframework.web.bind.annotation.PathVariable";  // @PathVariable
    private static final String SPRING_MVC_QUERY_PARAM = "org.springframework.web.bind.annotation.RequestParam"; // @RequestParam
    private static final String JERSEY_MULTIPART_FORM_PARAM = "com.sun.jersey.multipart.FormDataParam";
    
    @SuppressWarnings("serial")
    static final List<String> PRIMITIVES = new ArrayList<String>() {{
        add("byte");
        add("boolean");
        add("int");
        add("long");
        add("float");
        add("double");
        add("string");
        add("Date");
    }};

    public static String parsePath(AnnotationDesc[] annotations) {
        for (AnnotationDesc annotationDesc : annotations) {
            if (annotationDesc.annotationType().qualifiedTypeName().equals(SPRING_MVC_PATH)) {
                for (AnnotationDesc.ElementValuePair pair : annotationDesc.elementValues()) {
                    if (pair.element().name().equals("value")) {
                    	AnnotationValue[] values = (AnnotationValue[]) pair.value().value();
                        String path = values[0].value().toString();
                        if (path.endsWith("/")) {
                            path = path.substring(0, path.length() - 1);
                        }
                        return path.isEmpty() || path.startsWith("/") ? path : "/" + path;
                    }
                }
            }
        }
        return null;
    }

    /**
     * Determines the String representation of the object Type.
     */
    public static String typeOf(String javaType) {
        String type;
        if (javaType.startsWith("java.lang.")) {
            int i = javaType.lastIndexOf(".");
            type = javaType.substring(i + 1).toLowerCase();
        } else if (PRIMITIVES.contains(javaType.toLowerCase())) {
            type = javaType.toLowerCase();
        } else if (javaType.equals("java.util.Date")) {
            type = "Date";
        } else {
            int i = javaType.lastIndexOf(".");
            if (i >= 0) {
                type = javaType.substring(i + 1);
            } else {
                type = javaType;
            }
        }
        if (type.equalsIgnoreCase("integer")) {
            type = "int";
        } else if (type.equalsIgnoreCase("arraylist") || type.equalsIgnoreCase("linkedlist")) {
            type = "List";
        }
        return type;
    }

    /**
     * Determines the string representation of the parameter type.
     */
    public static String paramTypeOf(Parameter parameter) {
        AnnotationParser p = new AnnotationParser(parameter);
        if(p.isAnnotatedBy(JERSEY_MULTIPART_FORM_PARAM)) {
        	return "form";
        } else if (p.isAnnotatedBy(SPRING_MVC_PATH_PARAM)) {
            return "path";
        } else if (p.isAnnotatedBy(SPRING_MVC_QUERY_PARAM)) {
            return "query";
        }
        return "body";
    }

    /**
     * Determines the string representation of the parameter name.
     */
    public static String paramNameOf(Parameter parameter) {
        // TODO (DL): make this part of Translator?
        AnnotationParser p = new AnnotationParser(parameter);
        String name = p.getAnnotationValue(SPRING_MVC_PATH_PARAM, "value");
        if (name == null) {
            name = p.getAnnotationValue(SPRING_MVC_QUERY_PARAM, "value");
        }
        if (name == null) {
            name = parameter.name();
        }
        return name;
    }

    public static boolean isPrimitive(Type type) {
        return PRIMITIVES.contains(typeOf(type.qualifiedTypeName()));
    }

    public static class ExcludedAnnotations implements Predicate<AnnotationDesc> {
        private final DocletOptions options;

        public ExcludedAnnotations(DocletOptions options) {
            this.options = options;
        }

        @Override
        public boolean apply(AnnotationDesc annotationDesc) {
            String annotationClass = annotationDesc.annotationType().qualifiedTypeName();
            return options.getExcludeAnnotationClasses().contains(annotationClass);
        }
    }

    public static class JaxRsAnnotations implements Predicate<AnnotationDesc> {
        @Override
        public boolean apply(AnnotationDesc annotationDesc) {
            String annotationClass = annotationDesc.annotationType().qualifiedTypeName();
            return annotationClass.startsWith(SPRING_MVC_ANNOTATION_PACKAGE);
        }
    }

}
