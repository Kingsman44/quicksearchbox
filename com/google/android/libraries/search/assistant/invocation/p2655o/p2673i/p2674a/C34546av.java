package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.HotwordTriggeringFrontend$controlCoroutine$5", mo61344c = "HotwordTriggeringFrontend.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.av */
/* compiled from: PG */
final class C34546av extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f91789a;

    /* renamed from: b */
    final /* synthetic */ C34563bg f91790b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34546av(C34563bg bgVar, C69577g gVar) {
        super(3, gVar);
        this.f91790b = bgVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        C34546av avVar = new C34546av(this.f91790b, (C69577g) obj3);
        avVar.f91789a = (Throwable) obj2;
        return avVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Object obj2 = this.f91789a;
        C34563bg bgVar = this.f91790b;
        if (obj2 instanceof CancellationException) {
            bgVar.f91830f.mo39440a(C34539ao.f91776a);
            C59052c cVar = (C59052c) C34563bg.f91824a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "TRG.HotwordFrontend");
            cVar.mo56379ah(new C59094n(51379));
            cVar.mo56386p("Configuration flow completed.");
        } else {
            Throwable th = (Throwable) obj2;
            bgVar.f91830f.mo39440a(new C34534aj(th));
            C59052c cVar2 = (C59052c) C34563bg.f91824a.mo56226d();
            cVar2.mo56378ag(C58975e.f156826a, "TRG.HotwordFrontend");
            C59052c cVar3 = (C59052c) cVar2.mo56382g(th);
            cVar3.mo56379ah(new C59094n(51378));
            cVar3.mo56386p("Configuration flow failed.");
        }
        return C69788q.f186170a;
    }
}
