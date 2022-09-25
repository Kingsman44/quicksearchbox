package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.aj */
/* compiled from: PG */
public final class C62902aj extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    C62902aj() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public C62902aj(String str) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)));
    }

    public C62902aj(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public C62902aj(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
