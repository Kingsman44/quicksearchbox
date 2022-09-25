package com.google.common.p4535g;

import java.io.Serializable;

/* renamed from: com.google.common.g.bb */
/* compiled from: PG */
public final class C59136bb implements Comparable, Serializable, C59165cd {

    /* renamed from: a */
    public static final C59136bb f157158a = new C59136bb(C59203do.f157270a, C59203do.f157270a, C59203do.f157270a);

    /* renamed from: b */
    public static final C59136bb f157159b = new C59136bb(1.0d, C59203do.f157270a, C59203do.f157270a);

    /* renamed from: c */
    public static final C59136bb f157160c = new C59136bb(C59203do.f157270a, C59203do.f157270a, 1.0d);

    /* renamed from: d */
    public static final C59136bb f157161d = new C59136bb(C59203do.f157270a, C59203do.f157270a, -1.0d);

    /* renamed from: e */
    final double f157162e;

    /* renamed from: f */
    final double f157163f;

    /* renamed from: g */
    final double f157164g;

    public C59136bb() {
        this(C59203do.f157270a, C59203do.f157270a, C59203do.f157270a);
    }

    public C59136bb(double d, double d2, double d3) {
        this.f157162e = d;
        this.f157163f = d2;
        this.f157164g = d3;
    }

    /* renamed from: f */
    public static final double m91665f(C59136bb bbVar, C59136bb bbVar2, C59136bb bbVar3) {
        C59136bb bbVar4 = bbVar;
        C59136bb bbVar5 = bbVar2;
        C59136bb bbVar6 = bbVar3;
        double d = bbVar5.f157163f;
        double d2 = bbVar6.f157164g;
        double d3 = bbVar5.f157164g;
        double d4 = bbVar6.f157163f;
        double d5 = bbVar6.f157162e;
        double d6 = bbVar5.f157162e;
        return (bbVar4.f157162e * ((d * d2) - (d3 * d4))) + (bbVar4.f157163f * ((d3 * d5) - (d2 * d6))) + (bbVar4.f157164g * ((d6 * d4) - (d * d5)));
    }

    /* renamed from: i */
    static final int m91666i(double d, double d2, double d3) {
        double abs = Math.abs(d);
        double abs2 = Math.abs(d2);
        double abs3 = Math.abs(d3);
        return abs > abs2 ? abs > abs3 ? 0 : 2 : abs2 > abs3 ? 1 : 2;
    }

    /* renamed from: j */
    public static final C59136bb m91667j(C59136bb bbVar, C59136bb bbVar2) {
        return new C59136bb(bbVar.f157162e + bbVar2.f157162e, bbVar.f157163f + bbVar2.f157163f, bbVar.f157164g + bbVar2.f157164g);
    }

    /* renamed from: k */
    public static final C59136bb m91668k(C59136bb bbVar, C59136bb bbVar2) {
        C59136bb bbVar3 = bbVar;
        C59136bb bbVar4 = bbVar2;
        double d = bbVar3.f157163f;
        double d2 = bbVar4.f157164g;
        double d3 = bbVar3.f157164g;
        double d4 = bbVar4.f157163f;
        double d5 = bbVar4.f157162e;
        double d6 = bbVar3.f157162e;
        return new C59136bb((d * d2) - (d3 * d4), (d3 * d5) - (d2 * d6), (d6 * d4) - (d * d5));
    }

    /* renamed from: l */
    public static final C59136bb m91669l(C59136bb bbVar, double d) {
        return new C59136bb(d * bbVar.f157162e, bbVar.f157163f * d, bbVar.f157164g * d);
    }

    /* renamed from: m */
    public static final C59136bb m91670m(C59136bb bbVar) {
        return new C59136bb(-bbVar.f157162e, -bbVar.f157163f, -bbVar.f157164g);
    }

    /* renamed from: n */
    public static final C59136bb m91671n(C59136bb bbVar) {
        double sqrt = Math.sqrt(bbVar.mo56501e());
        if (sqrt != C59203do.f157270a) {
            sqrt = 1.0d / sqrt;
        }
        return m91669l(bbVar, sqrt);
    }

    /* renamed from: o */
    public static final C59136bb m91672o(C59136bb bbVar, C59136bb bbVar2) {
        return new C59136bb(bbVar.f157162e - bbVar2.f157162e, bbVar.f157163f - bbVar2.f157163f, bbVar.f157164g - bbVar2.f157164g);
    }

    /* renamed from: a */
    public final double mo56496a(C59136bb bbVar) {
        double d = this.f157163f;
        double d2 = bbVar.f157164g;
        double d3 = this.f157164g;
        double d4 = bbVar.f157163f;
        double d5 = (d * d2) - (d3 * d4);
        double d6 = bbVar.f157162e;
        double d7 = this.f157162e;
        double d8 = (d3 * d6) - (d2 * d7);
        double d9 = (d7 * d4) - (d * d6);
        return Math.atan2(Math.sqrt((d5 * d5) + (d8 * d8) + (d9 * d9)), mo56497b(bbVar));
    }

    /* renamed from: b */
    public final double mo56497b(C59136bb bbVar) {
        return (this.f157162e * bbVar.f157162e) + (this.f157163f * bbVar.f157163f) + (this.f157164g * bbVar.f157164g);
    }

    /* renamed from: c */
    public final double mo56498c(int i) {
        return i == 0 ? this.f157162e : i == 1 ? this.f157163f : this.f157164g;
    }

    /* renamed from: d */
    public final double mo56500d(C59136bb bbVar) {
        double d = this.f157162e - bbVar.f157162e;
        double d2 = this.f157163f - bbVar.f157163f;
        double d3 = this.f157164g - bbVar.f157164g;
        return (d * d) + (d2 * d2) + (d3 * d3);
    }

    /* renamed from: e */
    public final double mo56501e() {
        double d = this.f157162e;
        double d2 = this.f157163f;
        double d3 = this.f157164g;
        return (d * d) + (d2 * d2) + (d3 * d3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C59136bb)) {
            return false;
        }
        C59136bb bbVar = (C59136bb) obj;
        if (this.f157162e == bbVar.f157162e && this.f157163f == bbVar.f157163f && this.f157164g == bbVar.f157164g) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo56467g(C59225s sVar) {
        throw null;
    }

    /* renamed from: h */
    public final int compareTo(C59136bb bbVar) {
        if (mo56507r(bbVar)) {
            return -1;
        }
        return !mo56506q(bbVar) ? 1 : 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(Math.abs(this.f157162e)) + 646;
        long doubleToLongBits2 = doubleToLongBits + (doubleToLongBits * 37) + Double.doubleToLongBits(Math.abs(this.f157163f));
        long doubleToLongBits3 = doubleToLongBits2 + (37 * doubleToLongBits2) + Double.doubleToLongBits(Math.abs(this.f157164g));
        return (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
    }

    /* renamed from: p */
    public final String mo56505p() {
        C59127at atVar = new C59127at(this);
        return "(" + Double.toString(atVar.f157132a * 57.29577951308232d) + ", " + Double.toString(atVar.f157133b * 57.29577951308232d) + ")";
    }

    /* renamed from: q */
    public final boolean mo56506q(C59136bb bbVar) {
        return this.f157162e == bbVar.f157162e && this.f157163f == bbVar.f157163f && this.f157164g == bbVar.f157164g;
    }

    /* renamed from: r */
    public final boolean mo56507r(C59136bb bbVar) {
        double d = this.f157162e;
        double d2 = bbVar.f157162e;
        if (d < d2) {
            return true;
        }
        if (d2 < d) {
            return false;
        }
        double d3 = this.f157163f;
        double d4 = bbVar.f157163f;
        if (d3 < d4) {
            return true;
        }
        return d4 >= d3 && this.f157164g < bbVar.f157164g;
    }

    public final String toString() {
        return "(" + this.f157162e + ", " + this.f157163f + ", " + this.f157164g + ")";
    }
}
