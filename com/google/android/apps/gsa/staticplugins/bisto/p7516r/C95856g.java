package com.google.android.apps.gsa.staticplugins.bisto.p7516r;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.util.p7159c.C90883aq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.r.g */
/* compiled from: PG */
final class C95856g extends C90883aq {

    /* renamed from: a */
    final /* synthetic */ C87739bu f268418a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95856g(C87739bu buVar) {
        super("ackdone", 2, 0);
        this.f268418a = buVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C95857h.f268419a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "WorkerInitiator");
        ((C59052c) ((C59052c) c).mo56372aa(15489)).mo56354G("onFailure: %s, %s", this.f268418a, th);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        C58976aa aaVar = C58975e.f156826a;
    }
}
