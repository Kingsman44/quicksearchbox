package com.google.knowledge.cerebra.sense.textclassifier.tclib;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.g */
/* compiled from: PG */
final class C61964g extends C61907bq {

    /* renamed from: a */
    private final boolean f167435a;

    /* renamed from: b */
    private final Object f167436b;

    /* renamed from: c */
    private final Runnable f167437c;

    public C61964g(boolean z, Object obj, Runnable runnable) {
        this.f167435a = z;
        this.f167436b = obj;
        if (runnable != null) {
            this.f167437c = runnable;
            return;
        }
        throw new NullPointerException("Null modelUnlocker");
    }

    /* renamed from: a */
    public final Object mo58341a() {
        return this.f167436b;
    }

    /* renamed from: b */
    public final Runnable mo58342b() {
        return this.f167437c;
    }

    /* renamed from: c */
    public final boolean mo58343c() {
        return this.f167435a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f167436b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.knowledge.cerebra.sense.textclassifier.tclib.C61907bq
            r2 = 0
            if (r1 == 0) goto L_0x0036
            com.google.knowledge.cerebra.sense.textclassifier.tclib.bq r5 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61907bq) r5
            boolean r1 = r4.f167435a
            boolean r3 = r5.mo58343c()
            if (r1 != r3) goto L_0x0036
            java.lang.Object r1 = r4.f167436b
            if (r1 != 0) goto L_0x001e
            java.lang.Object r1 = r5.mo58341a()
            if (r1 != 0) goto L_0x0036
            goto L_0x0029
        L_0x001e:
            java.lang.Object r3 = r5.mo58341a()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x0036
        L_0x0029:
            java.lang.Runnable r1 = r4.f167437c
            java.lang.Runnable r5 = r5.mo58342b()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0036
            return r0
        L_0x0036:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.knowledge.cerebra.sense.textclassifier.tclib.C61964g.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        boolean z = this.f167435a;
        String valueOf = String.valueOf(this.f167436b);
        String obj = this.f167437c.toString();
        return "ModelResult{changed=" + z + ", model=" + valueOf + ", modelUnlocker=" + obj + "}";
    }

    public final int hashCode() {
        int i;
        int i2 = ((true != this.f167435a ? 1237 : 1231) ^ 1000003) * 1000003;
        Object obj = this.f167436b;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return ((i2 ^ i) * 1000003) ^ this.f167437c.hashCode();
    }
}
