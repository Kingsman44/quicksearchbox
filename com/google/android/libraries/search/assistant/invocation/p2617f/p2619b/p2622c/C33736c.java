package com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2622c;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34029as;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.core.resources.earcon.EarconResource$6", mo61344c = "EarconResource.kt", mo61345d = "invokeSuspend", mo61346e = {65})
/* renamed from: com.google.android.libraries.search.assistant.invocation.f.b.c.c */
/* compiled from: PG */
final class C33736c extends C69572j implements C69630p {

    /* renamed from: a */
    int f90097a;

    /* renamed from: b */
    /* synthetic */ Object f90098b;

    /* renamed from: c */
    final /* synthetic */ C33745l f90099c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33736c(C33745l lVar, C69577g gVar) {
        super(2, gVar);
        this.f90099c = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33736c) mo5194c((C34029as) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90097a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C33745l lVar = this.f90099c;
            this.f90097a = 1;
            if (lVar.mo39058e((C34029as) this.f90098b, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C33736c cVar = new C33736c(this.f90099c, gVar);
        cVar.f90098b = obj;
        return cVar;
    }
}
