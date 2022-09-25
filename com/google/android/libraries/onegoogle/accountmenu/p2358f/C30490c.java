package com.google.android.libraries.onegoogle.accountmenu.p2358f;

import com.google.android.libraries.onegoogle.account.p2345a.C30162g;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.f.c */
/* compiled from: PG */
final class C30490c extends C30492e {

    /* renamed from: a */
    private final boolean f82353a;

    /* renamed from: b */
    private final String f82354b;

    /* renamed from: c */
    private final String f82355c;

    /* renamed from: d */
    private final String f82356d;

    /* renamed from: e */
    private final String f82357e;

    /* renamed from: f */
    private final boolean f82358f;

    /* renamed from: g */
    private final boolean f82359g;

    /* renamed from: h */
    private final String f82360h;

    /* renamed from: i */
    private final String f82361i;

    /* renamed from: j */
    private final int f82362j;

    public C30490c(boolean z, String str, String str2, String str3, String str4, boolean z2, boolean z3, String str5, String str6, int i) {
        this.f82353a = z;
        this.f82354b = str;
        this.f82355c = str2;
        this.f82356d = str3;
        this.f82357e = str4;
        this.f82358f = z2;
        this.f82359g = z3;
        this.f82360h = str5;
        this.f82361i = str6;
        this.f82362j = i;
    }

    /* renamed from: a */
    public final String mo36114a() {
        return this.f82355c;
    }

    /* renamed from: b */
    public final String mo36115b() {
        return this.f82361i;
    }

    /* renamed from: c */
    public final String mo36116c() {
        return this.f82354b;
    }

    /* renamed from: d */
    public final String mo36117d() {
        return this.f82357e;
    }

    /* renamed from: e */
    public final String mo36118e() {
        return this.f82356d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r1 = r4.f82356d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r1 = r4.f82357e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        r1 = r4.f82360h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        r1 = r4.f82361i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f82354b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.onegoogle.accountmenu.p2358f.C30492e
            r2 = 0
            if (r1 == 0) goto L_0x00a2
            com.google.android.libraries.onegoogle.accountmenu.f.e r5 = (com.google.android.libraries.onegoogle.accountmenu.p2358f.C30492e) r5
            boolean r1 = r4.f82353a
            boolean r3 = r5.mo36124i()
            if (r1 != r3) goto L_0x00a2
            java.lang.String r1 = r4.f82354b
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r5.mo36116c()
            if (r1 != 0) goto L_0x00a2
            goto L_0x0028
        L_0x001e:
            java.lang.String r3 = r5.mo36116c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a2
        L_0x0028:
            java.lang.String r1 = r4.f82355c
            java.lang.String r3 = r5.mo36114a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a2
            java.lang.String r1 = r4.f82356d
            if (r1 != 0) goto L_0x003f
            java.lang.String r1 = r5.mo36118e()
            if (r1 != 0) goto L_0x00a2
            goto L_0x0049
        L_0x003f:
            java.lang.String r3 = r5.mo36118e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a2
        L_0x0049:
            java.lang.String r1 = r4.f82357e
            if (r1 != 0) goto L_0x0054
            java.lang.String r1 = r5.mo36117d()
            if (r1 != 0) goto L_0x00a2
            goto L_0x005e
        L_0x0054:
            java.lang.String r3 = r5.mo36117d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a2
        L_0x005e:
            boolean r1 = r4.f82358f
            boolean r3 = r5.mo36122h()
            if (r1 != r3) goto L_0x00a2
            boolean r1 = r4.f82359g
            boolean r3 = r5.mo36121g()
            if (r1 != r3) goto L_0x00a2
            java.lang.String r1 = r4.f82360h
            if (r1 != 0) goto L_0x0079
            java.lang.String r1 = r5.mo36120f()
            if (r1 != 0) goto L_0x00a2
            goto L_0x0083
        L_0x0079:
            java.lang.String r3 = r5.mo36120f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a2
        L_0x0083:
            java.lang.String r1 = r4.f82361i
            if (r1 != 0) goto L_0x008e
            java.lang.String r1 = r5.mo36115b()
            if (r1 != 0) goto L_0x00a2
            goto L_0x0099
        L_0x008e:
            java.lang.String r3 = r5.mo36115b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0099
            goto L_0x00a2
        L_0x0099:
            int r1 = r4.f82362j
            int r5 = r5.mo36125j()
            if (r1 != r5) goto L_0x00a2
            return r0
        L_0x00a2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.accountmenu.p2358f.C30490c.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo36120f() {
        return this.f82360h;
    }

    /* renamed from: g */
    public final boolean mo36121g() {
        return this.f82359g;
    }

    /* renamed from: h */
    public final boolean mo36122h() {
        return this.f82358f;
    }

    /* renamed from: i */
    public final boolean mo36124i() {
        return this.f82353a;
    }

    /* renamed from: j */
    public final int mo36125j() {
        return this.f82362j;
    }

    public final String toString() {
        boolean z = this.f82353a;
        String str = this.f82354b;
        String str2 = this.f82355c;
        String str3 = this.f82356d;
        String str4 = this.f82357e;
        boolean z2 = this.f82358f;
        boolean z3 = this.f82359g;
        String str5 = this.f82360h;
        String str6 = this.f82361i;
        int i = this.f82362j;
        return "DeviceOwner{isMetadataAvailable=" + z + ", displayName=" + str + ", accountName=" + str2 + ", givenName=" + str3 + ", familyName=" + str4 + ", isG1User=" + z2 + ", isDasherUser=" + z3 + ", obfuscatedGaiaId=" + str5 + ", avatarUrl=" + str6 + ", isUnicornUser=" + C30162g.m56037a(i) + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 1237;
        int i6 = ((true != this.f82353a ? 1237 : 1231) ^ 1000003) * 1000003;
        String str = this.f82354b;
        int i7 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (((i6 ^ i) * 1000003) ^ this.f82355c.hashCode()) * 1000003;
        String str2 = this.f82356d;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i8 = (hashCode ^ i2) * 1000003;
        String str3 = this.f82357e;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i9 = (((i8 ^ i3) * 1000003) ^ (true != this.f82358f ? 1237 : 1231)) * 1000003;
        if (true == this.f82359g) {
            i5 = 1231;
        }
        int i10 = (i9 ^ i5) * 1000003;
        String str4 = this.f82360h;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i11 = (i10 ^ i4) * 1000003;
        String str5 = this.f82361i;
        if (str5 != null) {
            i7 = str5.hashCode();
        }
        return ((i11 ^ i7) * 1000003) ^ this.f82362j;
    }
}
