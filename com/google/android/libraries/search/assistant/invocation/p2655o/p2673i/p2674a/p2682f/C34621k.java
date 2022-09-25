package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2682f;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;
import kotlinx.coroutines.p5573a.C71360an;
import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5574b.C71548cy;
import p5462h.C69677g;
import p5462h.C69685i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69514bd;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.suppression.HotwordSuppressionGrpcService$suppress$1", mo61344c = "HotwordSuppression.kt", mo61345d = "invokeSuspend", mo61346e = {95})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.f.k */
/* compiled from: PG */
final class C34621k extends C69572j implements C69630p {

    /* renamed from: a */
    int f91942a;

    /* renamed from: b */
    final /* synthetic */ C34613c f91943b;

    /* renamed from: c */
    final /* synthetic */ C34622l f91944c;

    /* renamed from: d */
    private /* synthetic */ Object f91945d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34621k(C34613c cVar, C34622l lVar, C69577g gVar) {
        super(2, gVar);
        this.f91943b = cVar;
        this.f91944c = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34621k) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object e;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91942a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar = (C71361ao) this.f91945d;
            C34612b a = C34612b.m63344a(this.f91943b.f91931b);
            if (a == null) {
                a = C34612b.UNRECOGNIZED;
            }
            int ordinal = a.ordinal();
            if (ordinal == 0) {
                C34623m mVar = C34623m.f91948a;
                C59052c cVar = (C59052c) C34622l.f91946a.mo56224b();
                cVar.mo56378ag(C58975e.f156826a, "TRG.HotwordSuppression");
                String str = this.f91943b.f91932c;
                cVar.mo56379ah(new C59094n(51416));
                cVar.mo56354G("Starting hotword suppression(%s: %s).", mVar, str);
                C34632v vVar = this.f91944c.f91947b;
                C69664n.m101061g(mVar, "mode");
                long andIncrement = vVar.f91963a.getAndIncrement();
                C71548cy cyVar = vVar.f91964b;
                do {
                    e = cyVar.mo62784e();
                } while (!cyVar.mo62808g(e, C69514bd.m100892f((Set) e, new C69685i(Long.valueOf(andIncrement), mVar))));
                C34620j jVar = new C34620j(mVar, this.f91943b, new C34625o(vVar, andIncrement, mVar));
                this.f91942a = 1;
                if (C71360an.m104022a(aoVar, jVar, this) == aVar) {
                    return aVar;
                }
            } else if (ordinal != 1) {
                throw new C69677g();
            } else {
                throw new IllegalStateException();
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34621k kVar = new C34621k(this.f91943b, this.f91944c, gVar);
        kVar.f91945d = obj;
        return kVar;
    }
}
