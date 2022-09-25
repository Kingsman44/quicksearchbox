package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10444a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.dataservice.incontextcontrol.SuggestInContextControlDataServiceImpl$getSuggestInContextControlData$1", mo61344c = "SuggestInContextControlDataServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {25})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.a.c */
/* compiled from: PG */
final class C137908c extends C69572j implements C69630p {

    /* renamed from: a */
    int f375225a;

    /* renamed from: b */
    final /* synthetic */ C137911f f375226b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137908c(C137911f fVar, C69577g gVar) {
        super(2, gVar);
        this.f375226b = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137908c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f375225a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C137911f fVar = this.f375226b;
            this.f375225a = 1;
            obj = fVar.mo114043c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137908c(this.f375226b, gVar);
    }
}
