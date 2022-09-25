package com.google.android.libraries.search.assistant.invocation.p2655o.p2665g.p2666a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.C34354a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Map;
import p5462h.C69685i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69514bd;
import p5462h.p5463a.C69540x;
import p5462h.p5463a.p5464a.C69477k;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.policy.conformance.SameClientAllowanceChecker$initialize$1$coroutine$2", mo61344c = "SameClientAllowance.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.g.a.l */
/* compiled from: PG */
final class C34343l extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f91305a;

    /* renamed from: b */
    final /* synthetic */ C34352u f91306b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34343l(C34352u uVar, C69577g gVar) {
        super(2, gVar);
        this.f91306b = uVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34343l) mo5194c((Set) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C34352u uVar = this.f91306b;
        C69477k kVar = new C69477k(8);
        for (C69685i iVar : (Set) this.f91305a) {
            Map.EL.merge(kVar, uVar.f91326d.mo39318a(iVar), C69514bd.m100887a((C34354a) iVar.f186052a), C34341j.f91304a);
        }
        for (Map.Entry value : C69505av.m100861c(kVar).entrySet()) {
            int i = 0;
            for (C34354a aVar2 : C69540x.m100837S((Set) value.getValue(), new C34342k())) {
                int i2 = i + 1;
                if (i != 0) {
                    C59052c cVar = (C59052c) C34352u.f91323a.mo56226d();
                    cVar.mo56378ag(C58975e.f156826a, "TRG.Check.SameClient");
                    String a = this.f91306b.f91325c.mo39317a();
                    cVar.mo56379ah(new C59094n(51346));
                    cVar.mo56354G("Cancelling connection(%s) per allowance(%s).", aVar2, a);
                    aVar2.mo39324e();
                }
                i = i2;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34343l lVar = new C34343l(this.f91306b, gVar);
        lVar.f91305a = obj;
        return lVar;
    }
}
