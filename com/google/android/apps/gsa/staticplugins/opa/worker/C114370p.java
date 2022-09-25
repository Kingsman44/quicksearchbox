package com.google.android.apps.gsa.staticplugins.opa.worker;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p5177r.p5178a.p5179a.p5180a.C66276d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.p */
/* compiled from: PG */
public final /* synthetic */ class C114370p implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C114507v f317108a;

    public /* synthetic */ C114370p(C114507v vVar) {
        this.f317108a = vVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C114507v vVar = this.f317108a;
        C58976aa aaVar = C58975e.f156826a;
        C86337q b = ((C86338r) vVar.f317521g.mo27525b()).mo80076b();
        b.mo80068c("opa_discovered_duo_capabilities", ((C66276d) obj).toByteArray());
        b.apply();
        return C118826c.f331422a;
    }
}
