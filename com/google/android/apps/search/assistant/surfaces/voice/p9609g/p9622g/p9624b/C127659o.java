package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b;

import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.C127613a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.triggering.impl.MainAssistantTriggeringClientImpl$TriggeringResponseObserver$onError$1", mo61344c = "MainAssistantTriggeringClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {536})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.g.b.o */
/* compiled from: PG */
final class C127659o extends C69572j implements C69626l {

    /* renamed from: a */
    int f351462a;

    /* renamed from: b */
    final /* synthetic */ C127661q f351463b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127659o(C127661q qVar, C69577g gVar) {
        super(1, gVar);
        this.f351463b = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C127659o(this.f351463b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f351462a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                C59052c cVar = (C59052c) ((C59052c) C127643ae.f351379a.mo56225c()).mo56382g(th);
                cVar.mo56379ah(new C59094n(37534));
                cVar.mo56386p("Retry Request Failed.");
            }
        } else {
            C69714l.m101134b(obj);
            C127661q qVar = this.f351463b;
            C127613a aVar2 = qVar.f351469a;
            this.f351462a = 1;
            if (qVar.mo108169d(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }
}
