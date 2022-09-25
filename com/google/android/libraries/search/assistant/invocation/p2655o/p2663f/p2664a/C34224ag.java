package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69514bd;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.orchestrator.sources.InvocationSinkGrpcService$permittedInvocationSources$1", mo61344c = "InvocationSinkImpl.kt", mo61345d = "invokeSuspend", mo61346e = {86})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.ag */
/* compiled from: PG */
final class C34224ag extends C69572j implements C69626l {

    /* renamed from: a */
    int f91059a;

    /* renamed from: b */
    final /* synthetic */ C34296f f91060b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34224ag(C34296f fVar, C69577g gVar) {
        super(1, gVar);
        this.f91060b = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C34224ag(this.f91060b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91059a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx cxVar = this.f91060b.f91210c;
            this.f91059a = 1;
            obj = C71663i.m104690c(cxVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return C69514bd.m100892f((Set) obj, C34043bf.ENTRYPOINT_SELF_INVOCATION);
    }
}
