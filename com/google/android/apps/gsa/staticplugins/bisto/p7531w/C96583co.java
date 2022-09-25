package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95353bd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.co */
/* compiled from: PG */
final class C96583co implements C95353bd {

    /* renamed from: a */
    final /* synthetic */ C96588ct f270189a;

    public C96583co(C96588ct ctVar) {
        this.f270189a = ctVar;
    }

    /* renamed from: ip */
    public final void mo89286ip(String str, boolean z) {
        if (!z) {
            synchronized (this.f270189a) {
                if (!this.f270189a.f270204p.isDone()) {
                    C59104x b = C96588ct.f270193f.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "OtaTask");
                    C59052c cVar = (C59052c) b;
                    cVar.mo56378ag(C58975e.f156826a, this.f270189a.mo90248a());
                    ((C59052c) cVar.mo56372aa(16696)).mo56386p("Canceling current task due to connection loss");
                    this.f270189a.mo90259g();
                }
            }
        }
    }
}
