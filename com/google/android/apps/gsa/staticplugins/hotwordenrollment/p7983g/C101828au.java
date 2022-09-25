package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import com.google.android.apps.gsa.h.s.z;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.assistant.p3861at.C49946ew;
import com.google.assistant.p3861at.act;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.au */
/* compiled from: PG */
public final /* synthetic */ class C101828au implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C101832ay f284018a;

    public /* synthetic */ C101828au(C101832ay ayVar) {
        this.f284018a = ayVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        boolean z;
        boolean z2;
        C101832ay ayVar = this.f284018a;
        act act = (act) obj;
        ayVar.f284026f.f284136c.set(act);
        boolean z3 = false;
        if (act == null || (act.f128894a & 524288) == 0) {
            z = false;
        } else {
            C49946ew ewVar = act.f128911r;
            if (ewVar == null) {
                ewVar = C49946ew.f129824q;
            }
            z = ewVar.f129834i;
        }
        ayVar.f284028h.mo83849L(z);
        if ((!ayVar.f284031k.mo70892k() || !ayVar.f284031k.mo70887e().mo70858g()) && ((!ayVar.f284031k.mo70891j() || ayVar.f284031k.mo70885c().mo70898b() != z.b) && (!ayVar.f284031k.mo70887e().mo70853a().mo70880d() || !ayVar.f284031k.mo70887e().mo70853a().mo70881e()))) {
            z2 = false;
        } else {
            z2 = true;
        }
        C101860a aVar = ayVar.f284026f;
        if (z && z2) {
            z3 = true;
        }
        aVar.f284140g.set(z3);
        ((C59052c) ((C59052c) C101832ay.f284023c.mo56224b()).mo56372aa(20689)).mo56386p("Successful fetch");
        ayVar.mo86905e(true);
    }
}
