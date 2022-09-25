package com.google.android.apps.gsa.staticplugins.gearhead;

import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13054p;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.d */
/* compiled from: PG */
public final /* synthetic */ class C101334d implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C101325be f282823a;

    public /* synthetic */ C101334d(C101325be beVar) {
        this.f282823a = beVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C101325be beVar = this.f282823a;
        C12986d dVar = (C12986d) obj;
        if (dVar == null) {
            ((C58970a) ((C58970a) C101325be.f282743a.mo56225c()).mo56372aa(20009)).mo56386p("Assistant request is null");
            beVar.f282747D.mo41687b("INVALID_REQUEST_PARAMS");
            beVar.f282773c.mo20152e(false);
            beVar.f282773c.mo20154g(C13054p.IDLE);
            C90875ai.m148465b(C101337g.f282826a, beVar.f282746C.mo20066d(), beVar.f282791u, "End voice session").mo85223a(C101338h.f282827a);
            return;
        }
        beVar.f282784n.mo92256d(dVar, beVar.f282772b);
    }
}
