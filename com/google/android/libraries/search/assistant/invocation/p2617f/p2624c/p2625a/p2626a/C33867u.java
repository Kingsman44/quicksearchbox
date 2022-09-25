package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.core.voiceinteraction.session.callbacks.ApaVoiceInteractionSessionCallbacksImpl$onCloseSystemDialogs$1", mo61344c = "ApaVoiceInteractionSessionCallbacksImpl.kt", mo61345d = "invokeSuspend", mo61346e = {144})
/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.u */
/* compiled from: PG */
final class C33867u extends C69572j implements C69626l {

    /* renamed from: a */
    int f90376a;

    /* renamed from: b */
    final /* synthetic */ C33768ah f90377b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33867u(C33768ah ahVar, C69577g gVar) {
        super(1, gVar);
        this.f90377b = ahVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C33867u(this.f90377b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Duration duration;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90376a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C33768ah ahVar = this.f90377b;
            C33776ap apVar = ahVar.f90189e;
            C33866t tVar = new C33866t(ahVar, (C69577g) null);
            this.f90376a = 1;
            if (!apVar.f90222c.isZero() && (duration = (Duration) apVar.f90223d.get()) != null && duration.plus(apVar.f90222c).compareTo(Duration.ofMillis(apVar.f90221b.mo26871c())) > 0) {
                ((C58970a) C33776ap.f90220a.mo56224b()).mo56386p("ignoring onCloseSystemDialogs");
                obj2 = C69788q.f186170a;
            } else {
                obj2 = tVar.mo5761a(this);
                if (obj2 != C69554a.COROUTINE_SUSPENDED) {
                    obj2 = C69788q.f186170a;
                }
            }
            if (obj2 == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }
}
