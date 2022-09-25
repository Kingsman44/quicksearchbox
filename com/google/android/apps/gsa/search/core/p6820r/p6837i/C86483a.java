package com.google.android.apps.gsa.search.core.p6820r.p6837i;

import com.google.android.apps.gsa.search.core.p6820r.C86576v;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.r.i.a */
/* compiled from: PG */
public final /* synthetic */ class C86483a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86494l f233718a;

    public /* synthetic */ C86483a(C86494l lVar) {
        this.f233718a = lVar;
    }

    public final void run() {
        C86494l lVar = this.f233718a;
        C59104x b = C86494l.f233731a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ForegroundSearchRunner");
        ((C59052c) ((C59052c) b).mo56372aa(8203)).mo56386p("Search shutdown was successful");
        C58485gu guVar = lVar.f233742l;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            ((C86576v) guVar.get(i)).mo80195a();
        }
    }
}
