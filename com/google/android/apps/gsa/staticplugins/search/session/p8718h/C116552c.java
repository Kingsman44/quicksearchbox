package com.google.android.apps.gsa.staticplugins.search.session.p8718h;

import com.google.android.apps.gsa.search.core.state.C87116hk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87138if;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7857b.C99998af;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116780ib;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.h.c */
/* compiled from: PG */
final class C116552c implements C87138if {

    /* renamed from: a */
    final /* synthetic */ C116553d f323189a;

    /* renamed from: b */
    private Query f323190b;

    /* renamed from: c */
    private boolean f323191c;

    public C116552c(C116553d dVar) {
        this.f323189a = dVar;
        C116735gk gkVar = dVar.f323192a;
        this.f323190b = gkVar.f323784p;
        this.f323191c = gkVar.mo102879U();
    }

    /* renamed from: a */
    public final C87116hk mo80220a() {
        return C116780ib.m193928ay(150);
    }

    /* renamed from: d */
    public final void mo80223d(C87135ic icVar) {
        Query query = this.f323189a.f323192a.f323784p;
        if (!this.f323190b.equals(query)) {
            this.f323190b = query;
            for (C99998af afVar : this.f323189a.f323193b.keySet()) {
                afVar.f279666a.mo91696e();
            }
        }
        boolean U = this.f323189a.f323192a.mo102879U();
        if (this.f323191c != U) {
            this.f323191c = U;
            for (C99998af afVar2 : this.f323189a.f323193b.keySet()) {
            }
        }
    }
}
