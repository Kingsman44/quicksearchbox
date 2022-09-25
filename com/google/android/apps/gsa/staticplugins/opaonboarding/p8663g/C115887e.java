package com.google.android.apps.gsa.staticplugins.opaonboarding.p8663g;

import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.assistant.p3861at.acz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opaonboarding.g.e */
/* compiled from: PG */
final class C115887e extends k {

    /* renamed from: a */
    final /* synthetic */ C115891i f321340a;

    public C115887e(C115891i iVar) {
        this.f321340a = iVar;
    }

    /* renamed from: gn */
    public final void mo102301gn(Throwable th) {
        C59104x c = C115891i.f321341b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "PersonalResultsAlone");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(30136)).mo56386p("Failed to update personal results.");
        this.f321340a.mo77318iT().mo77312a();
    }

    /* renamed from: go */
    public final /* bridge */ /* synthetic */ void mo102302go(Object obj) {
        acz acz = (acz) obj;
        C59104x b = C115891i.f321341b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PersonalResultsAlone");
        ((C59052c) ((C59052c) b).mo56372aa(30137)).mo56389s("Personal results bit updated VersionInfo() is %s ", this.f321340a.f321345f.e());
        this.f321340a.mo77318iT().mo77312a();
    }
}
