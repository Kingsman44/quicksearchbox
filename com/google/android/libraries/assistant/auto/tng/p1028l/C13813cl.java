package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.cl */
/* compiled from: PG */
final class C13813cl implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C13814cm f42084a;

    public C13813cl(C13814cm cmVar) {
        this.f42084a = cmVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C13814cm cmVar = this.f42084a;
        cmVar.f42090f = true;
        if (th instanceof CancellationException) {
            cmVar.f42086b.mo19974a(C37179a.f97508ba);
            if (((Boolean) this.f42084a.f42087c.mo17428b()).booleanValue()) {
                C59104x b = C13814cm.f42085a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "HybridFOPolicyAppFlow");
                ((C59052c) ((C59052c) b).mo56372aa(45043)).mo56386p("offline fetch cancelled");
                return;
            }
            C59104x d = C13814cm.f42085a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HybridFOPolicyAppFlow");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(45042)).mo56386p("offline fetch failed");
            return;
        }
        cmVar.f42086b.mo19974a(C37179a.f97691l);
        C59104x d2 = C13814cm.f42085a.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "HybridFOPolicyAppFlow");
        ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(th)).mo56372aa(45041)).mo56386p("offline fetch failed");
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        C13814cm cmVar = this.f42084a;
        cmVar.f42090f = true;
        if (!cmVar.f42088d) {
            cmVar.f42086b.mo19974a(C37179a.f97703x);
            C58976aa aaVar = C58975e.f156826a;
        }
        this.f42084a.f42086b.mo19974a(C37179a.f97689j);
        C58976aa aaVar2 = C58975e.f156826a;
    }
}
