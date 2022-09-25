package com.google.android.apps.gsa.nga.engine.p5964av.p5965b;

import com.google.common.p4535g.C59203do;

/* renamed from: com.google.android.apps.gsa.nga.engine.av.b.v */
/* compiled from: PG */
public class C75068v extends u {

    /* renamed from: c */
    private final double f209357c;

    /* renamed from: d */
    private final double f209358d;

    public C75068v() {
        this(0.01d, 128.0d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo71426c() {
        float[][] fArr;
        int length;
        int i;
        double d;
        char c = 0;
        int i2 = 0;
        while (true) {
            fArr = this.a;
            length = fArr.length;
            if (i2 >= length) {
                break;
            }
            double[] dArr = this.b;
            float[] fArr2 = fArr[i2];
            double d2 = this.f209358d;
            int i3 = (int) ((dArr[dArr.length - 1] - dArr[c]) * d2);
            if (i3 == 0) {
                i3 = 1;
            }
            float[] fArr3 = new float[i3];
            fArr3[c] = fArr2[c];
            int i4 = 1;
            int i5 = 0;
            while (i4 < i3) {
                double d3 = dArr[c];
                int i6 = i2;
                double d4 = (double) i4;
                Double.isNaN(d4);
                double d5 = d3 + (d4 / d2);
                while (true) {
                    i = i5 + 1;
                    d = dArr[i];
                    if (d5 <= d) {
                        break;
                    }
                    i5 = i;
                }
                float f = fArr2[i5];
                float f2 = fArr2[i];
                double d6 = dArr[i5];
                float[] fArr4 = fArr3;
                double d7 = (double) f;
                Double.isNaN(d7);
                double d8 = (double) f2;
                Double.isNaN(d8);
                fArr4[i4] = (float) (((d7 * (d - d5)) + (d8 * (d5 - d6))) / (d - d6));
                i4++;
                i2 = i6;
                fArr3 = fArr4;
                c = 0;
            }
            int i7 = i2;
            fArr[i7] = fArr3;
            float[][] fArr5 = this.a;
            float[] fArr6 = fArr5[i7];
            int round = (int) Math.round(this.f209358d * this.f209357c);
            for (int i8 = 0; i8 < 3; i8++) {
                int length2 = fArr6.length;
                double[] dArr2 = new double[(length2 + 1)];
                double d9 = C59203do.f157270a;
                for (int i9 = 0; i9 < length2; i9++) {
                    dArr2[i9] = d9;
                    double d10 = (double) fArr6[i9];
                    Double.isNaN(d10);
                    d9 += d10;
                }
                dArr2[length2] = d9;
                fArr6 = new float[length2];
                for (int i10 = 0; i10 < length2; i10++) {
                    int max = Math.max(i10 - round, 0);
                    int min = Math.min(i10 + round, length2 - 1);
                    double d11 = dArr2[min + 1] - dArr2[max];
                    double d12 = (double) ((min - max) + 1);
                    Double.isNaN(d12);
                    fArr6[i10] = (float) (d11 / d12);
                }
            }
            fArr5[i7] = fArr6;
            i2 = i7 + 1;
            c = 0;
        }
        double[] dArr3 = this.b;
        if (dArr3.length > 0 && length > 0) {
            double d13 = dArr3[0];
            this.b = new double[fArr[0].length];
            int i11 = 0;
            while (true) {
                double[] dArr4 = this.b;
                if (i11 < dArr4.length) {
                    double d14 = (double) i11;
                    double d15 = this.f209358d;
                    Double.isNaN(d14);
                    dArr4[i11] = (d14 / d15) + d13;
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public C75068v(double d, double d2) {
        this.f209357c = d;
        this.f209358d = d2;
    }
}
