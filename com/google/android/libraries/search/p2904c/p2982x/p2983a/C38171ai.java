package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.service.impl.StreamListeningSessionResponseSender$sendAudioBytesReceiverRegistry$2$2", mo61344c = "StreamListeningSessionResponseSender.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.c.x.a.ai */
/* compiled from: PG */
final class C38171ai extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f101152a;

    /* renamed from: b */
    final /* synthetic */ C38181as f101153b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38171ai(C38181as asVar, C69577g gVar) {
        super(3, gVar);
        this.f101153b = asVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        C38171ai aiVar = new C38171ai(this.f101153b, (C69577g) obj3);
        aiVar.f101152a = (Throwable) obj2;
        return aiVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Object obj2 = this.f101152a;
        C59052c cVar = (C59052c) C38181as.f101186a.mo56225c();
        cVar.mo56378ag(C58975e.f156826a, "ALT.GrpcARCRespSenderV2");
        Throwable th = (Throwable) obj2;
        C59052c cVar2 = (C59052c) cVar.mo56382g(th);
        cVar2.mo56379ah(new C59094n(53027));
        cVar2.mo56386p("#audio# Fail while getting flow's session audio data, shutting down");
        this.f101153b.mo41310g(th);
        return C69788q.f186170a;
    }
}
