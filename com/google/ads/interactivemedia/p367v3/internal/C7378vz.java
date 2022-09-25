package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vz */
/* compiled from: PG */
public final class C7378vz extends C7367vo {

    /* renamed from: m */
    private final int f24127m;

    /* renamed from: n */
    private final long f24128n;

    /* renamed from: o */
    private long f24129o;

    /* renamed from: p */
    private volatile boolean f24130p;

    /* renamed from: q */
    private boolean f24131q;

    /* renamed from: r */
    private final C7371vs f24132r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7378vz(abx abx, acb acb, C6864cy cyVar, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, C7371vs vsVar) {
        super(abx, acb, cyVar, i, obj, j, j2, j3, j4, j5);
        this.f24127m = i2;
        this.f24128n = j6;
        this.f24132r = vsVar;
    }

    /* renamed from: b */
    public final void mo14464b() {
        this.f24130p = true;
    }

    /* renamed from: c */
    public final void mo14465c() {
        C7050jv jvVar;
        long j;
        if (this.f24129o == 0) {
            C7369vq e = mo16672e();
            e.mo16674b(this.f24128n);
            C7371vs vsVar = this.f24132r;
            long j2 = this.f24064a;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.f24128n;
            long j4 = this.f24065b;
            if (j4 == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                j = j4 - this.f24128n;
            }
            vsVar.mo16680g(e, j3, j);
        }
        try {
            acb c = this.f24089d.mo14433c(this.f24129o);
            adg adg = this.f24096k;
            jvVar = new C7050jv(adg, c.f20245e, adg.mo14389c(c));
            do {
                if (this.f24130p || !this.f24132r.mo16681h(jvVar)) {
                    break;
                }
                break;
                break;
            } while (!this.f24132r.mo16681h(jvVar));
            break;
            this.f24129o = jvVar.mo16099l() - this.f24089d.f20245e;
            aeu.m18547q(this.f24096k);
            this.f24131q = !this.f24130p;
        } catch (Throwable th) {
            aeu.m18547q(this.f24096k);
            throw th;
        }
    }

    /* renamed from: i */
    public final long mo16702i() {
        return this.f24145l + ((long) this.f24127m);
    }

    /* renamed from: j */
    public final boolean mo16703j() {
        return this.f24131q;
    }
}
