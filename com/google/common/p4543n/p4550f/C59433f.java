package com.google.common.p4543n.p4550f;

/* renamed from: com.google.common.n.f.f */
/* compiled from: PG */
final class C59433f {

    /* renamed from: a */
    public double f157663a = 1.0d;

    /* renamed from: b */
    private int f157664b = 2;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo56944a(double d) {
        while (true) {
            double d2 = this.f157663a;
            if (d >= 1.5d * d2) {
                int i = this.f157664b;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                } else if (i2 == 0) {
                    this.f157663a = d2 + d2;
                    this.f157664b = 2;
                } else if (i2 == 1) {
                    this.f157663a = d2 + d2;
                    this.f157664b = 3;
                } else if (i2 == 2) {
                    this.f157663a = d2 * 2.5d;
                    this.f157664b = 1;
                }
            } else {
                return;
            }
        }
    }
}
