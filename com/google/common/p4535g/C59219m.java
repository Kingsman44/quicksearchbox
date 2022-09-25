package com.google.common.p4535g;

import com.google.common.base.C58838bb;
import com.google.common.p4575r.C60749f;
import java.io.Serializable;

/* renamed from: com.google.common.g.m */
/* compiled from: PG */
public final class C59219m implements Comparable, Serializable {

    /* renamed from: a */
    public static final C59219m f157300a = new C59219m(C59203do.f157270a);

    /* renamed from: b */
    public static final C59219m f157301b = new C59219m(2.0d);

    /* renamed from: c */
    public static final C59219m f157302c = new C59219m(4.0d);

    /* renamed from: d */
    public static final C59219m f157303d = new C59219m(Double.POSITIVE_INFINITY);

    /* renamed from: e */
    public static final C59219m f157304e = new C59219m(-1.0d);

    /* renamed from: f */
    public final double f157305f;

    private C59219m(double d) {
        this.f157305f = d;
        C58838bb.m90868c(mo56622h());
    }

    /* renamed from: a */
    public static double m91872a(C59219m mVar) {
        C58838bb.m90868c(!(mVar.mo56621g() || mVar.mo56620f()));
        double d = mVar.f157305f;
        return d * (1.0d - (0.25d * d));
    }

    /* renamed from: d */
    public static C59219m m91873d(double d) {
        return new C59219m(Math.min(4.0d, d));
    }

    /* renamed from: e */
    public static C59219m m91874e(C59218l lVar) {
        if (lVar.f157299c < C59203do.f157270a) {
            return f157304e;
        }
        if (lVar.equals(C59218l.f157297a)) {
            return f157303d;
        }
        double sin = Math.sin(Math.min(3.141592653589793d, lVar.f157299c) * 0.5d);
        double d = sin + sin;
        return new C59219m(d * d);
    }

    /* renamed from: b */
    public final int compareTo(C59219m mVar) {
        return Double.compare(this.f157305f, mVar.f157305f);
    }

    /* renamed from: c */
    public final C59218l mo56617c() {
        if (mo56621g()) {
            return new C59218l(-1.0d);
        }
        if (mo56620f()) {
            return C59218l.f157297a;
        }
        double asin = Math.asin(Math.sqrt(this.f157305f) * 0.5d);
        return new C59218l(asin + asin);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C59219m) && this.f157305f == ((C59219m) obj).f157305f;
    }

    /* renamed from: f */
    public final boolean mo56620f() {
        return this.f157305f == Double.POSITIVE_INFINITY;
    }

    /* renamed from: g */
    public final boolean mo56621g() {
        return this.f157305f < C59203do.f157270a;
    }

    /* renamed from: h */
    public final boolean mo56622h() {
        double d = this.f157305f;
        return (d >= C59203do.f157270a && d <= 4.0d) || mo56621g() || mo56620f();
    }

    public final int hashCode() {
        double d = this.f157305f;
        if (d == C59203do.f157270a) {
            return 0;
        }
        return C60749f.m92723a(d);
    }

    public final String toString() {
        double d = this.f157305f;
        if (d == f157304e.f157305f) {
            return "NEGATIVE";
        }
        if (d == f157300a.f157305f) {
            return "ZERO";
        }
        if (d == f157302c.f157305f) {
            return "STRAIGHT";
        }
        if (d == f157303d.f157305f) {
            return "INFINITY";
        }
        return mo56617c().toString();
    }

    public C59219m(C59136bb bbVar, C59136bb bbVar2) {
        this(Math.min(4.0d, bbVar.mo56500d(bbVar2)));
        C58838bb.m90868c(C59222p.m91903i(bbVar));
        C58838bb.m90868c(C59222p.m91903i(bbVar2));
        C58838bb.m90868c(mo56622h());
    }
}
