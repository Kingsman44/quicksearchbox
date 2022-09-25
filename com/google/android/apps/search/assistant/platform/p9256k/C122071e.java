package com.google.android.apps.search.assistant.platform.p9256k;

import java.util.concurrent.atomic.AtomicBoolean;
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
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.p5533i.C70862aj;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.voicesearch.BidiStreamingToFlowConverterKt$wrapGrpcImplBase$1", mo61344c = "BidiStreamingToFlowConverter.kt", mo61345d = "invokeSuspend", mo61346e = {88})
/* renamed from: com.google.android.apps.search.assistant.platform.k.e */
/* compiled from: PG */
final class C122071e extends C69572j implements C69630p {

    /* renamed from: a */
    int f338672a;

    /* renamed from: b */
    final /* synthetic */ C69626l f338673b;

    /* renamed from: c */
    final /* synthetic */ C71587n f338674c;

    /* renamed from: d */
    private /* synthetic */ Object f338675d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122071e(C69626l lVar, C71587n nVar, C69577g gVar) {
        super(2, gVar);
        this.f338673b = lVar;
        this.f338674c = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C122071e) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f338672a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar = (C71361ao) this.f338675d;
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C122070d dVar = new C122070d(aoVar, atomicBoolean);
            C71803m.m105043d(aoVar, (C69585o) null, (C71424ay) null, new C122068b(this.f338674c, (C70862aj) this.f338673b.mo5761a(dVar), aoVar, atomicBoolean, (C69577g) null), 3);
            C122069c cVar = C122069c.f338669a;
            this.f338672a = 1;
            if (C71360an.m104022a(aoVar, cVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C122071e eVar = new C122071e(this.f338673b, this.f338674c, gVar);
        eVar.f338675d = obj;
        return eVar;
    }
}
