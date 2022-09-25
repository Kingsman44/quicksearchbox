package com.google.android.libraries.assistant.p1363c.p1394f.p1395a;

import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17313i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.p5533i.C70868g;

@C69567e(mo61343b = "com.google.android.libraries.assistant.apa.opahandover.impl.HandoverSessionImpl$start$handoverDoneDeferred$1$1$2", mo61344c = "HandoverSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.assistant.c.f.a.j */
/* compiled from: PG */
final class C17285j extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f50084a;

    /* renamed from: b */
    final /* synthetic */ C70868g f50085b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17285j(C70868g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f50085b = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C17285j) mo5194c((C17313i) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        this.f50085b.mo20123c((C17313i) this.f50084a);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C17285j jVar = new C17285j(this.f50085b, gVar);
        jVar.f50084a = obj;
        return jVar;
    }
}
