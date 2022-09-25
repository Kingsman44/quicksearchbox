package androidx.media3.common;

import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.common.bk */
/* compiled from: PG */
public final class C2649bk implements C2668l {

    /* renamed from: a */
    public Object f7328a;

    /* renamed from: b */
    public Object f7329b;

    /* renamed from: c */
    public int f7330c;

    /* renamed from: d */
    public long f7331d;

    /* renamed from: e */
    public long f7332e;

    /* renamed from: f */
    public boolean f7333f;

    /* renamed from: g */
    public C2659c f7334g = C2659c.f7412a;

    /* renamed from: a */
    public final int mo6280a(int i) {
        return this.f7334g.mo6321c(i).f7219b;
    }

    /* renamed from: b */
    public final int mo6281b(long j) {
        return this.f7334g.mo6319a(j, this.f7331d);
    }

    /* renamed from: c */
    public final int mo6282c(long j) {
        return this.f7334g.mo6320b(j, this.f7331d);
    }

    /* renamed from: d */
    public final int mo6283d(int i) {
        return this.f7334g.mo6321c(i).mo6108a(-1);
    }

    /* renamed from: e */
    public final long mo6284e(int i, int i2) {
        C2600b c = this.f7334g.mo6321c(i);
        if (c.f7219b != -1) {
            return c.f7222e[i2];
        }
        return -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            C2649bk bkVar = (C2649bk) obj;
            return C2612ak.m6951aa(this.f7328a, bkVar.f7328a) && C2612ak.m6951aa(this.f7329b, bkVar.f7329b) && this.f7330c == bkVar.f7330c && this.f7331d == bkVar.f7331d && this.f7332e == bkVar.f7332e && this.f7333f == bkVar.f7333f && C2612ak.m6951aa(this.f7334g, bkVar.f7334g);
        }
    }

    /* renamed from: f */
    public final long mo6286f(int i) {
        return this.f7334g.mo6321c(i).f7218a;
    }

    /* renamed from: g */
    public final boolean mo6287g(int i) {
        return !this.f7334g.mo6321c(i).mo6111d();
    }

    /* renamed from: h */
    public final boolean mo6288h(int i) {
        boolean z = this.f7334g.mo6321c(i).f7224g;
        return false;
    }

    /* renamed from: i */
    public final void mo6290i(Object obj, Object obj2, int i, long j, long j2, C2659c cVar, boolean z) {
        this.f7328a = obj;
        this.f7329b = obj2;
        this.f7330c = i;
        this.f7331d = j;
        this.f7332e = j2;
        this.f7334g = cVar;
        this.f7333f = z;
    }

    /* renamed from: j */
    public final void mo6291j(Object obj, Object obj2, int i, long j, long j2) {
        mo6290i(obj, obj2, i, j, j2, C2659c.f7412a, false);
    }

    public final int hashCode() {
        int i;
        Object obj = this.f7328a;
        int i2 = 0;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i3 = (i + 217) * 31;
        Object obj2 = this.f7329b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        int i4 = this.f7330c;
        long j = this.f7331d;
        long j2 = this.f7332e;
        return ((((((((((i3 + i2) * 31) + i4) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f7333f ? 1 : 0)) * 31) + this.f7334g.hashCode();
    }
}
