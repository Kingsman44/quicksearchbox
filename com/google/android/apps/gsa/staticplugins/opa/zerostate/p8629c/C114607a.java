package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8629c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.c.a */
/* compiled from: PG */
final class C114607a extends C114609c {

    /* renamed from: a */
    private final int f317906a;

    /* renamed from: b */
    private final String f317907b;

    public C114607a(int i, String str) {
        this.f317906a = i;
        this.f317907b = str;
    }

    /* renamed from: a */
    public final int mo101450a() {
        return this.f317906a;
    }

    /* renamed from: b */
    public final String mo101451b() {
        return this.f317907b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f317907b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.opa.zerostate.p8629c.C114609c
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.google.android.apps.gsa.staticplugins.opa.zerostate.c.c r5 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8629c.C114609c) r5
            int r1 = r4.f317906a
            int r3 = r5.mo101450a()
            if (r1 != r3) goto L_0x002a
            java.lang.String r1 = r4.f317907b
            if (r1 != 0) goto L_0x001e
            java.lang.String r5 = r5.mo101451b()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x001e:
            java.lang.String r5 = r5.mo101451b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.zerostate.p8629c.C114607a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f317906a ^ 1000003) * 1000003;
        String str = this.f317907b;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.f317906a;
        String str = this.f317907b;
        return "VeTreeNodeKey{veId=" + i + ", key=" + str + "}";
    }
}
