package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.research.p5181a.p5182a.C66278a;
import com.google.research.p5181a.p5187e.C66355e;
import com.google.research.p5181a.p5188f.C66376a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ab */
/* compiled from: PG */
public final /* synthetic */ class C112307ab implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C112312ag f311662a;

    public /* synthetic */ C112307ab(C112312ag agVar) {
        this.f311662a = agVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C112312ag agVar = this.f311662a;
        C66355e eVar = (C66355e) obj;
        synchronized (agVar) {
            if (eVar != null) {
                int i = 0;
                while (true) {
                    C66278a aVar = agVar.f311681m.f180433a;
                    if (i < aVar.f180248b) {
                        eVar.mo59583b((C66376a) aVar.mo59448a(i));
                        i++;
                    } else {
                        agVar.f311681m = eVar;
                        C58976aa aaVar = C58975e.f156826a;
                        if (agVar.f311682n.isPresent()) {
                            ((C112341bi) agVar.f311682n.get()).mo59600e(agVar.f311681m);
                        }
                    }
                }
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
            }
        }
    }
}
