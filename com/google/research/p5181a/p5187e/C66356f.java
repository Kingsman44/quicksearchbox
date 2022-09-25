package com.google.research.p5181a.p5187e;

import com.google.common.p4535g.C59203do;
import com.google.research.p5181a.p5186d.C66343o;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Arrays;

/* renamed from: com.google.research.a.e.f */
/* compiled from: PG */
public final class C66356f implements C66372v {

    /* renamed from: c */
    private static final int[] f180435c = {0, 2, 7, 8};

    /* renamed from: a */
    protected double[] f180436a;

    /* renamed from: b */
    protected int f180437b;

    public C66356f(int i) {
        double[] dArr = new double[i];
        Arrays.fill(dArr, 0.1d);
        int i2 = i - 9;
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = f180435c[i3] + i2;
            double d = dArr[i4];
            dArr[i4] = d + d;
        }
        this.f180436a = dArr;
        this.f180437b = i;
    }

    /* renamed from: a */
    public final void mo59585a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        this.f180437b = readInt;
        this.f180436a = new double[readInt];
        for (int i = 0; i < this.f180437b; i++) {
            this.f180436a[i] = dataInputStream.readDouble();
        }
    }

    /* renamed from: b */
    public final C66367q mo59586b(C66343o oVar, int i) {
        C66343o oVar2 = oVar;
        int i2 = oVar2.f180407a;
        int i3 = oVar2.f180408b;
        float[] fArr = new float[i3];
        float[] d = mo59588d(oVar);
        float f = 0.0f;
        for (int i4 = 0; i4 < i2; i4++) {
            f += d[i4];
        }
        for (int i5 = 0; i5 < i3; i5++) {
            float f2 = 0.0f;
            for (int i6 = 0; i6 < i2; i6++) {
                double d2 = (double) (d[i6] / f);
                double a = oVar2.mo59550a(false, i6, i5);
                Double.isNaN(d2);
                f2 += (float) (d2 * a);
            }
            double d3 = (double) f2;
            double a2 = oVar2.mo59550a(false, i, i5);
            Double.isNaN(d3);
            fArr[i5] = (float) (d3 - a2);
        }
        for (int i7 = 0; i7 < i3; i7++) {
            double[] dArr = this.f180436a;
            double d4 = dArr[i7];
            double d5 = (double) fArr[i7];
            Double.isNaN(d5);
            dArr[i7] = (d4 - (d5 * 0.001d)) * 0.99d;
        }
        return new C66367q();
    }

    /* renamed from: c */
    public final void mo59587c(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.f180437b);
        for (int i = 0; i < this.f180437b; i++) {
            dataOutputStream.writeDouble(this.f180436a[i]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final float[] mo59588d(C66343o oVar) {
        C66343o oVar2 = oVar;
        int i = oVar2.f180408b;
        int i2 = oVar2.f180407a;
        float[] fArr = new float[i];
        float[] fArr2 = new float[i];
        float f = -1000.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            double[] dArr = new double[this.f180437b];
            for (int i4 = 0; i4 < this.f180437b; i4++) {
                dArr[i4] = oVar2.mo59550a(false, i3, i4);
            }
            double d = C59203do.f157270a;
            for (int i5 = 0; i5 < this.f180437b; i5++) {
                d += dArr[i5] * this.f180436a[i5];
            }
            float f2 = (float) d;
            fArr[i3] = f2;
            if (f2 > f) {
                f = f2;
            }
        }
        for (int i6 = 0; i6 < i2; i6++) {
            fArr2[i6] = (float) Math.exp((double) (fArr[i6] - f));
        }
        return fArr2;
    }

    /* renamed from: e */
    public final float[] mo59589e(C66343o oVar) {
        int i = oVar.f180407a;
        float[] fArr = new float[i];
        float[] d = mo59588d(oVar);
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += d[i2];
        }
        for (int i3 = 0; i3 < i; i3++) {
            fArr[i3] = d[i3] / f;
        }
        return fArr;
    }
}
