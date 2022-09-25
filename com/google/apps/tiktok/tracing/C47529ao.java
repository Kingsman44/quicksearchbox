package com.google.apps.tiktok.tracing;

import java.util.WeakHashMap;

/* renamed from: com.google.apps.tiktok.tracing.ao */
/* compiled from: PG */
final class C47529ao extends C47866z implements C47864x {

    /* renamed from: a */
    private final Exception f123366a;

    /* renamed from: b */
    private final boolean f123367b;

    public C47529ao(String str, C47864x xVar, C47563bn bnVar, boolean z) {
        super(str, (C47572bw) xVar, bnVar);
        this.f123366a = xVar.mo51393f();
        this.f123367b = z;
    }

    /* renamed from: e */
    public final C47572bw mo51392e(String str, C47563bn bnVar, boolean z) {
        if (z && !this.f123367b) {
            WeakHashMap weakHashMap = C47831fm.f123851a;
        }
        boolean z2 = true;
        if ((!z || this.f123367b) && !this.f123367b) {
            z2 = false;
        }
        return new C47529ao(str, this, bnVar, z2);
    }

    /* renamed from: f */
    public final Exception mo51393f() {
        return this.f123366a;
    }

    /* renamed from: g */
    public final C47559bj mo51394g(C47560bk bkVar) {
        C47559bj g = super.mo51394g(bkVar);
        return g.mo51421c() == 3 ? C47559bj.m84647d(2) : g;
    }

    /* renamed from: h */
    public final C47572bw mo51395h(String str, C47563bn bnVar, C47833fn fnVar) {
        return mo51392e(str, bnVar, true);
    }

    /* renamed from: i */
    public final void mo51396i(int i) {
    }

    /* renamed from: j */
    public final void mo51397j(boolean z) {
    }

    /* renamed from: k */
    public final boolean mo51398k() {
        return false;
    }

    /* renamed from: l */
    public final void mo51399l() {
    }

    public C47529ao(String str, C47563bn bnVar, boolean z) {
        super(str, C47517ac.f123357a.mo51386b(), bnVar);
        this.f123366a = C47528an.f123364a;
        this.f123367b = z;
    }
}
