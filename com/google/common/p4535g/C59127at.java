package com.google.common.p4535g;

import java.io.Serializable;

/* renamed from: com.google.common.g.at */
/* compiled from: PG */
public final class C59127at implements Serializable {

    /* renamed from: a */
    public final double f157132a;

    /* renamed from: b */
    public final double f157133b;

    public C59127at() {
        this((double) C59203do.f157270a, (double) C59203do.f157270a);
    }

    public C59127at(double d, double d2) {
        this.f157132a = d;
        this.f157133b = d2;
    }

    /* renamed from: b */
    public static C59127at m91610b(double d, double d2) {
        return new C59127at(C59218l.m91868b(d), C59218l.m91868b(d2));
    }

    /* renamed from: c */
    public static C59127at m91611c(int i, int i2) {
        return new C59127at(C59218l.m91869c(i), C59218l.m91869c(i2));
    }

    /* renamed from: a */
    public final C59218l mo56452a(C59127at atVar) {
        double d = this.f157132a;
        double d2 = atVar.f157132a;
        double d3 = this.f157133b;
        double d4 = atVar.f157133b;
        double sin = Math.sin((d2 - d) * 0.5d);
        double sin2 = Math.sin((d4 - d3) * 0.5d);
        double asin = Math.asin(Math.sqrt(Math.min(1.0d, (sin * sin) + (sin2 * sin2 * Math.cos(d) * Math.cos(d2)))));
        return new C59218l(asin + asin);
    }

    /* renamed from: d */
    public final C59136bb mo56453d() {
        double d = this.f157132a;
        double d2 = this.f157133b;
        double cos = Math.cos(d);
        return new C59136bb(Math.cos(d2) * cos, Math.sin(d2) * cos, Math.sin(d));
    }

    /* renamed from: e */
    public final boolean mo56454e() {
        return Math.abs(this.f157132a) <= 1.5707963267948966d && Math.abs(this.f157133b) <= 3.141592653589793d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59127at) {
            C59127at atVar = (C59127at) obj;
            if (this.f157132a == atVar.f157132a && this.f157133b == atVar.f157133b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f157132a) + 646;
        long doubleToLongBits2 = doubleToLongBits + (37 * doubleToLongBits) + Double.doubleToLongBits(this.f157133b);
        return (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
    }

    public final String toString() {
        return "(" + this.f157132a + ", " + this.f157133b + ")";
    }

    public C59127at(C59218l lVar, C59218l lVar2) {
        this(lVar.f157299c, lVar2.f157299c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C59127at(com.google.common.p4535g.C59136bb r9) {
        /*
            r8 = this;
            double r0 = r9.f157164g
            double r2 = r9.f157162e
            double r4 = r9.f157163f
            r6 = 0
            double r0 = r0 + r6
            double r2 = r2 * r2
            double r4 = r4 * r4
            double r2 = r2 + r4
            double r2 = java.lang.Math.sqrt(r2)
            double r0 = java.lang.Math.atan2(r0, r2)
            double r2 = r9.f157163f
            double r2 = r2 + r6
            double r4 = r9.f157162e
            double r4 = r4 + r6
            double r2 = java.lang.Math.atan2(r2, r4)
            r8.<init>((double) r0, (double) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4535g.C59127at.<init>(com.google.common.g.bb):void");
    }
}
