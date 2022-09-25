package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.p2604a;

import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.audio.focus.api.impl.AudioFocusSessionImpl$acquireAudioFocus$2", mo61344c = "AudioFocusSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.a.a.g */
/* compiled from: PG */
final class C33582g extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f89780a;

    public C33582g(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        C33582g gVar = new C33582g((C69577g) obj3);
        gVar.f89780a = (Throwable) obj2;
        return gVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Object obj2 = this.f89780a;
        if ((obj2 instanceof StatusException) && ((StatusException) obj2).f186943a.getCode() == Status.Code.CANCELLED) {
            return C69788q.f186170a;
        }
        throw ((Throwable) obj2);
    }
}
