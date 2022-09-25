package com.google.research.p5181a.p5186d;

import com.google.common.p4535g.C59203do;

/* renamed from: com.google.research.a.d.g */
/* compiled from: PG */
final class C66335g implements C66347s {

    /* renamed from: a */
    final /* synthetic */ int f180375a;

    /* renamed from: b */
    final /* synthetic */ C66343o f180376b;

    /* renamed from: c */
    final /* synthetic */ C66343o f180377c;

    public C66335g(int i, C66343o oVar, C66343o oVar2) {
        this.f180375a = i;
        this.f180376b = oVar;
        this.f180377c = oVar2;
    }

    /* renamed from: a */
    public final void mo59531a(int i) {
        int i2 = this.f180375a;
        if (i2 == 1) {
            if (this.f180376b.f180409c[i] == C59203do.f157270a) {
                this.f180377c.f180409c[i] = 0.0d;
            }
        } else if (i2 == 0) {
            double[] dArr = this.f180377c.f180409c;
            double d = this.f180376b.f180409c[i];
            dArr[i] = d * (1.0d - d) * dArr[i];
        } else {
            throw new RuntimeException("Unsupported activation function: " + this.f180375a);
        }
    }
}
