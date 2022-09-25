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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.core.voiceinteraction.session.callbacks.ApaVoiceInteractionSessionServiceCallbacksImpl$onSessionProcessDied$1", mo61344c = "ApaVoiceInteractionSessionServiceCallbacksImpl.kt", mo61345d = "invokeSuspend", mo61346e = {43})
/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.an */
/* compiled from: PG */
public final class C33774an extends C69572j implements C69626l {

    /* renamed from: a */
    int f90212a;

    /* renamed from: b */
    final /* synthetic */ C33775ao f90213b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33774an(C33775ao aoVar, C69577g gVar) {
        super(1, gVar);
        this.f90213b = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C33774an(this.f90213b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90212a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C33787b bVar = this.f90213b.f90216c;
            this.f90212a = 1;
            C33850di diVar = bVar.f90237a;
            C33816cb cbVar = (C33816cb) C33817cc.f90273a.createBuilder();
            C69664n.m101060f(cbVar, "newBuilder()");
            C69664n.m101061g(cbVar, "builder");
            C62942bv build = cbVar.build();
            C69664n.m101060f(build, "_builder.build()");
            if (diVar.mo39098k((C33817cc) build, new C70334de(), this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }
}
