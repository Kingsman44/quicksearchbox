package com.google.protobuf;

import java.io.OutputStream;

/* compiled from: PG */
public interface MessageLite extends C63001dt {
    C63010eb getParserForType();

    int getSerializedSize();

    C63000ds newBuilderForType();

    C63000ds toBuilder();

    byte[] toByteArray();

    C63088z toByteString();

    void writeDelimitedTo(OutputStream outputStream);

    void writeTo(C62906an anVar);

    void writeTo(OutputStream outputStream);
}
