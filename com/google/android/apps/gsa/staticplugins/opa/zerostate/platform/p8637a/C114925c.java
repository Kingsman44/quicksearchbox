package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.c */
/* compiled from: PG */
final class C114925c extends C114901a {

    /* renamed from: a */
    private final String f318863a;

    /* renamed from: b */
    private final String f318864b;

    /* renamed from: c */
    private final String f318865c;

    /* renamed from: d */
    private final Integer f318866d;

    public C114925c(String str, String str2, String str3, Integer num) {
        if (str != null) {
            this.f318863a = str;
            this.f318864b = str2;
            this.f318865c = str3;
            this.f318866d = num;
            return;
        }
        throw new NullPointerException("Null text");
    }

    /* renamed from: a */
    public final Integer mo101690a() {
        return this.f318866d;
    }

    /* renamed from: b */
    public final String mo101691b() {
        return this.f318865c;
    }

    /* renamed from: c */
    public final String mo101692c() {
        return this.f318864b;
    }

    /* renamed from: d */
    public final String mo101693d() {
        return this.f318863a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f318865c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f318864b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a.C114901a
            r2 = 0
            if (r1 == 0) goto L_0x004f
            com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.a r5 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a.C114901a) r5
            java.lang.String r1 = r4.f318863a
            java.lang.String r3 = r5.mo101693d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
            java.lang.String r1 = r4.f318864b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.mo101692c()
            if (r1 != 0) goto L_0x004f
            goto L_0x002c
        L_0x0022:
            java.lang.String r3 = r5.mo101692c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
        L_0x002c:
            java.lang.String r1 = r4.f318865c
            if (r1 != 0) goto L_0x0037
            java.lang.String r1 = r5.mo101691b()
            if (r1 != 0) goto L_0x004f
            goto L_0x0042
        L_0x0037:
            java.lang.String r3 = r5.mo101691b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0042
            goto L_0x004f
        L_0x0042:
            java.lang.Integer r1 = r4.f318866d
            java.lang.Integer r5 = r5.mo101690a()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x004f
            return r0
        L_0x004f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a.C114925c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f318863a.hashCode() ^ 1000003) * 1000003;
        String str = this.f318864b;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        String str2 = this.f318865c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((i3 ^ i2) * 1000003) ^ this.f318866d.hashCode();
    }

    public final String toString() {
        String str = this.f318863a;
        String str2 = this.f318864b;
        String str3 = this.f318865c;
        Integer num = this.f318866d;
        return "AddActionButton{text=" + str + ", intentUrl=" + str2 + ", iconUrl=" + str3 + ", veId=" + num + "}";
    }
}
