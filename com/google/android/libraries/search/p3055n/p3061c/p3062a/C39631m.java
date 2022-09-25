package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.n.c.a.m */
/* compiled from: PG */
final class C39631m implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C39633o f104313a;

    public C39631m(C39633o oVar) {
        this.f104313a = oVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C39633o.f104316a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(53477)).mo56386p("Exception when handling the result of handleDspHotwordDetected!");
        C39390af afVar = this.f104313a.f104331p;
        afVar.getClass();
        C39638t tVar = new C39638t();
        tVar.mo41807b(C39392ah.HANDLE_HOTWORD_VERIFICATION_RESULT_ERROR);
        tVar.f104350a = C58837ba.m90858g(th.getMessage());
        afVar.mo41801a(tVar.mo41806a());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C39395ak akVar = (C39395ak) obj;
        if (akVar.mo41813b()) {
            C59104x b = C39633o.f104316a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
            ((C59052c) ((C59052c) b).mo56372aa(53479)).mo56386p("Soda started succeessfuly after DSP hotword detected.");
            return;
        }
        C59104x c = C39633o.f104316a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
        ((C59052c) ((C59052c) c).mo56372aa(53478)).mo56386p("Soda started failed after DSP hotword detected!");
        C39390af afVar = this.f104313a.f104331p;
        afVar.getClass();
        afVar.mo41801a((C39393ai) akVar.mo41812a().mo56107c());
    }
}
