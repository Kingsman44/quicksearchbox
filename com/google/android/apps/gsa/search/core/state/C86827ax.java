package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90141t;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.ax */
/* compiled from: PG */
public final class C86827ax implements C87143ik {

    /* renamed from: a */
    private final C86826aw f234517a;

    /* renamed from: b */
    private final C68214a f234518b;

    public C86827ax(C86826aw awVar, C68214a aVar) {
        this.f234517a = awVar;
        this.f234518b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f234517a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        Query m;
        if (icVar.mo80754a(((C87052fn) this.f234518b.mo27525b()).f235452J)) {
            C86826aw awVar = this.f234517a;
            C87052fn fnVar = (C87052fn) this.f234518b.mo27525b();
            if (fnVar.f235177m.mo84468dv() && fnVar.f235177m.mo84403cj() && (m = fnVar.mo80711m("assistanttextsearch")) != null && !m.mo84397cd() && m.f252780s != awVar.f234516d) {
                C58976aa aaVar = C58975e.f156826a;
                awVar.f234516d = m.f252780s;
                if (!m.mo84363bw("android.opa.extra.QUERY_INITIATED_BY_NGA") || !m.mo84363bw("android.opa.extra.QUERY_RESPONSE_GENERATED_BY_NGA") || !m.mo84364bx("android.opa.extra.ASSISTANT_RESPONSE") || !((C86124t) awVar.f234513a.mo27525b()).mo79746e(C90141t.f251874a)) {
                    awVar.f234514b.mo79025a(m, awVar.f234515c);
                }
            }
        }
    }
}
