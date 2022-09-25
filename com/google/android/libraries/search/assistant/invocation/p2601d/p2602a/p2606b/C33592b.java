package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69648ae;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.audio.focus.service.AudioFocusInternalServiceImpl$createAudioFocusStreaming$1$2", mo61344c = "AudioFocusInternalServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.b.b */
/* compiled from: PG */
final class C33592b extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f89809a;

    /* renamed from: b */
    final /* synthetic */ C69648ae f89810b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33592b(C69648ae aeVar, C69577g gVar) {
        super(3, gVar);
        this.f89810b = aeVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        C33592b bVar = new C33592b(this.f89810b, (C69577g) obj3);
        bVar.f89809a = (Throwable) obj2;
        return bVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Object obj2 = this.f89809a;
        C59052c cVar = (C59052c) C33638h.f89888a.mo56226d();
        cVar.mo56378ag(C58975e.f156826a, "INV.AudioFocus.Server");
        C59052c cVar2 = (C59052c) cVar.mo56382g((Throwable) obj2);
        C34053bp bpVar = (C34053bp) this.f89810b.f186027a;
        C61301b a = bpVar != null ? C34711b.m63445a(bpVar) : null;
        cVar2.mo56379ah(new C59094n(51241));
        cVar2.mo56389s("Audio focus streaming call failed. InvocationToken: %s.", a);
        return C69788q.f186170a;
    }
}
