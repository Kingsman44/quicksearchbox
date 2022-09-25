package com.google.android.apps.gsa.staticplugins.gearhead;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13054p;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.o */
/* compiled from: PG */
public final /* synthetic */ class C101345o implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C101325be f282837a;

    public /* synthetic */ C101345o(C101325be beVar) {
        this.f282837a = beVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C101325be beVar = this.f282837a;
        if (((C13054p) obj) == C13054p.ONGOING) {
            ((C58970a) ((C58970a) C101325be.f282743a.mo56224b()).mo56372aa(20001)).mo56386p("stopOrDequeueVoiceSessionInternal(): Stopping ongoing media rec session");
            beVar.f282784n.mo92257e();
            beVar.f282773c.mo20154g(C13054p.STOPPED);
            return;
        }
        ((C58970a) ((C58970a) C101325be.f282743a.mo56224b()).mo56372aa(20000)).mo56386p("stopOrDequeueVoiceSessionInternal(): No ongoing media rec session");
    }
}
