package com.google.android.apps.gsa.search.core.service.p6848e;

import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86725e;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;

/* renamed from: com.google.android.apps.gsa.search.core.service.e.p */
/* compiled from: PG */
public final class C86694p {

    /* renamed from: a */
    public final C86675a f234187a;

    /* renamed from: b */
    public C86684f f234188b;

    /* renamed from: c */
    private final C86682d f234189c;

    public C86694p(C86682d dVar, C86675a aVar) {
        this.f234189c = dVar;
        this.f234187a = aVar;
    }

    /* renamed from: a */
    public static C86726f m139653a(C86684f fVar) {
        if (fVar == null) {
            return new C86726f(C86725e.m139700c(C86724d.IDLE));
        }
        fVar.mo80290b("#getUserScenarioObservable");
        return fVar.f234158a.mo80291b(fVar.f234162e);
    }

    /* renamed from: b */
    public final void mo80302b(C86684f fVar) {
        if (!this.f234189c.mo80288a(fVar.f234163f) && this.f234188b != fVar) {
            this.f234188b = fVar;
            this.f234187a.notifyObservers(m139653a(fVar));
        }
    }
}
