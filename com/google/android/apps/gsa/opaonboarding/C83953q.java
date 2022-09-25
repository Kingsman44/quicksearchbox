package com.google.android.apps.gsa.opaonboarding;

/* renamed from: com.google.android.apps.gsa.opaonboarding.q */
/* compiled from: PG */
public final class C83953q extends C83908bn {

    /* renamed from: a */
    private final int f228708a;

    /* renamed from: b */
    private final String f228709b;

    /* renamed from: c */
    private final String f228710c;

    /* renamed from: d */
    private final String f228711d;

    /* renamed from: e */
    private final String f228712e;

    public C83953q(int i, String str, String str2, String str3, String str4) {
        this.f228708a = i;
        this.f228709b = str;
        this.f228710c = str2;
        this.f228711d = str3;
        this.f228712e = str4;
    }

    /* renamed from: a */
    public final int mo77320a() {
        return this.f228708a;
    }

    /* renamed from: b */
    public final String mo77321b() {
        return this.f228711d;
    }

    /* renamed from: c */
    public final String mo77322c() {
        return this.f228712e;
    }

    /* renamed from: d */
    public final String mo77323d() {
        return this.f228709b;
    }

    /* renamed from: e */
    public final String mo77324e() {
        return this.f228710c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r1 = r4.f228710c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r1 = r4.f228711d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        r1 = r4.f228712e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f228709b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.opaonboarding.C83908bn
            r2 = 0
            if (r1 == 0) goto L_0x0069
            com.google.android.apps.gsa.opaonboarding.bn r5 = (com.google.android.apps.gsa.opaonboarding.C83908bn) r5
            int r1 = r4.f228708a
            int r3 = r5.mo77320a()
            if (r1 != r3) goto L_0x0069
            java.lang.String r1 = r4.f228709b
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r5.mo77323d()
            if (r1 != 0) goto L_0x0069
            goto L_0x0028
        L_0x001e:
            java.lang.String r3 = r5.mo77323d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0069
        L_0x0028:
            java.lang.String r1 = r4.f228710c
            if (r1 != 0) goto L_0x0033
            java.lang.String r1 = r5.mo77324e()
            if (r1 != 0) goto L_0x0069
            goto L_0x003d
        L_0x0033:
            java.lang.String r3 = r5.mo77324e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0069
        L_0x003d:
            java.lang.String r1 = r4.f228711d
            if (r1 != 0) goto L_0x0048
            java.lang.String r1 = r5.mo77321b()
            if (r1 != 0) goto L_0x0069
            goto L_0x0052
        L_0x0048:
            java.lang.String r3 = r5.mo77321b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0069
        L_0x0052:
            java.lang.String r1 = r4.f228712e
            if (r1 != 0) goto L_0x005d
            java.lang.String r5 = r5.mo77322c()
            if (r5 != 0) goto L_0x0069
            goto L_0x0068
        L_0x005d:
            java.lang.String r5 = r5.mo77322c()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            return r0
        L_0x0069:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.opaonboarding.C83953q.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = this.f228708a;
        String str = this.f228709b;
        String str2 = this.f228710c;
        String str3 = this.f228711d;
        String str4 = this.f228712e;
        return "UnicornConfig{unicornMode=" + i + ", parentAccountName=" + str + ", parentObfuscatedGaiaId=" + str2 + ", childAccountName=" + str3 + ", childObfuscatedGaiaId=" + str4 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = (this.f228708a ^ 1000003) * 1000003;
        String str = this.f228709b;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (i4 ^ i) * 1000003;
        String str2 = this.f228710c;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        String str3 = this.f228711d;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        String str4 = this.f228712e;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        return i8 ^ i5;
    }
}
