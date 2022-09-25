package com.google.android.apps.search.googleapp.discover.p10238u;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.RequestProperties$getRequestPropertiesInternal$2$userAgent$1", mo61344c = "RequestProperties.kt", mo61345d = "invokeSuspend", mo61346e = {70})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.fs */
/* compiled from: PG */
final class C135099fs extends C69572j implements C69630p {

    /* renamed from: a */
    int f367948a;

    /* renamed from: b */
    final /* synthetic */ C135101fu f367949b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135099fs(C135101fu fuVar, C69577g gVar) {
        super(2, gVar);
        this.f367949b = fuVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135099fs) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367948a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134969ba baVar = this.f367949b.f367963d;
            this.f367948a = 1;
            obj = baVar.mo112096a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135099fs(this.f367949b, gVar);
    }
}
