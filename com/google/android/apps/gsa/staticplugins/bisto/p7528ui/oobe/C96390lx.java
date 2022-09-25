package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60292ne;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.lx */
/* compiled from: PG */
public final /* synthetic */ class C96390lx implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95299e f269667a;

    public /* synthetic */ C96390lx(C95299e eVar) {
        this.f269667a = eVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95299e eVar = this.f269667a;
        C124548d dVar = (C124548d) obj;
        if (eVar.f266649d) {
            C59104x d = C95299e.f266645a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoOobeLogger");
            ((C59052c) ((C59052c) d).mo56372aa(14858)).mo56389s("session ended already %s", eVar.f266648c);
        }
        eVar.mo89236f((C60292ne) eVar.mo89231a(dVar.mo106481V(), dVar).build());
    }
}
