package com.google.research.p5181a.p5186d;

/* renamed from: com.google.research.a.d.i */
/* compiled from: PG */
final class C66337i implements C66347s {

    /* renamed from: a */
    final /* synthetic */ C66344p f180379a;

    /* renamed from: b */
    final /* synthetic */ C66343o f180380b;

    /* renamed from: c */
    final /* synthetic */ C66343o f180381c;

    /* renamed from: d */
    final /* synthetic */ C66343o f180382d;

    /* renamed from: e */
    final /* synthetic */ C66340l f180383e;

    public C66337i(C66340l lVar, C66344p pVar, C66343o oVar, C66343o oVar2, C66343o oVar3) {
        this.f180383e = lVar;
        this.f180379a = pVar;
        this.f180380b = oVar;
        this.f180381c = oVar2;
        this.f180382d = oVar3;
    }

    /* renamed from: a */
    public final void mo59531a(int i) {
        C66340l lVar;
        C66340l lVar2 = this.f180383e;
        int i2 = lVar2.f180369j;
        int i3 = i / i2;
        int i4 = i % i2;
        C66343o o = lVar2.mo59547o(this.f180379a);
        C66340l lVar3 = this.f180383e;
        int i5 = lVar3.f180369j * i3;
        double d = lVar3.f180395s.f180409c[i4];
        int i6 = 0;
        while (true) {
            lVar = this.f180383e;
            if (i6 >= lVar.f180368i) {
                break;
            }
            d += this.f180380b.mo59550a(false, i3, i6) * o.mo59550a(this.f180383e.f180390n, i6, i4);
            i6++;
        }
        if (lVar.f180371l && this.f180381c != null) {
            for (int i7 = 0; i7 < this.f180383e.f180369j; i7++) {
                d += this.f180381c.mo59550a(false, i3, i7) * this.f180383e.f180392p.mo59550a(false, i7, i4);
            }
        }
        this.f180382d.f180409c[i5 + i4] = d;
    }
}
