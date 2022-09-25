package com.google.android.libraries.onegoogle.account.p2347c;

import com.google.android.libraries.onegoogle.account.p2345a.C30163h;

/* renamed from: com.google.android.libraries.onegoogle.account.c.c */
/* compiled from: PG */
final class C30169c extends C30168b {

    /* renamed from: a */
    private final Object f81538a;

    /* renamed from: b */
    private final String f81539b;

    /* renamed from: c */
    private final String f81540c;

    /* renamed from: d */
    private final String f81541d;

    /* renamed from: e */
    private final String f81542e;

    /* renamed from: f */
    private final String f81543f;

    /* renamed from: g */
    private final boolean f81544g;

    /* renamed from: h */
    private final C30163h f81545h;

    public C30169c(Object obj, String str, String str2, String str3, String str4, String str5, boolean z, C30163h hVar) {
        this.f81538a = obj;
        this.f81539b = str;
        this.f81540c = str2;
        this.f81541d = str3;
        this.f81542e = str4;
        this.f81543f = str5;
        this.f81544g = z;
        this.f81545h = hVar;
    }

    /* renamed from: a */
    public final C30163h mo35572a() {
        return this.f81545h;
    }

    /* renamed from: c */
    public final Object mo35573c() {
        return this.f81538a;
    }

    /* renamed from: d */
    public final String mo35574d() {
        return this.f81539b;
    }

    /* renamed from: e */
    public final String mo35575e() {
        return this.f81543f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f81540c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r4.f81541d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        r1 = r4.f81542e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        r1 = r4.f81543f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        r1 = r4.f81545h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f81539b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.onegoogle.account.p2347c.C30168b
            r2 = 0
            if (r1 == 0) goto L_0x009f
            com.google.android.libraries.onegoogle.account.c.b r5 = (com.google.android.libraries.onegoogle.account.p2347c.C30168b) r5
            java.lang.Object r1 = r4.f81538a
            java.lang.Object r3 = r5.mo35573c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009f
            java.lang.String r1 = r4.f81539b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.mo35574d()
            if (r1 != 0) goto L_0x009f
            goto L_0x002c
        L_0x0022:
            java.lang.String r3 = r5.mo35574d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009f
        L_0x002c:
            java.lang.String r1 = r4.f81540c
            if (r1 != 0) goto L_0x0037
            java.lang.String r1 = r5.mo35576f()
            if (r1 != 0) goto L_0x009f
            goto L_0x0041
        L_0x0037:
            java.lang.String r3 = r5.mo35576f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009f
        L_0x0041:
            java.lang.String r1 = r4.f81541d
            if (r1 != 0) goto L_0x004c
            java.lang.String r1 = r5.mo35578h()
            if (r1 != 0) goto L_0x009f
            goto L_0x0056
        L_0x004c:
            java.lang.String r3 = r5.mo35578h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009f
        L_0x0056:
            java.lang.String r1 = r4.f81542e
            if (r1 != 0) goto L_0x0061
            java.lang.String r1 = r5.mo35577g()
            if (r1 != 0) goto L_0x009f
            goto L_0x006b
        L_0x0061:
            java.lang.String r3 = r5.mo35577g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009f
        L_0x006b:
            java.lang.String r1 = r4.f81543f
            if (r1 != 0) goto L_0x0076
            java.lang.String r1 = r5.mo35575e()
            if (r1 != 0) goto L_0x009f
            goto L_0x0080
        L_0x0076:
            java.lang.String r3 = r5.mo35575e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009f
        L_0x0080:
            boolean r1 = r4.f81544g
            boolean r3 = r5.mo35579i()
            if (r1 != r3) goto L_0x009f
            com.google.android.libraries.onegoogle.account.a.h r1 = r4.f81545h
            if (r1 != 0) goto L_0x0093
            com.google.android.libraries.onegoogle.account.a.h r5 = r5.mo35572a()
            if (r5 != 0) goto L_0x009f
            goto L_0x009e
        L_0x0093:
            com.google.android.libraries.onegoogle.account.a.h r5 = r5.mo35572a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            return r0
        L_0x009f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.account.p2347c.C30169c.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo35576f() {
        return this.f81540c;
    }

    /* renamed from: g */
    public final String mo35577g() {
        return this.f81542e;
    }

    /* renamed from: h */
    public final String mo35578h() {
        return this.f81541d;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int hashCode = (this.f81538a.hashCode() ^ 1000003) * 1000003;
        String str = this.f81539b;
        int i6 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i7 = (hashCode ^ i) * 1000003;
        String str2 = this.f81540c;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i8 = (i7 ^ i2) * 1000003;
        String str3 = this.f81541d;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i9 = (i8 ^ i3) * 1000003;
        String str4 = this.f81542e;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i10 = (i9 ^ i4) * 1000003;
        String str5 = this.f81543f;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i11 = (((i10 ^ i5) * 1000003) ^ (true != this.f81544g ? 1237 : 1231)) * 1000003;
        C30163h hVar = this.f81545h;
        if (hVar != null) {
            i6 = hVar.hashCode();
        }
        return i11 ^ i6;
    }

    /* renamed from: i */
    public final boolean mo35579i() {
        return this.f81544g;
    }

    public final String toString() {
        String obj = this.f81538a.toString();
        String str = this.f81539b;
        String str2 = this.f81540c;
        String str3 = this.f81541d;
        String str4 = this.f81542e;
        String str5 = this.f81543f;
        boolean z = this.f81544g;
        String valueOf = String.valueOf(this.f81545h);
        return "AccountSnapshot{account=" + obj + ", accountName=" + str + ", displayName=" + str2 + ", givenName=" + str3 + ", familyName=" + str4 + ", avatarUrl=" + str5 + ", isMetadataAvailable=" + z + ", gaiaAccountData=" + valueOf + "}";
    }
}
