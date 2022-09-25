package com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.p2590a;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.C33499c;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.service.impl.VoiceInteractionServiceLifecycleCallbacksImpl$forEachListener$1$failures$1$1", mo61344c = "VoiceInteractionServiceLifecycleCallbacksImpl.kt", mo61345d = "invokeSuspend", mo61346e = {73})
/* renamed from: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.a.a.b */
/* compiled from: PG */
final class C33491b extends C69572j implements C69630p {

    /* renamed from: a */
    int f89627a;

    /* renamed from: b */
    final /* synthetic */ C69630p f89628b;

    /* renamed from: c */
    final /* synthetic */ C33499c f89629c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33491b(C69630p pVar, C33499c cVar, C69577g gVar) {
        super(2, gVar);
        this.f89628b = pVar;
        this.f89629c = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33491b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f89627a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69630p pVar = this.f89628b;
            C33499c cVar = this.f89629c;
            this.f89627a = 1;
            if (pVar.mo5192a(cVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C33491b(this.f89628b, this.f89629c, gVar);
    }
}
