package com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1388a;

import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66612cj;
import com.google.speech.p5208h.C66613ck;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.assistant.apa.network.apas3client.commons3request.CommonS3RequestProducer$produceSessionInfo$1$createInitialRequestMutator$1", mo61344c = "CommonS3RequestProducer.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.assistant.c.e.a.a.o */
/* compiled from: PG */
final class C17230o extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ String f49983a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17230o(String str, C69577g gVar) {
        super(2, gVar);
        this.f49983a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C17230o) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C66612cj cjVar = (C66612cj) C66613ck.f181215c.createBuilder();
        String str = this.f49983a;
        cjVar.copyOnWrite();
        C66613ck ckVar = (C66613ck) cjVar.instance;
        str.getClass();
        ckVar.f181218a |= 1;
        ckVar.f181219b = str;
        C62942bv build = cjVar.build();
        C69664n.m101060f(build, "newBuilder().setSessionId(requestId).build()");
        return new C17229n((C66613ck) build);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C17230o(this.f49983a, gVar);
    }
}
