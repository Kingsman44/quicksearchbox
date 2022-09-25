package com.google.android.apps.search.googleapp.search.srp.p10435e;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.srp.request.AsyncWebCoordinatorInstanceState$getCachedOrAwait$5", mo61344c = "AsyncWebCoordinatorInstanceState.kt", mo61345d = "invokeSuspend", mo61346e = {87})
/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.f */
/* compiled from: PG */
final class C137781f extends C69572j implements C69630p {

    /* renamed from: a */
    int f374819a;

    /* renamed from: b */
    final /* synthetic */ C137783h f374820b;

    /* renamed from: c */
    private /* synthetic */ Object f374821c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137781f(C137783h hVar, C69577g gVar) {
        super(2, gVar);
        this.f374820b = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137781f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f374819a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71604be c = C71803m.m105042c((C71422aw) this.f374821c, (C69585o) null, (C71424ay) null, new C137780e(this.f374820b, (C69577g) null), 3);
            this.f374820b.mo113953a().f374797a = c;
            this.f374819a = 1;
            obj = c.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C137781f fVar = new C137781f(this.f374820b, gVar);
        fVar.f374821c = obj;
        return fVar;
    }
}
