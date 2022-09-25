package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.android.libraries.search.assistant.invocation.p2641k.C33914a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.util.Set;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69498ao;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.directactions.VisibleActivitiesTracker$shareIn$2", mo61344c = "VisibleActivitiesTracker.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.j.a.dq */
/* compiled from: PG */
final class C121644dq extends C69572j implements C69631q {

    /* renamed from: a */
    final /* synthetic */ C121647dt f337501a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121644dq(C121647dt dtVar, C69577g gVar) {
        super(3, gVar);
        this.f337501a = dtVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        Throwable th = (Throwable) obj2;
        return new C121644dq(this.f337501a, (C69577g) obj3).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object e;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C59052c cVar = (C59052c) C121647dt.f337504a.mo56224b();
        String c = C33914a.m62568c(this.f337501a.f337505b);
        cVar.mo56379ah(new C59094n(35908));
        cVar.mo56389s("Unsubscribing from activities updates in %s.", c);
        C121647dt dtVar = this.f337501a;
        dtVar.f337505b.unregisterVisibleActivityCallback(dtVar.f337508e);
        C71548cy cyVar = this.f337501a.f337507d;
        do {
            e = cyVar.mo62784e();
            Set set = (Set) e;
        } while (!cyVar.mo62808g(e, C69498ao.f185920a));
        return C69788q.f186170a;
    }
}
