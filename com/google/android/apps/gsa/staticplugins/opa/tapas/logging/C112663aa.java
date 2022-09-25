package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.p4559e.C59743a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.aa */
/* compiled from: PG */
public final /* synthetic */ class C112663aa implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C59743a f312265a;

    public /* synthetic */ C112663aa(C59743a aVar) {
        this.f312265a = aVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C59743a aVar = this.f312265a;
        ((C59052c) ((C59052c) ((C59052c) C112665ac.f312273a.mo56225c()).mo56382g((Exception) obj)).mo56372aa(27506)).mo56386p("Failed to log ML query.");
        C121537f fVar = C112665ac.f312274b;
        String name = aVar.name();
        fVar.mo105240i("tapasMLLogger_log_" + name + "_failed");
    }
}
