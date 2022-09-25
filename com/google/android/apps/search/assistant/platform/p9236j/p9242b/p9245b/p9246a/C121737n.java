package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a;

import kotlinx.coroutines.p5574b.C71547cx;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.resources.assistdata.AssistDataResource$withResourceAcquiredCheck$emitInteraction$1", mo61344c = "AssistDataResource.kt", mo61345d = "invokeSuspend", mo61346e = {85})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.a.n */
/* compiled from: PG */
final class C121737n extends C69572j implements C69630p {

    /* renamed from: a */
    int f337797a;

    /* renamed from: b */
    /* synthetic */ Object f337798b;

    /* renamed from: c */
    final /* synthetic */ C121738o f337799c;

    /* renamed from: d */
    final /* synthetic */ String f337800d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121737n(C121738o oVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f337799c = oVar;
        this.f337800d = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121737n) mo5194c((C121731h) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f337797a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71547cx cxVar = this.f337799c.f337806e;
            C121729f fVar = new C121729f(this.f337800d, (C121731h) this.f337798b);
            this.f337797a = 1;
            if (cxVar.mo20883a(fVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C121737n nVar = new C121737n(this.f337799c, this.f337800d, gVar);
        nVar.f337798b = obj;
        return nVar;
    }
}
