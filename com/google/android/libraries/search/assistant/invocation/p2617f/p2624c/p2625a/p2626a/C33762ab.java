package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import android.service.voice.VoiceInteractionSession;
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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.core.voiceinteraction.session.callbacks.ApaVoiceInteractionSessionCallbacksImpl$onDirectActionsInvalidated$1", mo61344c = "ApaVoiceInteractionSessionCallbacksImpl.kt", mo61345d = "invokeSuspend", mo61346e = {168})
/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.ab */
/* compiled from: PG */
final class C33762ab extends C69572j implements C69626l {

    /* renamed from: a */
    int f90167a;

    /* renamed from: b */
    final /* synthetic */ C33768ah f90168b;

    /* renamed from: c */
    final /* synthetic */ VoiceInteractionSession.ActivityId f90169c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33762ab(C33768ah ahVar, VoiceInteractionSession.ActivityId activityId, C69577g gVar) {
        super(1, gVar);
        this.f90168b = ahVar;
        this.f90169c = activityId;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C33762ab(this.f90168b, this.f90169c, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90167a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C121597bx bxVar = this.f90168b.f90192h;
            VoiceInteractionSession.ActivityId activityId = this.f90169c;
            C69664n.m101061g(activityId, "activityId");
            bxVar.f337380a.mo74756m(activityId);
            C121663t tVar = (C121663t) bxVar.f337381b.orElse(null);
            if (tVar != null) {
                tVar.mo74756m(activityId);
            }
            String a = this.f90168b.f90194j.mo38947a(this.f90169c);
            C33787b bVar = this.f90168b.f90186b;
            this.f90167a = 1;
            C33850di diVar = bVar.f90237a;
            C33795bh bhVar = (C33795bh) C33796bi.f90247b.createBuilder();
            C69664n.m101060f(bhVar, "newBuilder()");
            C69664n.m101061g(bhVar, "builder");
            C69664n.m101061g(a, "value");
            bhVar.copyOnWrite();
            a.getClass();
            ((C33796bi) bhVar.instance).f90249a = a;
            C62942bv build = bhVar.build();
            C69664n.m101060f(build, "_builder.build()");
            if (diVar.mo39093f((C33796bi) build, new C70334de(), this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }
}
