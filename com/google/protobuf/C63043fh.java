package com.google.protobuf;

/* renamed from: com.google.protobuf.fh */
/* compiled from: PG */
public final class C63043fh extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public C63043fh() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public final C62974ct mo59085a() {
        return new C62974ct(getMessage());
    }
}
