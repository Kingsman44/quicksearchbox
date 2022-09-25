package androidx.constraintlayout.p079a.p080a.p081a;

import com.google.common.p4535g.C59203do;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: androidx.constraintlayout.a.a.a.k */
/* compiled from: PG */
public class C1601k {

    /* renamed from: a */
    public C1599i f4415a;

    /* renamed from: b */
    public String f4416b;

    /* renamed from: c */
    public int f4417c = 0;

    /* renamed from: d */
    public String f4418d = null;

    /* renamed from: e */
    public int f4419e = 0;

    /* renamed from: f */
    public final ArrayList f4420f = new ArrayList();

    /* renamed from: a */
    public void mo4527a(Object obj) {
    }

    /* renamed from: b */
    public final void mo4528b() {
        int i;
        int size = this.f4420f.size();
        if (size != 0) {
            Collections.sort(this.f4420f, new C1598h());
            double[] dArr = new double[size];
            int[] iArr = new int[2];
            char c = 1;
            iArr[1] = 3;
            char c2 = 0;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            this.f4415a = new C1599i(this.f4417c, this.f4418d, size);
            ArrayList arrayList = this.f4420f;
            int size2 = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size2) {
                C1600j jVar = (C1600j) arrayList.get(i2);
                float f = jVar.f4413d;
                double d = (double) f;
                Double.isNaN(d);
                dArr[i3] = d * 0.01d;
                double[] dArr3 = dArr2[i3];
                float f2 = jVar.f4411b;
                double[][] dArr4 = dArr2;
                dArr3[c2] = (double) f2;
                float f3 = jVar.f4412c;
                int i4 = size2;
                dArr3[c] = (double) f3;
                float f4 = jVar.f4414e;
                dArr3[2] = (double) f4;
                C1599i iVar = this.f4415a;
                int i5 = jVar.f4410a;
                double[] dArr5 = iVar.f4404c;
                double d2 = (double) i5;
                Double.isNaN(d2);
                dArr5[i3] = d2 / 100.0d;
                iVar.f4405d[i3] = f;
                iVar.f4406e[i3] = f3;
                iVar.f4407f[i3] = f4;
                iVar.f4403b[i3] = f2;
                i3++;
                i2++;
                dArr2 = dArr4;
                size2 = i4;
                c = 1;
                c2 = 0;
            }
            double[][] dArr6 = dArr2;
            C1599i iVar2 = this.f4415a;
            double[] dArr7 = iVar2.f4404c;
            int length = dArr7.length;
            int[] iArr2 = new int[2];
            iArr2[1] = 3;
            iArr2[0] = length;
            double[][] dArr8 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
            int length2 = iVar2.f4403b.length + 2;
            iVar2.f4409h = new double[length2];
            double[] dArr9 = new double[length2];
            if (dArr7[0] > C59203do.f157270a) {
                iVar2.f4402a.mo4532a(C59203do.f157270a, iVar2.f4405d[0]);
            }
            double[] dArr10 = iVar2.f4404c;
            int length3 = dArr10.length - 1;
            if (dArr10[length3] < 1.0d) {
                iVar2.f4402a.mo4532a(1.0d, iVar2.f4405d[length3]);
            }
            for (int i6 = 0; i6 < dArr8.length; i6++) {
                double[] dArr11 = dArr8[i6];
                dArr11[0] = (double) iVar2.f4406e[i6];
                dArr11[1] = (double) iVar2.f4407f[i6];
                dArr11[2] = (double) iVar2.f4403b[i6];
                iVar2.f4402a.mo4532a(iVar2.f4404c[i6], iVar2.f4405d[i6]);
            }
            C1604n nVar = iVar2.f4402a;
            double d3 = 0.0d;
            int i7 = 0;
            while (true) {
                float[] fArr = nVar.f4430a;
                if (i7 >= fArr.length) {
                    break;
                }
                double d4 = (double) fArr[i7];
                Double.isNaN(d4);
                d3 += d4;
                i7++;
            }
            double d5 = 0.0d;
            int i8 = 1;
            while (true) {
                float[] fArr2 = nVar.f4430a;
                if (i8 >= fArr2.length) {
                    break;
                }
                int i9 = i8 - 1;
                float f5 = fArr2[i9];
                float f6 = fArr2[i8];
                double[] dArr12 = nVar.f4431b;
                double d6 = (double) ((f5 + f6) / 2.0f);
                Double.isNaN(d6);
                d5 += (dArr12[i8] - dArr12[i9]) * d6;
                i8++;
            }
            int i10 = 0;
            while (true) {
                float[] fArr3 = nVar.f4430a;
                if (i10 >= fArr3.length) {
                    break;
                }
                double d7 = (double) fArr3[i10];
                Double.isNaN(d7);
                fArr3[i10] = (float) (d7 * (d3 / d5));
                i10++;
            }
            nVar.f4432c[0] = 0.0d;
            int i11 = 1;
            while (true) {
                float[] fArr4 = nVar.f4430a;
                if (i11 >= fArr4.length) {
                    break;
                }
                int i12 = i11 - 1;
                float f7 = fArr4[i12];
                float f8 = fArr4[i11];
                double[] dArr13 = nVar.f4431b;
                double d8 = dArr13[i11];
                double d9 = dArr13[i12];
                double[] dArr14 = nVar.f4432c;
                double d10 = dArr14[i12];
                double d11 = (double) ((f7 + f8) / 2.0f);
                Double.isNaN(d11);
                dArr14[i11] = d10 + ((d8 - d9) * d11);
                i11++;
            }
            double[] dArr15 = iVar2.f4404c;
            if (dArr15.length > 1) {
                i = 0;
                iVar2.f4408g = C1594d.m4236f(0, dArr15, dArr8);
            } else {
                i = 0;
                iVar2.f4408g = null;
            }
            C1594d.m4236f(i, dArr, dArr6);
        }
    }

    public final String toString() {
        String str = this.f4416b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        ArrayList arrayList = this.f4420f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1600j jVar = (C1600j) arrayList.get(i);
            str = str + "[" + jVar.f4410a + " , " + decimalFormat.format((double) jVar.f4411b) + "] ";
        }
        return str;
    }
}
