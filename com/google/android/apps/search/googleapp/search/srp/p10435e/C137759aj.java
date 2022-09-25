package com.google.android.apps.search.googleapp.search.srp.p10435e;

import com.google.android.apps.search.googleapp.search.p10404a.C137389j;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.srp.request.QueryFreeRequestDataDataService$getAndCacheQueryFreeRequestDataInternal$2$1$limitedAdTrackingDeferred$1", mo61344c = "QueryFreeRequestDataDataService.kt", mo61345d = "invokeSuspend", mo61346e = {179})
/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.aj */
/* compiled from: PG */
final class C137759aj extends C69572j implements C69630p {

    /* renamed from: a */
    int f374734a;

    /* renamed from: b */
    final /* synthetic */ C137764ao f374735b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137759aj(C137764ao aoVar, C69577g gVar) {
        super(2, gVar);
        this.f374735b = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137759aj) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f374734a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C137389j jVar = this.f374735b.f374765k;
            this.f374734a = 1;
            obj = jVar.mo113700c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137759aj(this.f374735b, gVar);
    }
}
