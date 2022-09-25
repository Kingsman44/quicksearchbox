package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10460a.C138368a;
import com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10460a.C138369b;
import com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10460a.C138372e;
import com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10460a.C138373f;
import com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10460a.C138377j;
import com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10460a.C138378k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58886cw;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.be */
/* compiled from: PG */
public final /* synthetic */ class C138430be implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138445bt f376551a;

    /* renamed from: b */
    public final /* synthetic */ C138133o f376552b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f376553c;

    public /* synthetic */ C138430be(C138445bt btVar, C138133o oVar, C60870cx cxVar) {
        this.f376551a = btVar;
        this.f376552b = oVar;
        this.f376553c = cxVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C138445bt btVar = this.f376551a;
        C138133o oVar = this.f376552b;
        C60870cx cxVar2 = this.f376553c;
        if (!((Boolean) obj).booleanValue()) {
            return cxVar2;
        }
        long c = btVar.f376587j.mo26871c();
        C138378k kVar = btVar.f376586i;
        String c2 = C58890d.m90988c(oVar.f375825b);
        if (c2.isEmpty()) {
            cxVar = C60856cj.m92900i(C138373f.m224788a(oVar.f375825b, C58485gu.m89845m()));
        } else {
            C138372e eVar = kVar.f376452b;
            cxVar = C47633f.m84733g(C47633f.m84733g((C60870cx) C58886cw.m90973a(new C138368a(eVar)).mo6453a()).mo51515h(new C138369b(c2), eVar.f376443d)).mo51515h(new C138377j(oVar), kVar.f376451a);
        }
        C138439bn bnVar = new C138439bn(btVar, cxVar2, oVar, c);
        C138444bs bsVar = new C138444bs(btVar, C60922j.m93044g(cxVar, C47810es.m84963c(bnVar), btVar.f376583f), oVar);
        return C60846c.m92879h(cxVar2, Exception.class, C47810es.m84966f(bsVar), btVar.f376583f);
    }
}
