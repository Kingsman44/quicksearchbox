package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a;

import com.google.android.libraries.search.assistant.invocation.p2641k.C33914a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34060bw;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34074cj;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34076cl;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34078cn;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71348ab;
import kotlinx.coroutines.p5573a.C71367au;
import kotlinx.coroutines.p5573a.C71393z;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.connections.impl.TriggeringConnectionImpl$onPlatformConfigurationUpdate$2", mo61344c = "TriggeringConnectionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.a.a.k */
/* compiled from: PG */
final class C34365k extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C34060bw f91351a;

    /* renamed from: b */
    final /* synthetic */ C34366l f91352b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34365k(C34060bw bwVar, C34366l lVar, C69577g gVar) {
        super(2, gVar);
        this.f91351a = bwVar;
        this.f91352b = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34365k) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C59052c cVar = (C59052c) C34366l.f91353a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.Connection");
        String a = C33914a.m62566a(this.f91351a);
        String str = this.f91352b.f91354b;
        cVar.mo56379ah(new C59094n(51349));
        cVar.mo56354G("On platform configuration update(@%s) in connection(%s).", a, str);
        C71367au auVar = this.f91352b.f91355c;
        C34060bw bwVar = this.f91351a;
        C34074cj cjVar = (C34074cj) C34076cl.f90797c.createBuilder();
        C69664n.m101060f(cjVar, "newBuilder()");
        C34078cn a2 = C69664n.m101061g(cjVar, "builder");
        C69664n.m101061g(bwVar, "value");
        C34074cj cjVar2 = a2.f90802a;
        cjVar2.copyOnWrite();
        C34076cl clVar = (C34076cl) cjVar2.instance;
        bwVar.getClass();
        clVar.f90800b = bwVar;
        clVar.f90799a = 2;
        Object w = auVar.mo62730w(a2.mo39208a());
        if (!(w instanceof C71393z)) {
            C71348ab.m103986d(w);
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34365k(this.f91351a, this.f91352b, gVar);
    }
}
