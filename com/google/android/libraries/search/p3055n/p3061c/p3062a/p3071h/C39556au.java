package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.n.c.a.h.au */
/* compiled from: PG */
public final /* synthetic */ class C39556au implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C39580br f104135a;

    public /* synthetic */ C39556au(C39580br brVar) {
        this.f104135a = brVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C39580br brVar = this.f104135a;
        if (brVar.f104177j.get() == C39579bq.INITIALIZED || brVar.f104183p.mo56113h()) {
            cVar.mo5437b((Object) null);
            return "No need to wait; soda is either stopped or we are already waiting for it to be stopped";
        }
        brVar.f104183p = C58833ax.m90834k(cVar);
        C59104x b = C39580br.f104168a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
        ((C59052c) ((C59052c) b).mo56372aa(53775)).mo56386p("After setting sodaStopCompleter for waitForSodaStoppedAfterTimeout");
        return "Wait for Soda to stop after timeout.";
    }
}
