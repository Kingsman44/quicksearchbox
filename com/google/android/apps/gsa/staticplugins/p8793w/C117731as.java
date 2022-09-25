package com.google.android.apps.gsa.staticplugins.p8793w;

import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.as */
/* compiled from: PG */
public final /* synthetic */ class C117731as implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C117732at f326790a;

    public /* synthetic */ C117731as(C117732at atVar) {
        this.f326790a = atVar;
    }

    public final void run() {
        C117732at atVar = this.f326790a;
        C59104x b = C117732at.f326791a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Timeout");
        ((C59052c) ((C59052c) b).mo56372aa(18569)).mo56389s("Timed out waiting for %s", atVar.f326792b);
        atVar.f326794d = null;
        C118831d dVar = atVar.f326795e;
        if (dVar != null) {
            dVar.mo104025g(1);
        }
        atVar.f326793c.run();
    }
}
