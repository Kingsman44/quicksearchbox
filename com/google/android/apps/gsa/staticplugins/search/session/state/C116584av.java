package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4500cm.p4514b.C58170d;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.av */
/* compiled from: PG */
public final /* synthetic */ class C116584av implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116593bd f323326a;

    public /* synthetic */ C116584av(C116593bd bdVar) {
        this.f323326a = bdVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116593bd bdVar = this.f323326a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C58170d dVar = (C58170d) axVar.mo56107c();
            C116592bc bcVar = bdVar.f323346e;
            if (bcVar == null) {
                C59104x d = C116593bd.f323342a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "S_ClockworkState");
                ((C59052c) ((C59052c) d).mo56372aa(31994)).mo56389s("Received a ClockworkSearchResponse without a ClockworkSearch. Response = %s", dVar);
            } else {
                bcVar.f323339c = dVar;
                bcVar.mo102785a();
            }
            bdVar.mo102790j(bdVar.mo102787e());
            bdVar.mo80591ar();
        }
    }
}
