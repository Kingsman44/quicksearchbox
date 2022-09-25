package androidx.constraintlayout.p079a.p080a.p081a;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.a.a.a.q */
/* compiled from: PG */
public class C1607q {

    /* renamed from: a */
    protected C1594d f4439a;

    /* renamed from: b */
    protected int[] f4440b = new int[10];

    /* renamed from: c */
    protected float[] f4441c = new float[10];

    /* renamed from: d */
    public String f4442d;

    /* renamed from: e */
    private int f4443e;

    /* renamed from: a */
    public final float mo4534a(float f) {
        return (float) this.f4439a.mo4520e((double) f);
    }

    /* renamed from: b */
    public void mo4535b(int i, float f) {
        int[] iArr = this.f4440b;
        int length = iArr.length;
        if (length < this.f4443e + 1) {
            this.f4440b = Arrays.copyOf(iArr, length + length);
            float[] fArr = this.f4441c;
            int length2 = fArr.length;
            this.f4441c = Arrays.copyOf(fArr, length2 + length2);
        }
        int[] iArr2 = this.f4440b;
        int i2 = this.f4443e;
        iArr2[i2] = i;
        this.f4441c[i2] = f;
        this.f4443e = i2 + 1;
    }

    /* renamed from: c */
    public void mo4536c(int i) {
        int i2 = this.f4443e;
        if (i2 != 0) {
            int[] iArr = this.f4440b;
            float[] fArr = this.f4441c;
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i2 - 1;
            iArr2[1] = 0;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int i7 = iArr[i6];
                    int i8 = i5;
                    int i9 = i8;
                    while (i8 < i6) {
                        if (iArr[i8] <= i7) {
                            C1606p.m4270a(iArr, fArr, i9, i8);
                            i9++;
                        }
                        i8++;
                    }
                    C1606p.m4270a(iArr, fArr, i9, i6);
                    int i10 = i3 + 1;
                    iArr2[i3] = i9 - 1;
                    int i11 = i10 + 1;
                    iArr2[i10] = i5;
                    int i12 = i11 + 1;
                    iArr2[i11] = i6;
                    i3 = i12 + 1;
                    iArr2[i12] = i9 + 1;
                }
            }
            int i13 = 1;
            for (int i14 = 1; i14 < this.f4443e; i14++) {
                int[] iArr3 = this.f4440b;
                if (iArr3[i14 - 1] != iArr3[i14]) {
                    i13++;
                }
            }
            double[] dArr = new double[i13];
            int[] iArr4 = new int[2];
            iArr4[1] = 1;
            iArr4[0] = i13;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr4);
            int i15 = 0;
            for (int i16 = 0; i16 < this.f4443e; i16++) {
                if (i16 > 0) {
                    int[] iArr5 = this.f4440b;
                    if (iArr5[i16] == iArr5[i16 - 1]) {
                    }
                }
                double d = (double) this.f4440b[i16];
                Double.isNaN(d);
                dArr[i15] = d * 0.01d;
                dArr2[i15][0] = (double) this.f4441c[i16];
                i15++;
            }
            this.f4439a = C1594d.m4236f(i, dArr, dArr2);
        }
    }

    public final String toString() {
        String str = this.f4442d;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f4443e; i++) {
            str = str + "[" + this.f4440b[i] + " , " + decimalFormat.format((double) this.f4441c[i]) + "] ";
        }
        return str;
    }
}
