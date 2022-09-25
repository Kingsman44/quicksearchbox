package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.aq */
/* compiled from: PG */
final class C96531aq implements C96534at {

    /* renamed from: a */
    final /* synthetic */ C96532ar f270063a;

    public C96531aq(C96532ar arVar) {
        this.f270063a = arVar;
    }

    /* renamed from: b */
    public final void mo90202b(C22869e eVar) {
        synchronized (this.f270063a) {
            if (this.f270063a.f270068e) {
                C59104x b = C96532ar.f270064a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "OtaSession");
                ((C59052c) ((C59052c) b).mo56372aa(16589)).mo56386p("runSynchronizedStateOperation after session is destroyed. No-op.");
                return;
            }
            eVar.run();
        }
    }

    /* renamed from: c */
    public final void mo90203c(C96534at atVar) {
    }

    /* renamed from: a */
    public final void mo90201a(C124625ar arVar, C124629av avVar, C124548d dVar) {
        synchronized (this.f270063a) {
            C96532ar arVar2 = this.f270063a;
            if (arVar2.f270068e) {
                C59104x b = C96532ar.f270064a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "OtaSession");
                ((C59052c) ((C59052c) b).mo56372aa(16588)).mo56389s("moveToState: %s after session is destroyed. No-op.", arVar);
            } else if (!arVar2.f270066c.containsKey(arVar)) {
                C59104x c = C96532ar.f270064a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OtaSession");
                ((C59052c) ((C59052c) c).mo56372aa(16587)).mo56389s("moveToState: %s; Unsupported state", arVar);
            } else {
                C96532ar arVar3 = this.f270063a;
                arVar3.f270067d = (C96535au) arVar3.f270066c.get(arVar);
                this.f270063a.f270067d.mo90228e(avVar, dVar);
            }
        }
    }
}
