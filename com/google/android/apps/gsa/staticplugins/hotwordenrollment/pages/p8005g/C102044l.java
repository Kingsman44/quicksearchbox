package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8005g;

import com.google.android.apps.gsa.h.s.s;
import com.google.android.apps.gsa.h.s.z;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92362c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.g.l */
/* compiled from: PG */
final class C102044l extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C102045m f284709a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102044l(C102045m mVar) {
        super("Notify enrollment timeout", 1, 0);
        this.f284709a = mVar;
    }

    public final void run() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f284709a.f284716g.mo70884b() != s.b || this.f284709a.f284716g.mo70885c().mo70898b() != z.c) {
            C59104x b = C102045m.f284710a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MultiUsrEnrollTimer");
            ((C59052c) ((C59052c) b).mo56372aa(20529)).mo56386p("non-OOBE time out");
            this.f284709a.f284715f.mo83702b(C89849ae.VOICE_MATCH_MULTI_DEVICE_ENROLLMENT_TIMEOUT);
        } else if (this.f284709a.f284713d.f257557b) {
            C59104x b2 = C102045m.f284710a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "MultiUsrEnrollTimer");
            ((C59052c) ((C59052c) b2).mo56372aa(20531)).mo56386p("Cloud enrollment on device time out, proceed for OOBE");
            this.f284709a.f284715f.mo83702b(C89849ae.VOICE_MATCH_MULTI_DEVICE_ENROLLMENT_HOME_OOBE_TIMEOUT_BUT_SUCCESS);
            this.f284709a.f284713d.mo87026g(C92362c.CLOUD_ENROLLMENT_COMPLETED);
        } else {
            C59104x b3 = C102045m.f284710a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "MultiUsrEnrollTimer");
            ((C59052c) ((C59052c) b3).mo56372aa(20530)).mo56386p("OOBE time out");
            this.f284709a.f284715f.mo83702b(C89849ae.VOICE_MATCH_MULTI_DEVICE_ENROLLMENT_TIMEOUT);
            this.f284709a.f284713d.mo87025f(C92362c.ENROLL_TIME_OUT);
        }
    }
}
