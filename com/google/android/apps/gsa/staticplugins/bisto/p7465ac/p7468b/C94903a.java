package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.b.a */
/* compiled from: PG */
public final /* synthetic */ class C94903a implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C94905c f265450a;

    /* renamed from: b */
    public final /* synthetic */ C124548d f265451b;

    public /* synthetic */ C94903a(C94905c cVar, C124548d dVar) {
        this.f265450a = cVar;
        this.f265451b = dVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C94905c cVar = this.f265450a;
        C124548d dVar = this.f265451b;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C59104x b = C94905c.f265453a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoAccountInfoHandler");
            ((C59052c) ((C59052c) b).mo56372aa(17544)).mo56386p("Sending account to accessory");
            cVar.mo88780b((Account) axVar.mo56107c(), dVar);
            return;
        }
        C59104x b2 = C94905c.f265453a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "BistoAccountInfoHandler");
        ((C59052c) ((C59052c) b2).mo56372aa(17543)).mo56386p("Sending no account to accessory");
        cVar.mo88780b((Account) null, dVar);
    }
}
