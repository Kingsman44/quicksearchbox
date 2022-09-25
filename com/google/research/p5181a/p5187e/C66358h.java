package com.google.research.p5181a.p5187e;

import com.google.common.p4535g.C59203do;
import com.google.research.p5181a.p5186d.C66343o;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Arrays;

/* renamed from: com.google.research.a.e.h */
/* compiled from: PG */
public class C66358h implements C66372v {

    /* renamed from: a */
    public double f180439a = 0.001d;

    /* renamed from: b */
    public double[] f180440b;

    /* renamed from: c */
    public int f180441c;

    public C66358h(int i) {
        double[] dArr = new double[i];
        this.f180440b = dArr;
        Arrays.fill(dArr, 0.01d);
        this.f180441c = i;
    }

    /* renamed from: a */
    public void mo59585a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        this.f180441c = readInt;
        this.f180440b = new double[readInt];
        this.f180439a = dataInputStream.readDouble();
        for (int i = 0; i < this.f180441c; i++) {
            this.f180440b[i] = dataInputStream.readDouble();
        }
    }

    /* renamed from: b */
    public final C66367q mo59586b(C66343o oVar, int i) {
        double d;
        C66343o oVar2 = oVar;
        int i2 = oVar2.f180407a;
        int i3 = 0;
        while (i3 < i2) {
            double[] f = mo59591f(oVar2, i3);
            double d2 = (double) mo59590d(f);
            int length = f.length;
            if (i3 == i) {
                Double.isNaN(d2);
                d = 1.0d - d2;
            } else {
                Double.isNaN(d2);
                d = -d2;
            }
            int i4 = 0;
            while (i4 < length) {
                double[] dArr = this.f180440b;
                double d3 = dArr[i4];
                double d4 = 0.001d * d;
                this.f180439a += d4;
                dArr[i4] = (d3 - (1.0E-4d * d3)) + (d4 * f[i4]);
                i4++;
                i3 = i3;
            }
            i3++;
        }
        return new C66367q();
    }

    /* renamed from: c */
    public final void mo59587c(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.f180441c);
        dataOutputStream.writeDouble(this.f180439a);
        for (int i = 0; i < this.f180441c; i++) {
            dataOutputStream.writeDouble(this.f180440b[i]);
        }
    }

    /* renamed from: d */
    public final float mo59590d(double[] dArr) {
        if (dArr.length == this.f180440b.length) {
            double d = C59203do.f157270a;
            for (int i = 0; i < this.f180441c; i++) {
                d += dArr[i] * this.f180440b[i];
            }
            return (float) (1.0d / (Math.exp(-(d + this.f180439a)) + 1.0d));
        }
        throw new RuntimeException("Inconsistent vector length");
    }

    /* renamed from: e */
    public final float[] mo59589e(C66343o oVar) {
        int i = oVar.f180407a;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = mo59590d(mo59591f(oVar, i2));
        }
        return fArr;
    }

    /* renamed from: f */
    public final double[] mo59591f(C66343o oVar, int i) {
        double[] dArr = new double[this.f180441c];
        for (int i2 = 0; i2 < this.f180441c; i2++) {
            dArr[i2] = oVar.mo59550a(false, i, i2);
        }
        return dArr;
    }
}
