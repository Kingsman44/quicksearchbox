package com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c;

import com.google.speech.p5208h.C66652ds;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5573a.C71360an;
import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.p5533i.C70868g;

@C69567e(mo61343b = "com.google.android.libraries.assistant.apa.network.apas3client.impl.S3StubbyClientConnectorServiceStubsKt$s3BidiFlow$2", mo61344c = "S3StubbyClientConnectorServiceStubs.kt", mo61345d = "invokeSuspend", mo61346e = {70})
/* renamed from: com.google.android.libraries.assistant.c.e.a.c.v */
/* compiled from: PG */
final class C17257v extends C69572j implements C69630p {

    /* renamed from: a */
    int f50031a;

    /* renamed from: b */
    final /* synthetic */ C66652ds f50032b;

    /* renamed from: c */
    final /* synthetic */ C71587n f50033c;

    /* renamed from: d */
    private /* synthetic */ Object f50034d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17257v(C66652ds dsVar, C71587n nVar, C69577g gVar) {
        super(2, gVar);
        this.f50032b = dsVar;
        this.f50033c = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C17257v) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f50031a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar = (C71361ao) this.f50034d;
            C70868g gVar = (C70868g) this.f50032b.mo59701b(new C17256u(aoVar));
            C71803m.m105043d(aoVar, (C69585o) null, (C71424ay) null, new C17254s(this.f50033c, gVar, aoVar, (C69577g) null), 3);
            C17255t tVar = new C17255t(gVar);
            this.f50031a = 1;
            if (C71360an.m104022a(aoVar, tVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C17257v vVar = new C17257v(this.f50032b, this.f50033c, gVar);
        vVar.f50034d = obj;
        return vVar;
    }
}
