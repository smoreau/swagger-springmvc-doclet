package com.logikdev.swagger.springmvcdoclet.apidocs;

import com.logikdev.swagger.springmvcdoclet.DocletOptions;
import com.logikdev.swagger.springmvcdoclet.Recorder;
import com.logikdev.swagger.springmvcdoclet.model.ApiDeclaration;
import com.logikdev.swagger.springmvcdoclet.parser.SpringMvcAnnotationParser;
import com.sun.javadoc.RootDoc;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static com.logikdev.swagger.springmvcdoclet.apidocs.FixtureLoader.loadFixture;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ObjectTest {

    private Recorder recorderMock;
    private DocletOptions options;

    @Before
    public void setup() {
        recorderMock = mock(Recorder.class);
        options = new DocletOptions().setRecorder(recorderMock);
    }

    @Test
    public void testStart() throws IOException {
        final RootDoc rootDoc = RootDocLoader.fromPath("src/test/resources", "fixtures.object");
        new SpringMvcAnnotationParser(options, rootDoc).run();

        List<String> primitives = Arrays.asList("object");
        for (String primitive : primitives) {
            final ApiDeclaration api = loadFixture("/fixtures/object/object.json", ApiDeclaration.class);
            verify(recorderMock).record(any(File.class), eq(api));
        }
    }

}
