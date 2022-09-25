package com.google.android.apps.gsa.search.core.p6519al.p6662co;

import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.search.core.al.co.a */
/* compiled from: PG */
public final class C85152a extends C85166b {

    /* renamed from: a */
    private final Exception f230879a;

    /* renamed from: b */
    private final int f230880b;

    /* renamed from: c */
    private final InputStream f230881c;

    public C85152a(Exception exc, int i, InputStream inputStream) {
        this.f230879a = exc;
        this.f230880b = i;
        this.f230881c = inputStream;
    }

    /* renamed from: a */
    public final int mo78740a() {
        return this.f230880b;
    }

    /* renamed from: b */
    public final InputStream mo78741b() {
        return this.f230881c;
    }

    /* renamed from: c */
    public final Exception mo78742c() {
        return this.f230879a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r1 = r4.f230881c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.search.core.p6519al.p6662co.C85166b
            r2 = 0
            if (r1 == 0) goto L_0x003f
            com.google.android.apps.gsa.search.core.al.co.b r5 = (com.google.android.apps.gsa.search.core.p6519al.p6662co.C85166b) r5
            java.lang.Exception r1 = r4.f230879a
            if (r1 != 0) goto L_0x0016
            java.lang.Exception r1 = r5.mo78742c()
            if (r1 != 0) goto L_0x003f
            goto L_0x0020
        L_0x0016:
            java.lang.Exception r3 = r5.mo78742c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003f
        L_0x0020:
            int r1 = r4.f230880b
            int r3 = r5.mo78740a()
            if (r1 != r3) goto L_0x003f
            java.io.InputStream r1 = r4.f230881c
            if (r1 != 0) goto L_0x0033
            java.io.InputStream r5 = r5.mo78741b()
            if (r5 != 0) goto L_0x003f
            goto L_0x003e
        L_0x0033:
            java.io.InputStream r5 = r5.mo78741b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            return r0
        L_0x003f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6519al.p6662co.C85152a.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f230879a);
        int i = this.f230880b;
        String valueOf2 = String.valueOf(this.f230881c);
        return "ImageTransferExceptionOrHttpResponse{exception=" + valueOf + ", httpCode=" + i + ", httpResponseBody=" + valueOf2 + "}";
    }

    public final int hashCode() {
        int i;
        Exception exc = this.f230879a;
        int i2 = 0;
        if (exc == null) {
            i = 0;
        } else {
            i = exc.hashCode();
        }
        int i3 = (((i ^ 1000003) * 1000003) ^ this.f230880b) * 1000003;
        InputStream inputStream = this.f230881c;
        if (inputStream != null) {
            i2 = inputStream.hashCode();
        }
        return i3 ^ i2;
    }
}
