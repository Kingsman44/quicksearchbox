package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1146d;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.d.a */
/* compiled from: PG */
public final /* synthetic */ class C15611a implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C15615e f46678a;

    /* renamed from: b */
    public final /* synthetic */ C15666r f46679b;

    public /* synthetic */ C15611a(C15615e eVar, C15666r rVar) {
        this.f46678a = eVar;
        this.f46679b = rVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C15615e eVar = this.f46678a;
        C15666r rVar = this.f46679b;
        if (!((Boolean) eVar.f46684b.mo17428b()).booleanValue()) {
            C59104x d = C15615e.f46683a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HelpFulfiller");
            ((C59052c) ((C59052c) d).mo56372aa(46211)).mo56386p("On device Help response is not enabled");
            return C60856cj.m92900i(C58836b.f156633a);
        }
        int b = rVar.mo22476b().mo22462b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i == 0) {
            C59104x b2 = C15615e.f46683a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "HelpFulfiller");
            ((C59052c) ((C59052c) b2).mo56372aa(46210)).mo56386p("Handling help fulfillment through analyzer response");
            return eVar.mo22423b();
        } else if (i == 1) {
            C59104x b3 = C15615e.f46683a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "HelpFulfiller");
            ((C59052c) ((C59052c) b3).mo56372aa(46208)).mo56386p("Handling help fulfillment through intent query");
            return eVar.mo22423b();
        } else if (i != 2) {
            return C60856cj.m92900i(C58836b.f156633a);
        } else {
            C59104x b4 = C15615e.f46683a.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "HelpFulfiller");
            ((C59052c) ((C59052c) b4).mo56372aa(46209)).mo56386p("Handling help fulfillment through conversation delta");
            return C60922j.m93044g(eVar.mo22424c(), C47810es.m84963c(C15612b.f46680a), eVar.f46685c);
        }
    }
}
