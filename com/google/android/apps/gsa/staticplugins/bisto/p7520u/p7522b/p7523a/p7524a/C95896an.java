package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.an */
/* compiled from: PG */
public final /* synthetic */ class C95896an implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95898ap f268499a;

    public /* synthetic */ C95896an(C95898ap apVar) {
        this.f268499a = apVar;
    }

    public final void run() {
        C95898ap apVar = this.f268499a;
        C59104x b = C95898ap.f268501c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TwsRecNonInteractState");
        ((C59052c) ((C59052c) b).mo56372aa(15911)).mo56386p("TWS reconnect successfully completed");
        apVar.f268502d = null;
        apVar.mo89847j("ConnectingLCState", (Intent) null);
    }
}
