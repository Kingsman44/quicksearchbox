package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8822d;

import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.core.service.p6848e.C86683e;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.core.state.C87052fn;
import com.google.android.apps.gsa.search.core.state.C87116hk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87138if;
import com.google.android.apps.gsa.search.core.state.C87140ih;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.d.a */
/* compiled from: PG */
public final class C117909a implements C87138if {

    /* renamed from: c */
    private static final C87116hk f327269c = C86898ct.m140157al(50);

    /* renamed from: a */
    public final C87140ih f327270a;

    /* renamed from: b */
    public C58833ax f327271b = C58836b.f156633a;

    /* renamed from: d */
    private final C87052fn f327272d;

    /* renamed from: e */
    private final C86683e f327273e;

    public C117909a(C87052fn fnVar, C87140ih ihVar, C86683e eVar) {
        this.f327272d = fnVar;
        this.f327270a = ihVar;
        this.f327273e = eVar;
    }

    /* renamed from: a */
    public final C87116hk mo80220a() {
        return f327269c;
    }

    /* renamed from: d */
    public final void mo80223d(C87135ic icVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (icVar.mo80754a(50)) {
            Query query = this.f327272d.f235177m;
            if (query.mo84412cs() && !query.mo84385cR()) {
                if (!this.f327271b.mo56113h() || !((Query) this.f327271b.mo56107c()).mo84383cP(query)) {
                    C87684al alVar = new C87684al(C88244um.AUTO_QUERY_COMMIT);
                    alVar.mo81966c(query);
                    C87682aj ajVar = this.f327273e.f234157a;
                    if (ajVar != null) {
                        ((C86771n) ajVar).mo80379b(alVar.mo81964a());
                    }
                    this.f327271b = C58833ax.m90834k(query);
                }
            }
        }
    }
}
