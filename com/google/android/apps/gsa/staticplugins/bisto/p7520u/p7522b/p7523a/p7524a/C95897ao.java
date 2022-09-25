package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.ao */
/* compiled from: PG */
public final /* synthetic */ class C95897ao implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95898ap f268500a;

    public /* synthetic */ C95897ao(C95898ap apVar) {
        this.f268500a = apVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95898ap apVar = this.f268500a;
        Exception exc = (Exception) obj;
        apVar.f268502d = null;
        if (exc instanceof CancellationException) {
            C59104x b = C95898ap.f268501c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TwsRecNonInteractState");
            ((C59052c) ((C59052c) b).mo56372aa(15913)).mo56386p("TWS reconnect future cancelled");
        }
        C59104x c = C95898ap.f268501c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TwsRecNonInteractState");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(15912)).mo56386p("Error during TWS reconnect");
        apVar.mo89847j("DisconnectingState", (Intent) null);
    }
}
