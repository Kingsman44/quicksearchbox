package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.p.bi */
/* compiled from: PG */
final class C86226bi extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C86227bj f233011a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86226bi(C86227bj bjVar) {
        super("MultiDeviceSelectionDecisionTimeoutTask", 2, 0);
        this.f233011a = bjVar;
    }

    public final void run() {
        if (!this.f233011a.f233019a.f232925a.isDone()) {
            C58976aa aaVar = C58975e.f156826a;
            this.f233011a.f233019a.mo79828a(true);
        }
    }
}
