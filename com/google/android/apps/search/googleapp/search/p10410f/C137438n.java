package com.google.android.apps.search.googleapp.search.p10410f;

import com.google.apps.tiktok.monitoring.feedback.C47475l;
import com.google.apps.tiktok.monitoring.feedback.C47477n;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.feedback.FeedbackStarter$startFeedbackWithOptions$1", mo61344c = "FeedbackStarter.kt", mo61345d = "invokeSuspend", mo61346e = {47})
/* renamed from: com.google.android.apps.search.googleapp.search.f.n */
/* compiled from: PG */
final class C137438n extends C69572j implements C69630p {

    /* renamed from: a */
    Object f373817a;

    /* renamed from: b */
    int f373818b;

    /* renamed from: c */
    final /* synthetic */ C137440p f373819c;

    /* renamed from: d */
    final /* synthetic */ C137441q f373820d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137438n(C137440p pVar, C137441q qVar, C69577g gVar) {
        super(2, gVar);
        this.f373819c = pVar;
        this.f373820d = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137438n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f373818b != 0) {
            obj2 = this.f373817a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C137440p pVar = this.f373819c;
            C47477n nVar = pVar.f373823b;
            C137441q qVar = this.f373820d;
            this.f373817a = nVar;
            this.f373818b = 1;
            obj = pVar.mo113728a(qVar, this);
            if (obj == aVar) {
                return aVar;
            }
            obj2 = nVar;
        }
        ((C47477n) obj2).mo51336a((C47475l) obj);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137438n(this.f373819c, this.f373820d, gVar);
    }
}
