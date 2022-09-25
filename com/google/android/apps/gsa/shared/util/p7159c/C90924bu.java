package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.common.base.C58817ah;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.util.c.bu */
/* compiled from: PG */
public final /* synthetic */ class C90924bu implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C90926bw f254119a;

    public /* synthetic */ C90924bu(C90926bw bwVar) {
        this.f254119a = bwVar;
    }

    public final Object apply(Object obj) {
        C90926bw bwVar = this.f254119a;
        Throwable th = (Throwable) obj;
        C59104x c = C90926bw.f254123a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SequentialExecution");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(11371)).mo56386p("Error in SequentialExecutionQueue");
        C58887cx.m90980g(th);
        return bwVar.f254124b;
    }
}
