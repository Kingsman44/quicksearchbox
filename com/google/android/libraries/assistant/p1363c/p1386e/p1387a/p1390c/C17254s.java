package com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.p5533i.C70868g;
import p5488io.grpc.p5533i.C70869h;

@C69567e(mo61343b = "com.google.android.libraries.assistant.apa.network.apas3client.impl.S3StubbyClientConnectorServiceStubsKt$s3BidiFlow$2$1", mo61344c = "S3StubbyClientConnectorServiceStubs.kt", mo61345d = "invokeSuspend", mo61346e = {55})
/* renamed from: com.google.android.libraries.assistant.c.e.a.c.s */
/* compiled from: PG */
final class C17254s extends C69572j implements C69630p {

    /* renamed from: a */
    int f50025a;

    /* renamed from: b */
    final /* synthetic */ C71587n f50026b;

    /* renamed from: c */
    final /* synthetic */ C70868g f50027c;

    /* renamed from: d */
    final /* synthetic */ C71361ao f50028d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17254s(C71587n nVar, C70868g gVar, C71361ao aoVar, C69577g gVar2) {
        super(2, gVar2);
        this.f50026b = nVar;
        this.f50027c = gVar;
        this.f50028d = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C17254s) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f50025a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (CancellationException e) {
                this.f50028d.mo62727D(e);
                ((C70869h) this.f50027c).f189042b.mo27480d("Client Call Stream was cancelled", (Throwable) null);
            } catch (Throwable th) {
                this.f50028d.mo62727D(th);
                this.f50027c.mo20122b(th);
            }
        } else {
            C69714l.m101134b(obj);
            C71587n nVar = this.f50026b;
            C17253r rVar = new C17253r(this.f50027c);
            this.f50025a = 1;
            if (nVar.mo38165mp(rVar, this) == aVar) {
                return aVar;
            }
        }
        this.f50027c.mo20121a();
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C17254s(this.f50026b, this.f50027c, this.f50028d, gVar);
    }
}
