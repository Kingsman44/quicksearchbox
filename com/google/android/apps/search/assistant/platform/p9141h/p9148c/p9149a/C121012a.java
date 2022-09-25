package com.google.android.apps.search.assistant.platform.p9141h.p9148c.p9149a;

import com.google.android.libraries.search.assistant.p2704m.C34807b;
import com.google.android.libraries.search.assistant.p2704m.C34817l;
import com.google.android.libraries.search.assistant.p2704m.C34818m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.h.c.a.a */
/* compiled from: PG */
final class C121012a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f336383a;

    public C121012a(C70862aj ajVar) {
        this.f336383a = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C121013b.f336384a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AsstEligibilityServiceImpl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(35684)).mo56386p("getAssistantEligibility request failed.");
        this.f336383a.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C70862aj ajVar = this.f336383a;
        C34817l lVar = (C34817l) C34818m.f92354c.createBuilder();
        lVar.copyOnWrite();
        C34818m mVar = (C34818m) lVar.instance;
        mVar.f92357b = ((C34807b) obj).f92345g;
        mVar.f92356a |= 1;
        ajVar.mo20123c((C34818m) lVar.build());
        this.f336383a.mo20121a();
    }
}
