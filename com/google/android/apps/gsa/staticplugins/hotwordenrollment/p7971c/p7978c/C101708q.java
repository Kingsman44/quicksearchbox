package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import com.google.android.apps.gsa.speech.hotword.p7285c.C92362c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101777q;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101862c;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.q */
/* compiled from: PG */
final class C101708q implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C101706o f283804a;

    public C101708q(C101706o oVar) {
        this.f283804a = oVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C101706o oVar = this.f283804a;
        C59104x b = C101706o.f283791a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SLAEnrollmentCtrl");
        ((C59052c) ((C59052c) b).mo56372aa(20379)).mo56389s("#onExitEnrollmentEvent, event: %s", (C101777q) bVar);
        C101773m mVar = oVar.f283797g.f283875b;
        C92362c cVar = C92362c.LINK_ACCOUNT;
        C101773m mVar2 = C101773m.DEVICE_SCAN;
        int ordinal = mVar.ordinal();
        if (ordinal == 17) {
            C59104x b2 = C101706o.f283791a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SLAEnrollmentCtrl");
            ((C59052c) ((C59052c) b2).mo56372aa(20381)).mo56386p("Cancelled Face Match");
            C101862c cVar2 = oVar.f283796f;
            cVar2.f284148b.set(C101861b.CANCELLED);
        } else if (ordinal == 18) {
            C59104x b3 = C101706o.f283791a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "SLAEnrollmentCtrl");
            ((C59052c) ((C59052c) b3).mo56372aa(20382)).mo56386p("Cancelled Personal results");
            C101862c cVar3 = oVar.f283796f;
            cVar3.f284149c.set(C101861b.CANCELLED);
        } else if (C101646aj.f283629a.contains(mVar) && !oVar.f283796f.mo92641c().equals(C101861b.ENROLLED)) {
            C59104x b4 = C101706o.f283791a.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "SLAEnrollmentCtrl");
            ((C59052c) ((C59052c) b4).mo56372aa(20380)).mo56386p("Cancelled Voice Match");
            C101862c cVar4 = oVar.f283796f;
            cVar4.f284147a.set(C101861b.CANCELLED);
        }
        oVar.mo92515b();
        return C47392e.f123115a;
    }
}
