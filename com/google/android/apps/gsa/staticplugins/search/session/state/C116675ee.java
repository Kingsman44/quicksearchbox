package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7186u.C91101a;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ee */
/* compiled from: PG */
public final class C116675ee implements C87143ik {

    /* renamed from: a */
    private final C116674ed f323572a;

    /* renamed from: b */
    private final C86842bk f323573b;

    /* renamed from: c */
    private final C86842bk f323574c;

    /* renamed from: d */
    private final C86842bk f323575d;

    /* renamed from: e */
    private final C86842bk f323576e;

    /* renamed from: f */
    private final C86842bk f323577f;

    /* renamed from: g */
    private final C86842bk f323578g;

    public C116675ee(C116674ed edVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6) {
        this.f323572a = edVar;
        this.f323573b = new C86842bk(aVar);
        this.f323574c = new C86842bk(aVar2);
        this.f323575d = new C86842bk(aVar3);
        this.f323576e = new C86842bk(aVar4);
        this.f323577f = new C86842bk(aVar5);
        this.f323578g = new C86842bk(aVar6);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323572a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        boolean z;
        SearchError searchError;
        boolean z2;
        boolean z3;
        C87135ic icVar2 = icVar;
        this.f323573b.mo80534b(icVar2);
        this.f323574c.mo80534b(icVar2);
        this.f323575d.mo80534b(icVar2);
        this.f323576e.mo80534b(icVar2);
        this.f323577f.mo80534b(icVar2);
        this.f323578g.mo80534b(icVar2);
        C86842bk bkVar = this.f323573b;
        if (bkVar.f234552a || this.f323574c.f234552a || this.f323575d.f234552a || this.f323576e.f234552a || this.f323577f.f234552a || this.f323578g.f234552a) {
            C116674ed edVar = this.f323572a;
            C86842bk bkVar2 = this.f323574c;
            C86842bk bkVar3 = this.f323575d;
            C86842bk bkVar4 = this.f323576e;
            C86842bk bkVar5 = this.f323577f;
            C86842bk bkVar6 = this.f323578g;
            C116569ag agVar = (C116569ag) bkVar.mo80533a();
            C116735gk gkVar = (C116735gk) bkVar2.mo80533a();
            C116628cl clVar = (C116628cl) bkVar4.mo80533a();
            if (bkVar2.f234552a) {
                boolean z4 = edVar.f323566d;
                String be = gkVar.f323793y ? gkVar.f323783o.mo84346be() : null;
                if (!C58832aw.m90831a(be, edVar.f323571i)) {
                    edVar.f323571i = be;
                    z3 = true;
                } else {
                    z3 = false;
                }
                edVar.f323566d = z4 | z3;
            }
            if ((bkVar2.f234552a || bkVar4.f234552a) && gkVar.f323784p.mo84438dS()) {
                Query query = gkVar.f323784p;
                boolean z5 = clVar.f323457h.longValue() == edVar.f323568f;
                edVar.f323568f = clVar.f323457h.longValue();
                if ((!z5) && !edVar.f323569g.mo84383cP(query)) {
                    edVar.f323569g = query;
                }
            }
            if (bkVar4.f234552a) {
                boolean z6 = edVar.f323566d;
                List list = clVar.f323454e;
                if (list == null || list.equals(edVar.f323570h)) {
                    z2 = false;
                } else {
                    edVar.f323570h = list;
                    z2 = true;
                }
                edVar.f323566d = z6 | z2;
            }
            if (bkVar3.f234552a || bkVar5.f234552a) {
                C116740gp gpVar = (C116740gp) bkVar3.mo80533a();
                edVar.f323564b = (gpVar.mo102914k() && ((C116819jn) bkVar5.mo80533a()).f324184t) || ((gpVar.mo102913j() || gpVar.mo102912i()) && !gpVar.mo102914k());
            }
            if (edVar.f323567e) {
                if (bkVar4.f234552a && clVar.f323454e != null) {
                    C58976aa aaVar = C58975e.f156826a;
                    edVar.f323567e = false;
                    edVar.f323566d = true;
                }
            } else if (bkVar6.f234552a && (searchError = ((C116611bv) bkVar6.mo80533a()).f323415e) != null && searchError.mo81138R(16)) {
                C58976aa aaVar2 = C58975e.f156826a;
                edVar.f323567e = true;
                edVar.f323566d = true;
            }
            if (edVar.f323567e) {
                boolean z7 = edVar.f323566d;
                if (!C58597ky.m90218i(C116674ed.f323563a, edVar.f323570h)) {
                    edVar.f323570h = C116674ed.f323563a;
                    z = true;
                } else {
                    z = false;
                }
                edVar.f323566d = z7 | z;
            }
            boolean z8 = agVar.f323267a.mo81888f() || C91101a.m148849a(agVar.f323267a);
            if ((edVar.f323564b || edVar.f323567e) && z8 && edVar.f323566d) {
                edVar.f323566d = false;
                if (!edVar.f323565c) {
                    edVar.f323565c = true;
                    this.f323572a.mo80591ar();
                }
            }
        }
    }
}
