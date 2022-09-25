package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.common.p4522b.C58485gu;
import com.google.p4283bv.p4354e.C57051b;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.GrpcFeedRequestClient$triggerDebugRequest$1$1", mo61344c = "GrpcFeedRequestClient.kt", mo61345d = "invokeSuspend", mo61346e = {122})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.cf */
/* compiled from: PG */
final class C135004cf extends C69572j implements C69630p {

    /* renamed from: a */
    int f367601a;

    /* renamed from: b */
    final /* synthetic */ C135008cj f367602b;

    /* renamed from: c */
    final /* synthetic */ C57051b f367603c;

    /* renamed from: d */
    final /* synthetic */ C57303dd f367604d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135004cf(C135008cj cjVar, C57051b bVar, C57303dd ddVar, C69577g gVar) {
        super(2, gVar);
        this.f367602b = cjVar;
        this.f367603c = bVar;
        this.f367604d = ddVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135004cf) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C58485gu guVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367601a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135008cj cjVar = this.f367602b;
            C57051b bVar = this.f367603c;
            C57303dd ddVar = this.f367604d;
            this.f367601a = 1;
            if (bVar != null) {
                guVar = C58485gu.m89846n(bVar);
                C69664n.m101060f(guVar, "of(currentSessionFeedId)");
            } else {
                guVar = C58485gu.m89845m();
                C69664n.m101060f(guVar, "of()");
            }
            C135049dw dwVar = cjVar.f367629a;
            obj = C71803m.m105040a(dwVar.f367760a, new C135047du(dwVar, guVar, ddVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135004cf(this.f367602b, this.f367603c, this.f367604d, gVar);
    }
}
