package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121597bx;
import com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121663t;
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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.core.voiceinteraction.session.callbacks.ApaVoiceInteractionSessionCallbacksImpl$onHide$1", mo61344c = "ApaVoiceInteractionSessionCallbacksImpl.kt", mo61345d = "invokeSuspend", mo61346e = {155})
/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.af */
/* compiled from: PG */
final class C33766af extends C69572j implements C69626l {

    /* renamed from: a */
    int f90178a;

    /* renamed from: b */
    final /* synthetic */ C33768ah f90179b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33766af(C33768ah ahVar, C69577g gVar) {
        super(1, gVar);
        this.f90179b = ahVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C33766af(this.f90179b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90178a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            this.f90179b.f90190f.ifPresent(C33765ae.f90177a);
            C121597bx bxVar = this.f90179b.f90192h;
            bxVar.f337380a.mo74758o();
            C121663t tVar = (C121663t) bxVar.f337381b.orElse(null);
            if (tVar != null) {
                tVar.mo74758o();
            }
            C33787b bVar = this.f90179b.f90186b;
            this.f90178a = 1;
            C33850di diVar = bVar.f90237a;
            C33807bt btVar = (C33807bt) C33808bu.f90260a.createBuilder();
            C69664n.m101060f(btVar, "newBuilder()");
            C69664n.m101061g(btVar, "builder");
            C62942bv build = btVar.build();
            C69664n.m101060f(build, "_builder.build()");
            if (diVar.mo39096i((C33808bu) build, new C70334de(), this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }
}
