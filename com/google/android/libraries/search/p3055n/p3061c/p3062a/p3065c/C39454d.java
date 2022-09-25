package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3065c;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.search.n.c.a.c.d */
/* compiled from: PG */
public final /* synthetic */ class C39454d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C39457g f103862a;

    public /* synthetic */ C39454d(C39457g gVar) {
        this.f103862a = gVar;
    }

    public final Object apply(Object obj) {
        this.f103862a.mo41843b("WAITING_FOR_ENROLL_RESULT_TIME_OUT");
        C59104x c = C39457g.f103868a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "DspModelEnrollmentMgr");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((TimeoutException) obj)).mo56372aa(53658)).mo56386p("After sending the enroll intent, timeout at waiting for the availability change!");
        return C39455e.RETRY_REQUIRED;
    }
}
