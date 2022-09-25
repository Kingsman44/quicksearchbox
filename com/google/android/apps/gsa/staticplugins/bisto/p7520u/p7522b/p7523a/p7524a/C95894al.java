package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.al */
/* compiled from: PG */
public final /* synthetic */ class C95894al implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95895am f268490a;

    public /* synthetic */ C95894al(C95895am amVar) {
        this.f268490a = amVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95895am amVar = this.f268490a;
        Exception exc = (Exception) obj;
        amVar.f268494f = null;
        if (exc instanceof CancellationException) {
            C59104x b = C95895am.f268491c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TwsRecInteractState");
            ((C59052c) ((C59052c) b).mo56372aa(15902)).mo56386p("TWS reconnect future cancelled");
        }
        C59104x c = C95895am.f268491c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TwsRecInteractState");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(15901)).mo56386p("Error during TWS reconnect");
        amVar.mo89847j(amVar.f268492d.mo89278w() ? "DispatchingState" : "WaitingToReconnectState", (Intent) null);
    }
}
