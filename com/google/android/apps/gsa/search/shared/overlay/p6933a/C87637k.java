package com.google.android.apps.gsa.search.shared.overlay.p6933a;

import android.content.Intent;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.a.k */
/* compiled from: PG */
final class C87637k implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C87625ad f236896a;

    public C87637k(C87625ad adVar) {
        this.f236896a = adVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C87625ad.f236770n.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SearchOverlay");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(9680)).mo56386p("Failed to get the location consent intent");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        this.f236896a.f236840aq.mo65089a((Intent) obj);
    }
}
