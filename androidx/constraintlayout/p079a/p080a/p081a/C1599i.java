package androidx.constraintlayout.p079a.p080a.p081a;

import com.google.common.p4535g.C59203do;
import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.a.a.a.i */
/* compiled from: PG */
public final class C1599i {

    /* renamed from: a */
    C1604n f4402a;

    /* renamed from: b */
    float[] f4403b;

    /* renamed from: c */
    double[] f4404c;

    /* renamed from: d */
    float[] f4405d;

    /* renamed from: e */
    float[] f4406e;

    /* renamed from: f */
    float[] f4407f;

    /* renamed from: g */
    C1594d f4408g;

    /* renamed from: h */
    double[] f4409h;

    public C1599i(int i, String str, int i2) {
        long j;
        String str2 = str;
        int i3 = i2;
        C1604n nVar = new C1604n();
        this.f4402a = nVar;
        nVar.f4435f = i;
        nVar.f4433d = str2;
        if (nVar.f4433d != null) {
            double[] dArr = new double[(str.length() / 2)];
            int indexOf = str2.indexOf(40) + 1;
            int indexOf2 = str2.indexOf(44, indexOf);
            char c = 0;
            int i4 = 0;
            while (indexOf2 != -1) {
                dArr[i4] = Double.parseDouble(str2.substring(indexOf, indexOf2).trim());
                indexOf = indexOf2 + 1;
                indexOf2 = str2.indexOf(44, indexOf);
                i4++;
            }
            dArr[i4] = Double.parseDouble(str2.substring(indexOf, str2.indexOf(41, indexOf)).trim());
            double[] copyOf = Arrays.copyOf(dArr, i4 + 1);
            int length = copyOf.length;
            int i5 = (length * 3) - 2;
            int i6 = length - 1;
            double d = (double) i6;
            Double.isNaN(d);
            double d2 = 1.0d / d;
            int[] iArr = new int[2];
            iArr[1] = 1;
            iArr[0] = i5;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            double[] dArr3 = new double[i5];
            int i7 = 0;
            while (i7 < copyOf.length) {
                double d3 = copyOf[i7];
                int i8 = i7 + i6;
                dArr2[i8][c] = d3;
                double d4 = (double) i7;
                Double.isNaN(d4);
                double d5 = d4 * d2;
                dArr3[i8] = d5;
                if (i7 > 0) {
                    int i9 = i6 + i6 + i7;
                    j = 4607182418800017408L;
                    dArr2[i9][0] = d3 + 1.0d;
                    dArr3[i9] = d5 + 1.0d;
                    int i10 = i7 - 1;
                    dArr2[i10][0] = (d3 - 4.0d) - d2;
                    dArr3[i10] = (d5 - 4.0d) - d2;
                } else {
                    j = 4607182418800017408L;
                }
                i7++;
                long j2 = j;
                c = 0;
            }
            nVar.f4434e = new C1603m(dArr3, dArr2);
        }
        this.f4403b = new float[i3];
        this.f4404c = new double[i3];
        this.f4405d = new float[i3];
        this.f4406e = new float[i3];
        this.f4407f = new float[i3];
        float[] fArr = new float[i3];
    }

    /* renamed from: a */
    public final double mo4526a(float f) {
        double d;
        float f2 = f;
        C1594d dVar = this.f4408g;
        if (dVar != null) {
            dVar.mo4516a((double) f2, this.f4409h);
        } else {
            double[] dArr = this.f4409h;
            dArr[0] = (double) this.f4406e[0];
            dArr[1] = (double) this.f4407f[0];
            dArr[2] = (double) this.f4403b[0];
        }
        double[] dArr2 = this.f4409h;
        double d2 = dArr2[0];
        double d3 = dArr2[1];
        C1604n nVar = this.f4402a;
        double d4 = (double) f2;
        double d5 = C59203do.f157270a;
        if (d4 < C59203do.f157270a) {
            d4 = 0.0d;
        } else if (d4 > 1.0d) {
            d4 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(nVar.f4431b, d4);
        if (binarySearch > 0) {
            d5 = 1.0d;
        } else if (binarySearch != 0) {
            int i = (-binarySearch) - 1;
            float[] fArr = nVar.f4430a;
            float f3 = fArr[i];
            int i2 = i - 1;
            float f4 = fArr[i2];
            double[] dArr3 = nVar.f4431b;
            double d6 = dArr3[i];
            double d7 = dArr3[i2];
            double d8 = (double) (f3 - f4);
            Double.isNaN(d8);
            double d9 = d8 / (d6 - d7);
            double d10 = nVar.f4432c[i2];
            double d11 = (double) f4;
            Double.isNaN(d11);
            d5 = d10 + ((d11 - (d9 * d7)) * (d4 - d7)) + ((d9 * ((d4 * d4) - (d7 * d7))) / 2.0d);
        }
        double d12 = d5 + d3;
        switch (nVar.f4435f) {
            case 1:
                d = Math.signum(0.5d - (d12 % 1.0d));
                break;
            case 2:
                d = 1.0d - Math.abs((((d12 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                d = -1.0d + (((d12 + d12) + 1.0d) % 2.0d);
                break;
            case 4:
                d = 1.0d - (((d12 + d12) + 1.0d) % 2.0d);
                break;
            case 5:
                double d13 = nVar.f4436g;
                d = Math.cos((d3 + d12) * 6.283185307179586d);
                break;
            case 6:
                double abs = 1.0d - Math.abs(((d12 * 4.0d) % 4.0d) - 2.0d);
                d = 1.0d - (abs * abs);
                break;
            case 7:
                d = nVar.f4434e.mo4520e(d12 % 1.0d);
                break;
            default:
                double d14 = nVar.f4436g;
                d = Math.sin(d12 * 6.283185307179586d);
                break;
        }
        return d2 + (d * this.f4409h[2]);
    }
}
