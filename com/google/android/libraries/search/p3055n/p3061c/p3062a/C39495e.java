package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.search.n.c.a.e */
/* compiled from: PG */
public final /* synthetic */ class C39495e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C39633o f104019a;

    public /* synthetic */ C39495e(C39633o oVar) {
        this.f104019a = oVar;
    }

    public final Object apply(Object obj) {
        C39633o oVar = this.f104019a;
        C59104x c = C39633o.f104316a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((TimeoutException) obj)).mo56372aa(53485)).mo56386p("AlwaysOnHotwordDetector or DspModelEnrollmentManager creation time out!");
        oVar.mo41963d("TIMED_OUT_WAITING_FIRST_ON_AVAILABILITY_CHANGED");
        C39394aj c2 = C39395ak.m68799c();
        C39638t tVar = new C39638t();
        tVar.mo41807b(C39392ah.DSP_MODEL_NOT_READY_RETRY_REQUIRED);
        tVar.f104350a = "AlwaysOnHotwordDetector or DspModelEnrollmentManager creation time out!";
        ((C39640v) c2).f104354a = C58833ax.m90834k(tVar.mo41806a());
        return c2.mo41810a();
    }
}
