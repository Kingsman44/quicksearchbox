package com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.p2590a;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.C33499c;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.service.impl.VoiceInteractionServiceLifecycleCallbacksImpl$onReady$1$1", mo61344c = "VoiceInteractionServiceLifecycleCallbacksImpl.kt", mo61345d = "invokeSuspend", mo61346e = {55})
/* renamed from: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.a.a.d */
/* compiled from: PG */
final class C33493d extends C69572j implements C69630p {

    /* renamed from: a */
    int f89639a;

    /* renamed from: b */
    final /* synthetic */ C33497h f89640b;

    /* renamed from: c */
    private /* synthetic */ Object f89641c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33493d(C33497h hVar, C69577g gVar) {
        super(2, gVar);
        this.f89640b = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33493d) mo5194c((C33499c) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f89639a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C33497h hVar = this.f89640b;
            this.f89639a = 1;
            if (((C33499c) this.f89641c).mo38910e(hVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C33493d dVar = new C33493d(this.f89640b, gVar);
        dVar.f89641c = obj;
        return dVar;
    }
}
