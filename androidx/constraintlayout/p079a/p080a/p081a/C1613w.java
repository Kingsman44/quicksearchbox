package androidx.constraintlayout.p079a.p080a.p081a;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* renamed from: androidx.constraintlayout.a.a.a.w */
/* compiled from: PG */
public class C1613w {

    /* renamed from: a */
    protected C1594d f4467a;

    /* renamed from: b */
    public int f4468b = 0;

    /* renamed from: c */
    protected final int[] f4469c = new int[10];

    /* renamed from: d */
    protected final float[][] f4470d = ((float[][]) Array.newInstance(Float.TYPE, new int[]{10, 3}));

    /* renamed from: e */
    protected int f4471e;

    /* renamed from: f */
    public String f4472f;

    /* renamed from: g */
    protected final float[] f4473g = new float[3];

    /* renamed from: h */
    public boolean f4474h = false;

    /* renamed from: i */
    public long f4475i;

    /* renamed from: j */
    protected float f4476j = Float.NaN;

    /* renamed from: b */
    public void mo4544b(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.f4469c;
        int i3 = this.f4471e;
        iArr[i3] = i;
        float[] fArr = this.f4470d[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.f4468b = Math.max(this.f4468b, i2);
        this.f4471e++;
    }

    /* renamed from: c */
    public void mo4545c(int i) {
        int i2 = this.f4471e;
        if (i2 == 0) {
            System.err.println("Error no points added to ".concat(String.valueOf(this.f4472f)));
            return;
        }
        int[] iArr = this.f4469c;
        float[][] fArr = this.f4470d;
        int[] iArr2 = new int[20];
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
                        C1612v.m4287a(iArr, fArr, i9, i8);
                        i9++;
                    }
                    i8++;
                }
                C1612v.m4287a(iArr, fArr, i9, i6);
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
        int i14 = 0;
        while (true) {
            int[] iArr3 = this.f4469c;
            if (i13 >= 10) {
                break;
            }
            if (iArr3[i13] != iArr3[i13 - 1]) {
                i14++;
            }
            i13++;
        }
        if (i14 == 0) {
            i14 = 1;
        }
        double[] dArr = new double[i14];
        int[] iArr4 = new int[2];
        iArr4[1] = 3;
        iArr4[0] = i14;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr4);
        int i15 = 0;
        for (int i16 = 0; i16 < this.f4471e; i16++) {
            if (i16 > 0) {
                int[] iArr5 = this.f4469c;
                if (iArr5[i16] == iArr5[i16 - 1]) {
                }
            }
            double d = (double) this.f4469c[i16];
            Double.isNaN(d);
            dArr[i15] = d * 0.01d;
            double[] dArr3 = dArr2[i15];
            float[] fArr2 = this.f4470d[i16];
            dArr3[0] = (double) fArr2[0];
            dArr3[1] = (double) fArr2[1];
            dArr3[2] = (double) fArr2[2];
            i15++;
        }
        this.f4467a = C1594d.m4236f(i, dArr, dArr2);
    }

    public final String toString() {
        String str = this.f4472f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f4471e; i++) {
            str = str + "[" + this.f4469c[i] + " , " + decimalFormat.format(this.f4470d[i]) + "] ";
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo4543a(float f) {
        float abs;
        switch (this.f4468b) {
            case 1:
                return Math.signum(f * 6.2831855f);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f + f) + 1.0f) % 2.0f) - 4.0f;
            case 4:
                abs = ((f + f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f * 6.2831855f));
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin((double) (f * 6.2831855f));
        }
        return 1.0f - abs;
    }
}
