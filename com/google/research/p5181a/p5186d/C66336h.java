package com.google.research.p5181a.p5186d;

/* renamed from: com.google.research.a.d.h */
/* compiled from: PG */
final class C66336h implements C66347s {

    /* renamed from: a */
    final /* synthetic */ C66340l f180378a;

    public C66336h(C66340l lVar) {
        this.f180378a = lVar;
    }

    /* renamed from: a */
    public final void mo59531a(int i) {
        C66340l lVar;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            lVar = this.f180378a;
            if (i3 >= lVar.f180368i) {
                break;
            }
            int i4 = lVar.f180369j;
            C66343o oVar = lVar.f180391o;
            boolean z = lVar.f180390n;
            double d = C66333e.f180360a;
            double d2 = lVar.f180393q.f180409c[(i4 * i3) + i];
            double[] dArr = oVar.f180409c;
            int c = oVar.mo59552c(z, i3, i);
            dArr[c] = dArr[c] + ((-d) * d2);
            i3++;
        }
        if (lVar.f180371l) {
            while (true) {
                C66340l lVar2 = this.f180378a;
                int i5 = lVar2.f180369j;
                if (i2 >= i5) {
                    break;
                }
                double[] dArr2 = lVar2.f180392p.f180409c;
                int i6 = (i5 * i2) + i;
                dArr2[i6] = dArr2[i6] - (C66333e.f180360a * lVar2.f180394r.f180409c[i6]);
                i2++;
            }
        }
        if (!Double.isNaN(this.f180378a.f180396t.f180409c[i])) {
            C66340l lVar3 = this.f180378a;
            double[] dArr3 = lVar3.f180395s.f180409c;
            dArr3[i] = dArr3[i] - (C66333e.f180360a * lVar3.f180396t.f180409c[i]);
            return;
        }
        throw new RuntimeException("NaN in bias gradients...");
    }
}
