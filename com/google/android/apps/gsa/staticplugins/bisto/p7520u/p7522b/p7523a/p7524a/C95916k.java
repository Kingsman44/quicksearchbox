package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.k */
/* compiled from: PG */
public final /* synthetic */ class C95916k implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95917l f268561a;

    public /* synthetic */ C95916k(C95917l lVar) {
        this.f268561a = lVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95917l lVar = this.f268561a;
        Exception exc = (Exception) obj;
        if (!(exc instanceof CancellationException)) {
            C59104x c = C95917l.f268562c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ConnectingLCState");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(15842)).mo56386p("Connection failed");
            lVar.mo89847j("DisconnectingState", (Intent) null);
        } else if (lVar.f268869b) {
            C59104x c2 = C95917l.f268562c.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "ConnectingLCState");
            ((C59052c) ((C59052c) c2).mo56372aa(15844)).mo56386p("Cancelled. Currently active. Disconnecting.");
            lVar.mo89847j("DisconnectingState", (Intent) null);
        } else {
            C59104x b = C95917l.f268562c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ConnectingLCState");
            ((C59052c) ((C59052c) b).mo56372aa(15843)).mo56386p("Cancelled");
        }
    }
}
