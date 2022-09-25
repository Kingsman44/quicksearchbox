package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62942bv;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.core.voiceinteraction.session.callbacks.ApaVoiceInteractionSessionCallbacksImpl$onCloseSystemDialogs$1$1", mo61344c = "ApaVoiceInteractionSessionCallbacksImpl.kt", mo61345d = "invokeSuspend", mo61346e = {147})
/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.t */
/* compiled from: PG */
final class C33866t extends C69572j implements C69626l {

    /* renamed from: a */
    int f90374a;

    /* renamed from: b */
    final /* synthetic */ C33768ah f90375b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33866t(C33768ah ahVar, C69577g gVar) {
        super(1, gVar);
        this.f90375b = ahVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C33866t(this.f90375b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90374a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C59052c cVar = (C59052c) C33768ah.f90184a.mo56224b();
            cVar.mo56379ah(new C59094n(51287));
            cVar.mo56386p("onAllowedOnCloseSystemDialogs");
            this.f90375b.f90190f.ifPresent(C33865s.f90373a);
            C33787b bVar = this.f90375b.f90186b;
            this.f90374a = 1;
            C33850di diVar = bVar.f90237a;
            C33778ar arVar = (C33778ar) C33779as.f90229a.createBuilder();
            C69664n.m101060f(arVar, "newBuilder()");
            C69664n.m101061g(arVar, "builder");
            C62942bv build = arVar.build();
            C69664n.m101060f(build, "_builder.build()");
            if (diVar.mo39089b((C33779as) build, new C70334de(), this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }
}
