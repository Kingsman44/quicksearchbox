package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.p10712d.C142468gl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.n */
/* compiled from: PG */
final class C96611n extends C96586cr {

    /* renamed from: a */
    final /* synthetic */ C96612o f270277a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96611n(C96612o oVar) {
        super(oVar);
        this.f270277a = oVar;
    }

    /* renamed from: b */
    public final boolean mo90253b(C142468gl glVar) {
        synchronized (this.f270277a) {
            C59104x b = C96612o.f270278a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "DeviceStateOtaTask");
            ((C59052c) ((C59052c) b).mo56372aa(16555)).mo56387q("Received index: %s", glVar.f386626e);
            if ((glVar.f386622a & 8) == 0 || this.f270277a.f270280c == glVar.f386626e) {
                C96612o oVar = this.f270277a;
                oVar.f270279b.put(Integer.valueOf(oVar.f270280c), glVar);
                if (this.f270277a.f270281d.hasNext()) {
                    C96612o oVar2 = this.f270277a;
                    oVar2.f270280c = ((Integer) oVar2.f270281d.next()).intValue();
                    C96612o oVar3 = this.f270277a;
                    oVar3.mo90274c(oVar3.f270280c);
                } else {
                    C96612o oVar4 = this.f270277a;
                    oVar4.mo90261i(oVar4.f270279b);
                }
            }
        }
        return true;
    }
}
