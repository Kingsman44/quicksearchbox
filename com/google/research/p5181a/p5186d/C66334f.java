package com.google.research.p5181a.p5186d;

/* renamed from: com.google.research.a.d.f */
/* compiled from: PG */
final class C66334f implements C66347s {

    /* renamed from: a */
    final /* synthetic */ C66343o f180372a;

    /* renamed from: b */
    final /* synthetic */ C66343o f180373b;

    /* renamed from: c */
    final /* synthetic */ C66340l f180374c;

    public C66334f(C66340l lVar, C66343o oVar, C66343o oVar2) {
        this.f180374c = lVar;
        this.f180372a = oVar;
        this.f180373b = oVar2;
    }

    /* renamed from: a */
    public final void mo59531a(int i) {
        C66340l lVar;
        C66340l lVar2 = this.f180374c;
        int i2 = lVar2.f180369j;
        int i3 = i / i2;
        int i4 = i % i2;
        double d = lVar2.f180364e.f180409c[(i2 * i3) + i4];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            lVar = this.f180374c;
            int i7 = lVar.f180368i;
            if (i6 >= i7) {
                break;
            }
            double[] dArr = lVar.f180393q.f180409c;
            int i8 = (lVar.f180369j * i6) + i4;
            dArr[i8] = dArr[i8] + (this.f180372a.f180409c[(i7 * i3) + i6] * d);
            i6++;
        }
        if (lVar.f180371l && this.f180373b != null) {
            while (true) {
                C66340l lVar3 = this.f180374c;
                int i9 = lVar3.f180369j;
                if (i5 >= i9) {
                    break;
                }
                double[] dArr2 = lVar3.f180394r.f180409c;
                int i10 = (i5 * i9) + i4;
                dArr2[i10] = dArr2[i10] + (this.f180373b.f180409c[(i9 * i3) + i5] * d);
                i5++;
            }
        }
        double[] dArr3 = this.f180374c.f180396t.f180409c;
        dArr3[i4] = dArr3[i4] + d;
    }
}
