package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.p7526a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.l */
/* compiled from: PG */
public final /* synthetic */ class C95991l implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95993n f268744a;

    public /* synthetic */ C95991l(C95993n nVar) {
        this.f268744a = nVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95993n nVar = this.f268744a;
        C59104x c = C95993n.f268747c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "WiredInitState");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(15992)).mo56386p("Failed to get device capabilities");
        nVar.mo89847j("WiredDisconnectingState", (Intent) null);
    }
}
