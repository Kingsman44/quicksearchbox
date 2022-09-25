package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.e */
/* compiled from: PG */
final class C109809e extends C109786af {

    /* renamed from: a */
    private final int f305989a;

    /* renamed from: b */
    private final C109785ae f305990b;

    public C109809e(int i, C109785ae aeVar) {
        this.f305989a = i;
        this.f305990b = aeVar;
    }

    /* renamed from: a */
    public final int mo98118a() {
        return this.f305989a;
    }

    /* renamed from: b */
    public final C109785ae mo98119b() {
        return this.f305990b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f305990b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109786af
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.af r5 = (com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109786af) r5
            int r1 = r4.f305989a
            int r3 = r5.mo98118a()
            if (r1 != r3) goto L_0x002a
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ae r1 = r4.f305990b
            if (r1 != 0) goto L_0x001e
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ae r5 = r5.mo98119b()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x001e:
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ae r5 = r5.mo98119b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109809e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f305989a ^ 1000003) * 1000003;
        C109785ae aeVar = this.f305990b;
        return i ^ (aeVar == null ? 0 : aeVar.hashCode());
    }

    public final String toString() {
        int i = this.f305989a;
        String valueOf = String.valueOf(this.f305990b);
        return "FetchResponse{responseStatus=" + i + ", innerFetchPayload=" + valueOf + "}";
    }
}
