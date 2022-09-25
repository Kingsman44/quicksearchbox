package com.google.android.libraries.onegoogle.p2380c.p2382b;

/* renamed from: com.google.android.libraries.onegoogle.c.b.b */
/* compiled from: PG */
final class C30873b extends C30861a {

    /* renamed from: a */
    private final String f83254a;

    /* renamed from: b */
    private final int f83255b;

    public C30873b(int i, String str) {
        this.f83255b = i;
        this.f83254a = str;
    }

    /* renamed from: c */
    public final String mo36549c() {
        return this.f83254a;
    }

    /* renamed from: d */
    public final int mo36550d() {
        return this.f83255b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f83254a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.onegoogle.p2380c.p2382b.C30861a
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.google.android.libraries.onegoogle.c.b.a r5 = (com.google.android.libraries.onegoogle.p2380c.p2382b.C30861a) r5
            int r1 = r4.f83255b
            int r3 = r5.mo36550d()
            if (r1 != r3) goto L_0x002a
            java.lang.String r1 = r4.f83254a
            if (r1 != 0) goto L_0x001e
            java.lang.String r5 = r5.mo36549c()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x001e:
            java.lang.String r5 = r5.mo36549c()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.p2380c.p2382b.C30873b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f83255b ^ 1000003) * 1000003;
        String str = this.f83254a;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.f83255b;
        String str = i != 1 ? i != 2 ? i != 3 ? "INCOGNITO" : "PSEUDONYMOUS" : "ANONYMOUS" : "GAIA";
        String str2 = this.f83254a;
        return "AuthChannel{type=" + str + ", account=" + str2 + "}";
    }
}
