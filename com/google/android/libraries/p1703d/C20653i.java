package com.google.android.libraries.p1703d;

/* renamed from: com.google.android.libraries.d.i */
/* compiled from: PG */
final class C20653i extends C20639ac {

    /* renamed from: a */
    private final String f57908a;

    /* renamed from: b */
    private final boolean f57909b;

    /* renamed from: c */
    private final String f57910c;

    /* renamed from: d */
    private final Integer f57911d;

    public C20653i(String str, boolean z, String str2, Integer num) {
        this.f57908a = str;
        this.f57909b = z;
        this.f57910c = str2;
        this.f57911d = num;
    }

    /* renamed from: a */
    public final String mo25581a() {
        return this.f57910c;
    }

    /* renamed from: b */
    public final String mo25582b() {
        return this.f57908a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r1 = r4.f57911d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r1 = r4.f57910c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.p1703d.C20639ac
            r2 = 0
            if (r1 == 0) goto L_0x004b
            com.google.android.libraries.d.ac r5 = (com.google.android.libraries.p1703d.C20639ac) r5
            java.lang.String r1 = r4.f57908a
            java.lang.String r3 = r5.mo25582b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004b
            boolean r1 = r4.f57909b
            boolean r3 = r5.mo25583f()
            if (r1 != r3) goto L_0x004b
            java.lang.String r1 = r4.f57910c
            if (r1 != 0) goto L_0x002a
            java.lang.String r1 = r5.mo25581a()
            if (r1 != 0) goto L_0x004b
            goto L_0x0034
        L_0x002a:
            java.lang.String r3 = r5.mo25581a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004b
        L_0x0034:
            java.lang.Integer r1 = r4.f57911d
            if (r1 != 0) goto L_0x003f
            java.lang.Integer r5 = r5.mo25584iG()
            if (r5 != 0) goto L_0x004b
            goto L_0x004a
        L_0x003f:
            java.lang.Integer r5 = r5.mo25584iG()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            return r0
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p1703d.C20653i.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo25583f() {
        return this.f57909b;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f57908a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f57909b ? 1237 : 1231)) * 1000003;
        String str = this.f57910c;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        Integer num = this.f57911d;
        if (num != null) {
            i2 = num.hashCode();
        }
        return i3 ^ i2;
    }

    /* renamed from: iG */
    public final Integer mo25584iG() {
        return this.f57911d;
    }

    public final String toString() {
        String str = this.f57908a;
        boolean z = this.f57909b;
        String str2 = this.f57910c;
        Integer num = this.f57911d;
        return "ImmutableCctState{packageName=" + str + ", firstRunDone=" + z + ", browserAccount=" + str2 + ", privateApiVersion=" + num + "}";
    }
}
