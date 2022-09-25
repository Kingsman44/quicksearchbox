package com.google.android.apps.gsa.staticplugins.p7816dl.p7818b;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99688m;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.b.ab */
/* compiled from: PG */
public final /* synthetic */ class C99645ab implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C99649af f278839a;

    public /* synthetic */ C99645ab(C99649af afVar) {
        this.f278839a = afVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C99649af afVar = this.f278839a;
        C58833ax axVar = (C58833ax) obj;
        C58976aa aaVar = C58975e.f156826a;
        if (axVar.mo56113h()) {
            afVar.mo91552l(axVar);
            afVar.mo91546e();
            if (afVar.f278854l) {
                afVar.mo91549i(C99688m.PARTNER_TAB);
            } else {
                afVar.mo91549i(C99688m.GOOGLE_TAB);
            }
            afVar.mo91555o();
            return;
        }
        new Exception("Received empty icon.");
        afVar.mo91556p();
    }
}
