package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import com.google.android.libraries.search.p3055n.C39260aj;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.HotwordInvocationSource$onHotwordTriggeredEvent$1", mo61344c = "HotwordInvocationSource.kt", mo61345d = "invokeSuspend", mo61346e = {120})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.s */
/* compiled from: PG */
final class C34652s extends C69572j implements C69630p {

    /* renamed from: a */
    int f92000a;

    /* renamed from: b */
    final /* synthetic */ C34658y f92001b;

    /* renamed from: c */
    final /* synthetic */ C39260aj f92002c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34652s(C34658y yVar, C39260aj ajVar, C69577g gVar) {
        super(2, gVar);
        this.f92001b = yVar;
        this.f92002c = ajVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34652s) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f92000a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C34658y yVar = this.f92001b;
            C39260aj ajVar = this.f92002c;
            this.f92000a = 1;
            if (yVar.mo39460b(ajVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34652s(this.f92001b, this.f92002c, gVar);
    }
}
