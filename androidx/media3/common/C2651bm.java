package androidx.media3.common;

import android.util.Pair;
import androidx.media3.common.p136b.C2601a;

/* renamed from: androidx.media3.common.bm */
/* compiled from: PG */
public abstract class C2651bm implements C2668l {

    /* renamed from: c */
    public static final C2651bm f7353c = new C2648bj();

    protected C2651bm() {
    }

    /* renamed from: a */
    public abstract int mo6020a(Object obj);

    /* renamed from: b */
    public abstract int mo6021b();

    /* renamed from: c */
    public abstract int mo6022c();

    /* renamed from: d */
    public abstract C2649bk mo6023d(int i, C2649bk bkVar, boolean z);

    /* renamed from: e */
    public abstract C2650bl mo6024e(int i, C2650bl blVar, long j);

    public boolean equals(Object obj) {
        int h;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2651bm)) {
            return false;
        }
        C2651bm bmVar = (C2651bm) obj;
        if (bmVar.mo6022c() == mo6022c() && bmVar.mo6021b() == mo6021b()) {
            C2650bl blVar = new C2650bl();
            C2649bk bkVar = new C2649bk();
            C2650bl blVar2 = new C2650bl();
            C2649bk bkVar2 = new C2649bk();
            for (int i = 0; i < mo6022c(); i++) {
                if (!mo6024e(i, blVar, 0).equals(bmVar.mo6024e(i, blVar2, 0))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < mo6021b(); i2++) {
                if (!mo6023d(i2, bkVar, true).equals(bmVar.mo6023d(i2, bkVar2, true))) {
                    return false;
                }
            }
            int g = mo6296g(true);
            if (g == bmVar.mo6296g(true) && (h = mo6297h(true)) == bmVar.mo6297h(true)) {
                while (g != h) {
                    int j = mo6299j(g, 0, true);
                    if (j != bmVar.mo6299j(g, 0, true)) {
                        return false;
                    }
                    g = j;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public abstract Object mo6026f(int i);

    /* renamed from: g */
    public int mo6296g(boolean z) {
        return mo6304o() ? -1 : 0;
    }

    /* renamed from: h */
    public int mo6297h(boolean z) {
        if (mo6304o()) {
            return -1;
        }
        return mo6022c() - 1;
    }

    public int hashCode() {
        C2650bl blVar = new C2650bl();
        C2649bk bkVar = new C2649bk();
        int c = mo6022c() + 217;
        for (int i = 0; i < mo6022c(); i++) {
            c = (c * 31) + mo6024e(i, blVar, 0).hashCode();
        }
        int b = (c * 31) + mo6021b();
        for (int i2 = 0; i2 < mo6021b(); i2++) {
            b = (b * 31) + mo6023d(i2, bkVar, true).hashCode();
        }
        int g = mo6296g(true);
        while (g != -1) {
            b = (b * 31) + g;
            g = mo6299j(g, 0, true);
        }
        return b;
    }

    /* renamed from: i */
    public final int mo6298i(int i, C2649bk bkVar, C2650bl blVar, int i2, boolean z) {
        int i3 = mo6023d(i, bkVar, false).f7330c;
        if (mo6024e(i3, blVar, 0).f7351p != i) {
            return i + 1;
        }
        int j = mo6299j(i3, i2, z);
        if (j == -1) {
            return -1;
        }
        return mo6024e(j, blVar, 0).f7350o;
    }

    /* renamed from: j */
    public int mo6299j(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == mo6297h(z) ? mo6296g(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == mo6297h(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    /* renamed from: k */
    public int mo6300k(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == mo6296g(z) ? mo6297h(z) : i - 1;
            }
            throw new IllegalStateException();
        } else if (i == mo6296g(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    /* renamed from: l */
    public final Pair mo6301l(C2650bl blVar, C2649bk bkVar, int i, long j) {
        Pair m = mo6302m(blVar, bkVar, i, j, 0);
        m.getClass();
        return m;
    }

    /* renamed from: m */
    public final Pair mo6302m(C2650bl blVar, C2649bk bkVar, int i, long j, long j2) {
        C2601a.m6834f(i, mo6022c());
        mo6024e(i, blVar, j2);
        if (j == -9223372036854775807L) {
            j = blVar.f7348m;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = blVar.f7350o;
        mo6023d(i2, bkVar, false);
        while (i2 < blVar.f7351p && bkVar.f7332e != j) {
            int i3 = i2 + 1;
            if (mo6023d(i3, bkVar, false).f7332e > j) {
                break;
            }
            i2 = i3;
        }
        mo6023d(i2, bkVar, true);
        long j3 = j - bkVar.f7332e;
        long j4 = bkVar.f7331d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0, j3);
        Object obj = bkVar.f7329b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    /* renamed from: n */
    public C2649bk mo6303n(Object obj, C2649bk bkVar) {
        return mo6023d(mo6020a(obj), bkVar, true);
    }

    /* renamed from: o */
    public final boolean mo6304o() {
        return mo6022c() == 0;
    }
}
