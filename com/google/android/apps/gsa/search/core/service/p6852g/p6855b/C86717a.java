package com.google.android.apps.gsa.search.core.service.p6852g.p6855b;

import com.google.android.apps.gsa.search.core.service.p6852g.C86725e;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.service.g.b.a */
/* compiled from: PG */
final class C86717a extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C86725e f234245a;

    /* renamed from: b */
    final /* synthetic */ C86719c f234246b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86717a(C86719c cVar, C86725e eVar) {
        super("Set current user scenario back to IDLE to avoid starvation", 1, 0);
        this.f234246b = cVar;
        this.f234245a = eVar;
    }

    public final void run() {
        C58976aa aaVar = C58975e.f156826a;
        this.f234246b.mo80332e(this.f234245a);
    }
}
