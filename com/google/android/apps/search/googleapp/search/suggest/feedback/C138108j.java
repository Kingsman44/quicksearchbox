package com.google.android.apps.search.googleapp.search.suggest.feedback;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.feedback.FeedbackDataService$submitFeedbackFromJava$1", mo61344c = "FeedbackDataService.kt", mo61345d = "invokeSuspend", mo61346e = {46})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.feedback.j */
/* compiled from: PG */
final class C138108j extends C69572j implements C69630p {

    /* renamed from: a */
    int f375758a;

    /* renamed from: b */
    final /* synthetic */ C138109k f375759b;

    /* renamed from: c */
    final /* synthetic */ C138098ao f375760c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138108j(C138109k kVar, C138098ao aoVar, C69577g gVar) {
        super(2, gVar);
        this.f375759b = kVar;
        this.f375760c = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138108j) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f375758a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C138109k kVar = this.f375759b;
            C138098ao aoVar = this.f375760c;
            this.f375758a = 1;
            obj = kVar.mo114151a(aoVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138108j(this.f375759b, this.f375760c, gVar);
    }
}
