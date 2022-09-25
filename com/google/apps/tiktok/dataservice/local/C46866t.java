package com.google.apps.tiktok.dataservice.local;

import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.apps.tiktok.dataservice.local.t */
/* compiled from: PG */
final class C46866t implements C46852f {

    /* renamed from: a */
    private final C46852f f122293a;

    /* renamed from: b */
    private C46844as f122294b = null;

    public C46866t(C46852f fVar) {
        this.f122293a = fVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        C19559g.m37304c();
        C46844as asVar = this.f122294b;
        C46849c cVar = new C46849c(th);
        this.f122294b = cVar;
        if (!cVar.equals(asVar)) {
            this.f122293a.mo20960h(th);
        }
    }

    /* renamed from: j */
    public final void mo20961j(Object obj) {
        C19559g.m37304c();
        C46844as asVar = this.f122294b;
        C46850d dVar = new C46850d(obj);
        this.f122294b = dVar;
        if (!dVar.equals(asVar)) {
            this.f122293a.mo20961j(obj);
        }
    }
}
