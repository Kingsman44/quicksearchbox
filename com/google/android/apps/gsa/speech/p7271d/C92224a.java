package com.google.android.apps.gsa.speech.p7271d;

import com.google.android.apps.gsa.search.core.google.gaia.C86053n;
import com.google.android.apps.gsa.shared.util.p7159c.C90891ay;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60470rb;

/* renamed from: com.google.android.apps.gsa.speech.d.a */
/* compiled from: PG */
final class C92224a extends C90891ay {

    /* renamed from: a */
    final /* synthetic */ C92225b f257120a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92224a(C92225b bVar) {
        super("Auth token dependency checker");
        this.f257120a = bVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C58976aa aaVar = C58975e.f156826a;
        this.f257120a.mo86902c();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C86053n nVar = (C86053n) obj;
        if (nVar.f232633b == C60470rb.USER_RECOVERABLE_ERROR) {
            C58976aa aaVar = C58975e.f156826a;
            this.f257120a.mo86902c();
        } else if (nVar.f232633b == C60470rb.IO_EXCEPTION) {
            this.f257120a.mo86902c();
        } else {
            this.f257120a.mo86905e(true);
        }
    }
}
