package org.p5623b.p5624a;

/* renamed from: org.b.a.bz */
/* compiled from: PG */
public final class C72073bz extends C72018ad {
    public C72073bz(boolean z, int i, C72092e eVar) {
        super(z, i, eVar);
    }

    /* renamed from: a */
    public final int mo63217a() {
        int b;
        int a = this.f191774c.mo63233g().mo63229h().mo63217a();
        if (this.f191773b) {
            b = C72090ch.m105545b(this.f191772a) + C72090ch.m105544a(a);
        } else {
            b = C72090ch.m105545b(this.f191772a);
            a--;
        }
        return b + a;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        C72108u h = this.f191774c.mo63233g().mo63229h();
        int i = 160;
        if (!this.f191773b && !h.mo63220d()) {
            i = 128;
        }
        sVar.mo63306k(z, i, this.f191772a);
        if (this.f191773b) {
            sVar.mo63304h(h.mo63217a());
        }
        sVar.mo63252b().mo63254j(h, this.f191773b);
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return this.f191773b || this.f191774c.mo63233g().mo63229h().mo63220d();
    }

    /* renamed from: h */
    public final C72108u mo63229h() {
        return this;
    }
}
