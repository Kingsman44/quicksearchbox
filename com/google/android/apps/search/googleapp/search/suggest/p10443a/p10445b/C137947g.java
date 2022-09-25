package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.dataservice.localdata.LocalDataServiceImpl$getUserSettings$1", mo61344c = "LocalDataServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {78})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.b.g */
/* compiled from: PG */
final class C137947g extends C69572j implements C69630p {

    /* renamed from: a */
    int f375303a;

    /* renamed from: b */
    final /* synthetic */ C137960t f375304b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137947g(C137960t tVar, C69577g gVar) {
        super(2, gVar);
        this.f375304b = tVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137947g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f375303a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C137960t tVar = this.f375304b;
            this.f375303a = 1;
            obj = tVar.mo114057f(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137947g(this.f375304b, gVar);
    }
}
