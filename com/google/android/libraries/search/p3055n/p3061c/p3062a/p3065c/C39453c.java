package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3065c;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.n.c.a.c.c */
/* compiled from: PG */
public final /* synthetic */ class C39453c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C39457g f103861a;

    public /* synthetic */ C39453c(C39457g gVar) {
        this.f103861a = gVar;
    }

    public final Object apply(Object obj) {
        C39457g gVar = this.f103861a;
        if (((Integer) obj).intValue() == 2) {
            gVar.mo41843b("GOT_SUCCESS_ENROLL_RESULT");
            return C39455e.SUCCESS;
        }
        gVar.mo41843b("GOT_FAIL_ENROLL_RESULT");
        C59104x d = C39457g.f103868a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "DspModelEnrollmentMgr");
        ((C59052c) ((C59052c) d).mo56372aa(53657)).mo56387q("After sending the enroll intent, the availability is %d", gVar.f103873f.get());
        return C39455e.RETRY_REQUIRED;
    }
}
