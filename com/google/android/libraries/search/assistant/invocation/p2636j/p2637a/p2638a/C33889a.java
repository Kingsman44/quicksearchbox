package com.google.android.libraries.search.assistant.invocation.p2636j.p2637a.p2638a;

import com.google.android.libraries.search.assistant.invocation.p2636j.p2637a.C33891b;
import com.google.android.libraries.search.assistant.invocation.p2636j.p2639b.C33893b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.lifecycle.api.impl.InvocationLifecycleApiImpl$updateState$1", mo61344c = "InvocationLifecycleApiImpl.kt", mo61345d = "invokeSuspend", mo61346e = {40})
/* renamed from: com.google.android.libraries.search.assistant.invocation.j.a.a.a */
/* compiled from: PG */
final class C33889a extends C69572j implements C69630p {

    /* renamed from: a */
    int f90410a;

    /* renamed from: b */
    final /* synthetic */ C33890b f90411b;

    /* renamed from: c */
    final /* synthetic */ C33891b f90412c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33889a(C33890b bVar, C33891b bVar2, C69577g gVar) {
        super(2, gVar);
        this.f90411b = bVar;
        this.f90412c = bVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33889a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90410a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C33890b bVar = this.f90411b;
            C33893b bVar2 = bVar.f90414b;
            C34053bp bpVar = bVar.f90413a;
            C33891b bVar3 = this.f90412c;
            this.f90410a = 1;
            if (bVar2.mo39121a(bpVar, bVar3, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C33889a(this.f90411b, this.f90412c, gVar);
    }
}
