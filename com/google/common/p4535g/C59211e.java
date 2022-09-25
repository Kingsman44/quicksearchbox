package com.google.common.p4535g;

/* renamed from: com.google.common.g.e */
/* compiled from: PG */
public final class C59211e {

    /* renamed from: a */
    public final double[] f157284a;

    /* renamed from: b */
    public final int f157285b;

    /* renamed from: c */
    private final int f157286c = 3;

    public C59211e(int i) {
        this.f157285b = i;
        this.f157284a = new double[(i * 3)];
    }

    /* renamed from: b */
    public static C59211e m91844b(C59136bb... bbVarArr) {
        C59211e eVar = new C59211e(bbVarArr.length);
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < eVar.f157285b; i2++) {
                eVar.mo56580c(i, i2, bbVarArr[i2].mo56498c(i));
            }
        }
        return eVar;
    }

    /* renamed from: a */
    public final double mo56579a(int i, int i2) {
        return this.f157284a[(i * this.f157285b) + i2];
    }

    /* renamed from: c */
    public final void mo56580c(int i, int i2, double d) {
        this.f157284a[(i * this.f157285b) + i2] = d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C59211e)) {
            return false;
        }
        C59211e eVar = (C59211e) obj;
        int i = eVar.f157286c;
        if (this.f157285b != eVar.f157285b) {
            return false;
        }
        int i2 = 0;
        while (true) {
            double[] dArr = this.f157284a;
            if (i2 >= dArr.length) {
                return true;
            }
            if (dArr[i2] != eVar.f157284a[i2]) {
                return false;
            }
            i2++;
        }
    }

    public final int hashCode() {
        long j = ((long) this.f157285b) * 37;
        int i = 0;
        while (true) {
            double[] dArr = this.f157284a;
            if (i >= dArr.length) {
                return (int) j;
            }
            j = (j * 37) + Double.doubleToLongBits(dArr[i]);
            i++;
        }
    }
}
