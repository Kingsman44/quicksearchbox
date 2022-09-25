package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.p7526a;

import android.content.Intent;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.e */
/* compiled from: PG */
public final /* synthetic */ class C95984e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95986g f268731a;

    public /* synthetic */ C95984e(C95986g gVar) {
        this.f268731a = gVar;
    }

    public final void run() {
        C95986g gVar = this.f268731a;
        C59104x b = C95986g.f268733c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "WiredDisconnectingState");
        ((C59052c) ((C59052c) b).mo56372aa(15985)).mo56386p("Disconnect complete");
        gVar.mo89847j(gVar.f268734d ? "WiredConnectingState" : "WiredIdleState", (Intent) null);
    }
}
