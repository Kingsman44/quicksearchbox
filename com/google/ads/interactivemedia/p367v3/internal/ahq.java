package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ahq */
/* compiled from: PG */
final class ahq extends agt {

    /* renamed from: a */
    final /* synthetic */ boolean f20656a;

    /* renamed from: b */
    final /* synthetic */ boolean f20657b;

    /* renamed from: c */
    final /* synthetic */ age f20658c;

    /* renamed from: d */
    final /* synthetic */ akz f20659d;

    /* renamed from: e */
    final /* synthetic */ ahr f20660e;

    /* renamed from: f */
    private agt f20661f;

    public ahq(ahr ahr, boolean z, boolean z2, age age, akz akz) {
        this.f20660e = ahr;
        this.f20656a = z;
        this.f20657b = z2;
        this.f20658c = age;
        this.f20659d = akz;
    }

    /* renamed from: a */
    private final agt m18737a() {
        agt agt = this.f20661f;
        if (agt != null) {
            return agt;
        }
        agt c = this.f20658c.mo14705c(this.f20660e, this.f20659d);
        this.f20661f = c;
        return c;
    }

    public final Object read(alb alb) {
        if (!this.f20656a) {
            return m18737a().read(alb);
        }
        alb.mo14835m();
        return null;
    }

    public final void write(ald ald, Object obj) {
        if (this.f20657b) {
            ald.mo14851g();
        } else {
            m18737a().write(ald, obj);
        }
    }
}
