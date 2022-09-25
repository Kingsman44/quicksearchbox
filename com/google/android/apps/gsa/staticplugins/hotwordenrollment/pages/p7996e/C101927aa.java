package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a.C101511af;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.aa */
/* compiled from: PG */
public final /* synthetic */ class C101927aa implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C101932af f284321a;

    public /* synthetic */ C101927aa(C101932af afVar) {
        this.f284321a = afVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C101932af afVar = this.f284321a;
        C101511af afVar2 = (C101511af) obj;
        afVar.f284326a.mo92701e();
        if (afVar2 == C101511af.RETRAIN_SUCCESS) {
            C59104x b = C101933ag.f284328a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
            ((C59052c) ((C59052c) b).mo56372aa(20449)).mo56386p("Google Home speaker id model is successfully retrained");
            ((C89859i) afVar.f284326a.f284374y.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_MULTI_DEVICE_ENROLLMENT_COMPLETE);
            afVar.f284326a.mo92702f();
            return;
        }
        afVar.f284326a.mo92704h(afVar2);
    }
}
