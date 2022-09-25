package androidx.core.content.p091b;

import com.google.common.p4535g.C59203do;

/* renamed from: androidx.core.content.b.y */
/* compiled from: PG */
final class C1876y {

    /* renamed from: a */
    static final C1876y f5757a;

    /* renamed from: b */
    public final float f5758b;

    /* renamed from: c */
    public final float f5759c;

    /* renamed from: d */
    public final float f5760d;

    /* renamed from: e */
    public final float f5761e = 0.69f;

    /* renamed from: f */
    public final float f5762f;

    /* renamed from: g */
    public final float[] f5763g;

    /* renamed from: h */
    public final float f5764h;

    /* renamed from: i */
    public final float f5765i;

    /* renamed from: j */
    public final float f5766j;

    static {
        float[] fArr = C1853b.f5727c;
        double c = (double) C1853b.m5079c();
        Double.isNaN(c);
        float f = (float) ((c * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = C1853b.f5725a;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr3[0];
        float f4 = fArr[1];
        float f5 = fArr3[1];
        float f6 = fArr[2];
        float f7 = (f3 * f2) + (f5 * f4) + (fArr3[2] * f6);
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[0] * f2) + (fArr4[1] * f4) + (fArr4[2] * f6);
        float[] fArr5 = fArr2[2];
        float f9 = (f2 * fArr5[0]) + (f4 * fArr5[1]) + (f6 * fArr5[2]);
        float exp = 1.0f - (((float) Math.exp((double) (((-f) - 0.10546875f) / 92.0f))) * 0.2777778f);
        double d = (double) exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < C59203do.f157270a) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp};
        float f10 = 1.0f / ((5.0f * f) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        double d2 = (double) f;
        Double.isNaN(d2);
        float cbrt = (f11 * f) + (0.1f * f12 * f12 * ((float) Math.cbrt(d2 * 5.0d)));
        float c2 = C1853b.m5079c() / fArr[1];
        double d3 = (double) c2;
        double sqrt = Math.sqrt(d3);
        float f13 = cbrt;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        double d4 = (double) (fArr6[0] * f13 * f7);
        Double.isNaN(d4);
        double d5 = (double) (fArr6[1] * f13 * f8);
        Double.isNaN(d5);
        double d6 = (double) (fArr6[2] * f13 * f9);
        Double.isNaN(d6);
        float pow2 = (float) Math.pow(d6 / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(d4 / 100.0d, 0.42d), (float) Math.pow(d5 / 100.0d, 0.42d), pow2};
        float f14 = fArr7[0];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr7[1];
        float pow3 = (float) Math.pow((double) f13, 0.25d);
        float f17 = ((float) sqrt) + 1.48f;
        float[] fArr8 = fArr6;
        f5757a = new C1876y(c2, (f15 + f15 + ((f16 * 400.0f) / (f16 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, fArr8, f13, pow3, f17);
    }

    private C1876y(float f, float f2, float f3, float f4, float[] fArr, float f5, float f6, float f7) {
        this.f5762f = f;
        this.f5758b = f2;
        this.f5759c = f3;
        this.f5760d = f4;
        this.f5763g = fArr;
        this.f5764h = f5;
        this.f5765i = f6;
        this.f5766j = f7;
    }
}
