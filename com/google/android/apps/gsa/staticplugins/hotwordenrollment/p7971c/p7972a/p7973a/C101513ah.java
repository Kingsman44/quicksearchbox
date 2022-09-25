package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import com.google.android.apps.gsa.assistant.shared.l;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.act;
import com.google.assistant.p3897e.p3929l.p3930a.C52710bp;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C101513ah implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C101515aj f283305a;

    /* renamed from: b */
    public final /* synthetic */ l f283306b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f283307c;

    public /* synthetic */ C101513ah(C101515aj ajVar, l lVar, C60870cx cxVar) {
        this.f283305a = ajVar;
        this.f283306b = lVar;
        this.f283307c = cxVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C101515aj ajVar = this.f283305a;
        l lVar = this.f283306b;
        C60870cx cxVar = this.f283307c;
        act act = (act) obj;
        String d = lVar.d();
        ((C59052c) ((C59052c) C101515aj.f283310b.mo56224b()).mo56372aa(20320)).mo56386p("#checkVoiceMatchEnrollmentStatus Start checking status.");
        if (!cxVar.isDone() || (((C60873d) cxVar).value instanceof C60873d.C60875b)) {
            ((C59052c) ((C59052c) C101515aj.f283310b.mo56225c()).mo56372aa(20321)).mo56389s("#checkVoiceMatchEnrollmentStatus Enrollment incomplete or cancelled for %s", d);
            lVar.f(false);
            throw new Exception("Enrollment incomplete or cancelled for ".concat(String.valueOf(d)));
        }
        C90476a aVar = C91018d.f254254a;
        boolean e = ajVar.f283312d.mo79746e(C90082eg.f250080q);
        C52710bp a = C101515aj.m167884a((act) cxVar.get(), lVar);
        String d2 = lVar.d();
        if (!e) {
            ((C59052c) ((C59052c) C101515aj.f283310b.mo56224b()).mo56372aa(20326)).mo56354G("VoiceEnrollmentStatus for %s is %s", d2, a);
        } else if (a == C52710bp.VOICE_ENROLLMENT_SUCCESS) {
            ((C59052c) ((C59052c) C101515aj.f283310b.mo56224b()).mo56372aa(20325)).mo56389s("VoiceEnrollmentStatus is successful %s", d2);
        } else {
            ((C59052c) ((C59052c) C101515aj.f283310b.mo56225c()).mo56372aa(20324)).mo56389s("VoiceEnrollmentStatus is failed %s", d2);
            ((C59052c) ((C59052c) C101515aj.f283310b.mo56225c()).mo56372aa(20323)).mo56389s("#checkVoiceMatchEnrollmentStatus Enrollment not successful for %s", d);
            lVar.f(false);
            throw new Exception("Enrollment failed for ".concat(String.valueOf(d)));
        }
        ((C59052c) ((C59052c) C101515aj.f283310b.mo56224b()).mo56372aa(20322)).mo56389s("#checkVoiceMatchEnrollmentStatus Enrollment successful for %s", d);
        lVar.f(true);
        return null;
    }
}
