package com.google.android.apps.search.googleapp.search.srp.p10435e;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.srp.request.BaselineRequestDataFetcher$baselineRequestData$2$cookieValidated$1", mo61344c = "BaselineRequestDataFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {114})
/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.n */
/* compiled from: PG */
final class C137789n extends C69572j implements C69630p {

    /* renamed from: a */
    int f374840a;

    /* renamed from: b */
    final /* synthetic */ C137799x f374841b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137789n(C137799x xVar, C69577g gVar) {
        super(2, gVar);
        this.f374841b = xVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137789n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f374840a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C137799x xVar = this.f374841b;
            this.f374840a = 1;
            if (xVar.mo113962e(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137789n(this.f374841b, gVar);
    }
}
