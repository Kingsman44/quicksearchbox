package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wf */
/* compiled from: PG */
public final class C7385wf extends C7367vo {

    /* renamed from: m */
    private final int f24147m;

    /* renamed from: n */
    private final C6864cy f24148n;

    /* renamed from: o */
    private long f24149o;

    /* renamed from: p */
    private boolean f24150p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7385wf(abx abx, acb acb, C6864cy cyVar, int i, Object obj, long j, long j2, long j3, int i2, C6864cy cyVar2) {
        super(abx, acb, cyVar, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.f24147m = i2;
        this.f24148n = cyVar2;
    }

    /* renamed from: b */
    public final void mo14464b() {
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final void mo14465c() {
        C7369vq e = mo16672e();
        e.mo16674b(0);
        C7073kr c = e.mo16675c(this.f24147m);
        c.mo16102a(this.f24148n);
        try {
            long c2 = this.f24096k.mo14389c(this.f24089d.mo14433c(this.f24149o));
            if (c2 != -1) {
                c2 += this.f24149o;
            }
            C7050jv jvVar = new C7050jv(this.f24096k, this.f24149o, c2);
            for (int i = 0; i != -1; i = c.mo16104c(jvVar, Integer.MAX_VALUE, true)) {
                this.f24149o += (long) i;
            }
            c.mo16103b(this.f24094i, 1, (int) this.f24149o, 0, (C7072kq) null);
            aeu.m18547q(this.f24096k);
            this.f24150p = true;
        } catch (Throwable th) {
            aeu.m18547q(this.f24096k);
            throw th;
        }
    }

    /* renamed from: j */
    public final boolean mo16703j() {
        return this.f24150p;
    }
}
