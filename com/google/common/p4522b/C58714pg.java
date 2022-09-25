package com.google.common.p4522b;

import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import com.google.common.base.C58839bc;
import java.io.Serializable;

/* renamed from: com.google.common.b.pg */
/* compiled from: PG */
public final class C58714pg extends C58715ph implements Serializable, C58839bc {

    /* renamed from: a */
    public static final C58714pg f156455a = new C58714pg(C58404du.f156003a, C58402ds.f156002a);
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    public final C58406dw f156456b;

    /* renamed from: c */
    public final C58406dw f156457c;

    public C58714pg(C58406dw dwVar, C58406dw dwVar2) {
        dwVar.getClass();
        this.f156456b = dwVar;
        dwVar2.getClass();
        this.f156457c = dwVar2;
        if (dwVar.compareTo(dwVar2) > 0 || dwVar == C58402ds.f156002a || dwVar2 == C58404du.f156003a) {
            throw new IllegalArgumentException("Invalid range: ".concat(m90510s(dwVar, dwVar2)));
        }
    }

    /* renamed from: b */
    static int m90499b(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    /* renamed from: c */
    public static C58817ah m90500c() {
        return C58712pe.f156453a;
    }

    /* renamed from: d */
    static C58710pc m90501d() {
        return C58713pf.f156454a;
    }

    /* renamed from: e */
    public static C58714pg m90502e(Comparable comparable) {
        return new C58714pg(new C58405dv(comparable), C58402ds.f156002a);
    }

    /* renamed from: f */
    public static C58714pg m90503f(Comparable comparable) {
        return new C58714pg(C58404du.f156003a, new C58403dt(comparable));
    }

    /* renamed from: g */
    public static C58714pg m90504g(Comparable comparable, Comparable comparable2) {
        return new C58714pg(new C58405dv(comparable), new C58403dt(comparable2));
    }

    /* renamed from: h */
    public static C58714pg m90505h(Comparable comparable, Comparable comparable2) {
        return new C58714pg(new C58405dv(comparable), new C58405dv(comparable2));
    }

    /* renamed from: j */
    public static C58714pg m90506j(Comparable comparable, Comparable comparable2) {
        return new C58714pg(new C58403dt(comparable), new C58403dt(comparable2));
    }

    /* renamed from: s */
    private static String m90510s(C58406dw dwVar, C58406dw dwVar2) {
        StringBuilder sb = new StringBuilder(16);
        dwVar.mo55180e(sb);
        sb.append("..");
        dwVar2.mo55181f(sb);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C58714pg) {
            C58714pg pgVar = (C58714pg) obj;
            if (!this.f156456b.equals(pgVar.f156456b) || !this.f156457c.equals(pgVar.f156457c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f156456b.hashCode() * 31) + this.f156457c.hashCode();
    }

    /* renamed from: i */
    public final C58714pg mo55819i(C58714pg pgVar) {
        C58406dw dwVar;
        C58406dw dwVar2;
        int a = this.f156456b.compareTo(pgVar.f156456b);
        int a2 = this.f156457c.compareTo(pgVar.f156457c);
        if (a >= 0 && a2 <= 0) {
            return this;
        }
        if (a <= 0 && a2 >= 0) {
            return pgVar;
        }
        if (a >= 0) {
            dwVar = this.f156456b;
        } else {
            dwVar = pgVar.f156456b;
        }
        if (a2 <= 0) {
            dwVar2 = this.f156457c;
        } else {
            dwVar2 = pgVar.f156457c;
        }
        C58838bb.m90879n(dwVar.compareTo(dwVar2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, pgVar);
        return new C58714pg(dwVar, dwVar2);
    }

    /* renamed from: l */
    public final boolean mo55821l() {
        return this.f156456b != C58404du.f156003a;
    }

    /* renamed from: m */
    public final boolean mo55822m() {
        return this.f156457c != C58402ds.f156002a;
    }

    /* renamed from: n */
    public final boolean mo55823n(C58714pg pgVar) {
        return this.f156456b.compareTo(pgVar.f156457c) <= 0 && pgVar.f156456b.compareTo(this.f156457c) <= 0;
    }

    /* renamed from: o */
    public final boolean mo55824o() {
        return this.f156456b.equals(this.f156457c);
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        C58714pg pgVar = f156455a;
        return equals(pgVar) ? pgVar : this;
    }

    public final String toString() {
        return m90510s(this.f156456b, this.f156457c);
    }

    /* renamed from: q */
    public static C58714pg m90508q(Comparable comparable, int i, Comparable comparable2, int i2) {
        C58406dw dwVar;
        C58406dw dwVar2;
        if (i == 1) {
            dwVar = new C58403dt(comparable);
        } else {
            dwVar = new C58405dv(comparable);
        }
        if (i2 == 1) {
            dwVar2 = new C58405dv(comparable2);
        } else {
            dwVar2 = new C58403dt(comparable2);
        }
        return new C58714pg(dwVar, dwVar2);
    }

    /* renamed from: k */
    public final boolean mo5941a(Comparable comparable) {
        comparable.getClass();
        return this.f156456b.mo55182g(comparable) && !this.f156457c.mo55182g(comparable);
    }

    /* renamed from: p */
    public static C58714pg m90507p(Comparable comparable, int i) {
        if (i - 1 != 0) {
            return m90502e(comparable);
        }
        return new C58714pg(new C58403dt(comparable), C58402ds.f156002a);
    }

    /* renamed from: r */
    public static C58714pg m90509r(Comparable comparable, int i) {
        if (i - 1 != 0) {
            return m90503f(comparable);
        }
        return new C58714pg(C58404du.f156003a, new C58405dv(comparable));
    }
}
