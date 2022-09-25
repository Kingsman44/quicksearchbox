package com.google.android.libraries.onegoogle.owners;

/* renamed from: com.google.android.libraries.onegoogle.owners.b */
/* compiled from: PG */
final class C30961b extends C30976k {

    /* renamed from: a */
    private final String f83417a;

    /* renamed from: b */
    private final boolean f83418b;

    /* renamed from: c */
    private final String f83419c;

    /* renamed from: d */
    private final String f83420d;

    /* renamed from: e */
    private final String f83421e;

    /* renamed from: f */
    private final String f83422f;

    /* renamed from: g */
    private final boolean f83423g;

    /* renamed from: h */
    private final boolean f83424h;

    /* renamed from: i */
    private final String f83425i;

    /* renamed from: j */
    private final String f83426j;

    /* renamed from: k */
    private final int f83427k;

    /* renamed from: l */
    private final int f83428l;

    public C30961b(String str, boolean z, String str2, String str3, String str4, String str5, boolean z2, boolean z3, int i, String str6, String str7, int i2) {
        this.f83417a = str;
        this.f83418b = z;
        this.f83419c = str2;
        this.f83420d = str3;
        this.f83421e = str4;
        this.f83422f = str5;
        this.f83423g = z2;
        this.f83424h = z3;
        this.f83428l = i;
        this.f83425i = str6;
        this.f83426j = str7;
        this.f83427k = i2;
    }

    /* renamed from: a */
    public final String mo36650a() {
        return this.f83417a;
    }

    /* renamed from: b */
    public final String mo36651b() {
        return this.f83425i;
    }

    /* renamed from: c */
    public final String mo36652c() {
        return this.f83426j;
    }

    /* renamed from: d */
    public final String mo36653d() {
        return this.f83419c;
    }

    /* renamed from: e */
    public final String mo36654e() {
        return this.f83421e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r1 = r4.f83420d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r1 = r4.f83421e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        r1 = r4.f83422f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008b, code lost:
        r1 = r4.f83425i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a0, code lost:
        r1 = r4.f83426j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r1 = r4.f83419c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.onegoogle.owners.C30976k
            r2 = 0
            if (r1 == 0) goto L_0x00bf
            com.google.android.libraries.onegoogle.owners.k r5 = (com.google.android.libraries.onegoogle.owners.C30976k) r5
            java.lang.String r1 = r4.f83417a
            java.lang.String r3 = r5.mo36650a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00bf
            boolean r1 = r4.f83418b
            boolean r3 = r5.mo36661j()
            if (r1 != r3) goto L_0x00bf
            java.lang.String r1 = r4.f83419c
            if (r1 != 0) goto L_0x002a
            java.lang.String r1 = r5.mo36653d()
            if (r1 != 0) goto L_0x00bf
            goto L_0x0034
        L_0x002a:
            java.lang.String r3 = r5.mo36653d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00bf
        L_0x0034:
            java.lang.String r1 = r4.f83420d
            if (r1 != 0) goto L_0x003f
            java.lang.String r1 = r5.mo36656f()
            if (r1 != 0) goto L_0x00bf
            goto L_0x0049
        L_0x003f:
            java.lang.String r3 = r5.mo36656f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00bf
        L_0x0049:
            java.lang.String r1 = r4.f83421e
            if (r1 != 0) goto L_0x0054
            java.lang.String r1 = r5.mo36654e()
            if (r1 != 0) goto L_0x00bf
            goto L_0x005e
        L_0x0054:
            java.lang.String r3 = r5.mo36654e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00bf
        L_0x005e:
            java.lang.String r1 = r4.f83422f
            if (r1 != 0) goto L_0x0069
            java.lang.String r1 = r5.mo36657g()
            if (r1 != 0) goto L_0x00bf
            goto L_0x0073
        L_0x0069:
            java.lang.String r3 = r5.mo36657g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00bf
        L_0x0073:
            boolean r1 = r4.f83423g
            boolean r3 = r5.mo36660i()
            if (r1 != r3) goto L_0x00bf
            boolean r1 = r4.f83424h
            boolean r3 = r5.mo36658h()
            if (r1 != r3) goto L_0x00bf
            int r1 = r4.f83428l
            int r3 = r5.mo36663l()
            if (r1 != r3) goto L_0x00bf
            java.lang.String r1 = r4.f83425i
            if (r1 != 0) goto L_0x0096
            java.lang.String r1 = r5.mo36651b()
            if (r1 != 0) goto L_0x00bf
            goto L_0x00a0
        L_0x0096:
            java.lang.String r3 = r5.mo36651b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00bf
        L_0x00a0:
            java.lang.String r1 = r4.f83426j
            if (r1 != 0) goto L_0x00ab
            java.lang.String r1 = r5.mo36652c()
            if (r1 != 0) goto L_0x00bf
            goto L_0x00b6
        L_0x00ab:
            java.lang.String r3 = r5.mo36652c()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00b6
            goto L_0x00bf
        L_0x00b6:
            int r1 = r4.f83427k
            int r5 = r5.mo36662k()
            if (r1 != r5) goto L_0x00bf
            return r0
        L_0x00bf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.owners.C30961b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo36656f() {
        return this.f83420d;
    }

    /* renamed from: g */
    public final String mo36657g() {
        return this.f83422f;
    }

    /* renamed from: h */
    public final boolean mo36658h() {
        return this.f83424h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 1237;
        int hashCode = (((this.f83417a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f83418b ? 1237 : 1231)) * 1000003;
        String str = this.f83419c;
        int i7 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i8 = (hashCode ^ i) * 1000003;
        String str2 = this.f83420d;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i9 = (i8 ^ i2) * 1000003;
        String str3 = this.f83421e;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i10 = (i9 ^ i3) * 1000003;
        String str4 = this.f83422f;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i11 = (((i10 ^ i4) * 1000003) ^ (true != this.f83423g ? 1237 : 1231)) * 1000003;
        if (true == this.f83424h) {
            i6 = 1231;
        }
        int i12 = (((i11 ^ i6) * 1000003) ^ this.f83428l) * 1000003;
        String str5 = this.f83425i;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i13 = (i12 ^ i5) * 1000003;
        String str6 = this.f83426j;
        if (str6 != null) {
            i7 = str6.hashCode();
        }
        return ((i13 ^ i7) * 1000003) ^ this.f83427k;
    }

    /* renamed from: i */
    public final boolean mo36660i() {
        return this.f83423g;
    }

    /* renamed from: j */
    public final boolean mo36661j() {
        return this.f83418b;
    }

    /* renamed from: k */
    public final int mo36662k() {
        return this.f83427k;
    }

    /* renamed from: l */
    public final int mo36663l() {
        return this.f83428l;
    }

    public final String toString() {
        String str = this.f83417a;
        boolean z = this.f83418b;
        String str2 = this.f83419c;
        String str3 = this.f83420d;
        String str4 = this.f83421e;
        String str5 = this.f83422f;
        boolean z2 = this.f83423g;
        boolean z3 = this.f83424h;
        String a = C30975j.m57822a(this.f83428l);
        String str6 = this.f83425i;
        String str7 = this.f83426j;
        int i = this.f83427k;
        String str8 = i != 1 ? i != 2 ? i != 3 ? "TWENTY_ONE_OR_OLDER" : "EIGHTEEN_TO_TWENTY" : "LESS_THAN_EIGHTEEN" : "UNKNOWN";
        return "GoogleOwner{accountName=" + str + ", isMetadataAvailable=" + z + ", displayName=" + str2 + ", givenName=" + str3 + ", familyName=" + str4 + ", obfuscatedGaiaId=" + str5 + ", isG1User=" + z2 + ", isDasherUser=" + z3 + ", isUnicornUser=" + a + ", avatarUrl=" + str6 + ", defaultAvatarUrl=" + str7 + ", ageRange=" + str8 + "}";
    }
}
