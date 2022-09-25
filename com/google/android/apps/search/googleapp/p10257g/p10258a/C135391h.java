package com.google.android.apps.search.googleapp.p10257g.p10258a;

import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.doodle.dataservice.DoodleDataService$doodleFlow$2$3", mo61344c = "DoodleDataService.kt", mo61345d = "invokeSuspend", mo61346e = {47})
/* renamed from: com.google.android.apps.search.googleapp.g.a.h */
/* compiled from: PG */
final class C135391h extends C69572j implements C69630p {

    /* renamed from: a */
    int f368877a;

    /* renamed from: b */
    final /* synthetic */ C135396m f368878b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135391h(C135396m mVar, C69577g gVar) {
        super(2, gVar);
        this.f368878b = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135391h) mo5194c(Boolean.valueOf(((Boolean) obj).booleanValue()), (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368877a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135388e eVar = this.f368878b.f368886b;
            this.f368877a = 1;
            obj = eVar.mo112304a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135391h(this.f368878b, gVar);
    }
}
