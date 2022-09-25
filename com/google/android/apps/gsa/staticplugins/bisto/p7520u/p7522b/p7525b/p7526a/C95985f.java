package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.p7526a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.f */
/* compiled from: PG */
public final /* synthetic */ class C95985f implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95986g f268732a;

    public /* synthetic */ C95985f(C95986g gVar) {
        this.f268732a = gVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95986g gVar = this.f268732a;
        C59104x c = C95986g.f268733c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "WiredDisconnectingState");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(15986)).mo56386p("Failed to disconnect");
        gVar.mo89847j("WiredIdleState", (Intent) null);
    }
}
