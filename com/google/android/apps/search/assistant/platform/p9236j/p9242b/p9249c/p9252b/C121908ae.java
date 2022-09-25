package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.ae */
/* compiled from: PG */
final class C121908ae implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C121909af f338292a;

    public C121908ae(C121909af afVar) {
        this.f338292a = afVar;
    }

    public final void run() {
        C121916am amVar = this.f338292a.f338293a;
        if (amVar == null) {
            C59052c cVar = (C59052c) C121916am.f338306a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "INV.AssistLayer.Host");
            long j = this.f338292a.f338294b;
            cVar.mo56379ah(new C59094n(36048));
            cVar.mo56388r("AssistLayerSession(%s).dismiss: host was null", j);
            return;
        }
        C59052c cVar2 = (C59052c) C121916am.f338306a.mo56224b();
        cVar2.mo56378ag(C58975e.f156826a, "INV.AssistLayer.Host");
        cVar2.mo56380ai(C58979ad.FULL);
        cVar2.mo56379ah(new C59094n(36047));
        cVar2.mo56386p("AssistLayerSessionImpl clientDismissed");
        amVar.mo105445f("clientDismissed");
    }
}
