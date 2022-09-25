package com.google.android.libraries.onegoogle.p2378b;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.onegoogle.b.a */
/* compiled from: PG */
public final class C30811a extends C30828e {

    /* renamed from: a */
    public final C30830g f83137a;

    /* renamed from: b */
    public final C30830g f83138b;

    /* renamed from: c */
    public final C58485gu f83139c;

    /* renamed from: d */
    public final C30826c f83140d;

    public C30811a(C30830g gVar, C30830g gVar2, C30826c cVar, C58485gu guVar) {
        this.f83137a = gVar;
        this.f83138b = gVar2;
        this.f83140d = cVar;
        this.f83139c = guVar;
    }

    /* renamed from: a */
    public final C30830g mo36512a() {
        return this.f83137a;
    }

    /* renamed from: b */
    public final C30830g mo36513b() {
        return this.f83138b;
    }

    /* renamed from: c */
    public final C58485gu mo36514c() {
        return this.f83139c;
    }

    /* renamed from: d */
    public final C30826c mo36515d() {
        return this.f83140d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r1 = r4.f83139c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.onegoogle.p2378b.C30828e
            r2 = 0
            if (r1 == 0) goto L_0x0046
            com.google.android.libraries.onegoogle.b.e r5 = (com.google.android.libraries.onegoogle.p2378b.C30828e) r5
            com.google.android.libraries.onegoogle.b.g r1 = r4.f83137a
            com.google.android.libraries.onegoogle.b.g r3 = r5.mo36512a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0046
            com.google.android.libraries.onegoogle.b.g r1 = r4.f83138b
            com.google.android.libraries.onegoogle.b.g r3 = r5.mo36513b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0046
            com.google.android.libraries.onegoogle.b.c r1 = r4.f83140d
            com.google.android.libraries.onegoogle.b.c r3 = r5.mo36515d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0046
            com.google.common.b.gu r1 = r4.f83139c
            if (r1 != 0) goto L_0x003a
            com.google.common.b.gu r5 = r5.mo36514c()
            if (r5 != 0) goto L_0x0046
            goto L_0x0045
        L_0x003a:
            com.google.common.b.gu r5 = r5.mo36514c()
            boolean r5 = com.google.common.p4522b.C58597ky.m90218i(r1, r5)
            if (r5 != 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            return r0
        L_0x0046:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.p2378b.C30811a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f83137a.hashCode() ^ 1000003) * 1000003) ^ this.f83138b.hashCode()) * 1000003) ^ this.f83140d.hashCode()) * 1000003;
        C58485gu guVar = this.f83139c;
        if (guVar == null) {
            i = 0;
        } else {
            i = guVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f83137a.toString();
        String obj2 = this.f83138b.toString();
        String obj3 = this.f83140d.toString();
        String valueOf = String.valueOf(this.f83139c);
        return "ImageModelLoader{imageRetriever=" + obj + ", secondaryImageRetriever=" + obj2 + ", defaultImageRetriever=" + obj3 + ", postProcessors=" + valueOf + "}";
    }
}
