package com.logikdev.swagger.springmvcdoclet;

import com.logikdev.swagger.springmvcdoclet.model.ApiDeclaration;
import com.logikdev.swagger.springmvcdoclet.model.ResourceListing;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public interface Recorder {
    void record(File file, ResourceListing listing) throws IOException;

    void record(File file, ApiDeclaration declaration) throws IOException;

    void record(File file, InputStream stream) throws IOException;
}
