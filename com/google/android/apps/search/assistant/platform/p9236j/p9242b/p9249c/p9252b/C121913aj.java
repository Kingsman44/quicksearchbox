package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import android.content.res.Configuration;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.aj */
/* compiled from: PG */
final class C121913aj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C121916am f338300a;

    public C121913aj(C121916am amVar) {
        this.f338300a = amVar;
    }

    public final void run() {
        C121928ay ayVar = this.f338300a.f338312g;
        if (ayVar == null) {
            C59052c cVar = (C59052c) C121916am.f338306a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "INV.AssistLayer.Host");
            cVar.mo56379ah(new C59094n(36050));
            cVar.mo56386p("#onAndroidConfigurationChanged called but window is null.");
            return;
        }
        C59052c cVar2 = (C59052c) C121928ay.f338335a.mo56224b();
        cVar2.mo56378ag(C58975e.f156826a, "INV.AssistLayer.Window");
        cVar2.mo56379ah(new C59094n(36071));
        cVar2.mo56386p("onAndroidConfigurationChanged");
        Configuration configuration = ayVar.getContext().getResources().getConfiguration();
        C121955p pVar = ayVar.f338338d;
        if (pVar == null) {
            C69664n.m101065k("fragmentHost");
            pVar = null;
        }
        pVar.mo51131u(configuration);
    }
}
