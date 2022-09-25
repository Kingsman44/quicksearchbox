package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95013d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.s */
/* compiled from: PG */
public final /* synthetic */ class C94895s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C94868aq f265434a;

    /* renamed from: b */
    public final /* synthetic */ int f265435b;

    public /* synthetic */ C94895s(C94868aq aqVar, int i) {
        this.f265434a = aqVar;
        this.f265435b = i;
    }

    public final void run() {
        C94868aq aqVar = this.f265434a;
        int i = this.f265435b;
        C95013d dVar = aqVar.f265313z;
        if (dVar == null) {
            C59104x d = C94868aq.f265285a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoGattHelper");
            ((C59052c) ((C59052c) d).mo56372aa(17420)).mo56386p("GATT was null, ignoring timeout.");
            return;
        }
        C59104x b = C94868aq.f265285a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGattHelper");
        ((C59052c) ((C59052c) b).mo56372aa(17419)).mo56389s("[%s] GATT disconnected", C94876ay.m156555d(aqVar.f265313z));
        aqVar.f265295h.mo19413f(dVar.mo88919a().f265818a.getAddress()).ifPresent(new C94894r(aqVar, i));
        aqVar.mo88700f();
        aqVar.f265293f.mo88712b();
    }
}
