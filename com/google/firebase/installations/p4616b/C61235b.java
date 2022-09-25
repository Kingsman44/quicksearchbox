package com.google.firebase.installations.p4616b;

/* renamed from: com.google.firebase.installations.b.b */
/* compiled from: PG */
final class C61235b extends C61239f {

    /* renamed from: a */
    public final String f165641a;

    /* renamed from: b */
    public final String f165642b;

    /* renamed from: c */
    public final String f165643c;

    /* renamed from: d */
    public final long f165644d;

    /* renamed from: e */
    public final long f165645e;

    /* renamed from: f */
    public final String f165646f;

    /* renamed from: g */
    public final int f165647g;

    public C61235b(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.f165641a = str;
        this.f165647g = i;
        this.f165642b = str2;
        this.f165643c = str3;
        this.f165644d = j;
        this.f165645e = j2;
        this.f165646f = str4;
    }

    /* renamed from: a */
    public final long mo57820a() {
        return this.f165644d;
    }

    /* renamed from: b */
    public final long mo57821b() {
        return this.f165645e;
    }

    /* renamed from: c */
    public final C61238e mo57822c() {
        return new C61234a(this);
    }

    /* renamed from: d */
    public final String mo57823d() {
        return this.f165642b;
    }

    /* renamed from: e */
    public final String mo57824e() {
        return this.f165641a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r7.f165642b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        r1 = r7.f165643c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        r1 = r7.f165646f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.firebase.installations.p4616b.C61239f
            r2 = 0
            if (r1 == 0) goto L_0x0081
            com.google.firebase.installations.b.f r8 = (com.google.firebase.installations.p4616b.C61239f) r8
            java.lang.String r1 = r7.f165641a
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = r8.mo57824e()
            if (r1 != 0) goto L_0x0081
            goto L_0x0020
        L_0x0016:
            java.lang.String r3 = r8.mo57824e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
        L_0x0020:
            int r1 = r7.f165647g
            int r3 = r8.mo57828h()
            if (r1 == 0) goto L_0x007f
            if (r1 != r3) goto L_0x0081
            java.lang.String r1 = r7.f165642b
            if (r1 != 0) goto L_0x0035
            java.lang.String r1 = r8.mo57823d()
            if (r1 != 0) goto L_0x0081
            goto L_0x003f
        L_0x0035:
            java.lang.String r3 = r8.mo57823d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
        L_0x003f:
            java.lang.String r1 = r7.f165643c
            if (r1 != 0) goto L_0x004a
            java.lang.String r1 = r8.mo57827g()
            if (r1 != 0) goto L_0x0081
            goto L_0x0054
        L_0x004a:
            java.lang.String r3 = r8.mo57827g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
        L_0x0054:
            long r3 = r7.f165644d
            long r5 = r8.mo57820a()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0081
            long r3 = r7.f165645e
            long r5 = r8.mo57821b()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0081
            java.lang.String r1 = r7.f165646f
            if (r1 != 0) goto L_0x0073
            java.lang.String r8 = r8.mo57826f()
            if (r8 != 0) goto L_0x0081
            goto L_0x007e
        L_0x0073:
            java.lang.String r8 = r8.mo57826f()
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x007e
            goto L_0x0081
        L_0x007e:
            return r0
        L_0x007f:
            r8 = 0
            throw r8
        L_0x0081:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p4616b.C61235b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo57826f() {
        return this.f165646f;
    }

    /* renamed from: g */
    public final String mo57827g() {
        return this.f165643c;
    }

    /* renamed from: h */
    public final int mo57828h() {
        return this.f165647g;
    }

    public final String toString() {
        String str = this.f165641a;
        int i = this.f165647g;
        String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION";
        String str3 = this.f165642b;
        String str4 = this.f165643c;
        long j = this.f165644d;
        long j2 = this.f165645e;
        String str5 = this.f165646f;
        return "PersistedInstallationEntry{firebaseInstallationId=" + str + ", registrationStatus=" + str2 + ", authToken=" + str3 + ", refreshToken=" + str4 + ", expiresInSecs=" + j + ", tokenCreationEpochInSecs=" + j2 + ", fisError=" + str5 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f165641a;
        int i4 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i5 = (i ^ 1000003) * 1000003;
        int i6 = this.f165647g;
        if (i6 != 0) {
            int i7 = (i5 ^ i6) * 1000003;
            String str2 = this.f165642b;
            if (str2 == null) {
                i2 = 0;
            } else {
                i2 = str2.hashCode();
            }
            int i8 = (i7 ^ i2) * 1000003;
            String str3 = this.f165643c;
            if (str3 == null) {
                i3 = 0;
            } else {
                i3 = str3.hashCode();
            }
            long j = this.f165644d;
            long j2 = this.f165645e;
            int i9 = (((((i8 ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
            String str4 = this.f165646f;
            if (str4 != null) {
                i4 = str4.hashCode();
            }
            return i9 ^ i4;
        }
        throw null;
    }
}
