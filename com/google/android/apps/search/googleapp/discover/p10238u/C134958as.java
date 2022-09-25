package com.google.android.apps.search.googleapp.discover.p10238u;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.DiscoverUrlFetcher$fetchInternal$2$clientInfoDeferred$1", mo61344c = "DiscoverUrlFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {127})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.as */
/* compiled from: PG */
final class C134958as extends C69572j implements C69630p {

    /* renamed from: a */
    int f367452a;

    /* renamed from: b */
    final /* synthetic */ C134962aw f367453b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134958as(C134962aw awVar, C69577g gVar) {
        super(2, gVar);
        this.f367453b = awVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134958as) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367452a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135123v vVar = this.f367453b.f367476g;
            this.f367452a = 1;
            obj = vVar.mo112127b(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134958as(this.f367453b, gVar);
    }
}
