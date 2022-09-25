package com.google.android.apps.gsa.staticplugins.p7453bi;

import p5488io.grpc.C70334de;

/* renamed from: com.google.android.apps.gsa.staticplugins.bi.a */
/* compiled from: PG */
final class C94597a extends C94612d {

    /* renamed from: a */
    private final String f264594a;

    /* renamed from: b */
    private final int f264595b;

    /* renamed from: c */
    private final C70334de f264596c;

    /* renamed from: d */
    private final String f264597d;

    /* renamed from: e */
    private final int f264598e;

    public C94597a(String str, int i, C70334de deVar, String str2, int i2) {
        if (str != null) {
            this.f264594a = str;
            this.f264595b = i;
            this.f264596c = deVar;
            this.f264597d = str2;
            this.f264598e = i2;
            return;
        }
        throw new NullPointerException("Null host");
    }

    /* renamed from: a */
    public final int mo88526a() {
        return this.f264595b;
    }

    /* renamed from: b */
    public final int mo88527b() {
        return this.f264598e;
    }

    /* renamed from: c */
    public final C70334de mo88528c() {
        return this.f264596c;
    }

    /* renamed from: d */
    public final String mo88529d() {
        return this.f264597d;
    }

    /* renamed from: e */
    public final String mo88530e() {
        return this.f264594a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r1 = r4.f264597d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r1 = r4.f264596c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.p7453bi.C94612d
            r2 = 0
            if (r1 == 0) goto L_0x0053
            com.google.android.apps.gsa.staticplugins.bi.d r5 = (com.google.android.apps.gsa.staticplugins.p7453bi.C94612d) r5
            java.lang.String r1 = r4.f264594a
            java.lang.String r3 = r5.mo88530e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0053
            int r1 = r4.f264595b
            int r3 = r5.mo88526a()
            if (r1 != r3) goto L_0x0053
            io.grpc.de r1 = r4.f264596c
            if (r1 != 0) goto L_0x002a
            io.grpc.de r1 = r5.mo88528c()
            if (r1 != 0) goto L_0x0053
            goto L_0x0034
        L_0x002a:
            io.grpc.de r3 = r5.mo88528c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0053
        L_0x0034:
            java.lang.String r1 = r4.f264597d
            if (r1 != 0) goto L_0x003f
            java.lang.String r1 = r5.mo88529d()
            if (r1 != 0) goto L_0x0053
            goto L_0x004a
        L_0x003f:
            java.lang.String r3 = r5.mo88529d()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x004a
            goto L_0x0053
        L_0x004a:
            int r1 = r4.f264598e
            int r5 = r5.mo88527b()
            if (r1 != r5) goto L_0x0053
            return r0
        L_0x0053:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7453bi.C94597a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f264594a.hashCode() ^ 1000003) * 1000003) ^ this.f264595b) * 1000003;
        C70334de deVar = this.f264596c;
        int i2 = 0;
        if (deVar == null) {
            i = 0;
        } else {
            i = deVar.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        String str = this.f264597d;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((i3 ^ i2) * 1000003) ^ this.f264598e;
    }

    public final String toString() {
        String str = this.f264594a;
        int i = this.f264595b;
        String valueOf = String.valueOf(this.f264596c);
        String str2 = this.f264597d;
        int i2 = this.f264598e;
        return "CreateGrpcChannelArguments{host=" + str + ", port=" + i + ", extraHeaders=" + valueOf + ", authToken=" + str2 + ", trafficTag=" + i2 + "}";
    }
}
