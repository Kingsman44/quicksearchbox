package com.google.research.p5181a.p5186d;

import com.google.common.p4535g.C59203do;

/* renamed from: com.google.research.a.d.k */
/* compiled from: PG */
final class C66339k implements C66347s {

    /* renamed from: a */
    final /* synthetic */ C66343o f180387a;

    /* renamed from: b */
    final /* synthetic */ C66343o f180388b;

    public C66339k(C66343o oVar, C66343o oVar2) {
        this.f180387a = oVar;
        this.f180388b = oVar2;
    }

    /* renamed from: a */
    public final void mo59531a(int i) {
        int i2 = i;
        C66343o oVar = this.f180387a;
        C66343o oVar2 = this.f180388b;
        int i3 = oVar.f180408b;
        int c = oVar.mo59552c(false, i2, 0);
        int c2 = oVar.mo59552c(false, i2, i3);
        double d = -1.7976931348623157E308d;
        for (int i4 = c; i4 < c2; i4++) {
            double d2 = oVar.f180409c[i4];
            if (d2 > d) {
                d = d2;
            }
        }
        double d3 = 0.0d;
        while (c < c2) {
            oVar2.f180409c[c] = Math.exp(oVar.f180409c[c] - d);
            d3 += oVar2.f180409c[c];
            c++;
        }
        if (d3 != C59203do.f157270a) {
            for (int i5 = 0; i5 < i3; i5++) {
                double[] dArr = oVar2.f180409c;
                dArr[i5] = dArr[i5] / d3;
            }
            return;
        }
        throw new RuntimeException("softmax sum = 0");
    }
}
