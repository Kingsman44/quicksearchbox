package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.core.voiceinteraction.session.callbacks.ApaVoiceInteractionSessionCallbacksImpl$onConfigurationChanged$1", mo61344c = "ApaVoiceInteractionSessionCallbacksImpl.kt", mo61345d = "invokeSuspend", mo61346e = {89})
/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.w */
/* compiled from: PG */
final class C33869w extends C69572j implements C69626l {

    /* renamed from: a */
    int f90379a;

    /* renamed from: b */
    final /* synthetic */ C33768ah f90380b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33869w(C33768ah ahVar, C69577g gVar) {
        super(1, gVar);
        this.f90380b = ahVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C33869w(this.f90380b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90379a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            this.f90380b.f90190f.ifPresent(C33868v.f90378a);
            C33787b bVar = this.f90380b.f90186b;
            this.f90379a = 1;
            C33850di diVar = bVar.f90237a;
            C33782av avVar = (C33782av) C33783aw.f90233a.createBuilder();
            C69664n.m101060f(avVar, "newBuilder()");
            C69664n.m101061g(avVar, "builder");
            C62942bv build = avVar.build();
            C69664n.m101060f(build, "_builder.build()");
            if (diVar.mo39090c((C33783aw) build, new C70334de(), this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }
}
