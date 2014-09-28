package com.logikdev.swagger.springmvcdoclet.model;

import com.sun.javadoc.AnnotationDesc;
import com.sun.javadoc.AnnotationDesc.ElementValuePair;
import com.sun.javadoc.AnnotationValue;
import com.sun.javadoc.MethodDoc;

public enum HttpMethod {
    GET("org.springframework.web.bind.annotation.RequestMethod.GET"),
    PUT("org.springframework.web.bind.annotation.RequestMethod.PUT"),
    POST("org.springframework.web.bind.annotation.RequestMethod.POST"),
    DELETE("org.springframework.web.bind.annotation.RequestMethod.DELETE");

    private static final String REQUEST_MAPPING = "org.springframework.web.bind.annotation.RequestMapping";
    private static final String REQUEST_MAPPING_METHOD = "org.springframework.web.bind.annotation.RequestMapping.method";
    private final String canonicalClassname;

    private HttpMethod(String canonicalClassname) {
        this.canonicalClassname = canonicalClassname;
    }
    
    private  static HttpMethod fromString(String methodString) {
    	HttpMethod found = null;
    	for (HttpMethod value : HttpMethod.values()) {
            if (value.canonicalClassname.equals(methodString)) {
                found = value;
                break;
            }
        }
        return found;
    }

    public static HttpMethod fromMethod(MethodDoc method) {
    	HttpMethod found = null;
    	for (AnnotationDesc annotation : method.annotations()) {
            if (REQUEST_MAPPING.equals(annotation.annotationType().qualifiedTypeName())) {
            	for (ElementValuePair pair : annotation.elementValues()) {
            		if (REQUEST_MAPPING_METHOD.equals(pair.element().qualifiedName())) {
            			AnnotationValue[] values = (AnnotationValue[]) pair.value().value();
                        found = fromString(values[0].value().toString());
            		}
            	}
            }
        }
    	return found;
    }
}
