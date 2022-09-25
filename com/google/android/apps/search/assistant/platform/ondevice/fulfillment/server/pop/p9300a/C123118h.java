package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122985af;
import com.google.android.apps.search.assistant.platform.ondevice.p9263b.C122135p;
import com.google.android.libraries.assistant.gallium.framework.p1507b.C18226d;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.protos.p4850an.p4851a.p4852a.C63327k;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.h */
/* compiled from: PG */
public final /* synthetic */ class C123118h implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C123089ac f340761a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f340762b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f340763c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f340764d;

    /* renamed from: e */
    public final /* synthetic */ C122985af f340765e;

    /* renamed from: f */
    public final /* synthetic */ C123099am f340766f;

    public /* synthetic */ C123118h(C123089ac acVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C123099am amVar, C122985af afVar) {
        this.f340761a = acVar;
        this.f340762b = cxVar;
        this.f340763c = cxVar2;
        this.f340764d = cxVar3;
        this.f340766f = amVar;
        this.f340765e = afVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C123089ac acVar = this.f340761a;
        C60870cx cxVar2 = this.f340762b;
        C60870cx cxVar3 = this.f340763c;
        C60870cx cxVar4 = this.f340764d;
        C123099am amVar = this.f340766f;
        C122985af afVar = this.f340765e;
        C18226d dVar = (C18226d) C60856cj.m92909r(cxVar2);
        C63327k kVar = (C63327k) C60856cj.m92909r(cxVar3);
        Optional optional = (Optional) C60856cj.m92909r(cxVar4);
        C122135p pVar = new C122135p(acVar.f340689f);
        acVar.f340693j.mo19974a(C37176a.f96968cg);
        if (acVar.f340692i) {
            C60870cx a = acVar.f340688e.mo106031a();
            if (!a.isDone()) {
                ((C59052c) ((C59052c) C123089ac.f340684a.mo56226d()).mo56372aa(35060)).mo56386p("Gallium is not initialized yet while starting POP. This may put Gallium and long-lived component initialization on the critical path.");
            }
            C123121k kVar2 = new C123121k(acVar, afVar, kVar, optional);
            cxVar = C60922j.m93045h(a, C47810es.m84966f(kVar2), acVar.f340690g);
        } else {
            C123120j jVar = new C123120j(acVar, afVar, kVar, dVar, optional);
            cxVar = C60856cj.m92905n(C47810es.m84965e(jVar), acVar.f340690g);
        }
        C123123m mVar = new C123123m(acVar);
        C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(mVar), acVar.f340690g);
        C123124n nVar = new C123124n(acVar, pVar, amVar, afVar);
        C60870cx g = C60922j.m93044g(h, C47810es.m84963c(nVar), acVar.f340690g);
        C123125o oVar = new C123125o(acVar);
        return C60846c.m92879h(g, Exception.class, C47810es.m84966f(oVar), C60826bg.f164896a);
    }
}
