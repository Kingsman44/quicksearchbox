package com.google.android.apps.gsa.staticplugins.searchboxroot;

import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.staticplugins.p7867dv.p7869b.C100229x;
import com.google.android.apps.gsa.staticplugins.p7867dv.p7869b.C100230y;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.y */
/* compiled from: PG */
public final /* synthetic */ class C117044y implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C117045z f324976a;

    /* renamed from: b */
    public final /* synthetic */ Response f324977b;

    public /* synthetic */ C117044y(C117045z zVar, Response response) {
        this.f324976a = zVar;
        this.f324977b = response;
    }

    public final void run() {
        C117045z zVar = this.f324976a;
        Response response = this.f324977b;
        int i = response.f108864d;
        C100230y yVar = zVar.f324979b;
        if (yVar == null || i == 7) {
            C86775r rVar = zVar.f324978a.f324960k;
            if (rVar != null) {
                C86771n nVar = rVar.f234383e;
                C87684al alVar = new C87684al(C88244um.HANDLE_SUGGEST_RESPONSE);
                alVar.mo81966c(response);
                nVar.mo80379b(alVar.mo81964a());
                return;
            }
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        yVar.f280286a.f280293g.mo28212l("SuggestCtrl.handleSuggestResponse", new C100229x(yVar, response));
    }
}
