package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.z */
/* compiled from: PG */
public final /* synthetic */ class C96048z implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268926a;

    public /* synthetic */ C96048z(C96017bm bmVar) {
        this.f268926a = bmVar;
    }

    public final void run() {
        C96017bm bmVar = this.f268926a;
        bmVar.mo89881d();
        C58976aa aaVar = C58975e.f156826a;
        bmVar.f268844n.set(true);
        bmVar.f268836f.mo28212l("update-BistoGacsManage-active", new C96032j(bmVar));
        bmVar.f268845o = bmVar.f268836f.mo28208h("update-active-status", C96017bm.f268829b.toMillis(), new C96033k(bmVar));
        C90875ai.m148465b(C96034l.f268897a, bmVar.f268845o, bmVar.f268837g, "active-status-updated").mo85223a(C96035m.f268898a);
    }
}
