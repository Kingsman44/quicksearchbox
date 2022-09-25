package com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b;

import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.voicesearch.assistantpowered.request.QueryFreeRequestDataFetcher$getAndCacheQueryFreeRequestData$2$1$querySettingsDeferred$1", mo61344c = "QueryFreeRequestDataFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {118})
/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.b.x */
/* compiled from: PG */
final class C138763x extends C69572j implements C69630p {

    /* renamed from: a */
    int f377430a;

    /* renamed from: b */
    final /* synthetic */ C138736ag f377431b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138763x(C138736ag agVar, C69577g gVar) {
        super(2, gVar);
        this.f377431b = agVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138763x) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f377430a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C138736ag agVar = this.f377431b;
            C58974d dVar = C138736ag.f377324a;
            C60870cx c = agVar.f377329f.mo103983c();
            C69664n.m101060f(c, "agsaClassicSearchData.querySettings");
            this.f377430a = 1;
            obj = C71663i.m104690c(c, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138763x(this.f377431b, gVar);
    }
}
