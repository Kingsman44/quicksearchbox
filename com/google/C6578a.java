package com.google;

/* renamed from: com.google.a */
/* compiled from: PG */
public final class C6578a extends Exception {
    public C6578a(String str) {
        super(str);
    }

    public C6578a(Throwable th) {
        super("Attempted to instantiate a MessageDigest(SHA-512)", th);
    }
}
