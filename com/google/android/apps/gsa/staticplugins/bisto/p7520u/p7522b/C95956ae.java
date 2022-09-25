package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.base.C58879cp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.ae */
/* compiled from: PG */
public final /* synthetic */ class C95956ae implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268676a;

    public /* synthetic */ C95956ae(C96017bm bmVar) {
        this.f268676a = bmVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96017bm bmVar = this.f268676a;
        String R = ((C124548d) obj).mo106477R();
        if (!C58879cp.m90962d(R)) {
            String format = String.format("%s_%s", new Object[]{"/assistant/disabled_by_host_capability", R});
            bmVar.f268840j.mo123086c(format);
            C59104x b = C96017bm.f268828a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
            ((C59052c) ((C59052c) b).mo56372aa(15650)).mo56389s("Added local capability %s", format);
            return;
        }
        C59104x d = C96017bm.f268828a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoGacsManager");
        ((C59052c) ((C59052c) d).mo56372aa(15649)).mo56386p("Not able add local capability due to missing node id");
    }
}
