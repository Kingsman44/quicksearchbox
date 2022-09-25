package com.google.android.libraries.lens.view.gallery.p2111d;

import com.google.android.libraries.lens.view.gallery.data.C26403v;
import com.google.android.libraries.lens.view.gallery.data.C26404w;
import com.google.android.libraries.lens.view.gallery.data.C26405x;
import com.google.android.libraries.lens.view.gallery.data.C26406y;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.r */
/* compiled from: PG */
public final class C26372r {

    /* renamed from: a */
    public final C26406y f71732a;

    /* renamed from: b */
    public final int f71733b;

    /* renamed from: c */
    public final C26371q f71734c;

    /* renamed from: d */
    public final C58485gu f71735d;

    /* renamed from: e */
    private final C26371q f71736e;

    /* renamed from: f */
    private final boolean f71737f;

    /* renamed from: g */
    private final boolean f71738g;

    public C26372r(C26406y yVar, int i, boolean z, boolean z2, boolean z3) {
        C58485gu guVar;
        C26371q qVar;
        C26371q qVar2;
        this.f71732a = yVar;
        this.f71733b = i;
        this.f71737f = z;
        this.f71738g = z3;
        boolean z4 = false;
        int i2 = 1;
        if (z && yVar.mo31579b() == C26405x.NO_PERMISSION) {
            z4 = true;
        }
        C26405x b = yVar.mo31579b();
        C26405x xVar = C26405x.LOADING;
        if (b == xVar) {
            guVar = C58485gu.m89845m();
        } else {
            C58480gp e = C58485gu.m89837e();
            if (yVar.mo31581d().keySet().contains(C26403v.f71834a)) {
                e.mo55395g(C26403v.f71834a);
            }
            if (yVar.mo31581d().keySet().contains(C26403v.f71835b)) {
                e.mo55395g(C26403v.f71835b);
            }
            if (yVar.mo31581d().keySet().contains(C26403v.f71836c)) {
                e.mo55395g(C26403v.f71836c);
            }
            e.mo55397i(Collection.EL.stream(yVar.mo31581d().keySet()).filter(C26370p.f71727a).iterator());
            guVar = e.mo55394f();
        }
        this.f71735d = guVar;
        int i3 = z4 ? 2 : 1;
        int i4 = (true != z3 ? 2 : 1) * i;
        if (z4) {
            qVar = C26371q.m48630f(i3, i4, Integer.valueOf(true != z2 ? 3 : i2));
        } else if (b == xVar) {
            qVar = C26371q.m48630f(i3, i4, 1);
        } else {
            int size = yVar.mo31606f(C26403v.f71834a).size();
            qVar = size == 0 ? C26371q.m48628d(i3) : C26371q.m48629e(i3, Math.min(size, i4), 1);
        }
        this.f71734c = qVar;
        int b2 = i3 + qVar.f71728a + qVar.mo31557b();
        if (b == xVar) {
            qVar2 = C26371q.m48630f(b2, 40, 2);
        } else {
            int size2 = yVar.mo31580c().size();
            qVar2 = size2 == 0 ? C26371q.m48628d(b2) : C26371q.m48629e(b2, size2, 2);
        }
        this.f71736e = qVar2;
    }

    /* renamed from: a */
    public final int mo31562a() {
        C26405x xVar = C26405x.LOADING;
        int ordinal = this.f71732a.mo31579b().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new AssertionError(this.f71732a.mo31579b());
                }
            } else if (!this.f71737f) {
                return 2;
            } else {
                C26371q qVar = this.f71734c;
                return qVar.f71728a + qVar.mo31557b() + 2;
            }
        }
        C26371q qVar2 = this.f71734c;
        int i = qVar2.f71728a;
        int b = qVar2.mo31557b();
        C26371q qVar3 = this.f71736e;
        int b2 = i + b + qVar3.f71728a + qVar3.mo31557b();
        if (b2 == 0) {
            b2 = 1;
        }
        return b2 + 1;
    }

    /* renamed from: b */
    public final int mo31563b(int i) {
        if (i == 0) {
            return 5;
        }
        C26405x xVar = C26405x.LOADING;
        int ordinal = this.f71732a.mo31579b().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2 && this.f71736e.mo31560h() && this.f71734c.mo31560h()) {
                return this.f71737f ? 6 : 4;
            }
        } else if (!this.f71737f) {
            return 3;
        } else {
            if (i == 1) {
                return 6;
            }
        }
        C26371q qVar = this.f71736e;
        if (qVar.mo31559g(i)) {
            return qVar.mo31558c(i);
        }
        C26371q qVar2 = this.f71734c;
        if (qVar2.mo31559g(i)) {
            return qVar2.mo31558c(i);
        }
        throw new AssertionError(String.format("Getting type of view that is not in a section, and the gallery is not in a special state: State: %s, Position: %d Sizes: %d %d", new Object[]{this.f71732a.mo31579b(), Integer.valueOf(i), Integer.valueOf(qVar.f71728a + qVar.mo31557b()), Integer.valueOf(qVar2.f71728a + qVar2.mo31557b())}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo31564c(int i) {
        C26371q qVar = this.f71736e;
        if (qVar.mo31559g(i)) {
            return qVar.f71728a;
        }
        C26371q qVar2 = this.f71734c;
        if (qVar2.mo31559g(i)) {
            return qVar2.f71728a;
        }
        throw new IllegalArgumentException("position " + i);
    }

    /* renamed from: d */
    public final int mo31565d(int i) {
        C26371q qVar = this.f71736e;
        if (qVar.mo31559g(i)) {
            return qVar.mo31556a(i);
        }
        C26371q qVar2 = this.f71734c;
        if (qVar2.mo31559g(i)) {
            return qVar2.mo31556a(i);
        }
        throw new IllegalArgumentException("position " + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C26404w mo31566e(int i) {
        C26371q qVar = this.f71736e;
        if (!qVar.mo31559g(i)) {
            C26371q qVar2 = this.f71734c;
            if (!qVar2.mo31559g(i)) {
                throw new IllegalArgumentException("position " + i);
            } else if (qVar2.mo31561i(i)) {
                return null;
            } else {
                return (C26404w) this.f71732a.mo31606f(C26403v.f71834a).get(this.f71734c.mo31556a(i));
            }
        } else if (qVar.mo31561i(i)) {
            return null;
        } else {
            return (C26404w) this.f71732a.mo31580c().get(qVar.mo31556a(i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo31567f() {
        return ((C58724pq) this.f71735d).f156474d > 1;
    }

    /* renamed from: g */
    public final boolean mo31568g() {
        return this.f71732a.mo31606f(C26403v.f71834a).size() > this.f71733b * (true != this.f71738g ? 2 : 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo31569h(int i) {
        if (this.f71736e.mo31559g(i)) {
            return 3;
        }
        if (this.f71734c.mo31559g(i)) {
            return 2;
        }
        throw new IllegalArgumentException("position " + i);
    }
}
