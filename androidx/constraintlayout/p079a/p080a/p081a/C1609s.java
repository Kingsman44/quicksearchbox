package androidx.constraintlayout.p079a.p080a.p081a;

import com.google.common.p4535g.C59203do;
import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.a.a.a.s */
/* compiled from: PG */
public final class C1609s extends C1596f {

    /* renamed from: a */
    C1603m f4453a;

    public C1609s(String str) {
        String str2 = str;
        this.f4400g = str2;
        double[] dArr = new double[(this.f4400g.length() / 2)];
        int indexOf = str2.indexOf(40) + 1;
        int indexOf2 = str2.indexOf(44, indexOf);
        int i = 0;
        while (indexOf2 != -1) {
            dArr[i] = Double.parseDouble(str2.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str2.indexOf(44, indexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str2.substring(indexOf, str2.indexOf(41, indexOf)).trim());
        double[] copyOf = Arrays.copyOf(dArr, i + 1);
        int length = copyOf.length;
        int i2 = (length * 3) - 2;
        int i3 = length - 1;
        double d = (double) i3;
        Double.isNaN(d);
        double d2 = 1.0d / d;
        int[] iArr = new int[2];
        iArr[1] = 1;
        iArr[0] = i2;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
        double[] dArr3 = new double[i2];
        for (int i4 = 0; i4 < copyOf.length; i4++) {
            double d3 = copyOf[i4];
            int i5 = i4 + i3;
            dArr2[i5][0] = d3;
            double d4 = (double) i4;
            Double.isNaN(d4);
            double d5 = d4 * d2;
            dArr3[i5] = d5;
            if (i4 > 0) {
                int i6 = i3 + i3 + i4;
                dArr2[i6][0] = d3 + 1.0d;
                dArr3[i6] = d5 + 1.0d;
                int i7 = i4 - 1;
                dArr2[i7][0] = (d3 - 4.0d) - d2;
                dArr3[i7] = (d5 - 4.0d) - d2;
            }
        }
        C1603m mVar = new C1603m(dArr3, dArr2);
        System.out.println(" 0 " + mVar.mo4520e(C59203do.f157270a));
        System.out.println(" 1 " + mVar.mo4520e(1.0d));
        this.f4453a = mVar;
    }

    /* renamed from: a */
    public final double mo4521a(double d) {
        return this.f4453a.mo4520e(d);
    }

    /* renamed from: b */
    public final double mo4522b(double d) {
        return this.f4453a.mo4531g(d);
    }
}
