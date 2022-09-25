package com.google.research.p5181a.p5186d;

/* renamed from: com.google.research.a.d.q */
/* compiled from: PG */
final class C66345q implements C66347s {

    /* renamed from: a */
    final /* synthetic */ int f180413a;

    /* renamed from: b */
    final /* synthetic */ C66343o f180414b;

    /* renamed from: c */
    final /* synthetic */ C66343o f180415c;

    /* renamed from: d */
    final /* synthetic */ C66343o f180416d;

    /* renamed from: e */
    final /* synthetic */ C66346r f180417e;

    public C66345q(C66346r rVar, int i, C66343o oVar, C66343o oVar2, C66343o oVar3) {
        this.f180417e = rVar;
        this.f180413a = i;
        this.f180414b = oVar;
        this.f180415c = oVar2;
        this.f180416d = oVar3;
    }

    /* renamed from: a */
    public final void mo59531a(int i) {
        int i2 = this.f180413a;
        if (i2 == 0) {
            int i3 = this.f180417e.f180418v;
            if (i3 == 0) {
                double[] dArr = this.f180414b.f180409c;
                double d = this.f180415c.f180409c[i];
                dArr[i] = (1.0d - d) * d * (d - dArr[i]);
            } else if (i3 == 1) {
                double[] dArr2 = this.f180414b.f180409c;
                dArr2[i] = this.f180415c.f180409c[i] - dArr2[i];
            }
        } else if (i2 == 2) {
            double[] dArr3 = this.f180414b.f180409c;
            dArr3[i] = this.f180415c.f180409c[i] - dArr3[i];
        } else {
            throw new RuntimeException("unsupported activation function for the output layer");
        }
        C66343o oVar = this.f180416d;
        if (oVar != null) {
            double[] dArr4 = this.f180414b.f180409c;
            dArr4[i] = dArr4[i] * oVar.f180409c[i];
        }
    }
}
