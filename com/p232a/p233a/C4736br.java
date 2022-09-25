package com.p232a.p233a;

import com.google.common.p4535g.C59203do;

/* renamed from: com.a.a.br */
/* compiled from: PG */
final class C4736br {

    /* renamed from: a */
    public final float f14870a;

    /* renamed from: b */
    public final float f14871b;

    /* renamed from: c */
    public float f14872c = 0.0f;

    /* renamed from: d */
    public float f14873d = 0.0f;

    public C4736br(float f, float f2, float f3, float f4) {
        this.f14870a = f;
        this.f14871b = f2;
        double sqrt = Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
        if (sqrt != C59203do.f157270a) {
            double d = (double) f3;
            Double.isNaN(d);
            this.f14872c = (float) (d / sqrt);
            double d2 = (double) f4;
            Double.isNaN(d2);
            this.f14873d = (float) (d2 / sqrt);
        }
    }

    /* renamed from: a */
    public final void mo9625a(C4736br brVar) {
        this.f14872c += brVar.f14872c;
        this.f14873d += brVar.f14873d;
    }

    /* renamed from: b */
    public final void mo9626b(float f, float f2) {
        float f3 = f - this.f14870a;
        float f4 = f2 - this.f14871b;
        double sqrt = Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
        if (sqrt != C59203do.f157270a) {
            float f5 = this.f14872c;
            double d = (double) f3;
            Double.isNaN(d);
            this.f14872c = f5 + ((float) (d / sqrt));
            float f6 = this.f14873d;
            double d2 = (double) f4;
            Double.isNaN(d2);
            this.f14873d = f6 + ((float) (d2 / sqrt));
        }
    }

    public final String toString() {
        float f = this.f14870a;
        float f2 = this.f14871b;
        float f3 = this.f14872c;
        float f4 = this.f14873d;
        return "(" + f + "," + f2 + " " + f3 + "," + f4 + ")";
    }
}
