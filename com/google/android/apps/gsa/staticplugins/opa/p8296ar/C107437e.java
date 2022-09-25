package com.google.android.apps.gsa.staticplugins.opa.p8296ar;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3803ag.p3807b.p3808a.C48915q;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.e */
/* compiled from: PG */
public final /* synthetic */ class C107437e implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C48915q f298976a;

    public /* synthetic */ C107437e(C48915q qVar) {
        this.f298976a = qVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C48915q qVar = this.f298976a;
        C59104x d = C107440h.f298981a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ClientActionListener");
        C59052c cVar = (C59052c) ((C59052c) ((C59052c) d).mo56382g((Exception) obj)).mo56372aa(25349);
        C48919u uVar = qVar.f126577b;
        if (uVar == null) {
            uVar = C48919u.f126586g;
        }
        cVar.mo56389s("failed to remove trigger for trigger id %s", uVar.f126591d);
    }
}
