package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.p7526a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.c */
/* compiled from: PG */
public final /* synthetic */ class C95982c implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95983d f268725a;

    public /* synthetic */ C95982c(C95983d dVar) {
        this.f268725a = dVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95983d dVar = this.f268725a;
        Exception exc = (Exception) obj;
        if (!(exc instanceof CancellationException)) {
            C59104x c = C95983d.f268726c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "WiredConnectingState");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(15982)).mo56386p("Connection failed");
            dVar.mo89847j("WiredDisconnectingState", (Intent) null);
        } else if (dVar.f268869b) {
            C59104x c2 = C95983d.f268726c.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "WiredConnectingState");
            ((C59052c) ((C59052c) c2).mo56372aa(15984)).mo56386p("Cancelled. Currently active. Disconnecting.");
            dVar.mo89847j("WiredDisconnectingState", (Intent) null);
        } else {
            C59104x b = C95983d.f268726c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "WiredConnectingState");
            ((C59052c) ((C59052c) b).mo56372aa(15983)).mo56386p("Cancelled");
        }
    }
}
