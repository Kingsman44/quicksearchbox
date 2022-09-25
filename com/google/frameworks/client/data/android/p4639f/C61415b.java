package com.google.frameworks.client.data.android.p4639f;

import android.content.Context;
import org.chromium.net.CronetEngine;

/* renamed from: com.google.frameworks.client.data.android.f.b */
/* compiled from: PG */
public final class C61415b extends C61419f {

    /* renamed from: a */
    private final String f166091a;

    /* renamed from: b */
    private final boolean f166092b;

    /* renamed from: c */
    private final boolean f166093c;

    /* renamed from: d */
    private final int f166094d;

    /* renamed from: e */
    private final String f166095e;

    /* renamed from: f */
    private final int f166096f;

    public C61415b(String str, boolean z, boolean z2, int i, String str2, int i2) {
        this.f166091a = str;
        this.f166092b = z;
        this.f166093c = z2;
        this.f166094d = i;
        this.f166095e = str2;
        this.f166096f = i2;
    }

    /* renamed from: a */
    public final int mo58016a() {
        return this.f166094d;
    }

    /* renamed from: b */
    public final int mo58017b() {
        return 0;
    }

    /* renamed from: c */
    public final int mo58018c() {
        return this.f166096f;
    }

    /* renamed from: d */
    public final Context mo58019d() {
        return null;
    }

    /* renamed from: e */
    public final C61420g mo58020e() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        r1 = r4.f166095e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r1 = r4.f166091a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.frameworks.client.data.android.p4639f.C61419f
            r2 = 0
            if (r1 == 0) goto L_0x0081
            com.google.frameworks.client.data.android.f.f r5 = (com.google.frameworks.client.data.android.p4639f.C61419f) r5
            android.content.Context r1 = r5.mo58019d()
            if (r1 != 0) goto L_0x0081
            java.lang.String r1 = r4.f166091a
            if (r1 != 0) goto L_0x001c
            java.lang.String r1 = r5.mo58023g()
            if (r1 != 0) goto L_0x0081
            goto L_0x0026
        L_0x001c:
            java.lang.String r3 = r5.mo58023g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
        L_0x0026:
            boolean r1 = r4.f166092b
            boolean r3 = r5.mo58030m()
            if (r1 != r3) goto L_0x0081
            boolean r1 = r4.f166093c
            boolean r3 = r5.mo58026i()
            if (r1 != r3) goto L_0x0081
            boolean r1 = r5.mo58027j()
            if (r1 != 0) goto L_0x0081
            boolean r1 = r5.mo58028k()
            if (r1 != 0) goto L_0x0081
            boolean r1 = r5.mo58029l()
            if (r1 != 0) goto L_0x0081
            int r1 = r4.f166094d
            int r3 = r5.mo58016a()
            if (r1 != r3) goto L_0x0081
            int r1 = r5.mo58017b()
            if (r1 != 0) goto L_0x0081
            org.chromium.net.CronetEngine$Builder$LibraryLoader r1 = r5.mo58024h()
            if (r1 != 0) goto L_0x0081
            java.lang.String r1 = r4.f166095e
            if (r1 != 0) goto L_0x0067
            java.lang.String r1 = r5.mo58022f()
            if (r1 != 0) goto L_0x0081
            goto L_0x0072
        L_0x0067:
            java.lang.String r3 = r5.mo58022f()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0072
            goto L_0x0081
        L_0x0072:
            com.google.frameworks.client.data.android.f.g r1 = r5.mo58020e()
            if (r1 != 0) goto L_0x0081
            int r1 = r4.f166096f
            int r5 = r5.mo58018c()
            if (r1 != r5) goto L_0x0081
            return r0
        L_0x0081:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.frameworks.client.data.android.p4639f.C61415b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo58022f() {
        return this.f166095e;
    }

    /* renamed from: g */
    public final String mo58023g() {
        return this.f166091a;
    }

    /* renamed from: h */
    public final CronetEngine.Builder.LibraryLoader mo58024h() {
        return null;
    }

    /* renamed from: i */
    public final boolean mo58026i() {
        return this.f166093c;
    }

    /* renamed from: j */
    public final boolean mo58027j() {
        return false;
    }

    /* renamed from: k */
    public final boolean mo58028k() {
        return false;
    }

    /* renamed from: l */
    public final boolean mo58029l() {
        return false;
    }

    /* renamed from: m */
    public final boolean mo58030m() {
        return this.f166092b;
    }

    public final String toString() {
        String str = this.f166091a;
        boolean z = this.f166092b;
        boolean z2 = this.f166093c;
        int i = this.f166094d;
        String str2 = this.f166095e;
        int i2 = this.f166096f;
        return "CronetConfig{context=null, storagePath=" + str + ", enableQuic=" + z + ", enableBrotli=" + z2 + ", enableCertificateCache=false, enableHttpCache=false, enableNetworkQualityEstimator=false, diskCacheSizeBytes=" + i + ", inMemoryFallbackCacheSizeBytes=0, libraryLoader=null, experimentalOptions=" + str2 + ", cronetEngineBuilderFactory=null, threadPriority=" + i2 + "}";
    }

    public final int hashCode() {
        int i;
        String str = this.f166091a;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = 1231;
        int i4 = (((i ^ -721379959) * 1000003) ^ (true != this.f166092b ? 1237 : 1231)) * 1000003;
        if (true != this.f166093c) {
            i3 = 1237;
        }
        int i5 = (((((((((i4 ^ i3) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.f166094d) * 583896283;
        String str2 = this.f166095e;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((i5 ^ i2) * -721379959) ^ this.f166096f;
    }
}
