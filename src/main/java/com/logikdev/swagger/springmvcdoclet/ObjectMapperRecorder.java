package com.logikdev.swagger.springmvcdoclet;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.ByteStreams;
import com.logikdev.swagger.springmvcdoclet.model.ApiDeclaration;
import com.logikdev.swagger.springmvcdoclet.model.ResourceListing;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ObjectMapperRecorder implements Recorder {
    private final ObjectMapper mapper = new ObjectMapper();

    public ObjectMapperRecorder() {
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Override
    public void record(File file, ApiDeclaration declaration) throws IOException {
        mapper.writeValue(file, declaration);
    }

    @Override
    public void record(File file, ResourceListing listing) throws IOException {
        mapper.writeValue(file, listing);
    }

    @Override
    public void record(File file, InputStream stream) throws IOException {
        final FileOutputStream outputStream = new FileOutputStream(file);
        ByteStreams.copy(stream, outputStream);
        outputStream.flush();
        outputStream.close();
    }
}
