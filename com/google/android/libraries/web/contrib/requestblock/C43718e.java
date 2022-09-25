package com.google.android.libraries.web.contrib.requestblock;

import com.google.android.libraries.web.p3353c.C43367l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.contrib.requestblock.e */
/* compiled from: PG */
final class C43718e {

    /* renamed from: a */
    public C43367l f114042a;

    /* renamed from: b */
    public C43714a f114043b;

    /* renamed from: c */
    private final C43721h f114044c;

    public C43718e(C43721h hVar) {
        this.f114044c = hVar;
    }

    /* renamed from: a */
    public final void mo46750a() {
        C43714a aVar = this.f114043b;
        C43367l lVar = this.f114042a;
        if (aVar != null && lVar != null) {
            aVar.mo32340a(lVar);
            this.f114042a = null;
        }
    }

    /* renamed from: b */
    public final boolean mo46751b(C43367l lVar) {
        C69664n.m101061g(lVar, "request");
        if (this.f114042a != lVar) {
            return false;
        }
        mo46750a();
        return true;
    }

    /* renamed from: c */
    public final boolean mo46752c(C43367l lVar) {
        C69664n.m101061g(lVar, "request");
        this.f114042a = null;
        if (!this.f114044c.mo30517a(lVar)) {
            return false;
        }
        this.f114042a = lVar;
        return true;
    }
}
