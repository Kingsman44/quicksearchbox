package org.p5623b.p5624a;

/* renamed from: org.b.a.bl */
/* compiled from: PG */
public final class C72059bl extends C72018ad {
    public C72059bl(boolean z, int i, C72092e eVar) {
        super(z, i, eVar);
    }

    /* renamed from: a */
    public final int mo63217a() {
        int b;
        int a = this.f191774c.mo63233g().mo63228f().mo63217a();
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
        C72108u f = this.f191774c.mo63233g().mo63228f();
        int i = 160;
        if (!this.f191773b && !f.mo63220d()) {
            i = 128;
        }
        sVar.mo63306k(z, i, this.f191772a);
        if (this.f191773b) {
            sVar.mo63304h(f.mo63217a());
        }
        f.mo63218b(sVar.mo63253c(), this.f191773b);
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return this.f191773b || this.f191774c.mo63233g().mo63228f().mo63220d();
    }

    /* renamed from: f */
    public final C72108u mo63228f() {
        return this;
    }

    /* renamed from: h */
    public final C72108u mo63229h() {
        return this;
    }
}
