package com.google.firebase.installations.p4617c;

/* renamed from: com.google.firebase.installations.c.d */
/* compiled from: PG */
final class C61244d extends C61250j {

    /* renamed from: a */
    private final String f165668a;

    /* renamed from: b */
    private final long f165669b;

    /* renamed from: c */
    private final int f165670c;

    public C61244d(String str, long j, int i) {
        this.f165668a = str;
        this.f165669b = j;
        this.f165670c = i;
    }

    /* renamed from: a */
    public final long mo57850a() {
        return this.f165669b;
    }

    /* renamed from: b */
    public final String mo57851b() {
        return this.f165668a;
    }

    /* renamed from: c */
    public final int mo57852c() {
        return this.f165670c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r1 = r7.f165670c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.firebase.installations.p4617c.C61250j
            r2 = 0
            if (r1 == 0) goto L_0x003d
            com.google.firebase.installations.c.j r8 = (com.google.firebase.installations.p4617c.C61250j) r8
            java.lang.String r1 = r7.f165668a
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = r8.mo57851b()
            if (r1 != 0) goto L_0x003d
            goto L_0x0020
        L_0x0016:
            java.lang.String r3 = r8.mo57851b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003d
        L_0x0020:
            long r3 = r7.f165669b
            long r5 = r8.mo57850a()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x003d
            int r1 = r7.f165670c
            if (r1 != 0) goto L_0x0035
            int r8 = r8.mo57852c()
            if (r8 != 0) goto L_0x003d
            goto L_0x003c
        L_0x0035:
            int r8 = r8.mo57852c()
            if (r1 == r8) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            return r0
        L_0x003d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p4617c.C61244d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f165668a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f165669b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i3 = this.f165670c;
        if (i3 != 0) {
            i = i3;
        }
        return i2 ^ i;
    }

    public final String toString() {
        String str = this.f165668a;
        long j = this.f165669b;
        int i = this.f165670c;
        String str2 = i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK";
        return "TokenResult{token=" + str + ", tokenExpirationTimestamp=" + j + ", responseCode=" + str2 + "}";
    }
}
