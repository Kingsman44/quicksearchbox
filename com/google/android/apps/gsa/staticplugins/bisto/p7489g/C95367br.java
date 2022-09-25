package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.br */
/* compiled from: PG */
public final /* synthetic */ class C95367br implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95369bt f266829a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f266830b;

    public /* synthetic */ C95367br(C95369bt btVar, SettableFuture settableFuture) {
        this.f266829a = btVar;
        this.f266830b = settableFuture;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95369bt btVar = this.f266829a;
        SettableFuture settableFuture = this.f266830b;
        Exception exc = (Exception) obj;
        C59104x c = C95369bt.f266836o.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoTwsDevice");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(14964)).mo56386p("Failed to reconnect");
        btVar.f266840p = false;
        settableFuture.mo57357o(exc);
    }
}
