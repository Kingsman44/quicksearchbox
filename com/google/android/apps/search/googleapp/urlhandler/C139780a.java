package com.google.android.apps.search.googleapp.urlhandler;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.a */
/* compiled from: PG */
public final class C139780a extends RuntimeException {
    public C139780a() {
    }

    public C139780a(byte[] bArr) {
        super("Expected a redirect");
    }

    public C139780a(Throwable th) {
        super("Request failed", th);
    }
}
