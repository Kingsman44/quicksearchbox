package com.google.android.apps.gsa.search.core.state.p6866c.p6870d;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.C86354a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6825d.C86371i;
import com.google.android.apps.gsa.search.core.state.C87089gl;
import com.google.android.apps.gsa.search.core.state.C87091gn;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.state.c.d.g */
/* compiled from: PG */
public final class C86875g extends C86354a implements C86371i {

    /* renamed from: a */
    private final C87091gn f234611a;

    public C86875g(C87091gn gnVar) {
        this.f234611a = gnVar;
    }

    /* renamed from: a */
    public final void mo80143a(Query query, C60870cx cxVar) {
        C87091gn gnVar = this.f234611a;
        if (!query.mo84337bV() && !query.mo84438dS() && query.mo84391cX()) {
            C22871g gVar = gnVar.f235314d;
            long j = query.f252780s;
            gVar.mo28211k(cxVar, "Network Completion Callback for commit: " + j, new C87089gl(gnVar, query));
        }
    }
}
