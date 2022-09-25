package com.google.android.libraries.search.assistant.invocation.p2615e.p2616a;

import com.google.android.apps.search.assistant.platform.p9044c.p9052b.p9053a.p9054a.C120088d;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.configuration.defaults.AssistantEnabledProvider$enabled$1", mo61344c = "AssistantEnabledProvider.kt", mo61345d = "invokeSuspend", mo61346e = {22})
/* renamed from: com.google.android.libraries.search.assistant.invocation.e.a.b */
/* compiled from: PG */
final class C33708b extends C69572j implements C69626l {

    /* renamed from: a */
    int f90053a;

    /* renamed from: b */
    final /* synthetic */ C33712f f90054b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33708b(C33712f fVar, C69577g gVar) {
        super(1, gVar);
        this.f90054b = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C33708b(this.f90054b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90053a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C120088d dVar = this.f90054b.f90059c;
            this.f90053a = 1;
            obj = dVar.mo104660a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
