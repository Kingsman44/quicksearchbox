package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9901e;

import com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9908c.C130582h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50819dp;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.e.e */
/* compiled from: PG */
public final /* synthetic */ class C130520e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C130531p f357545a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f357546b;

    public /* synthetic */ C130520e(C130531p pVar, C60870cx cxVar) {
        this.f357545a = pVar;
        this.f357546b = cxVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C130531p pVar = this.f357545a;
        C60870cx cxVar2 = this.f357546b;
        C50819dp dpVar = (C50819dp) obj;
        if (!pVar.f357566b.mo109731a()) {
            cxVar = C60856cj.m92899h(new IllegalStateException("AiAi is not available."));
        } else if (dpVar.f132332a.size() == 0) {
            ((C58970a) ((C58970a) pVar.f357565a.mo56226d()).mo56372aa(38914)).mo56386p("Empty smartspace update. Ignored");
            cxVar = C60866ct.f164955a;
        } else {
            cxVar = ((C130582h) pVar.f357566b).mo109732b(dpVar, "smartspace_tng_update");
        }
        C130530o oVar = new C130530o(pVar, dpVar, cxVar2);
        C60856cj.m92911t(cxVar, C47810es.m84974n(oVar), pVar.f357567c);
        return cxVar;
    }
}
