package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.n */
/* compiled from: PG */
public final /* synthetic */ class C95919n implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95920o f268569a;

    public /* synthetic */ C95919n(C95920o oVar) {
        this.f268569a = oVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95920o oVar = this.f268569a;
        C59104x c = C95920o.f268570c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "DisconnectingState");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(15850)).mo56386p("Failed to disconnect");
        oVar.mo89847j("ClassicIdleState", (Intent) null);
    }
}
