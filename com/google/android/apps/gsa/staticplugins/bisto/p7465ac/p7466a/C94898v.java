package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.v */
/* compiled from: PG */
public final /* synthetic */ class C94898v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C94868aq f265439a;

    public /* synthetic */ C94898v(C94868aq aqVar) {
        this.f265439a = aqVar;
    }

    public final void run() {
        C94868aq aqVar = this.f265439a;
        C59104x b = C94868aq.f265285a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGattHelper");
        ((C59052c) ((C59052c) b).mo56372aa(17417)).mo56389s("[%s] GATT connected", C94876ay.m156555d(aqVar.f265313z));
        try {
            aqVar.mo88706l();
        } catch (C94893q e) {
            C94876ay.m156555d(aqVar.f265313z);
            e.getMessage();
        }
        aqVar.mo88702h(new C94877az(2));
    }
}
