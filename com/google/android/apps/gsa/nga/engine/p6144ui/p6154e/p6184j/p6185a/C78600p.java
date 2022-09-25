package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6184j.p6185a;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.lens.sdk.avs.C24898o;
import com.google.android.libraries.lens.sdk.avs.data.C24869d;
import com.google.android.libraries.lens.sdk.avs.data.C24873h;
import com.google.android.libraries.lens.sdk.avs.data.C24881p;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.j.a.p */
/* compiled from: PG */
public final /* synthetic */ class C78600p implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C24898o f216402a;

    public /* synthetic */ C78600p(C24898o oVar) {
        this.f216402a = oVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C24898o oVar = this.f216402a;
        AccountId accountId = (AccountId) obj;
        C59104x b = C78583aa.f216340a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AvsController");
        ((C59052c) ((C59052c) b).mo56372aa(5246)).mo56389s("accountId retrieved %s", accountId);
        C24881p pVar = new C24881p();
        C24869d dVar = new C24869d();
        dVar.mo30071d(1);
        dVar.mo30072e();
        dVar.mo30070c(accountId);
        pVar.mo30106d(dVar);
        C24873h hVar = new C24873h();
        hVar.mo30082c(true);
        pVar.mo30107e(hVar);
        oVar.mo30128e(pVar);
        C59104x b2 = C78583aa.f216340a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "AvsController");
        ((C59052c) ((C59052c) b2).mo56372aa(5247)).mo56386p("started avs");
    }
}
