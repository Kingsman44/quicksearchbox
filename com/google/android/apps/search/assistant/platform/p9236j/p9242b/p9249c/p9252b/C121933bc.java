package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33504b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.bc */
/* compiled from: PG */
final class C121933bc implements Callable {

    /* renamed from: a */
    final /* synthetic */ C121934bd f338344a;

    public C121933bc(C121934bd bdVar) {
        this.f338344a = bdVar;
    }

    public final /* synthetic */ Object call() {
        C33504b bVar = this.f338344a.f338347c;
        if (bVar == null) {
            C59052c cVar = (C59052c) C121940bj.f338366a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "INV.AssistLayer.Host");
            cVar.mo56379ah(new C59094n(36078));
            cVar.mo56386p("dismiss called, but session was already invalidated");
            return null;
        }
        C59052c cVar2 = (C59052c) C121940bj.f338366a.mo56224b();
        cVar2.mo56378ag(C58975e.f156826a, "INV.AssistLayer.Host");
        cVar2.mo56379ah(new C59094n(36077));
        cVar2.mo56386p("dismiss");
        bVar.setUiEnabled(false);
        C121925av avVar = this.f338344a.f338348d;
        if (avVar == null) {
            return null;
        }
        avVar.mo105450l(new C121919ap(avVar));
        return null;
    }
}
