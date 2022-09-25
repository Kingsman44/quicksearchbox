package com.google.research.p5181a.p5186d;

import com.google.common.p4535g.C59203do;

/* renamed from: com.google.research.a.d.j */
/* compiled from: PG */
final class C66338j implements C66347s {

    /* renamed from: a */
    final /* synthetic */ int f180384a;

    /* renamed from: b */
    final /* synthetic */ C66343o f180385b;

    /* renamed from: c */
    final /* synthetic */ C66343o f180386c;

    public C66338j(int i, C66343o oVar, C66343o oVar2) {
        this.f180384a = i;
        this.f180385b = oVar;
        this.f180386c = oVar2;
    }

    /* renamed from: a */
    public final void mo59531a(int i) {
        int i2 = this.f180384a;
        double d = C59203do.f157270a;
        if (i2 == 1) {
            double[] dArr = this.f180385b.f180409c;
            double d2 = this.f180386c.f180409c[i];
            if (d2 > C59203do.f157270a) {
                d = d2;
            }
            dArr[i] = d;
            return;
        }
        double[] dArr2 = this.f180385b.f180409c;
        double exp = Math.exp(-this.f180386c.f180409c[i]);
        if (!Double.isInfinite(exp)) {
            d = 1.0d / (exp + 1.0d);
        }
        dArr2[i] = d;
    }
}
