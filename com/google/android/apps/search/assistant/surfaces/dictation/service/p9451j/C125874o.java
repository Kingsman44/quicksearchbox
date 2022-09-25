package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9430b.C125285o;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71506bj;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71598y;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.p5533i.C70862aj;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.invocation.CanStartDictationMonitor$monitor$respondingJob$1", mo61344c = "CanStartDictationMonitor.kt", mo61345d = "invokeSuspend", mo61346e = {69})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.o */
/* compiled from: PG */
final class C125874o extends C69572j implements C69630p {

    /* renamed from: a */
    int f346928a;

    /* renamed from: b */
    final /* synthetic */ C125876q f346929b;

    /* renamed from: c */
    final /* synthetic */ C70862aj f346930c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125874o(C125876q qVar, C70862aj ajVar, C69577g gVar) {
        super(2, gVar);
        this.f346929b = qVar;
        this.f346930c = ajVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125874o) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f346928a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C125876q qVar = this.f346929b;
            C71587n b = C71598y.m104522b(C71506bj.m104335a(qVar.f346935b.f346686e, new C125873n(qVar, (C69577g) null)));
            C70862aj ajVar = this.f346930c;
            this.f346928a = 1;
            if (C125285o.m205217b(b, ajVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125874o(this.f346929b, this.f346930c, gVar);
    }
}
