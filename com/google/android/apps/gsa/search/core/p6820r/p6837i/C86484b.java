package com.google.android.apps.gsa.search.core.p6820r.p6837i;

import com.google.android.apps.gsa.search.core.p6820r.C86576v;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.r.i.b */
/* compiled from: PG */
public final /* synthetic */ class C86484b implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C86494l f233719a;

    public /* synthetic */ C86484b(C86494l lVar) {
        this.f233719a = lVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C86494l lVar = this.f233719a;
        C59104x d = C86494l.f233731a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ForegroundSearchRunner");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g((Exception) obj)).mo56372aa(8204)).mo56386p("Search shutdown failed");
        C58485gu guVar = lVar.f233742l;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            ((C86576v) guVar.get(i)).mo80195a();
        }
    }
}
