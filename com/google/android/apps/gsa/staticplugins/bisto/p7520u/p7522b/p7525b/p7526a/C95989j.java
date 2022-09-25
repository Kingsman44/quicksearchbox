package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.p7526a;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.j */
/* compiled from: PG */
public final /* synthetic */ class C95989j implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f268742a;

    public /* synthetic */ C95989j(SettableFuture settableFuture) {
        this.f268742a = settableFuture;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        SettableFuture settableFuture = this.f268742a;
        Exception exc = (Exception) obj;
        C59104x c = C95993n.f268747c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "WiredInitState");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(15993)).mo56386p("onFailCapabilityCheckFuture");
        settableFuture.mo57357o(exc);
    }
}
