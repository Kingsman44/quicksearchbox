package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.d */
/* compiled from: PG */
final class C114926d extends C114924b {

    /* renamed from: a */
    private final String f318867a;

    /* renamed from: b */
    private final String f318868b;

    /* renamed from: c */
    private final String f318869c;

    /* renamed from: d */
    private final String f318870d;

    /* renamed from: e */
    private final String f318871e;

    /* renamed from: f */
    private final Integer f318872f;

    public C114926d(String str, String str2, String str3, String str4, String str5, Integer num) {
        if (str != null) {
            this.f318867a = str;
            if (str2 != null) {
                this.f318868b = str2;
                this.f318869c = str3;
                this.f318870d = str4;
                this.f318871e = str5;
                this.f318872f = num;
                return;
            }
            throw new NullPointerException("Null subtext");
        }
        throw new NullPointerException("Null text");
    }

    /* renamed from: a */
    public final Integer mo101703a() {
        return this.f318872f;
    }

    /* renamed from: b */
    public final String mo101704b() {
        return this.f318871e;
    }

    /* renamed from: c */
    public final String mo101705c() {
        return this.f318870d;
    }

    /* renamed from: d */
    public final String mo101706d() {
        return this.f318869c;
    }

    /* renamed from: e */
    public final String mo101707e() {
        return this.f318868b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.f318870d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r1 = r4.f318871e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f318869c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a.C114924b
            r2 = 0
            if (r1 == 0) goto L_0x0070
            com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.b r5 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a.C114924b) r5
            java.lang.String r1 = r4.f318867a
            java.lang.String r3 = r5.mo101708f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0070
            java.lang.String r1 = r4.f318868b
            java.lang.String r3 = r5.mo101707e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0070
            java.lang.String r1 = r4.f318869c
            if (r1 != 0) goto L_0x002e
            java.lang.String r1 = r5.mo101706d()
            if (r1 != 0) goto L_0x0070
            goto L_0x0038
        L_0x002e:
            java.lang.String r3 = r5.mo101706d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0070
        L_0x0038:
            java.lang.String r1 = r4.f318870d
            if (r1 != 0) goto L_0x0043
            java.lang.String r1 = r5.mo101705c()
            if (r1 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0043:
            java.lang.String r3 = r5.mo101705c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0070
        L_0x004d:
            java.lang.String r1 = r4.f318871e
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = r5.mo101704b()
            if (r1 != 0) goto L_0x0070
            goto L_0x0063
        L_0x0058:
            java.lang.String r3 = r5.mo101704b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0063
            goto L_0x0070
        L_0x0063:
            java.lang.Integer r1 = r4.f318872f
            java.lang.Integer r5 = r5.mo101703a()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0070
            return r0
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a.C114926d.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo101708f() {
        return this.f318867a;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (((this.f318867a.hashCode() ^ 1000003) * 1000003) ^ this.f318868b.hashCode()) * 1000003;
        String str = this.f318869c;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = (hashCode ^ i) * 1000003;
        String str2 = this.f318870d;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        String str3 = this.f318871e;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return ((i5 ^ i3) * 1000003) ^ this.f318872f.hashCode();
    }

    public final String toString() {
        String str = this.f318867a;
        String str2 = this.f318868b;
        String str3 = this.f318869c;
        String str4 = this.f318870d;
        String str5 = this.f318871e;
        Integer num = this.f318872f;
        return "AddShelfMenuButton{text=" + str + ", subtext=" + str2 + ", intentUrl=" + str3 + ", iconUrl=" + str4 + ", arrowIconUrl=" + str5 + ", veId=" + num + "}";
    }
}
