package com.google.apps.tiktok.lifecycle.flow;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71571du;
import p5462h.C69596e;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.apps.tiktok.lifecycle.flow.StreamMixinImpl$streamFrom$2$2$1", mo61344c = "Implementation.kt", mo61345d = "invokeSuspend", mo61346e = {133})
/* renamed from: com.google.apps.tiktok.lifecycle.flow.l */
/* compiled from: PG */
final class C47432l extends C69572j implements C69630p {

    /* renamed from: a */
    int f123189a;

    /* renamed from: b */
    final /* synthetic */ C71571du f123190b;

    /* renamed from: c */
    final /* synthetic */ C47423c f123191c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47432l(C71571du duVar, C47423c cVar, C69577g gVar) {
        super(2, gVar);
        this.f123190b = duVar;
        this.f123191c = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C47432l) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f123189a == 0) {
            C69714l.m101134b(obj);
            C71571du duVar = this.f123190b;
            C47431k kVar = new C47431k(this.f123191c);
            this.f123189a = 1;
            if (duVar.mo38165mp(kVar, this) == aVar) {
                return aVar;
            }
        } else {
            C69714l.m101134b(obj);
        }
        throw new C69596e();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C47432l(this.f123190b, this.f123191c, gVar);
    }
}
