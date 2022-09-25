package com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.assistant.apa.network.apas3client.impl.ApaS3ConnectionImpl$requestFlow$2$merged$2", mo61344c = "ApaS3ConnectionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.assistant.c.e.a.c.h */
/* compiled from: PG */
final class C17243h extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f50001a;

    /* renamed from: b */
    final /* synthetic */ C17249n f50002b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17243h(C17249n nVar, C69577g gVar) {
        super(3, gVar);
        this.f50002b = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        C17243h hVar = new C17243h(this.f50002b, (C69577g) obj3);
        hVar.f50001a = (Throwable) obj2;
        return hVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Throwable th = (Throwable) this.f50001a;
        C59052c cVar = (C59052c) ((C59052c) C17249n.f50012a.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(42647));
        cVar.mo56386p("Error in S3RequestProducer#streamTo");
        C17249n.m34427b(new C17242g(this.f50002b, th));
        throw th;
    }
}
