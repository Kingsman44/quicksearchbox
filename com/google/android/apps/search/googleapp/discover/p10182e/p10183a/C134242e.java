package com.google.android.apps.search.googleapp.discover.p10182e.p10183a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p3186j$.time.Instant;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.appstatus.dataservice.FirstApplicationLaunchDataServiceImpl$hasUserEnteredApp$2", mo61344c = "FirstApplicationLaunchDataServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {58})
/* renamed from: com.google.android.apps.search.googleapp.discover.e.a.e */
/* compiled from: PG */
public final class C134242e extends C69572j implements C69630p {

    /* renamed from: a */
    int f365716a;

    /* renamed from: b */
    final /* synthetic */ C134243f f365717b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134242e(C134243f fVar, C69577g gVar) {
        super(2, gVar);
        this.f365717b = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134242e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365716a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134243f fVar = this.f365717b;
            this.f365716a = 1;
            obj = C71803m.m105040a(fVar.f365719b, new C134241d(fVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return Boolean.valueOf(((Instant) obj).isAfter(Instant.EPOCH));
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134242e(this.f365717b, gVar);
    }
}
