package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.state.p6872d.C86966r;
import com.google.android.apps.gsa.search.core.state.p6874f.C87038e;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107722a;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107724c;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107733l;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.d.r */
/* compiled from: PG */
public final /* synthetic */ class C107792r implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C107799y f299938a;

    /* renamed from: b */
    public final /* synthetic */ Query f299939b;

    public /* synthetic */ C107792r(C107799y yVar, Query query) {
        this.f299938a = yVar;
        this.f299939b = query;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C107799y yVar = this.f299938a;
        Query query = this.f299939b;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C107781g gVar = yVar.f299961k;
            SearchError searchError = (SearchError) axVar.mo56107c();
            C87038e.m140569c(searchError, query, ((C86966r) gVar.f299913c.mo27525b()).f234900a);
            if (!searchError.mo81138R(1) || query.mo84428dI()) {
                gVar.f299914d = C58833ax.m90834k(searchError);
                gVar.mo96282a(searchError);
                C107733l lVar = gVar.f299912b;
                C58976aa aaVar = C58975e.f156826a;
                if (C22872h.m42744d(C86593a.class)) {
                    lVar.f299776c.mo80668k(searchError);
                } else {
                    lVar.f299775b.mo28212l("#logEventBusSearchError", new C107722a(lVar, searchError));
                }
            } else {
                if (!query.mo84391cX()) {
                    ((C59052c) ((C59052c) C107781g.f299911a.mo56226d()).mo56372aa(26170)).mo56386p("SRP Auth failure for search type without SRP.");
                    int i = C90755l.f253831a;
                }
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                ufVar.f164093a |= 2;
                ufVar.f164258m = 203;
                String b = C39191a.m68623b(query.f252749G);
                tzVar.copyOnWrite();
                C60555uf ufVar2 = (C60555uf) tzVar.instance;
                b.getClass();
                ufVar2.f164093a |= 4;
                ufVar2.f164259n = b;
                C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                Query j = query.mo84498y().mo84481j(query);
                C107733l lVar2 = gVar.f299912b;
                C58976aa aaVar2 = C58975e.f156826a;
                if (C22872h.m42744d(C86593a.class)) {
                    lVar2.f299774a.mo80718x(j);
                } else {
                    lVar2.f299775b.mo28212l("#retryEventBusQuery", new C107724c(lVar2, j));
                }
            }
        }
        return C118826c.f331422a;
    }
}
