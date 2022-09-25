package com.google.common.p4535g;

/* renamed from: com.google.common.g.ak */
/* compiled from: PG */
final class C59118ak {

    /* renamed from: a */
    public C59136bb f157108a;

    /* renamed from: b */
    private double f157109b = Double.POSITIVE_INFINITY;

    public C59118ak(C59136bb bbVar) {
        this.f157108a = bbVar;
    }

    /* renamed from: a */
    public final void mo56433a(C59136bb bbVar, C59136bb bbVar2) {
        double e = C59136bb.m91672o(bbVar, bbVar2).mo56501e();
        double d = this.f157109b;
        if (e < d || (e == d && bbVar2.mo56507r(this.f157108a))) {
            this.f157109b = e;
            this.f157108a = bbVar2;
        }
    }
}
