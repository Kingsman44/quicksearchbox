package com.google.android.apps.gsa.search.core.state.p6866c.p6869c;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6824c.C86362b;
import com.google.android.apps.gsa.search.core.state.C87041fc;
import com.google.android.apps.gsa.search.core.state.C87042fd;
import com.google.android.apps.gsa.search.core.state.C87052fn;
import com.google.android.apps.gsa.shared.logger.p7053c.C89882e;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60537to;

/* renamed from: com.google.android.apps.gsa.search.core.state.c.c.a */
/* compiled from: PG */
public final class C86867a extends C86362b {

    /* renamed from: a */
    private final C87042fd f234593a;

    /* renamed from: b */
    private final Query f234594b;

    public C86867a(Query query, C87042fd fdVar) {
        this.f234593a = fdVar;
        this.f234594b = query;
    }

    /* renamed from: a */
    public final void mo80123a(C60537to toVar, C90456c cVar) {
        this.f234593a.mo80666i(this.f234594b, 464, toVar, C58833ax.m90834k(cVar));
    }

    /* renamed from: b */
    public final void mo80124b() {
        C87042fd fdVar = this.f234593a;
        Query query = this.f234594b;
        C58976aa aaVar = C58975e.f156826a;
        if (fdVar.mo80672p() || ((C87052fn) fdVar.f235113b.mo27525b()).f235177m.f252749G == query.f252749G) {
            if (fdVar.mo80671o()) {
                C87041fc fcVar = fdVar.f235115d;
                fcVar.getClass();
                if (fcVar.f235109b.f252749G != query.f252749G) {
                    fdVar.mo80665g(fcVar, 465, C60537to.NO_LONGER_HANDLED);
                    fdVar.mo80591ar();
                }
            }
            if (query.f252749G != fdVar.f235116e) {
                fdVar.f235115d = fdVar.mo80663a(query);
            }
            if (fdVar.mo80671o()) {
                C58838bb.m90883r(query.mo84430dK());
                C87041fc fcVar2 = fdVar.f235115d;
                fcVar2.getClass();
                fcVar2.f235111d = true;
            }
        }
    }

    /* renamed from: c */
    public final void mo80125c() {
        this.f234593a.mo80669m(this.f234594b);
    }

    /* renamed from: d */
    public final void mo80126d(C89882e eVar) {
        this.f234593a.mo80670n(eVar, this.f234594b.f252749G);
    }
}
