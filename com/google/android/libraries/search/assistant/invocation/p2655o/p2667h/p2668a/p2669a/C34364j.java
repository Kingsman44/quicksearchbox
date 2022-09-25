package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a;

import com.google.android.apps.gsa.binaries.satin.app.aqs;
import com.google.android.libraries.search.assistant.invocation.p2641k.p2642a.C33917c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34039bb;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34074cj;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34076cl;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34078cn;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34119a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34120b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71367au;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.connections.impl.TriggeringConnectionImpl$onInvocation$2", mo61344c = "TriggeringConnectionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {78})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.a.a.j */
/* compiled from: PG */
final class C34364j extends C69572j implements C69630p {

    /* renamed from: a */
    int f91348a;

    /* renamed from: b */
    final /* synthetic */ C34039bb f91349b;

    /* renamed from: c */
    final /* synthetic */ C34366l f91350c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34364j(C34039bb bbVar, C34366l lVar, C69577g gVar) {
        super(2, gVar);
        this.f91349b = bbVar;
        this.f91350c = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34364j) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91348a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C59052c cVar = (C59052c) C34366l.f91353a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "TRG.Connection");
            C34043bf a = C34043bf.m62692a(this.f91349b.f90719b);
            if (a == null) {
                a = C34043bf.UNRECOGNIZED;
            }
            String name = a.name();
            C34053bp bpVar = this.f91349b.f90720c;
            if (bpVar == null) {
                bpVar = C34053bp.f90753a;
            }
            C69664n.m101060f(bpVar, "event.token");
            C61301b a2 = C34711b.m63445a(bpVar);
            String str = this.f91350c.f91354b;
            cVar.mo56379ah(new C59094n(51348));
            cVar.mo56359L("On invocation(%s => %s) in connection(%s).", name, a2, str);
            C34366l lVar = this.f91350c;
            aqs aqs = lVar.f91358f;
            C34119a aVar2 = ((C34120b) lVar.f91357e.mo62784e()).f90872a;
            C34053bp bpVar2 = this.f91349b.f90720c;
            if (bpVar2 == null) {
                bpVar2 = C34053bp.f90753a;
            }
            C69664n.m101060f(bpVar2, "event.token");
            C33917c a3 = aqs.mo67207a(aVar2, bpVar2);
            C37258g gVar = C37176a.f97057eP;
            C69664n.m101060f(gVar, "APA_INVOCATION_PROPAGATION_TO_CLIENT");
            a3.mo39128a(gVar.mo40779c(), a3.f90466b);
            C71367au auVar = this.f91350c.f91355c;
            C34039bb bbVar = this.f91349b;
            C34074cj cjVar = (C34074cj) C34076cl.f90797c.createBuilder();
            C69664n.m101060f(cjVar, "newBuilder()");
            C34078cn a4 = C69664n.m101061g(cjVar, "builder");
            C69664n.m101061g(bbVar, "value");
            C34074cj cjVar2 = a4.f90802a;
            cjVar2.copyOnWrite();
            C34076cl clVar = (C34076cl) cjVar2.instance;
            bbVar.getClass();
            clVar.f90800b = bbVar;
            clVar.f90799a = 1;
            C34076cl a5 = a4.mo39208a();
            this.f91348a = 1;
            if (auVar.mo62729v(a5, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34364j(this.f91349b, this.f91350c, gVar);
    }
}
