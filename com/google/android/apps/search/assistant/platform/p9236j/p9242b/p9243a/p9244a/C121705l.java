package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71517bu;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.manager.impl.InvocationDetails$completion$1", mo61344c = "InvocationDetails.kt", mo61345d = "invokeSuspend", mo61346e = {51})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.a.a.l */
/* compiled from: PG */
final class C121705l extends C69572j implements C69630p {

    /* renamed from: a */
    int f337669a;

    /* renamed from: b */
    final /* synthetic */ C121706m f337670b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121705l(C121706m mVar, C69577g gVar) {
        super(2, gVar);
        this.f337670b = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121705l) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f337669a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C121704k kVar = new C121704k(this.f337670b.f337675e);
            this.f337669a = 1;
            obj = C71517bu.m104350a(kVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121705l(this.f337670b, gVar);
    }
}
