package com.google.android.apps.search.assistant.platform.p9256k;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
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
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.voicesearch.BidiStreamingToFlowConverterKt$wrapGrpcImplBase$1$1", mo61344c = "BidiStreamingToFlowConverter.kt", mo61345d = "invokeSuspend", mo61346e = {63})
/* renamed from: com.google.android.apps.search.assistant.platform.k.b */
/* compiled from: PG */
final class C122068b extends C69572j implements C69630p {

    /* renamed from: a */
    int f338664a;

    /* renamed from: b */
    final /* synthetic */ C71587n f338665b;

    /* renamed from: c */
    final /* synthetic */ C70862aj f338666c;

    /* renamed from: d */
    final /* synthetic */ AtomicBoolean f338667d;

    /* renamed from: e */
    final /* synthetic */ C71361ao f338668e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122068b(C71587n nVar, C70862aj ajVar, C71361ao aoVar, AtomicBoolean atomicBoolean, C69577g gVar) {
        super(2, gVar);
        this.f338665b = nVar;
        this.f338666c = ajVar;
        this.f338668e = aoVar;
        this.f338667d = atomicBoolean;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C122068b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f338664a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (CancellationException e) {
                this.f338668e.mo62727D(e);
                if (this.f338667d.get()) {
                    this.f338666c.mo20121a();
                } else {
                    this.f338666c.mo20122b(new C70761fa(Status.f186904b.withDescription("VSR was cancelled: ".concat(String.valueOf(e.getMessage()))), (C70334de) null, true));
                }
            } catch (Throwable th) {
                this.f338668e.mo62727D(th);
                this.f338666c.mo20122b(th);
            }
        } else {
            C69714l.m101134b(obj);
            C71587n nVar = this.f338665b;
            C122067a aVar2 = new C122067a(this.f338666c);
            this.f338664a = 1;
            if (nVar.mo38165mp(aVar2, this) == aVar) {
                return aVar;
            }
        }
        this.f338666c.mo20121a();
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C122068b(this.f338665b, this.f338666c, this.f338668e, this.f338667d, gVar);
    }
}
