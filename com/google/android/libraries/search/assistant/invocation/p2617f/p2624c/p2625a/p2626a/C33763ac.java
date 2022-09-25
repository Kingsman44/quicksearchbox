package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import android.service.voice.VoiceInteractionSession;
import com.google.android.libraries.search.assistant.invocation.android.parcelables.C33487a;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61539c;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61541e;
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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.core.voiceinteraction.session.callbacks.ApaVoiceInteractionSessionCallbacksImpl$onHandleAssist$1", mo61344c = "ApaVoiceInteractionSessionCallbacksImpl.kt", mo61345d = "invokeSuspend", mo61346e = {139})
/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.ac */
/* compiled from: PG */
final class C33763ac extends C69572j implements C69626l {

    /* renamed from: a */
    int f90170a;

    /* renamed from: b */
    final /* synthetic */ VoiceInteractionSession.ActivityId f90171b;

    /* renamed from: c */
    final /* synthetic */ AssistStateCompat f90172c;

    /* renamed from: d */
    final /* synthetic */ C33768ah f90173d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33763ac(VoiceInteractionSession.ActivityId activityId, AssistStateCompat assistStateCompat, C33768ah ahVar, C69577g gVar) {
        super(1, gVar);
        this.f90171b = activityId;
        this.f90172c = assistStateCompat;
        this.f90173d = ahVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C33763ac(this.f90171b, this.f90172c, this.f90173d, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90170a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            VoiceInteractionSession.ActivityId activityId = this.f90171b;
            String a = activityId != null ? this.f90173d.f90194j.mo38947a(activityId) : null;
            AssistStateCompat assistStateCompat = this.f90172c;
            AssistStateCompat assistStateCompat2 = new AssistStateCompat(assistStateCompat.f89669a, assistStateCompat.f89670b, assistStateCompat.f89671c, assistStateCompat.f89672d, assistStateCompat.f89673e, a);
            this.f90173d.f90192h.f337382c.mo38939a(assistStateCompat2, this.f90171b);
            C33787b bVar = this.f90173d.f90186b;
            this.f90170a = 1;
            C33850di diVar = bVar.f90237a;
            C61541e eVar = C33487a.f89618c;
            C69664n.m101060f(eVar, "ASSIST_STATE_KEYS");
            C33799bl blVar = (C33799bl) C33800bm.f90252a.createBuilder();
            C69664n.m101060f(blVar, "newBuilder()");
            C69664n.m101061g(blVar, "builder");
            C62942bv build = blVar.build();
            C69664n.m101060f(build, "_builder.build()");
            if (((C33850di) C61539c.m94271a(diVar, eVar, assistStateCompat2)).mo39094g((C33800bm) build, new C70334de(), this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }
}
