package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.z */
/* compiled from: PG */
public final /* synthetic */ class C95453z implements C95353bd {

    /* renamed from: a */
    public final /* synthetic */ C95345aw f267096a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f267097b;

    public /* synthetic */ C95453z(C95345aw awVar, SettableFuture settableFuture) {
        this.f267096a = awVar;
        this.f267097b = settableFuture;
    }

    /* renamed from: ip */
    public final void mo89286ip(String str, boolean z) {
        C95345aw awVar = this.f267096a;
        SettableFuture settableFuture = this.f267097b;
        if (!z && awVar.f266748b.equals(str) && !settableFuture.isDone()) {
            C59104x b = C95345aw.f266745a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoBluetoothDevice");
            ((C59052c) ((C59052c) b).mo56372aa(14939)).mo56386p("Canceling device request");
            settableFuture.cancel(false);
        }
    }
}
