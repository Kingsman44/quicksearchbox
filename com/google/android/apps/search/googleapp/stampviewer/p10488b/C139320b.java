package com.google.android.apps.search.googleapp.stampviewer.p10488b;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.b.b */
/* compiled from: PG */
final class C139320b extends C139335q {

    /* renamed from: a */
    private final boolean f378910a;

    /* renamed from: b */
    private final C139321c f378911b;

    public C139320b(boolean z, C139321c cVar) {
        this.f378910a = z;
        this.f378911b = cVar;
    }

    /* renamed from: a */
    public final C139321c mo114896a() {
        return this.f378911b;
    }

    /* renamed from: b */
    public final boolean mo114897b() {
        return this.f378910a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f378911b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.search.googleapp.stampviewer.p10488b.C139335q
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.google.android.apps.search.googleapp.stampviewer.b.q r5 = (com.google.android.apps.search.googleapp.stampviewer.p10488b.C139335q) r5
            boolean r1 = r4.f378910a
            boolean r3 = r5.mo114897b()
            if (r1 != r3) goto L_0x002a
            com.google.android.apps.search.googleapp.stampviewer.b.c r1 = r4.f378911b
            if (r1 != 0) goto L_0x001e
            com.google.android.apps.search.googleapp.stampviewer.b.c r5 = r5.mo114896a()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x001e:
            com.google.android.apps.search.googleapp.stampviewer.b.c r5 = r5.mo114896a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.stampviewer.p10488b.C139320b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = ((true != this.f378910a ? 1237 : 1231) ^ 1000003) * 1000003;
        C139321c cVar = this.f378911b;
        return i ^ (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        boolean z = this.f378910a;
        String valueOf = String.valueOf(this.f378911b);
        return "Result{isValid=" + z + ", errorCause=" + valueOf + "}";
    }
}
