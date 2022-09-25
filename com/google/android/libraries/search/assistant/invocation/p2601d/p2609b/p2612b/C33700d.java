package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.audio.input.service.AudioInputInternalServiceImpl$openSessionStreaming$1$2", mo61344c = "AudioInputInternalServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.b.d */
/* compiled from: PG */
final class C33700d extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f90026a;

    /* renamed from: b */
    final /* synthetic */ C69648ae f90027b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33700d(C69648ae aeVar, C69577g gVar) {
        super(3, gVar);
        this.f90027b = aeVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        C33700d dVar = new C33700d(this.f90027b, (C69577g) obj3);
        dVar.f90026a = (Throwable) obj2;
        return dVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C59052c cVar = (C59052c) ((C59052c) C33706j.f90049a.mo56226d()).mo56382g((Throwable) this.f90026a);
        C34053bp bpVar = (C34053bp) this.f90027b.f186027a;
        C61301b a = bpVar != null ? C34711b.m63445a(bpVar) : null;
        cVar.mo56379ah(new C59094n(51263));
        cVar.mo56389s("Audio input streaming call failed (%s).", a);
        return C69788q.f186170a;
    }
}
