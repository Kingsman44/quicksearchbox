package com.google.android.apps.search.googleapp.discover.p10238u;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.RequestProperties$getRequestProperties$1", mo61344c = "RequestProperties.kt", mo61345d = "invokeSuspend", mo61346e = {44})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.fk */
/* compiled from: PG */
final class C135091fk extends C69572j implements C69630p {

    /* renamed from: a */
    int f367935a;

    /* renamed from: b */
    final /* synthetic */ C135101fu f367936b;

    /* renamed from: c */
    final /* synthetic */ C135109h f367937c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135091fk(C135101fu fuVar, C135109h hVar, C69577g gVar) {
        super(2, gVar);
        this.f367936b = fuVar;
        this.f367937c = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135091fk) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367935a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135101fu fuVar = this.f367936b;
            C135109h hVar = this.f367937c;
            this.f367935a = 1;
            obj = fuVar.mo112122a(hVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135091fk(this.f367936b, this.f367937c, gVar);
    }
}
