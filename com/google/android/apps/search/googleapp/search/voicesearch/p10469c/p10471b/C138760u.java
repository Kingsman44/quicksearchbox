package com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.voicesearch.assistantpowered.request.QueryFreeRequestDataFetcher$getAndCacheQueryFreeRequestData$2$1$baselineRequestData$1", mo61344c = "QueryFreeRequestDataFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {108})
/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.b.u */
/* compiled from: PG */
final class C138760u extends C69572j implements C69630p {

    /* renamed from: a */
    int f377423a;

    /* renamed from: b */
    final /* synthetic */ C138736ag f377424b;

    /* renamed from: c */
    final /* synthetic */ boolean f377425c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138760u(C138736ag agVar, boolean z, C69577g gVar) {
        super(2, gVar);
        this.f377424b = agVar;
        this.f377425c = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138760u) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f377423a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C138754o oVar = this.f377424b.f377330g;
            boolean z = this.f377425c;
            this.f377423a = 1;
            obj = oVar.mo114509c(z, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138760u(this.f377424b, this.f377425c, gVar);
    }
}
