package com.google.android.libraries.search.p2904c.p2982x.p2983a;

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
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.service.impl.GrpcAudioLibraryPrewarmer$maybePrewarm$2", mo61344c = "GrpcAudioLibraryPrewarmer.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.c.x.a.o */
/* compiled from: PG */
final class C38206o extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f101263a;

    /* renamed from: b */
    final /* synthetic */ C38207p f101264b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38206o(C38207p pVar, C69577g gVar) {
        super(3, gVar);
        this.f101264b = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        C38206o oVar2 = new C38206o(this.f101264b, (C69577g) obj3);
        oVar2.f101263a = (Throwable) obj2;
        return oVar2.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Object obj2 = this.f101263a;
        Status.Code code = obj2 instanceof StatusException ? ((StatusException) obj2).f186943a.getCode() : Status.Code.UNKNOWN;
        C59052c cVar = (C59052c) C38207p.f101265a.mo56226d();
        String name = code.name();
        cVar.mo56379ah(new C59094n(53006));
        cVar.mo56389s("#audio# Prewarming connection status error = %s", name);
        this.f101264b.f101266b.mo41176i(code.name());
        return C69788q.f186170a;
    }
}
