package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6491a.p6493b.C84352a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.state.p6874f.C87038e;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107932g;
import com.google.android.apps.gsa.staticplugins.opa.p8408q.C109951a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.bd */
/* compiled from: PG */
public final class C107891bd implements C107874az {

    /* renamed from: a */
    private static final C59071e f300201a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.e.bd");

    /* renamed from: b */
    private final C86124t f300202b;

    /* renamed from: c */
    private final C68214a f300203c;

    /* renamed from: d */
    private final C68214a f300204d;

    /* renamed from: e */
    private final C68214a f300205e;

    /* renamed from: f */
    private final C68214a f300206f;

    /* renamed from: g */
    private final C68214a f300207g;

    /* renamed from: h */
    private final C68214a f300208h;

    /* renamed from: i */
    private final C68214a f300209i;

    /* renamed from: j */
    private final C68214a f300210j;

    /* renamed from: k */
    private final C90476a f300211k;

    /* renamed from: l */
    private final C109951a f300212l;

    public C107891bd(C86124t tVar, C109951a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C90476a aVar10) {
        this.f300202b = tVar;
        this.f300212l = aVar;
        this.f300203c = aVar2;
        this.f300204d = aVar3;
        this.f300205e = aVar4;
        this.f300206f = aVar5;
        this.f300207g = aVar6;
        this.f300208h = aVar7;
        this.f300209i = aVar8;
        this.f300210j = aVar9;
        this.f300211k = aVar10;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96296a() {
    }

    /* renamed from: b */
    public final boolean mo96322b(ClientEventData clientEventData) {
        TtsRequest ttsRequest;
        C58976aa aaVar = C58975e.f156826a;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a.ordinal() != 45) {
            return false;
        }
        this.f300212l.f306381a.clear();
        this.f300212l.mo98270a("query-committed");
        ((C107852ad) this.f300203c.mo27525b()).mo96319c();
        Query query = (Query) clientEventData.mo81912b(Query.class);
        if (query != null && query.mo84322bG() && query.mo84403cj()) {
            C107892be beVar = (C107892be) this.f300204d.mo27525b();
            beVar.f300213a.mo78758e(query, beVar);
            return true;
        } else if (!query.mo84374cG() && !query.mo84419cz()) {
            return false;
        } else {
            Bundle bundle = query.f252786y;
            if (bundle == null || (ttsRequest = (TtsRequest) bundle.getParcelable("notification-message")) == null || TtsRequest.m141979c(ttsRequest)) {
                C59104x d = f300201a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "QueryCommitSubCtrl");
                ((C59052c) ((C59052c) d).mo56372aa(26282)).mo56389s("Invalid notification message: %s.", bundle);
                return true;
            }
            C87038e.m140572f(query, ((C107932g) this.f300205e.mo27525b()).f300312b, this.f300206f, this.f300207g, this.f300208h, this.f300209i, this.f300202b);
            if ((query.f252765d & 15) != 11 && !ttsRequest.f236281e) {
                ((C84352a) this.f300210j.mo27525b()).mo77888b(query, ttsRequest, C107890bc.f300200a);
            } else {
                ((C84352a) this.f300210j.mo27525b()).mo77887a(query, ttsRequest, C107889bb.f300199a);
            }
            return true;
        }
    }
}
