package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.UUID;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.al */
/* compiled from: PG */
final class C97772al implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C97775ao.f272987a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PCP.BackgroundTask");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(30242)).mo56386p("Daily background task failed to enqueue local calendar periodic scheduler worker on PCP");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        UUID uuid = (UUID) obj;
        C58976aa aaVar = C58975e.f156826a;
    }
}
