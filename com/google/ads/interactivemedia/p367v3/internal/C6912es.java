package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Pair;

/* renamed from: com.google.ads.interactivemedia.v3.internal.es */
/* compiled from: PG */
public abstract class C6912es {

    /* renamed from: a */
    public static final C6912es f22059a = new C6909ep();

    /* renamed from: c */
    public int mo15475c(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == mo15476d(z) ? mo15477e(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == mo15476d(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    /* renamed from: d */
    public int mo15476d(boolean z) {
        if (mo15851u()) {
            return -1;
        }
        return mo15780s() - 1;
    }

    /* renamed from: e */
    public int mo15477e(boolean z) {
        return mo15851u() ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6912es)) {
            return false;
        }
        C6912es esVar = (C6912es) obj;
        if (esVar.mo15780s() != mo15780s() || esVar.mo15781t() != mo15781t()) {
            return false;
        }
        C6911er erVar = new C6911er();
        C6910eq eqVar = new C6910eq();
        C6911er erVar2 = new C6911er();
        C6910eq eqVar2 = new C6910eq();
        for (int i = 0; i < mo15780s(); i++) {
            if (!mo15852v(i, erVar).equals(esVar.mo15852v(i, erVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo15781t(); i2++) {
            if (!mo15480h(i2, eqVar, true).equals(esVar.mo15480h(i2, eqVar2, true))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public abstract C6911er mo15478f(int i, C6911er erVar, long j);

    /* renamed from: g */
    public C6910eq mo15479g(Object obj, C6910eq eqVar) {
        return mo15480h(mo15481i(obj), eqVar, true);
    }

    /* renamed from: h */
    public abstract C6910eq mo15480h(int i, C6910eq eqVar, boolean z);

    public final int hashCode() {
        C6911er erVar = new C6911er();
        C6910eq eqVar = new C6910eq();
        int s = mo15780s() + 217;
        for (int i = 0; i < mo15780s(); i++) {
            s = (s * 31) + mo15852v(i, erVar).hashCode();
        }
        int t = (s * 31) + mo15781t();
        for (int i2 = 0; i2 < mo15781t(); i2++) {
            t = (t * 31) + mo15480h(i2, eqVar, true).hashCode();
        }
        return t;
    }

    /* renamed from: i */
    public abstract int mo15481i(Object obj);

    /* renamed from: j */
    public abstract Object mo15482j(int i);

    /* renamed from: s */
    public abstract int mo15780s();

    /* renamed from: t */
    public abstract int mo15781t();

    /* renamed from: u */
    public final boolean mo15851u() {
        return mo15780s() == 0;
    }

    /* renamed from: v */
    public final C6911er mo15852v(int i, C6911er erVar) {
        return mo15478f(i, erVar, 0);
    }

    /* renamed from: w */
    public final int mo15853w(int i, C6910eq eqVar, C6911er erVar, int i2, boolean z) {
        int i3 = mo15856z(i, eqVar).f22038c;
        if (mo15852v(i3, erVar).f22055m != i) {
            return i + 1;
        }
        int c = mo15475c(i3, i2, z);
        if (c == -1) {
            return -1;
        }
        return mo15852v(c, erVar).f22054l;
    }

    /* renamed from: x */
    public final Pair mo15854x(C6911er erVar, C6910eq eqVar, int i, long j) {
        Pair y = mo15855y(erVar, eqVar, i, j, 0);
        ary.m19467t(y);
        return y;
    }

    /* renamed from: y */
    public final Pair mo15855y(C6911er erVar, C6910eq eqVar, int i, long j, long j2) {
        ary.m19468u(i, mo15780s());
        mo15478f(i, erVar, j2);
        if (j == -9223372036854775807L) {
            j = erVar.f22056n;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = erVar.f22054l;
        long j3 = erVar.f22058p + j;
        long j4 = mo15480h(i2, eqVar, true).f22039d;
        while (j4 != -9223372036854775807L && j3 >= j4 && i2 < erVar.f22055m) {
            j3 -= j4;
            i2++;
            j4 = mo15480h(i2, eqVar, true).f22039d;
        }
        Object obj = eqVar.f22037b;
        ary.m19467t(obj);
        return Pair.create(obj, Long.valueOf(j3));
    }

    /* renamed from: z */
    public final C6910eq mo15856z(int i, C6910eq eqVar) {
        return mo15480h(i, eqVar, false);
    }
}
