package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d;

import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.d.d */
/* compiled from: PG */
public final /* synthetic */ class C107778d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C107779e f299897a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f299898b;

    /* renamed from: c */
    public final /* synthetic */ Query f299899c;

    public /* synthetic */ C107778d(C107779e eVar, C60870cx cxVar, Query query) {
        this.f299897a = eVar;
        this.f299898b = cxVar;
        this.f299899c = query;
    }

    public final void run() {
        C107779e eVar = this.f299897a;
        C60870cx cxVar = this.f299898b;
        Query query = this.f299899c;
        try {
            C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar);
            if (axVar.mo56113h() && !((C51195j) axVar.mo56107c()).f133274i) {
                C87684al alVar = new C87684al(C88244um.END_OF_CONVERSATION_TURN);
                alVar.mo81966c(query);
                eVar.f299901b.mo96337a(alVar.mo81964a());
            }
        } catch (ExecutionException e) {
            C59104x d = C107779e.f299900a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CclCtrl");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(26168)).mo56386p("Send END_OF_CONVERSATION_TURN service event failed.");
        }
    }
}
