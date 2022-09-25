package com.google.research.p5181a.p5186d;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* renamed from: com.google.research.a.d.o */
/* compiled from: PG */
public final class C66343o {

    /* renamed from: a */
    public int f180407a;

    /* renamed from: b */
    public int f180408b;

    /* renamed from: c */
    public double[] f180409c;

    public C66343o() {
    }

    public C66343o(int i, int i2) {
        this.f180407a = i;
        this.f180408b = i2;
        this.f180409c = new double[(i * i2)];
    }

    /* renamed from: i */
    public static void m97044i(C66343o oVar, C66343o oVar2, C66343o oVar3) {
        int i;
        int i2 = oVar.f180408b;
        int i3 = oVar2.f180408b;
        if (i2 == i3 && oVar.f180407a == (i = oVar2.f180407a) && oVar3.f180408b == i3 && oVar3.f180407a == i) {
            C66348t.m97072b();
            C66348t.m97071a(oVar3.f180409c.length, new C66341m(oVar3, oVar, oVar2));
            return;
        }
        throw new RuntimeException(oVar.f180407a + "x" + oVar.f180408b + " " + oVar2.f180407a + "x" + oVar2.f180408b + " " + oVar3.f180407a + "x" + oVar3.f180408b);
    }

    /* renamed from: j */
    public static void m97045j(C66343o oVar, C66343o oVar2, boolean z, C66343o oVar3) {
        if (oVar.f180408b == oVar2.mo59554d(z) && oVar3.f180407a == oVar.f180407a && oVar3.f180408b == oVar2.mo59551b(z)) {
            C66348t.m97072b();
            C66348t.m97071a(oVar3.f180409c.length, new C66342n(oVar3, oVar, oVar2, z));
            return;
        }
        throw new RuntimeException(oVar.f180407a + "x" + oVar.f180408b + " " + oVar2.mo59554d(z) + "x" + oVar2.mo59551b(z) + " " + oVar3.f180407a + "x" + oVar3.f180408b);
    }

    /* renamed from: a */
    public final double mo59550a(boolean z, int i, int i2) {
        if (i >= mo59554d(z)) {
            throw new RuntimeException("requested row: " + i + " >= " + mo59554d(z));
        } else if (i2 < mo59551b(z)) {
            return this.f180409c[mo59552c(z, i, i2)];
        } else {
            throw new RuntimeException("requested col: " + i2 + " >= " + mo59551b(z));
        }
    }

    /* renamed from: b */
    public final int mo59551b(boolean z) {
        return z ? this.f180407a : this.f180408b;
    }

    /* renamed from: c */
    public final int mo59552c(boolean z, int i, int i2) {
        return z ? (i2 * this.f180408b) + i : (i * this.f180408b) + i2;
    }

    /* renamed from: d */
    public final int mo59554d(boolean z) {
        return z ? this.f180408b : this.f180407a;
    }

    /* renamed from: e */
    public final C66343o clone() {
        C66343o oVar = new C66343o(this.f180407a, this.f180408b);
        int i = 0;
        while (true) {
            double[] dArr = this.f180409c;
            if (i >= dArr.length) {
                return oVar;
            }
            oVar.f180409c[i] = dArr[i];
            i++;
        }
    }

    /* renamed from: f */
    public final void mo59556f(DataInputStream dataInputStream, int i) {
        this.f180407a = dataInputStream.readInt();
        int readInt = dataInputStream.readInt();
        this.f180408b = readInt;
        int i2 = this.f180407a;
        int i3 = i2 * readInt;
        if (i > i2) {
            this.f180407a = i;
        } else {
            i = i2;
        }
        this.f180409c = new double[(i * readInt)];
        for (int i4 = 0; i4 < i3; i4++) {
            this.f180409c[i4] = dataInputStream.readDouble();
        }
    }

    /* renamed from: g */
    public final void mo59557g(float[] fArr) {
        if (this.f180409c.length == fArr.length) {
            for (int i = 0; i < fArr.length; i++) {
                this.f180409c[i] = (double) fArr[i];
            }
            return;
        }
        throw new RuntimeException();
    }

    /* renamed from: h */
    public final void mo59558h(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.f180407a);
        dataOutputStream.writeInt(this.f180408b);
        int i = 0;
        while (true) {
            double[] dArr = this.f180409c;
            if (i < dArr.length) {
                dataOutputStream.writeDouble(dArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public final void mo59559k(int i, int i2, double d) {
        this.f180409c[mo59552c(false, i, i2)] = d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f180407a; i++) {
            for (int i2 = 0; i2 < this.f180408b; i2++) {
                sb.append(mo59550a(false, i, i2) + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
