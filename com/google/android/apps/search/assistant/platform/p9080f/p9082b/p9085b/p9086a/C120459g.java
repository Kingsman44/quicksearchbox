package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a;

import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.C33588c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5085c.p5086a.p5090b.p5091a.p5092a.C65490b;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.focus.impl.AudioApiAudioFocusPolicyImpl$acquireMicFocus$1$sessionLost$1$1$1", mo61344c = "AudioApiAudioFocusPolicyImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.b.a.g */
/* compiled from: PG */
final class C120459g extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f335023a;

    public C120459g(C69577g gVar) {
        super(2, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120459g) mo5194c((C33588c) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        if (((C33588c) this.f335023a).f89803c) {
            C58976aa aaVar = C58975e.f156826a;
            return C69788q.f186170a;
        }
        throw new C120465m("Focus lost unexpectedly", C65490b.UNEXPECTED_FOCUS_LOSS, (Throwable) null);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120459g gVar2 = new C120459g(gVar);
        gVar2.f335023a = obj;
        return gVar2;
    }
}
