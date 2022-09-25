package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92362c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101862c;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.s */
/* compiled from: PG */
final class C101710s implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C101706o f283806a;

    public C101710s(C101706o oVar) {
        this.f283806a = oVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C101783w wVar = (C101783w) bVar;
        C101706o oVar = this.f283806a;
        C101773m mVar = oVar.f283797g.f283875b;
        C59104x b = C101706o.f283791a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SLAEnrollmentCtrl");
        ((C59052c) ((C59052c) b).mo56372aa(20384)).mo56389s("#onShowNextEvent for current screen %s", mVar);
        C92362c cVar = C92362c.LINK_ACCOUNT;
        C101773m mVar2 = C101773m.DEVICE_SCAN;
        int ordinal = mVar.ordinal();
        if (ordinal == 7) {
            C59104x b2 = C101706o.f283791a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SLAEnrollmentCtrl");
            ((C59052c) ((C59052c) b2).mo56372aa(20387)).mo56386p("Enrolled in Voice Match");
            C101862c cVar2 = oVar.f283796f;
            cVar2.f284147a.set(C101861b.ENROLLED);
        } else if (ordinal == 17) {
            C59104x b3 = C101706o.f283791a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "SLAEnrollmentCtrl");
            ((C59052c) ((C59052c) b3).mo56372aa(20385)).mo56386p("Enrolled in Face Match");
            C101862c cVar3 = oVar.f283796f;
            cVar3.f284148b.set(C101861b.ENROLLED);
        } else if (ordinal == 18) {
            C59104x b4 = C101706o.f283791a.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "SLAEnrollmentCtrl");
            ((C59052c) ((C59052c) b4).mo56372aa(20386)).mo56386p("Enrolled in Personal results");
            C101862c cVar4 = oVar.f283796f;
            cVar4.f284149c.set(C101861b.ENROLLED);
            ((C89859i) oVar.f283793c.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_ENROLLMENT_PERSONAL_RESULT_CONTINUE);
        }
        oVar.mo92515b();
        return C47392e.f123115a;
    }
}
