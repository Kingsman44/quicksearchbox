package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f;

import java.util.Set;
import p5462h.C69685i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.orchestrator.ConnectionInvocationsTracker$initialize$1$coroutine$1", mo61344c = "ConnectionInvocationsTracker.kt", mo61345d = "invokeSuspend", mo61346e = {79})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.c */
/* compiled from: PG */
final class C34318c extends C69572j implements C69630p {

    /* renamed from: a */
    int f91254a;

    /* renamed from: b */
    /* synthetic */ Object f91255b;

    /* renamed from: c */
    final /* synthetic */ C34326k f91256c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34318c(C34326k kVar, C69577g gVar) {
        super(2, gVar);
        this.f91256c = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34318c) mo5194c((C69685i) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91254a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69685i iVar = (C69685i) this.f91255b;
            C34326k kVar = this.f91256c;
            this.f91254a = 1;
            if (C34322g.m62974e(kVar, (Set) iVar.f186052a, (Set) iVar.f186053b, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34318c cVar = new C34318c(this.f91256c, gVar);
        cVar.f91255b = obj;
        return cVar;
    }
}
