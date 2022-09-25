package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vv */
/* compiled from: PG */
public final class C7374vv implements C7354vb {

    /* renamed from: a */
    public final C7376vx f24099a;

    /* renamed from: b */
    final /* synthetic */ C7376vx f24100b;

    /* renamed from: c */
    private final C7353va f24101c;

    /* renamed from: d */
    private final int f24102d;

    /* renamed from: e */
    private boolean f24103e;

    public C7374vv(C7376vx vxVar, C7376vx vxVar2, C7353va vaVar, int i) {
        this.f24100b = vxVar;
        this.f24099a = vxVar2;
        this.f24101c = vaVar;
        this.f24102d = i;
    }

    /* renamed from: f */
    private final void m22188f() {
        if (!this.f24103e) {
            this.f24100b.f24111h.mo16569r(this.f24100b.f24106c[this.f24102d], this.f24100b.f24107d[this.f24102d], 0, (Object) null, this.f24100b.f24123t);
            this.f24103e = true;
        }
    }

    /* renamed from: a */
    public final void mo16685a() {
        ary.m19464q(this.f24100b.f24108e[this.f24102d]);
        this.f24100b.f24108e[this.f24102d] = false;
    }

    /* renamed from: b */
    public final boolean mo16493b() {
        return !this.f24100b.mo16693q() && this.f24101c.mo16636y(this.f24100b.f24105b);
    }

    /* renamed from: c */
    public final void mo16494c() {
    }

    /* renamed from: d */
    public final int mo16495d(C6865cz czVar, C7024iw iwVar, boolean z) {
        if (this.f24100b.mo16693q()) {
            return -3;
        }
        if (this.f24100b.f24125v != null && this.f24100b.f24125v.mo16671d(this.f24102d + 1) <= this.f24101c.mo16629r()) {
            return -3;
        }
        m22188f();
        return this.f24101c.mo16637z(czVar, iwVar, z, this.f24100b.f24105b);
    }

    /* renamed from: e */
    public final int mo16496e(long j) {
        if (this.f24100b.mo16693q()) {
            return 0;
        }
        int C = this.f24101c.mo16608C(j, this.f24100b.f24105b);
        if (this.f24100b.f24125v != null) {
            C = Math.min(C, this.f24100b.f24125v.mo16671d(this.f24102d + 1) - this.f24101c.mo16629r());
        }
        this.f24101c.mo16609D(C);
        if (C > 0) {
            m22188f();
        }
        return C;
    }
}
