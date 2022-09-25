package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.b.k */
/* compiled from: PG */
final class C94913k implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ boolean f265481a;

    /* renamed from: b */
    final /* synthetic */ C94914l f265482b;

    public C94913k(C94914l lVar, boolean z) {
        this.f265482b = lVar;
        this.f265481a = z;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C94914l.f265483a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoGacsDataHandler");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(17548)).mo56386p("sendAccountInfoIfNeedBe: Failed to get device info");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C124548d dVar = (C124548d) obj;
        if (dVar != null && dVar.mo106484Y()) {
            if (dVar.mo106521s() == C124636bb.OPA_ENABLED || this.f265481a) {
                this.f265482b.f265484b.mo88779a(dVar);
            }
        }
    }
}
