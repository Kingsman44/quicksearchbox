package com.google.android.apps.gsa.proactive.p6475b;

import com.google.android.apps.gsa.shared.p7127q.C90456c;

/* renamed from: com.google.android.apps.gsa.proactive.b.b */
/* compiled from: PG */
final class C84159b extends C84162e {

    /* renamed from: a */
    private final boolean f229108a;

    /* renamed from: b */
    private final int f229109b;

    /* renamed from: c */
    private final C90456c f229110c;

    /* renamed from: d */
    private final boolean f229111d;

    public C84159b(boolean z, int i, C90456c cVar, boolean z2) {
        this.f229108a = z;
        this.f229109b = i;
        this.f229110c = cVar;
        this.f229111d = z2;
    }

    /* renamed from: a */
    public final int mo77593a() {
        return this.f229109b;
    }

    /* renamed from: b */
    public final C90456c mo77594b() {
        return this.f229110c;
    }

    /* renamed from: c */
    public final boolean mo77595c() {
        return this.f229111d;
    }

    /* renamed from: d */
    public final boolean mo77596d() {
        return this.f229108a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r1 = r4.f229110c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.proactive.p6475b.C84162e
            r2 = 0
            if (r1 == 0) goto L_0x003a
            com.google.android.apps.gsa.proactive.b.e r5 = (com.google.android.apps.gsa.proactive.p6475b.C84162e) r5
            boolean r1 = r4.f229108a
            boolean r3 = r5.mo77596d()
            if (r1 != r3) goto L_0x003a
            int r1 = r4.f229109b
            int r3 = r5.mo77593a()
            if (r1 != r3) goto L_0x003a
            com.google.android.apps.gsa.shared.q.c r1 = r4.f229110c
            if (r1 != 0) goto L_0x0026
            com.google.android.apps.gsa.shared.q.c r1 = r5.mo77594b()
            if (r1 != 0) goto L_0x003a
            goto L_0x0031
        L_0x0026:
            com.google.android.apps.gsa.shared.q.c r3 = r5.mo77594b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0031
            goto L_0x003a
        L_0x0031:
            boolean r1 = r4.f229111d
            boolean r5 = r5.mo77595c()
            if (r1 != r5) goto L_0x003a
            return r0
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.proactive.p6475b.C84159b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.f229108a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f229109b) * 1000003;
        C90456c cVar = this.f229110c;
        int hashCode = (i2 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        if (true == this.f229111d) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        boolean z = this.f229108a;
        int i = this.f229109b;
        String valueOf = String.valueOf(this.f229110c);
        boolean z2 = this.f229111d;
        return "NextPageRequestResult{nextPageAvailable=" + z + ", clientErrorCode=" + i + ", gsaError=" + valueOf + ", responseHasContent=" + z2 + "}";
    }
}
