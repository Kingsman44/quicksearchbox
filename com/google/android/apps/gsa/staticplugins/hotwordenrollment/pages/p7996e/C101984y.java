package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.y */
/* compiled from: PG */
final class C101984y implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C101933ag f284552a;

    public C101984y(C101933ag agVar) {
        this.f284552a = agVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C101933ag.f284328a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(20446)).mo56386p("DSP enroll/reenroll failed!");
        ((C89859i) this.f284552a.f284374y.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_DSP_ENROLLMENT_FAILED);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C89849ae aeVar;
        Boolean bool = (Boolean) obj;
        C59104x b = C101933ag.f284328a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
        ((C59052c) ((C59052c) b).mo56372aa(20447)).mo56389s("DSP enroll tasks finished successfully - %b", bool);
        if (bool.booleanValue()) {
            aeVar = C89849ae.VOICE_MATCH_DSP_ENROLLMENT_COMPLETE;
        } else {
            aeVar = C89849ae.VOICE_MATCH_DSP_ENROLLMENT_FAILED;
        }
        ((C89859i) this.f284552a.f284374y.mo27525b()).mo83702b(aeVar);
        if (bool.booleanValue()) {
            this.f284552a.mo92702f();
            return;
        }
        C59104x c = C101933ag.f284328a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
        ((C59052c) ((C59052c) c).mo56372aa(20448)).mo56386p("DSP enroll/reenroll failed!");
    }
}
