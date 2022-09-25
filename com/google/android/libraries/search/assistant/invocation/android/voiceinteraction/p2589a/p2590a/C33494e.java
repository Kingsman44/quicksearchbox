package com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.p2590a;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.C33499c;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.service.impl.VoiceInteractionServiceLifecycleCallbacksImpl$onShutdown$1$1", mo61344c = "VoiceInteractionServiceLifecycleCallbacksImpl.kt", mo61345d = "invokeSuspend", mo61346e = {61})
/* renamed from: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.a.a.e */
/* compiled from: PG */
final class C33494e extends C69572j implements C69630p {

    /* renamed from: a */
    int f89642a;

    /* renamed from: b */
    private /* synthetic */ Object f89643b;

    public C33494e(C69577g gVar) {
        super(2, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33494e) mo5194c((C33499c) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f89642a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            this.f89642a = 1;
            if (((C33499c) this.f89643b).mo38909d(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C33494e eVar = new C33494e(gVar);
        eVar.f89643b = obj;
        return eVar;
    }
}
