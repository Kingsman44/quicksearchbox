package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.ck */
/* compiled from: PG */
final class C13812ck implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C13814cm f42083a;

    public C13812ck(C13814cm cmVar) {
        this.f42083a = cmVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof CancellationException) {
            this.f42083a.f42086b.mo19974a(C37179a.f97509bb);
            if (((Boolean) this.f42083a.f42087c.mo17428b()).booleanValue()) {
                C59104x b = C13814cm.f42085a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "HybridFOPolicyAppFlow");
                ((C59052c) ((C59052c) b).mo56372aa(45039)).mo56386p("online fetch cancelled");
                return;
            }
            C59104x d = C13814cm.f42085a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HybridFOPolicyAppFlow");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(45038)).mo56386p("online fetch failed");
            return;
        }
        this.f42083a.f42086b.mo19974a(C37179a.f97690k);
        C59104x d2 = C13814cm.f42085a.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "HybridFOPolicyAppFlow");
        ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(th)).mo56372aa(45037)).mo56386p("online fetch failed");
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        this.f42083a.f42086b.mo19974a(C37179a.f97688i);
        C58976aa aaVar = C58975e.f156826a;
    }
}
