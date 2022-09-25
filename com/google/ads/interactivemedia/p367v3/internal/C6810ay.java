package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Pair;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ay */
/* compiled from: PG */
public abstract class C6810ay extends C6912es {

    /* renamed from: b */
    private final int f21572b;

    /* renamed from: c */
    private final C7357ve f21573c;

    public C6810ay(C7357ve veVar) {
        this.f21573c = veVar;
        this.f21572b = veVar.mo16638a();
    }

    /* renamed from: a */
    public static Object m19689a(Object obj) {
        return ((Pair) obj).first;
    }

    /* renamed from: b */
    public static Object m19690b(Object obj) {
        return ((Pair) obj).second;
    }

    /* renamed from: r */
    private final int m19691r(int i, boolean z) {
        if (z) {
            return this.f21573c.mo16639b(i);
        }
        if (i >= this.f21572b - 1) {
            return -1;
        }
        return i + 1;
    }

    /* renamed from: c */
    public final int mo15475c(int i, int i2, boolean z) {
        int l = mo15484l(i);
        int p = mo15488p(l);
        int c = mo15486n(l).mo15475c(i - p, i2 == 2 ? 0 : i2, z);
        if (c != -1) {
            return p + c;
        }
        int r = m19691r(l, z);
        while (r != -1 && mo15486n(r).mo15851u()) {
            r = m19691r(r, z);
        }
        if (r != -1) {
            return mo15488p(r) + mo15486n(r).mo15477e(z);
        }
        if (i2 == 2) {
            return mo15477e(z);
        }
        return -1;
    }

    /* renamed from: d */
    public final int mo15476d(boolean z) {
        int i;
        int i2 = this.f21572b;
        if (i2 == 0) {
            return -1;
        }
        int d = z ? this.f21573c.mo16641d() : i2 - 1;
        while (mo15486n(d).mo15851u()) {
            if (z) {
                i = this.f21573c.mo16640c(d);
                continue;
            } else if (d > 0) {
                i = d - 1;
                continue;
            } else {
                i = -1;
                continue;
            }
            if (d == -1) {
                return -1;
            }
        }
        return mo15488p(d) + mo15486n(d).mo15476d(z);
    }

    /* renamed from: e */
    public final int mo15477e(boolean z) {
        if (this.f21572b == 0) {
            return -1;
        }
        int e = z ? this.f21573c.mo16642e() : 0;
        while (mo15486n(e).mo15851u()) {
            e = m19691r(e, z);
            if (e == -1) {
                return -1;
            }
        }
        return mo15488p(e) + mo15486n(e).mo15477e(z);
    }

    /* renamed from: f */
    public final C6911er mo15478f(int i, C6911er erVar, long j) {
        int l = mo15484l(i);
        int p = mo15488p(l);
        int o = mo15487o(l);
        mo15486n(l).mo15478f(i - p, erVar, j);
        Object q = mo15489q(l);
        if (!C6911er.f22042a.equals(erVar.f22044b)) {
            q = Pair.create(q, erVar.f22044b);
        }
        erVar.f22044b = q;
        erVar.f22054l += o;
        erVar.f22055m += o;
        return erVar;
    }

    /* renamed from: g */
    public final C6910eq mo15479g(Object obj, C6910eq eqVar) {
        Object a = m19689a(obj);
        Object b = m19690b(obj);
        int m = mo15485m(a);
        int p = mo15488p(m);
        mo15486n(m).mo15479g(b, eqVar);
        eqVar.f22038c += p;
        eqVar.f22037b = obj;
        return eqVar;
    }

    /* renamed from: h */
    public final C6910eq mo15480h(int i, C6910eq eqVar, boolean z) {
        int k = mo15483k(i);
        int p = mo15488p(k);
        mo15486n(k).mo15480h(i - mo15487o(k), eqVar, z);
        eqVar.f22038c += p;
        if (z) {
            Object q = mo15489q(k);
            Object obj = eqVar.f22037b;
            ary.m19467t(obj);
            eqVar.f22037b = Pair.create(q, obj);
        }
        return eqVar;
    }

    /* renamed from: i */
    public final int mo15481i(Object obj) {
        int i;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object a = m19689a(obj);
        Object b = m19690b(obj);
        int m = mo15485m(a);
        if (m == -1 || (i = mo15486n(m).mo15481i(b)) == -1) {
            return -1;
        }
        return mo15487o(m) + i;
    }

    /* renamed from: j */
    public final Object mo15482j(int i) {
        int k = mo15483k(i);
        return Pair.create(mo15489q(k), mo15486n(k).mo15482j(i - mo15487o(k)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract int mo15483k(int i);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract int mo15484l(int i);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract int mo15485m(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract C6912es mo15486n(int i);

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract int mo15487o(int i);

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract int mo15488p(int i);

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract Object mo15489q(int i);
}
