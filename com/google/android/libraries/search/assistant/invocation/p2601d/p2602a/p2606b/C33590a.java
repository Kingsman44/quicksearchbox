package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b;

import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33610d;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33621o;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33622p;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.audio.focus.service.AudioFocusInternalServiceImpl$createAudioFocusStreaming$1$1", mo61344c = "AudioFocusInternalServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {120})
/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.b.a */
/* compiled from: PG */
final class C33590a extends C69572j implements C69630p {

    /* renamed from: a */
    int f89804a;

    /* renamed from: b */
    /* synthetic */ Object f89805b;

    /* renamed from: c */
    final /* synthetic */ C69648ae f89806c;

    /* renamed from: d */
    final /* synthetic */ C33638h f89807d;

    /* renamed from: e */
    final /* synthetic */ C71361ao f89808e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33590a(C69648ae aeVar, C33638h hVar, C71361ao aoVar, C69577g gVar) {
        super(2, gVar);
        this.f89806c = aeVar;
        this.f89807d = hVar;
        this.f89808e = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33590a) mo5194c((C33622p) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C33610d dVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f89804a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C33622p pVar = (C33622p) this.f89805b;
            C59052c cVar = (C59052c) C33638h.f89888a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "INV.AudioFocus.Server");
            int a = C33621o.m62215a(pVar.f89853a);
            String str = a != 1 ? a != 2 ? a != 3 ? "null" : "REQUEST_NOT_SET" : "CLOSE_STREAMING_REQUEST" : "ACQUIRE_SESSION_REQUEST";
            if (a != 0) {
                C34053bp bpVar = (C34053bp) this.f89806c.f186027a;
                C61301b a2 = bpVar != null ? C34711b.m63445a(bpVar) : null;
                cVar.mo56379ah(new C59094n(51240));
                cVar.mo56354G("On new streaming audio focus request(%s). InvocationToken: %s.", str, a2);
                int i = pVar.f89853a;
                int a3 = C33621o.m62215a(i);
                int i2 = a3 - 1;
                if (a3 == 0) {
                    throw null;
                } else if (i2 == 0) {
                    C69648ae aeVar = this.f89806c;
                    C33638h hVar = this.f89807d;
                    C71361ao aoVar = this.f89808e;
                    if (i == 1) {
                        dVar = (C33610d) pVar.f89854b;
                    } else {
                        dVar = C33610d.f89827b;
                    }
                    C69664n.m101060f(dVar, "it.acquireSessionRequest");
                    this.f89804a = 1;
                    if (C33636f.m62221e(aeVar, hVar, aoVar, dVar, this) == aVar) {
                        return aVar;
                    }
                } else if (i2 == 2) {
                    throw new IllegalArgumentException("No request data.");
                }
            } else {
                throw null;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C33590a aVar = new C33590a(this.f89806c, this.f89807d, this.f89808e, gVar);
        aVar.f89805b = obj;
        return aVar;
    }
}
