package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33883a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71808r;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.directactions.InternalDirectActionsBackendImpl$onDirectActionsInvalidated$1", mo61344c = "InternalDirectActionsBackendImpl.kt", mo61345d = "invokeSuspend", mo61346e = {354})
/* renamed from: com.google.android.apps.search.assistant.platform.j.a.cg */
/* compiled from: PG */
final class C121607cg extends C69572j implements C69630p {

    /* renamed from: a */
    int f337407a;

    /* renamed from: b */
    final /* synthetic */ C33883a f337408b;

    /* renamed from: c */
    final /* synthetic */ C121616cp f337409c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121607cg(C33883a aVar, C121616cp cpVar, C69577g gVar) {
        super(2, gVar);
        this.f337408b = aVar;
        this.f337409c = cpVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121607cg) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f337407a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C58976aa aaVar = C58975e.f156826a;
            C33883a aVar2 = this.f337408b;
            C121616cp cpVar = this.f337409c;
            this.f337407a = 1;
            C71808r rVar = new C71808r(C69555b.m100961b(this), 1);
            rVar.mo63041A();
            C121599bz bzVar = new C121599bz(rVar, aVar2);
            rVar.mo63035f(new C121606cf(cpVar, bzVar));
            cpVar.f337450g.add(bzVar);
            obj = rVar.mo63043n();
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121607cg(this.f337408b, this.f337409c, gVar);
    }
}
