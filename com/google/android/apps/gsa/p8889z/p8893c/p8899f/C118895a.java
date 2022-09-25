package com.google.android.apps.gsa.p8889z.p8893c.p8899f;

/* renamed from: com.google.android.apps.gsa.z.c.f.a */
/* compiled from: PG */
public final class C118895a extends C118896b {

    /* renamed from: a */
    public final String f331592a;

    /* renamed from: b */
    public final String f331593b;

    /* renamed from: c */
    public final boolean f331594c;

    /* renamed from: d */
    public final String f331595d;

    public C118895a(String str, String str2, boolean z, String str3) {
        if (str != null) {
            this.f331592a = str;
            if (str2 != null) {
                this.f331593b = str2;
                this.f331594c = z;
                this.f331595d = str3;
                return;
            }
            throw new NullPointerException("Null unstable");
        }
        throw new NullPointerException("Null stable");
    }

    /* renamed from: a */
    public final String mo104058a() {
        return this.f331595d;
    }

    /* renamed from: b */
    public final String mo104059b() {
        return this.f331592a;
    }

    /* renamed from: c */
    public final String mo104060c() {
        return this.f331593b;
    }

    /* renamed from: d */
    public final boolean mo104061d() {
        return this.f331594c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        r1 = r4.f331595d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.p8889z.p8893c.p8899f.C118896b
            r2 = 0
            if (r1 == 0) goto L_0x0042
            com.google.android.apps.gsa.z.c.f.b r5 = (com.google.android.apps.gsa.p8889z.p8893c.p8899f.C118896b) r5
            java.lang.String r1 = r4.f331592a
            java.lang.String r3 = r5.mo104059b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0042
            java.lang.String r1 = r4.f331593b
            java.lang.String r3 = r5.mo104060c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0042
            boolean r1 = r4.f331594c
            boolean r3 = r5.mo104061d()
            if (r1 != r3) goto L_0x0042
            java.lang.String r1 = r4.f331595d
            if (r1 != 0) goto L_0x0036
            java.lang.String r5 = r5.mo104058a()
            if (r5 != 0) goto L_0x0042
            goto L_0x0041
        L_0x0036:
            java.lang.String r5 = r5.mo104058a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            return r0
        L_0x0042:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p8889z.p8893c.p8899f.C118895a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f331592a.hashCode() ^ 1000003) * 1000003) ^ this.f331593b.hashCode()) * 1000003) ^ (true != this.f331594c ? 1237 : 1231)) * 1000003;
        String str = this.f331595d;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f331592a;
        String str2 = this.f331593b;
        boolean z = this.f331594c;
        String str3 = this.f331595d;
        return "RecognizedText{stable=" + str + ", unstable=" + str2 + ", isFinal=" + z + ", language=" + str3 + "}";
    }
}
