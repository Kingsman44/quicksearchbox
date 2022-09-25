package com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b;

import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120691f;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import kotlinx.coroutines.p5574b.p5575a.C71450g;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.execution.session.FulfillmentSession$deferredResults$1$invokeSuspend$$inlined$transform$1", mo61344c = "FulfillmentSession.kt", mo61345d = "invokeSuspend", mo61346e = {40})
/* renamed from: com.google.android.apps.search.assistant.platform.f.e.b.t */
/* compiled from: PG */
public final class C120569t extends C69572j implements C69630p {

    /* renamed from: a */
    int f335336a;

    /* renamed from: b */
    final /* synthetic */ C71587n f335337b;

    /* renamed from: c */
    final /* synthetic */ C120546ac f335338c;

    /* renamed from: d */
    final /* synthetic */ C120691f f335339d;

    /* renamed from: e */
    private /* synthetic */ Object f335340e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120569t(C71587n nVar, C69577g gVar, C120546ac acVar, C120691f fVar) {
        super(2, gVar);
        this.f335337b = nVar;
        this.f335338c = acVar;
        this.f335339d = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120569t) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335336a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n nVar = this.f335337b;
            C120568s sVar = new C120568s((C71588o) this.f335340e, this.f335338c, this.f335339d);
            this.f335336a = 1;
            if (C71450g.m104241h((C71450g) nVar, sVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120569t tVar = new C120569t(this.f335337b, gVar, this.f335338c, this.f335339d);
        tVar.f335340e = obj;
        return tVar;
    }
}
