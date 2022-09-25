package com.google.common.p4535g;

import java.io.Serializable;

/* renamed from: com.google.common.g.n */
/* compiled from: PG */
public final class C59220n implements Cloneable, Serializable {

    /* renamed from: a */
    public double f157306a;

    /* renamed from: b */
    public double f157307b;

    public C59220n() {
        this(3.141592653589793d, -3.141592653589793d);
    }

    /* renamed from: b */
    public static double m91880b(double d, double d2) {
        double d3 = d2 - d;
        return d3 >= C59203do.f157270a ? d3 : (d2 + 3.141592653589793d) - (d - 1.4292036732051034d);
    }

    /* renamed from: c */
    public static C59220n m91881c() {
        C59220n nVar = new C59220n();
        nVar.mo56629g();
        return nVar;
    }

    /* renamed from: d */
    public static C59220n m91882d() {
        C59220n nVar = new C59220n();
        nVar.mo56630h();
        return nVar;
    }

    /* renamed from: a */
    public final double mo56625a() {
        double d = this.f157307b - this.f157306a;
        if (d >= C59203do.f157270a) {
            return d;
        }
        double d2 = d + 6.283185307179586d;
        if (d2 > C59203do.f157270a) {
            return d2;
        }
        return -1.0d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo56626e(double d, double d2) {
        if (d == -3.141592653589793d) {
            d = 3.141592653589793d;
        }
        if (d2 == -3.141592653589793d) {
            d2 = 3.141592653589793d;
        }
        if (m91880b(d, d2) <= 3.141592653589793d) {
            this.f157306a = d;
            this.f157307b = d2;
            return;
        }
        this.f157306a = d2;
        this.f157307b = d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59220n) {
            C59220n nVar = (C59220n) obj;
            if (this.f157306a == nVar.f157306a && this.f157307b == nVar.f157307b) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo56628f(double d, double d2, boolean z) {
        this.f157306a = d;
        this.f157307b = d2;
        if (!z) {
            if (d == -3.141592653589793d && d2 != 3.141592653589793d) {
                this.f157306a = 3.141592653589793d;
            }
            if (d2 == -3.141592653589793d && d != 3.141592653589793d) {
                this.f157307b = 3.141592653589793d;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo56629g() {
        this.f157306a = 3.141592653589793d;
        this.f157307b = -3.141592653589793d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo56630h() {
        this.f157306a = -3.141592653589793d;
        this.f157307b = 3.141592653589793d;
    }

    public final int hashCode() {
        long doubleToLongBits = ((Double.doubleToLongBits(this.f157306a) + 629) * 37) + Double.doubleToLongBits(this.f157307b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo56632i(C59220n nVar) {
        if (!nVar.mo56635l()) {
            double d = nVar.f157306a;
            if (mo56634k(d)) {
                double d2 = nVar.f157307b;
                if (!mo56634k(d2)) {
                    this.f157307b = d2;
                } else if (!mo56633j(nVar)) {
                    mo56630h();
                }
            } else {
                double d3 = nVar.f157307b;
                if (mo56634k(d3)) {
                    this.f157306a = d;
                    return;
                }
                if (!mo56635l()) {
                    double d4 = this.f157306a;
                    if (!nVar.mo56634k(d4)) {
                        if (m91880b(d3, d4) < m91880b(this.f157307b, d)) {
                            this.f157306a = d;
                            return;
                        } else {
                            this.f157307b = d3;
                            return;
                        }
                    }
                }
                this.f157306a = d;
                this.f157307b = d3;
            }
        }
    }

    /* renamed from: j */
    public final boolean mo56633j(C59220n nVar) {
        if (!mo56637n()) {
            return nVar.mo56637n() ? mo56636m() || nVar.mo56635l() : nVar.f157306a >= this.f157306a && nVar.f157307b <= this.f157307b;
        }
        boolean n = nVar.mo56637n();
        double d = nVar.f157306a;
        double d2 = this.f157306a;
        return n ? d >= d2 && nVar.f157307b <= this.f157307b : (d >= d2 || nVar.f157307b <= this.f157307b) && !mo56635l();
    }

    /* renamed from: k */
    public final boolean mo56634k(double d) {
        boolean n = mo56637n();
        double d2 = this.f157306a;
        return n ? (d >= d2 || d <= this.f157307b) && !mo56635l() : d >= d2 && d <= this.f157307b;
    }

    /* renamed from: l */
    public final boolean mo56635l() {
        return this.f157306a - this.f157307b == 6.283185307179586d;
    }

    /* renamed from: m */
    public final boolean mo56636m() {
        return this.f157307b - this.f157306a == 6.283185307179586d;
    }

    /* renamed from: n */
    public final boolean mo56637n() {
        return this.f157306a > this.f157307b;
    }

    public final String toString() {
        return "[" + this.f157306a + ", " + this.f157307b + "]";
    }

    public C59220n(double d, double d2) {
        mo56628f(d, d2, false);
    }

    public C59220n(C59220n nVar) {
        this(nVar.f157306a, nVar.f157307b);
    }
}
