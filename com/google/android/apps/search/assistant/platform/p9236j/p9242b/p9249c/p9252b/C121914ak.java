package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.ak */
/* compiled from: PG */
final class C121914ak implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C121916am f338301a;

    public C121914ak(C121916am amVar) {
        this.f338301a = amVar;
    }

    public final void run() {
        C121928ay ayVar = this.f338301a.f338312g;
        if (ayVar == null) {
            C59052c cVar = (C59052c) C121916am.f338306a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "INV.AssistLayer.Host");
            cVar.mo56379ah(new C59094n(36051));
            cVar.mo56386p("#onCloseSystemDialogs called but window is null.");
            return;
        }
        ayVar.mo105453c("onCloseSystemDialogs", C121927ax.f338334a);
    }
}
