package androidx.core.content.p091b;

import android.graphics.Color;
import androidx.core.graphics.C1924a;
import com.google.common.p4535g.C59203do;

/* renamed from: androidx.core.content.b.a */
/* compiled from: PG */
final class C1852a {

    /* renamed from: a */
    public final float f5719a;

    /* renamed from: b */
    public final float f5720b;

    /* renamed from: c */
    public final float f5721c;

    /* renamed from: d */
    public final float f5722d;

    /* renamed from: e */
    public final float f5723e;

    /* renamed from: f */
    public final float f5724f;

    public C1852a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f5719a = f;
        this.f5720b = f2;
        this.f5721c = f3;
        this.f5722d = f4;
        this.f5723e = f5;
        this.f5724f = f6;
    }

    /* renamed from: b */
    static C1852a m5074b(int i, C1876y yVar) {
        C1876y yVar2 = yVar;
        float a = C1853b.m5077a(Color.red(i));
        float a2 = C1853b.m5077a(Color.green(i));
        float a3 = C1853b.m5077a(Color.blue(i));
        float[][] fArr = C1853b.f5728d;
        float[] fArr2 = fArr[0];
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        float[] fArr3 = fArr[1];
        float f4 = fArr3[0];
        float f5 = fArr3[1];
        float f6 = fArr3[2];
        float[] fArr4 = fArr[2];
        float[] fArr5 = {(f * a) + (f2 * a2) + (f3 * a3), (f4 * a) + (f5 * a2) + (f6 * a3), (a * fArr4[0]) + (a2 * fArr4[1]) + (a3 * fArr4[2])};
        float[][] fArr6 = C1853b.f5725a;
        float f7 = fArr5[0];
        float[] fArr7 = fArr6[0];
        float f8 = fArr7[0];
        float f9 = fArr5[1];
        float f10 = fArr7[1];
        float f11 = fArr5[2];
        float f12 = (f8 * f7) + (f10 * f9) + (fArr7[2] * f11);
        float[] fArr8 = fArr6[1];
        float f13 = (fArr8[0] * f7) + (fArr8[1] * f9);
        float f14 = fArr8[2];
        float[] fArr9 = fArr6[2];
        float f15 = fArr9[0];
        float f16 = fArr9[1];
        float f17 = fArr9[2];
        float[] fArr10 = yVar2.f5763g;
        float f18 = fArr10[0] * f12;
        float f19 = fArr10[1] * (f13 + (f14 * f11));
        float f20 = fArr10[2] * ((f7 * f15) + (f9 * f16) + (f11 * f17));
        double abs = (double) (yVar2.f5764h * Math.abs(f18));
        Double.isNaN(abs);
        float pow = (float) Math.pow(abs / 100.0d, 0.42d);
        double abs2 = (double) (yVar2.f5764h * Math.abs(f19));
        Double.isNaN(abs2);
        float pow2 = (float) Math.pow(abs2 / 100.0d, 0.42d);
        double abs3 = (double) (yVar2.f5764h * Math.abs(f20));
        Double.isNaN(abs3);
        float pow3 = (float) Math.pow(abs3 / 100.0d, 0.42d);
        float signum = ((Math.signum(f18) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f19) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f20) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = (double) signum3;
        double d2 = (double) signum;
        Double.isNaN(d2);
        double d3 = (double) signum2;
        Double.isNaN(d3);
        Double.isNaN(d);
        float f21 = ((float) (((d2 * 11.0d) + (d3 * -12.0d)) + d)) / 11.0f;
        double d4 = (double) (signum + signum2);
        Double.isNaN(d);
        Double.isNaN(d);
        Double.isNaN(d4);
        float f22 = ((float) (d4 - (d + d))) / 9.0f;
        float f23 = signum2 * 20.0f;
        float f24 = (((signum * 20.0f) + f23) + (21.0f * signum3)) / 20.0f;
        float f25 = (((signum * 40.0f) + f23) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f22, (double) f21)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 0.012451172f;
        }
        float f26 = atan2;
        float f27 = (3.1415927f * f26) / 180.0f;
        float f28 = yVar2.f5759c;
        float f29 = yVar2.f5758b;
        float f30 = yVar2.f5761e;
        float pow4 = ((float) Math.pow((double) ((f25 * f28) / f29), (double) (yVar2.f5766j * 0.69f))) * 100.0f;
        float f31 = yVar2.f5761e;
        Math.sqrt((double) (pow4 / 100.0f));
        float f32 = yVar2.f5758b;
        float f33 = yVar2.f5765i;
        double d5 = (double) (((double) f26) < 20.14d ? 360.0f + f26 : f26);
        Double.isNaN(d5);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) yVar2.f5762f), 0.73d)) * ((float) Math.pow((double) (((((((float) (Math.cos(((d5 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * yVar2.f5760d) * ((float) Math.sqrt((double) ((f21 * f21) + (f22 * f22))))) / (f24 + 0.305f)), 0.9d));
        double d6 = (double) pow4;
        Double.isNaN(d6);
        float sqrt = pow5 * ((float) Math.sqrt(d6 / 100.0d));
        float f34 = yVar2.f5765i;
        float f35 = yVar2.f5761e;
        Math.sqrt((double) ((pow5 * 0.69f) / (yVar2.f5758b + 4.0f)));
        float log = ((float) Math.log((double) ((f34 * sqrt * 0.0228f) + 1.0f))) * 43.85965f;
        double d7 = (double) f27;
        return new C1852a(f26, sqrt, pow4, (1.7f * pow4) / ((0.007f * pow4) + 1.0f), log * ((float) Math.cos(d7)), log * ((float) Math.sin(d7)));
    }

    /* renamed from: c */
    public static C1852a m5075c(float f, float f2, float f3, C1876y yVar) {
        float f4 = yVar.f5761e;
        double d = (double) f;
        Double.isNaN(d);
        double d2 = d / 100.0d;
        Math.sqrt(d2);
        float f5 = yVar.f5758b;
        float f6 = yVar.f5765i;
        double sqrt = Math.sqrt(d2);
        float f7 = yVar.f5761e;
        Math.sqrt((double) (((f2 / ((float) sqrt)) * 0.69f) / (yVar.f5758b + 4.0f)));
        double d3 = (double) (f6 * f2);
        Double.isNaN(d3);
        float log = ((float) Math.log((d3 * 0.0228d) + 1.0d)) * 43.85965f;
        double d4 = (double) ((3.1415927f * f3) / 180.0f);
        return new C1852a(f3, f2, f, (1.7f * f) / ((0.007f * f) + 1.0f), log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo5033a(C1876y yVar) {
        C1876y yVar2 = yVar;
        float f = this.f5720b;
        float f2 = 0.0f;
        if (((double) f) != C59203do.f157270a) {
            double d = (double) this.f5721c;
            if (d != C59203do.f157270a) {
                Double.isNaN(d);
                f2 = f / ((float) Math.sqrt(d / 100.0d));
            }
        }
        double d2 = (double) f2;
        double pow = Math.pow(1.64d - Math.pow(0.29d, (double) yVar2.f5762f), 0.73d);
        Double.isNaN(d2);
        float pow2 = (float) Math.pow(d2 / pow, 1.1111111111111112d);
        double d3 = (double) ((this.f5719a * 3.1415927f) / 180.0f);
        Double.isNaN(d3);
        double cos = Math.cos(2.0d + d3);
        float f3 = yVar2.f5758b;
        float f4 = this.f5721c;
        float f5 = yVar2.f5761e;
        float f6 = yVar2.f5766j;
        double d4 = (double) f4;
        Double.isNaN(d4);
        double d5 = (double) f6;
        Double.isNaN(d5);
        double pow3 = Math.pow(d4 / 100.0d, 1.4492753673265821d / d5);
        float f7 = yVar2.f5760d;
        float f8 = (f3 * ((float) pow3)) / yVar2.f5759c;
        float sin = (float) Math.sin(d3);
        float cos2 = (float) Math.cos(d3);
        float f9 = (((0.305f + f8) * 23.0f) * pow2) / ((((((((float) (cos + 3.8d)) * 0.25f) * 3846.1538f) * f7) * 23.0f) + ((11.0f * pow2) * cos2)) + ((pow2 * 108.0f) * sin));
        float f10 = cos2 * f9;
        float f11 = f9 * sin;
        float f12 = f8 * 460.0f;
        float f13 = (((451.0f * f10) + f12) + (288.0f * f11)) / 1403.0f;
        float f14 = ((f12 - (891.0f * f10)) - (261.0f * f11)) / 1403.0f;
        float f15 = ((f12 - (f10 * 220.0f)) - (f11 * 6300.0f)) / 1403.0f;
        float abs = Math.abs(f13);
        float abs2 = Math.abs(f13);
        double d6 = (double) abs;
        Double.isNaN(d6);
        double d7 = (double) abs2;
        Double.isNaN(d7);
        float signum = Math.signum(f13) * (100.0f / yVar2.f5764h) * ((float) Math.pow((double) ((float) Math.max(C59203do.f157270a, (d6 * 27.13d) / (400.0d - d7))), 2.380952380952381d));
        float abs3 = Math.abs(f14);
        float abs4 = Math.abs(f14);
        double d8 = (double) abs3;
        Double.isNaN(d8);
        double d9 = (double) abs4;
        Double.isNaN(d9);
        float signum2 = Math.signum(f14) * (100.0f / yVar2.f5764h) * ((float) Math.pow((double) ((float) Math.max(C59203do.f157270a, (d8 * 27.13d) / (400.0d - d9))), 2.380952380952381d));
        float abs5 = Math.abs(f15);
        float abs6 = Math.abs(f15);
        double d10 = (double) abs5;
        Double.isNaN(d10);
        double d11 = (double) abs6;
        Double.isNaN(d11);
        double max = Math.max(C59203do.f157270a, (d10 * 27.13d) / (400.0d - d11));
        float signum3 = Math.signum(f15);
        float f16 = yVar2.f5764h;
        double pow4 = Math.pow((double) ((float) max), 2.380952380952381d);
        float[] fArr = yVar2.f5763g;
        float f17 = signum / fArr[0];
        float f18 = signum2 / fArr[1];
        float f19 = ((signum3 * (100.0f / f16)) * ((float) pow4)) / fArr[2];
        float[][] fArr2 = C1853b.f5726b;
        float[] fArr3 = fArr2[0];
        float f20 = fArr3[0];
        float f21 = fArr3[1];
        float f22 = fArr3[2];
        float[] fArr4 = fArr2[1];
        float f23 = fArr4[0];
        float f24 = fArr4[1];
        float f25 = fArr4[2];
        float[] fArr5 = fArr2[2];
        return C1924a.m5185d((double) ((f20 * f17) + (f21 * f18) + (f22 * f19)), (double) ((f23 * f17) + (f24 * f18) + (f25 * f19)), (double) ((f17 * fArr5[0]) + (f18 * fArr5[1]) + (f19 * fArr5[2])));
    }
}
