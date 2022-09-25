package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wb */
/* compiled from: PG */
public final class C7381wb extends C7372vt {

    /* renamed from: a */
    private long f24141a;

    /* renamed from: b */
    private volatile boolean f24142b;

    /* renamed from: l */
    private final C7371vs f24143l;

    /* renamed from: m */
    private C7369vq f24144m;

    public C7381wb(abx abx, acb acb, C6864cy cyVar, int i, Object obj, C7371vs vsVar) {
        super(abx, acb, 2, cyVar, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f24143l = vsVar;
    }

    /* renamed from: a */
    public final void mo16711a(C7369vq vqVar) {
        this.f24144m = vqVar;
    }

    /* renamed from: b */
    public final void mo14464b() {
        this.f24142b = true;
    }

    /* renamed from: c */
    public final void mo14465c() {
        C7050jv jvVar;
        if (this.f24141a == 0) {
            this.f24143l.mo16680g(this.f24144m, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            acb c = this.f24089d.mo14433c(this.f24141a);
            adg adg = this.f24096k;
            jvVar = new C7050jv(adg, c.f20245e, adg.mo14389c(c));
            do {
                if (this.f24142b || !this.f24143l.mo16681h(jvVar)) {
                    break;
                }
                break;
                break;
            } while (!this.f24143l.mo16681h(jvVar));
            break;
            this.f24141a = jvVar.mo16099l() - this.f24089d.f20245e;
            aeu.m18547q(this.f24096k);
        } catch (Throwable th) {
            aeu.m18547q(this.f24096k);
            throw th;
        }
    }
}
