package com.google.android.apps.search.soundsearch.p10654c;

/* renamed from: com.google.android.apps.search.soundsearch.c.b */
/* compiled from: PG */
public final class C141647b extends C141648c {

    /* renamed from: a */
    private final int f384466a;

    /* renamed from: b */
    private final String f384467b;

    public C141647b(String str) {
        this.f384466a = 0;
        this.f384467b = str;
    }

    public final String getMessage() {
        int i = this.f384466a;
        String str = this.f384467b;
        return "Error code from S3 gRPC = " + i + ", error message: " + str;
    }

    public C141647b(String str, int i) {
        this.f384466a = i;
        this.f384467b = str;
    }
}
