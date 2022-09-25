package com.google.common.p4535g;

import java.io.Serializable;

/* renamed from: com.google.common.g.j */
/* compiled from: PG */
public final class C59216j implements Serializable {

    /* renamed from: a */
    double f157293a;

    /* renamed from: b */
    double f157294b;

    public C59216j() {
        this(C59203do.f157270a, C59203do.f157270a);
    }

    public C59216j(double d, double d2) {
        this.f157293a = d;
        this.f157294b = d2;
    }

    /* renamed from: a */
    public final double mo56600a(int i) {
        return i == 0 ? this.f157293a : this.f157294b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo56601b(C59216j jVar) {
        this.f157293a = jVar.f157293a;
        this.f157294b = jVar.f157294b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C59216j)) {
            return false;
        }
        C59216j jVar = (C59216j) obj;
        if (this.f157293a == jVar.f157293a && this.f157294b == jVar.f157294b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(Math.abs(this.f157293a)) + 646;
        long doubleToLongBits2 = doubleToLongBits + (37 * doubleToLongBits) + Double.doubleToLongBits(Math.abs(this.f157294b));
        return (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
    }

    public final String toString() {
        return "(" + this.f157293a + ", " + this.f157294b + ")";
    }
}
