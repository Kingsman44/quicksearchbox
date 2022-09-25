package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123029bw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60845bz;
import com.google.protos.p4985f.p5030q.C65184er;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.y */
/* compiled from: PG */
final class C123561y implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C123562z f341424a;

    public C123561y(C123562z zVar) {
        this.f341424a = zVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!this.f341424a.f341434j) {
            ((C59052c) ((C59052c) this.f341424a.f341431g.mo105765d().mo56382g(th)).mo56372aa(34797)).mo56386p("IGDP request failed due to exception.");
            C123562z zVar = this.f341424a;
            zVar.f341430f.mo20122b(zVar.f341432h.mo105845a(th, "callIGDP").asException());
        } else if (!(th instanceof CancellationException)) {
            ((C59052c) ((C59052c) this.f341424a.f341431g.mo105765d().mo56382g(th)).mo56372aa(34798)).mo56386p("Got failure after responses complete.");
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C123029bw bwVar = (C123029bw) obj;
        ((C59052c) this.f341424a.f341431g.mo105767f(C59071e.f157037b).mo56372aa(34799)).mo56386p("Received igdp response");
        if (this.f341424a.f341434j) {
            ((C59052c) this.f341424a.f341431g.mo105767f(C59071e.f157037b).mo56372aa(34802)).mo56386p("Ignoring igdp results because already finalized.");
            return;
        }
        ((C59052c) this.f341424a.f341431g.mo105764c().mo56372aa(34800)).mo56386p("IGDP request finished successfully");
        ((C59052c) this.f341424a.f341431g.mo105767f(C59071e.f157037b).mo56372aa(34801)).mo56389s("Result response: %s", bwVar.mo105839b());
        this.f341424a.f341430f.mo20123c((C65184er) bwVar.mo105839b());
        this.f341424a.f341430f.mo20121a();
    }
}
