package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.m */
/* compiled from: PG */
public final /* synthetic */ class C96035m implements C90919bp {

    /* renamed from: a */
    public static final /* synthetic */ C96035m f268898a = new C96035m();

    private /* synthetic */ C96035m() {
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        Exception exc = (Exception) obj;
        C59071e eVar = C96017bm.f268828a;
        if (exc instanceof CancellationException) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C59104x d = C96017bm.f268828a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoGacsManager");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(exc)).mo56372aa(15690)).mo56386p("Could not update actual active status.");
    }
}
