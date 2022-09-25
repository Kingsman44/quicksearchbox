package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vr */
/* compiled from: PG */
final class C7370vr implements C7073kr {

    /* renamed from: a */
    public C6864cy f24071a;

    /* renamed from: b */
    private final int f24072b;

    /* renamed from: c */
    private final int f24073c;

    /* renamed from: d */
    private final C6864cy f24074d;

    /* renamed from: e */
    private final C7052jx f24075e = new C7052jx();

    /* renamed from: f */
    private C7073kr f24076f;

    /* renamed from: g */
    private long f24077g;

    public C7370vr(int i, int i2, C6864cy cyVar) {
        this.f24072b = i;
        this.f24073c = i2;
        this.f24074d = cyVar;
    }

    /* renamed from: a */
    public final void mo16102a(C6864cy cyVar) {
        C6864cy cyVar2 = this.f24074d;
        if (cyVar2 != null) {
            cyVar = cyVar.mo15637b(cyVar2);
        }
        this.f24071a = cyVar;
        C7073kr krVar = this.f24076f;
        int i = aeu.f20466a;
        krVar.mo16102a(this.f24071a);
    }

    /* renamed from: b */
    public final void mo16103b(long j, int i, int i2, int i3, C7072kq kqVar) {
        long j2 = this.f24077g;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.f24076f = this.f24075e;
        }
        C7073kr krVar = this.f24076f;
        int i4 = aeu.f20466a;
        krVar.mo16103b(j, i, i2, i3, kqVar);
    }

    /* renamed from: c */
    public final int mo16104c(abu abu, int i, boolean z) {
        return atv.m19625q(this, abu, i, z);
    }

    /* renamed from: d */
    public final void mo16105d(aee aee, int i) {
        atv.m19626r(this, aee, i);
    }

    /* renamed from: e */
    public final int mo16106e(abu abu, int i, boolean z) {
        C7073kr krVar = this.f24076f;
        int i2 = aeu.f20466a;
        return krVar.mo16104c(abu, i, z);
    }

    /* renamed from: f */
    public final void mo16107f(aee aee, int i) {
        C7073kr krVar = this.f24076f;
        int i2 = aeu.f20466a;
        krVar.mo16105d(aee, i);
    }

    /* renamed from: g */
    public final void mo16676g(C7369vq vqVar, long j) {
        if (vqVar == null) {
            this.f24076f = this.f24075e;
            return;
        }
        this.f24077g = j;
        C7073kr c = vqVar.mo16675c(this.f24073c);
        this.f24076f = c;
        C6864cy cyVar = this.f24071a;
        if (cyVar != null) {
            c.mo16102a(cyVar);
        }
    }
}
