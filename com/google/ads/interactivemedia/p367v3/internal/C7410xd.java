package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xd */
/* compiled from: PG */
final class C7410xd implements C7354vb {

    /* renamed from: a */
    private final C6864cy f24264a;

    /* renamed from: b */
    private final C7249re f24265b = new C7249re();

    /* renamed from: c */
    private long[] f24266c;

    /* renamed from: d */
    private boolean f24267d;

    /* renamed from: e */
    private C7420xn f24268e;

    /* renamed from: f */
    private boolean f24269f;

    /* renamed from: g */
    private int f24270g;

    /* renamed from: h */
    private long f24271h = -9223372036854775807L;

    public C7410xd(C7420xn xnVar, C6864cy cyVar, boolean z) {
        this.f24264a = cyVar;
        this.f24268e = xnVar;
        this.f24266c = xnVar.f24324b;
        mo16751f(xnVar, z);
    }

    /* renamed from: a */
    public final String mo16750a() {
        return this.f24268e.mo16773a();
    }

    /* renamed from: b */
    public final boolean mo16493b() {
        return true;
    }

    /* renamed from: c */
    public final void mo16494c() {
    }

    /* renamed from: d */
    public final int mo16495d(C6865cz czVar, C7024iw iwVar, boolean z) {
        if (z || !this.f24269f) {
            czVar.f21827a = this.f24264a;
            this.f24269f = true;
            return -5;
        }
        int i = this.f24270g;
        if (i != this.f24266c.length) {
            this.f24270g = i + 1;
            byte[] a = this.f24265b.mo16365a(this.f24268e.f24323a[i]);
            iwVar.mo16042i(a.length);
            iwVar.f22515b.put(a);
            iwVar.f22517d = this.f24266c[i];
            iwVar.mo16035f(1);
            return -4;
        } else if (this.f24267d) {
            return -3;
        } else {
            iwVar.mo16035f(4);
            return -4;
        }
    }

    /* renamed from: e */
    public final int mo16496e(long j) {
        int max = Math.max(this.f24270g, aeu.m18520ak(this.f24266c, j, true));
        int i = this.f24270g;
        this.f24270g = max;
        return max - i;
    }

    /* renamed from: g */
    public final void mo16752g(long j) {
        int ak = aeu.m18520ak(this.f24266c, j, true);
        this.f24270g = ak;
        if (!this.f24267d || ak != this.f24266c.length) {
            j = -9223372036854775807L;
        }
        this.f24271h = j;
    }

    /* renamed from: f */
    public final void mo16751f(C7420xn xnVar, boolean z) {
        long j;
        int i = this.f24270g;
        if (i == 0) {
            j = -9223372036854775807L;
        } else {
            j = this.f24266c[i - 1];
        }
        this.f24267d = z;
        this.f24268e = xnVar;
        long[] jArr = xnVar.f24324b;
        this.f24266c = jArr;
        long j2 = this.f24271h;
        if (j2 != -9223372036854775807L) {
            mo16752g(j2);
        } else if (j != -9223372036854775807L) {
            this.f24270g = aeu.m18520ak(jArr, j, false);
        }
    }
}
