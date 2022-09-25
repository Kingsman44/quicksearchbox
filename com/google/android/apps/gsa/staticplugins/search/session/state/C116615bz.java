package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.bz */
/* compiled from: PG */
public final /* synthetic */ class C116615bz implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116619cc f323424a;

    public /* synthetic */ C116615bz(C116619cc ccVar) {
        this.f323424a = ccVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116619cc ccVar = this.f323424a;
        C59104x c = C116619cc.f323428a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "S_ExternalQueryState");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(32045)).mo56386p("Failed to handle url in query string");
        ccVar.f323436i = false;
        if (((C116800iv) ccVar.f323432e.mo27525b()).mo102950j()) {
            ccVar.mo80591ar();
        }
    }
}
