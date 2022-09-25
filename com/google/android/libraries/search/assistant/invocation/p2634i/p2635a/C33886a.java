package com.google.android.libraries.search.assistant.invocation.p2634i.p2635a;

import com.google.android.libraries.search.p2904c.C37626ge;
import com.google.android.libraries.search.p2904c.C37628gg;
import com.google.android.libraries.search.p2904c.C37629gh;
import com.google.android.libraries.search.p2904c.C37631gj;
import com.google.android.libraries.search.p2904c.C37633gl;
import com.google.android.libraries.search.p2904c.p2929h.C37649a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.earcon.client.EarconPlayerImpl$playInternal$2", mo61344c = "EarconPlayerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {37})
/* renamed from: com.google.android.libraries.search.assistant.invocation.i.a.a */
/* compiled from: PG */
final class C33886a extends C69572j implements C69630p {

    /* renamed from: a */
    int f90404a;

    /* renamed from: b */
    final /* synthetic */ C33887b f90405b;

    /* renamed from: c */
    final /* synthetic */ C37628gg f90406c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33886a(C33887b bVar, C37628gg ggVar, C69577g gVar) {
        super(2, gVar);
        this.f90405b = bVar;
        this.f90406c = ggVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33886a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90404a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                C59052c cVar = (C59052c) C33887b.f90407a.mo56225c();
                cVar.mo56378ag(C58975e.f156826a, "INV.Earcon.Player");
                C59052c cVar2 = (C59052c) cVar.mo56382g(th);
                cVar2.mo56379ah(new C59094n(51299));
                cVar2.mo56386p("Error while playing earcon.");
            }
        } else {
            C69714l.m101134b(obj);
            C37649a aVar2 = this.f90405b.f90408b;
            C37628gg ggVar = this.f90406c;
            C37626ge geVar = (C37626ge) C37629gh.f99987c.createBuilder();
            C69664n.m101060f(geVar, "newBuilder()");
            C69664n.m101061g(geVar, "builder");
            C69664n.m101061g(ggVar, "value");
            geVar.copyOnWrite();
            C37629gh ghVar = (C37629gh) geVar.instance;
            ghVar.f99990b = ggVar.f99986g;
            ghVar.f99989a |= 1;
            C62942bv build = geVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C60870cx a = aVar2.mo41046a((C37629gh) build);
            this.f90404a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C59052c cVar3 = (C59052c) C33887b.f90407a.mo56224b();
        cVar3.mo56378ag(C58975e.f156826a, "INV.Earcon.Player");
        String name = this.f90406c.name();
        C37633gl a2 = C37633gl.m66602a(((C37631gj) obj).f99994b);
        if (a2 == null) {
            a2 = C37633gl.AUDIOTACTILE_FEEDBACK_STATUS_UNKNOWN;
        }
        cVar3.mo56379ah(new C59094n(51298));
        cVar3.mo56354G("%s earcon played: %s.", name, a2);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C33886a(this.f90405b, this.f90406c, gVar);
    }
}
