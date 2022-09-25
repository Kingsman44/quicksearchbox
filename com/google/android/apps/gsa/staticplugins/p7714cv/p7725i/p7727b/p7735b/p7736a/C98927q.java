package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7736a;

import com.google.android.apps.gsa.search.core.p6816p.C86246cb;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.b.a.q */
/* compiled from: PG */
public final /* synthetic */ class C98927q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C98932v f276465a;

    /* renamed from: b */
    public final /* synthetic */ Query f276466b;

    /* renamed from: c */
    public final /* synthetic */ C86246cb f276467c;

    public /* synthetic */ C98927q(C98932v vVar, Query query, C86246cb cbVar) {
        this.f276465a = vVar;
        this.f276466b = query;
        this.f276467c = cbVar;
    }

    public final void run() {
        C98932v vVar = this.f276465a;
        Query query = this.f276466b;
        C86246cb cbVar = this.f276467c;
        if (cbVar != null) {
            vVar.f276479b.mo91331i(vVar.f276483f);
            vVar.f276479b.mo91329g(vVar.f276483f, query, cbVar);
            return;
        }
        C59104x c = C98932v.f276474a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "CarEngineCallback");
        ((C59052c) ((C59052c) c).mo56372aa(31287)).mo56386p("No results given when we needed the last recognition result.");
    }
}
