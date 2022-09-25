package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.C2649bk;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import androidx.media3.exoplayer.p145h.C3098ci;

/* renamed from: androidx.media3.exoplayer.a */
/* compiled from: PG */
public abstract class C2683a extends C2651bm {

    /* renamed from: a */
    private final int f7512a;

    /* renamed from: b */
    private final C3098ci f7513b;

    public C2683a(C3098ci ciVar) {
        this.f7513b = ciVar;
        this.f7512a = ciVar.f9065a.length;
    }

    /* renamed from: w */
    private final int m7347w(int i, boolean z) {
        if (z) {
            C3098ci ciVar = this.f7513b;
            int i2 = ciVar.f9066b[i] + 1;
            int[] iArr = ciVar.f9065a;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        } else if (i >= this.f7512a - 1) {
            return -1;
        } else {
            return i + 1;
        }
    }

    /* renamed from: x */
    private final int m7348x(int i, boolean z) {
        if (z) {
            C3098ci ciVar = this.f7513b;
            int i2 = ciVar.f9066b[i] - 1;
            if (i2 >= 0) {
                return ciVar.f9065a[i2];
            }
            return -1;
        } else if (i <= 0) {
            return -1;
        } else {
            return i - 1;
        }
    }

    /* renamed from: a */
    public final int mo6020a(Object obj) {
        int a;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int p = mo6365p(obj2);
        if (p == -1 || (a = mo6370u(p).mo6020a(obj3)) == -1) {
            return -1;
        }
        return mo6368s(p) + a;
    }

    /* renamed from: d */
    public final C2649bk mo6023d(int i, C2649bk bkVar, boolean z) {
        int q = mo6366q(i);
        int t = mo6369t(q);
        mo6370u(q).mo6023d(i - mo6368s(q), bkVar, z);
        bkVar.f7330c += t;
        if (z) {
            Object v = mo6371v(q);
            Object obj = bkVar.f7329b;
            obj.getClass();
            bkVar.f7329b = Pair.create(v, obj);
        }
        return bkVar;
    }

    /* renamed from: e */
    public final C2650bl mo6024e(int i, C2650bl blVar, long j) {
        int r = mo6367r(i);
        int t = mo6369t(r);
        int s = mo6368s(r);
        mo6370u(r).mo6024e(i - t, blVar, j);
        Object v = mo6371v(r);
        if (!C2650bl.f7335a.equals(blVar.f7337b)) {
            v = Pair.create(v, blVar.f7337b);
        }
        blVar.f7337b = v;
        blVar.f7350o += s;
        blVar.f7351p += s;
        return blVar;
    }

    /* renamed from: f */
    public final Object mo6026f(int i) {
        int q = mo6366q(i);
        return Pair.create(mo6371v(q), mo6370u(q).mo6026f(i - mo6368s(q)));
    }

    /* renamed from: g */
    public final int mo6296g(boolean z) {
        if (this.f7512a == 0) {
            return -1;
        }
        int i = 0;
        if (z) {
            int[] iArr = this.f7513b.f9065a;
            i = iArr.length > 0 ? iArr[0] : -1;
        }
        while (mo6370u(i).mo6304o()) {
            i = m7347w(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return mo6369t(i) + mo6370u(i).mo6296g(z);
    }

    /* renamed from: h */
    public final int mo6297h(boolean z) {
        int i;
        int i2 = this.f7512a;
        if (i2 == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = this.f7513b.f9065a;
            int length = iArr.length;
            i = length > 0 ? iArr[length - 1] : -1;
        } else {
            i = i2 - 1;
        }
        while (mo6370u(i).mo6304o()) {
            i = m7348x(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return mo6369t(i) + mo6370u(i).mo6297h(z);
    }

    /* renamed from: j */
    public final int mo6299j(int i, int i2, boolean z) {
        int r = mo6367r(i);
        int t = mo6369t(r);
        int j = mo6370u(r).mo6299j(i - t, i2 == 2 ? 0 : i2, z);
        if (j != -1) {
            return t + j;
        }
        int w = m7347w(r, z);
        while (w != -1 && mo6370u(w).mo6304o()) {
            w = m7347w(w, z);
        }
        if (w != -1) {
            return mo6369t(w) + mo6370u(w).mo6296g(z);
        }
        if (i2 == 2) {
            return mo6296g(z);
        }
        return -1;
    }

    /* renamed from: k */
    public final int mo6300k(int i, int i2, boolean z) {
        int r = mo6367r(i);
        int t = mo6369t(r);
        int k = mo6370u(r).mo6300k(i - t, i2 == 2 ? 0 : i2, z);
        if (k != -1) {
            return t + k;
        }
        int x = m7348x(r, z);
        while (x != -1 && mo6370u(x).mo6304o()) {
            x = m7348x(x, z);
        }
        if (x != -1) {
            return mo6369t(x) + mo6370u(x).mo6297h(z);
        }
        if (i2 == 2) {
            return mo6297h(z);
        }
        return -1;
    }

    /* renamed from: n */
    public final C2649bk mo6303n(Object obj, C2649bk bkVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int p = mo6365p(obj2);
        int t = mo6369t(p);
        mo6370u(p).mo6303n(obj3, bkVar);
        bkVar.f7330c += t;
        bkVar.f7329b = obj;
        return bkVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract int mo6365p(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract int mo6366q(int i);

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract int mo6367r(int i);

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract int mo6368s(int i);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract int mo6369t(int i);

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract C2651bm mo6370u(int i);

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract Object mo6371v(int i);
}
