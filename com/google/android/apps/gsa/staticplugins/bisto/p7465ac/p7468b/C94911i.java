package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.b.i */
/* compiled from: PG */
public final /* synthetic */ class C94911i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C94914l f265478a;

    /* renamed from: b */
    public final /* synthetic */ C124548d f265479b;

    public /* synthetic */ C94911i(C94914l lVar, C124548d dVar) {
        this.f265478a = lVar;
        this.f265479b = dVar;
    }

    public final void run() {
        C94914l lVar = this.f265478a;
        C124548d dVar = this.f265479b;
        C59104x b = C94914l.f265483a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGacsDataHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17562)).mo56389s("Assistant Settings and BDD Success %s", dVar.mo106520r());
        if (C124633az.OOBE_IN_PROGRESS.equals(dVar.mo106520r())) {
            lVar.f265485c.mo83394aj(lVar.f265486d, C124636bb.OPA_ENABLED, C124633az.OOBE_FINISHED);
        }
    }
}
