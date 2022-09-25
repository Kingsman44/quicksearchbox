package com.google.common.p4522b;

import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import java.util.Comparator;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.sg */
/* compiled from: PG */
final class C58795sg {

    /* renamed from: a */
    public final Object f156576a;

    /* renamed from: b */
    public int f156577b;

    /* renamed from: c */
    public int f156578c;

    /* renamed from: d */
    public long f156579d;

    /* renamed from: e */
    public C58795sg f156580e;

    /* renamed from: f */
    public C58795sg f156581f;

    /* renamed from: g */
    public C58795sg f156582g;

    /* renamed from: h */
    public C58795sg f156583h;

    /* renamed from: i */
    private int f156584i;

    public C58795sg() {
        this.f156576a = null;
        this.f156577b = 1;
    }

    public C58795sg(Object obj, int i) {
        C58838bb.m90868c(i > 0);
        this.f156576a = obj;
        this.f156577b = i;
        this.f156579d = (long) i;
        this.f156578c = 1;
        this.f156584i = 1;
        this.f156580e = null;
        this.f156581f = null;
    }

    /* renamed from: j */
    private final int m90742j() {
        return m90743k(this.f156580e) - m90743k(this.f156581f);
    }

    /* renamed from: k */
    private static int m90743k(C58795sg sgVar) {
        if (sgVar == null) {
            return 0;
        }
        return sgVar.f156584i;
    }

    /* renamed from: l */
    private static long m90744l(C58795sg sgVar) {
        if (sgVar == null) {
            return 0;
        }
        return sgVar.f156579d;
    }

    /* renamed from: m */
    private final C58795sg m90745m() {
        int i = this.f156577b;
        this.f156577b = 0;
        C58795sg e = mo56012e();
        C58795sg g = mo56014g();
        e.f156583h = g;
        g.f156582g = e;
        C58795sg sgVar = this.f156580e;
        if (sgVar == null) {
            return this.f156581f;
        }
        C58795sg sgVar2 = this.f156581f;
        if (sgVar2 == null) {
            return sgVar;
        }
        if (sgVar.f156584i >= sgVar2.f156584i) {
            C58795sg e2 = mo56012e();
            e2.f156580e = this.f156580e.m90747o(e2);
            e2.f156581f = this.f156581f;
            e2.f156578c = this.f156578c - 1;
            e2.f156579d = this.f156579d - ((long) i);
            return e2.m90746n();
        }
        C58795sg g2 = mo56014g();
        g2.f156581f = this.f156581f.m90748p(g2);
        g2.f156580e = this.f156580e;
        g2.f156578c = this.f156578c - 1;
        g2.f156579d = this.f156579d - ((long) i);
        return g2.m90746n();
    }

    /* renamed from: o */
    private final C58795sg m90747o(C58795sg sgVar) {
        C58795sg sgVar2 = this.f156581f;
        if (sgVar2 == null) {
            return this.f156580e;
        }
        this.f156581f = sgVar2.m90747o(sgVar);
        this.f156578c--;
        this.f156579d -= (long) sgVar.f156577b;
        return m90746n();
    }

    /* renamed from: p */
    private final C58795sg m90748p(C58795sg sgVar) {
        C58795sg sgVar2 = this.f156580e;
        if (sgVar2 == null) {
            return this.f156581f;
        }
        this.f156580e = sgVar2.m90748p(sgVar);
        this.f156578c--;
        this.f156579d -= (long) sgVar.f156577b;
        return m90746n();
    }

    /* renamed from: q */
    private final C58795sg m90749q() {
        C58838bb.m90883r(this.f156581f != null);
        C58795sg sgVar = this.f156581f;
        this.f156581f = sgVar.f156580e;
        sgVar.f156580e = this;
        sgVar.f156579d = this.f156579d;
        sgVar.f156578c = this.f156578c;
        m90752t();
        m90751s();
        sgVar.m90751s();
        return sgVar;
    }

    /* renamed from: r */
    private final C58795sg m90750r() {
        C58838bb.m90883r(this.f156580e != null);
        C58795sg sgVar = this.f156580e;
        this.f156580e = sgVar.f156581f;
        sgVar.f156581f = this;
        sgVar.f156579d = this.f156579d;
        sgVar.f156578c = this.f156578c;
        m90752t();
        m90751s();
        sgVar.m90751s();
        return sgVar;
    }

    /* renamed from: s */
    private final void m90751s() {
        this.f156584i = Math.max(m90743k(this.f156580e), m90743k(this.f156581f)) + 1;
    }

    /* renamed from: t */
    private final void m90752t() {
        C58795sg sgVar = this.f156580e;
        int u = C58797si.m90763u(sgVar);
        C58795sg sgVar2 = this.f156581f;
        this.f156578c = u + 1 + C58797si.m90763u(sgVar2);
        this.f156579d = ((long) this.f156577b) + m90744l(sgVar) + m90744l(sgVar2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo56008a(Comparator comparator, Object obj) {
        int compare = comparator.compare(obj, this.f156576a);
        if (compare < 0) {
            C58795sg sgVar = this.f156580e;
            if (sgVar == null) {
                return 0;
            }
            return sgVar.mo56008a(comparator, obj);
        } else if (compare <= 0) {
            return this.f156577b;
        } else {
            C58795sg sgVar2 = this.f156581f;
            if (sgVar2 == null) {
                return 0;
            }
            return sgVar2.mo56008a(comparator, obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C58795sg mo56009b(Comparator comparator, Object obj, int i, int[] iArr) {
        int compare = comparator.compare(obj, this.f156576a);
        boolean z = true;
        if (compare < 0) {
            C58795sg sgVar = this.f156580e;
            if (sgVar == null) {
                iArr[0] = 0;
                this.f156580e = new C58795sg(obj, i);
                C58795sg e = mo56012e();
                C58795sg sgVar2 = this.f156580e;
                e.f156583h = sgVar2;
                sgVar2.f156582g = e;
                sgVar2.f156583h = this;
                this.f156582g = sgVar2;
                this.f156584i = Math.max(2, this.f156584i);
                this.f156578c++;
                this.f156579d += (long) i;
                return this;
            }
            int i2 = sgVar.f156584i;
            C58795sg b = sgVar.mo56009b(comparator, obj, i, iArr);
            this.f156580e = b;
            if (iArr[0] == 0) {
                this.f156578c++;
            }
            this.f156579d += (long) i;
            return b.f156584i == i2 ? this : m90746n();
        } else if (compare > 0) {
            C58795sg sgVar3 = this.f156581f;
            if (sgVar3 == null) {
                iArr[0] = 0;
                C58795sg sgVar4 = new C58795sg(obj, i);
                this.f156581f = sgVar4;
                C58795sg g = mo56014g();
                this.f156583h = sgVar4;
                sgVar4.f156582g = this;
                sgVar4.f156583h = g;
                g.f156582g = sgVar4;
                this.f156584i = Math.max(2, this.f156584i);
                this.f156578c++;
                this.f156579d += (long) i;
                return this;
            }
            int i3 = sgVar3.f156584i;
            C58795sg b2 = sgVar3.mo56009b(comparator, obj, i, iArr);
            this.f156581f = b2;
            if (iArr[0] == 0) {
                this.f156578c++;
            }
            this.f156579d += (long) i;
            return b2.f156584i == i3 ? this : m90746n();
        } else {
            int i4 = this.f156577b;
            iArr[0] = i4;
            long j = (long) i;
            if (((long) i4) + j > 2147483647L) {
                z = false;
            }
            C58838bb.m90868c(z);
            this.f156577b += i;
            this.f156579d += j;
            return this;
        }
    }

    /* renamed from: c */
    public final C58795sg mo56010c(Comparator comparator, Object obj) {
        int compare = comparator.compare(obj, this.f156576a);
        if (compare < 0) {
            C58795sg sgVar = this.f156580e;
            if (sgVar == null) {
                return this;
            }
            return (C58795sg) C58831av.m90830c(sgVar.mo56010c(comparator, obj), this);
        } else if (compare == 0) {
            return this;
        } else {
            C58795sg sgVar2 = this.f156581f;
            if (sgVar2 == null) {
                return null;
            }
            return sgVar2.mo56010c(comparator, obj);
        }
    }

    /* renamed from: d */
    public final C58795sg mo56011d(Comparator comparator, Object obj) {
        int compare = comparator.compare(obj, this.f156576a);
        if (compare > 0) {
            C58795sg sgVar = this.f156581f;
            if (sgVar == null) {
                return this;
            }
            return (C58795sg) C58831av.m90830c(sgVar.mo56011d(comparator, obj), this);
        } else if (compare == 0) {
            return this;
        } else {
            C58795sg sgVar2 = this.f156580e;
            if (sgVar2 == null) {
                return null;
            }
            return sgVar2.mo56011d(comparator, obj);
        }
    }

    /* renamed from: e */
    public final C58795sg mo56012e() {
        return (C58795sg) Objects.requireNonNull(this.f156582g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C58795sg mo56013f(Comparator comparator, Object obj, int i, int[] iArr) {
        int compare = comparator.compare(obj, this.f156576a);
        if (compare < 0) {
            C58795sg sgVar = this.f156580e;
            if (sgVar == null) {
                iArr[0] = 0;
                return this;
            }
            this.f156580e = sgVar.mo56013f(comparator, obj, i, iArr);
            int i2 = iArr[0];
            if (i2 > 0) {
                if (i >= i2) {
                    this.f156578c--;
                    this.f156579d -= (long) i2;
                } else {
                    this.f156579d -= (long) i;
                }
            }
            return i2 == 0 ? this : m90746n();
        } else if (compare > 0) {
            C58795sg sgVar2 = this.f156581f;
            if (sgVar2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.f156581f = sgVar2.mo56013f(comparator, obj, i, iArr);
            int i3 = iArr[0];
            if (i3 > 0) {
                if (i >= i3) {
                    this.f156578c--;
                    this.f156579d -= (long) i3;
                } else {
                    this.f156579d -= (long) i;
                }
            }
            return m90746n();
        } else {
            int i4 = this.f156577b;
            iArr[0] = i4;
            if (i >= i4) {
                return m90745m();
            }
            this.f156577b = i4 - i;
            this.f156579d -= (long) i;
            return this;
        }
    }

    /* renamed from: g */
    public final C58795sg mo56014g() {
        return (C58795sg) Objects.requireNonNull(this.f156583h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C58795sg mo56015h(Comparator comparator, Object obj, int i, int[] iArr) {
        int compare = comparator.compare(obj, this.f156576a);
        if (compare < 0) {
            C58795sg sgVar = this.f156580e;
            if (sgVar == null) {
                iArr[0] = 0;
                return this;
            }
            this.f156580e = sgVar.mo56015h(comparator, obj, i, iArr);
            int i2 = iArr[0];
            if (i2 == i) {
                if (i2 != 0) {
                    this.f156578c--;
                }
                this.f156579d += (long) (-i2);
            }
            return m90746n();
        } else if (compare > 0) {
            C58795sg sgVar2 = this.f156581f;
            if (sgVar2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.f156581f = sgVar2.mo56015h(comparator, obj, i, iArr);
            int i3 = iArr[0];
            if (i3 == i) {
                if (i3 != 0) {
                    this.f156578c--;
                }
                this.f156579d += (long) (-i3);
            }
            return m90746n();
        } else {
            int i4 = this.f156577b;
            iArr[0] = i4;
            return i == i4 ? m90745m() : this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C58795sg mo56016i(Comparator comparator, Object obj, int[] iArr) {
        int compare = comparator.compare(obj, this.f156576a);
        if (compare < 0) {
            C58795sg sgVar = this.f156580e;
            if (sgVar == null) {
                iArr[0] = 0;
                return this;
            }
            this.f156580e = sgVar.mo56016i(comparator, obj, iArr);
            int i = iArr[0];
            if (i != 0) {
                this.f156578c--;
            }
            this.f156579d += (long) (-i);
            return m90746n();
        } else if (compare > 0) {
            C58795sg sgVar2 = this.f156581f;
            if (sgVar2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.f156581f = sgVar2.mo56016i(comparator, obj, iArr);
            int i2 = iArr[0];
            if (i2 != 0) {
                this.f156578c--;
            }
            this.f156579d += (long) (-i2);
            return m90746n();
        } else {
            iArr[0] = this.f156577b;
            return m90745m();
        }
    }

    public final String toString() {
        return new C58697oq(this.f156576a, this.f156577b).toString();
    }

    /* renamed from: n */
    private final C58795sg m90746n() {
        int j = m90742j();
        if (j == -2) {
            Objects.requireNonNull(this.f156581f);
            if (this.f156581f.m90742j() > 0) {
                this.f156581f = this.f156581f.m90750r();
            }
            return m90749q();
        } else if (j != 2) {
            m90751s();
            return this;
        } else {
            Objects.requireNonNull(this.f156580e);
            if (this.f156580e.m90742j() < 0) {
                this.f156580e = this.f156580e.m90749q();
            }
            return m90750r();
        }
    }
}
