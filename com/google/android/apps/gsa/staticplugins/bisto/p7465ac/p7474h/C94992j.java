package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h;

import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.assistant.p3739a.p3740a.C48098ce;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.h.j */
/* compiled from: PG */
public final /* synthetic */ class C94992j implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C94993k f265736a;

    public /* synthetic */ C94992j(C94993k kVar) {
        this.f265736a = kVar;
    }

    public final void run() {
        C94993k kVar = this.f265736a;
        C59104x b = C94995m.f265738a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17791)).mo56386p("Timeout triggered");
        C94995m mVar = kVar.f265737a;
        mVar.f265758u = null;
        if ("RUNNING_ACTION".equals(mVar.f265761x.f265734d)) {
            kVar.f265737a.f265754q = C48098ce.QUERY_FAILED;
            kVar.f265737a.mo88902f("DONE");
        }
    }
}
