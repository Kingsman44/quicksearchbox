package com.google.research.p5181a.p5186d;

import com.google.common.p4535g.C59203do;

/* renamed from: com.google.research.a.d.n */
/* compiled from: PG */
final class C66342n implements C66347s {

    /* renamed from: a */
    final /* synthetic */ C66343o f180403a;

    /* renamed from: b */
    final /* synthetic */ C66343o f180404b;

    /* renamed from: c */
    final /* synthetic */ C66343o f180405c;

    /* renamed from: d */
    final /* synthetic */ boolean f180406d;

    public C66342n(C66343o oVar, C66343o oVar2, C66343o oVar3, boolean z) {
        this.f180403a = oVar;
        this.f180404b = oVar2;
        this.f180405c = oVar3;
        this.f180406d = z;
    }

    /* renamed from: a */
    public final void mo59531a(int i) {
        C66343o oVar = this.f180403a;
        double[] dArr = oVar.f180409c;
        int i2 = oVar.f180408b;
        int i3 = i / i2;
        int i4 = i % i2;
        int i5 = this.f180404b.f180408b;
        double d = C59203do.f157270a;
        for (int i6 = 0; i6 < i5; i6++) {
            d += this.f180404b.mo59550a(false, i3, i6) * this.f180405c.mo59550a(this.f180406d, i6, i4);
        }
        dArr[i] = d;
    }
}
