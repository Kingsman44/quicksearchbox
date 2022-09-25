package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6519al.p6540aj.C84691a;
import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.cd */
/* compiled from: PG */
public final class C116620cd implements C87143ik {

    /* renamed from: a */
    private final C116619cc f323437a;

    /* renamed from: b */
    private final C86842bk f323438b;

    /* renamed from: c */
    private final C86842bk f323439c;

    public C116620cd(C116619cc ccVar, C68214a aVar, C68214a aVar2) {
        this.f323437a = ccVar;
        this.f323438b = new C86842bk(aVar);
        this.f323439c = new C86842bk(aVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323437a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        SearchError searchError;
        this.f323438b.mo80534b(icVar);
        this.f323439c.mo80534b(icVar);
        C86842bk bkVar = this.f323438b;
        boolean z = bkVar.f234552a;
        if (z || this.f323439c.f234552a) {
            C116619cc ccVar = this.f323437a;
            C86842bk bkVar2 = this.f323439c;
            Uri uri = null;
            if (z) {
                C116735gk gkVar = (C116735gk) bkVar.mo80533a();
                Query query = gkVar.f323784p;
                if (!query.f252770i.isEmpty() && !gkVar.f323794z) {
                    gkVar.f323794z = true;
                    new C90873ag(ccVar.f323433f.mo78421a(query), ccVar.f323434g, "Pop Query if external activity launched", new C116617ca(ccVar)).mo85223a(C116618cb.f323427a);
                }
                C116735gk gkVar2 = (C116735gk) bkVar.mo80533a();
                Query query2 = gkVar2.f323784p;
                ActionData actionData = ((C116836z) ccVar.f323429b.mo27525b()).f324250j;
                if (!ccVar.f323435h.mo84383cP(query2)) {
                    ccVar.f323435h = query2;
                    if (!query2.f252770i.isEmpty() && !gkVar2.mo102879U() && (actionData == null || actionData.mo81098i())) {
                        ccVar.f323436i = true;
                        C84691a aVar = ccVar.f323433f;
                        C58833ax j = C58833ax.m90833j(((C116569ag) ccVar.f323430c.mo27525b()).f323272f);
                        Bundle bundle = ((C116569ag) ccVar.f323430c.mo27525b()).f323271e;
                        new C90873ag(aVar.mo78422b(query2, j, C58833ax.m90833j(bundle != null ? bundle.getString("com.google.android.ssb.extra.ASSISTED_APP_TARGET_ACTIVITY") : null)), ccVar.f323434g, "handle url in query string", new C116614by(ccVar)).mo85223a(new C116615bz(ccVar));
                    }
                }
            }
            if (bkVar.f234552a || bkVar2.f234552a) {
                C116735gk gkVar3 = (C116735gk) bkVar.mo80533a();
                if (!gkVar3.mo102879U()) {
                    if (gkVar3.f323779k.mo79746e(C90120fr.f250855v)) {
                        if (gkVar3.f323784p.mo84435dP()) {
                            searchError = ((C116742gr) gkVar3.f323772d.mo27525b()).mo102920m(gkVar3.f323784p);
                        } else {
                            searchError = gkVar3.f323791w.mo102853b(gkVar3.f323784p);
                        }
                        C58976aa aaVar = C58975e.f156826a;
                        if (searchError != null && !gkVar3.f323784p.mo84325bJ() && !((C116800iv) gkVar3.f323775g.mo27525b()).mo102949i(gkVar3.f323784p) && searchError.mo81135N() == 262170 && gkVar3.f323779k.mo79742A(searchError.f236028l)) {
                            C90498f i = gkVar3.f323784p.mo84480i();
                            i.mo84572d(0, 16777216);
                            gkVar3.mo102873N(i.mo84568a());
                            uri = Uri.parse(searchError.f236028l);
                        }
                    }
                    if (uri != null) {
                        ccVar.f323433f.mo78424e(gkVar3.f323784p, uri);
                    }
                }
            }
        }
    }
}
