package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.p2982x.C38257p;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.Status;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.service.impl.GrpcAudioLibraryPrewarmer$maybePrewarm$1", mo61344c = "GrpcAudioLibraryPrewarmer.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.c.x.a.n */
/* compiled from: PG */
final class C38205n extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f101261a;

    /* renamed from: b */
    final /* synthetic */ C38207p f101262b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38205n(C38207p pVar, C69577g gVar) {
        super(2, gVar);
        this.f101262b = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C38205n) mo5194c((C38257p) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        ((C38257p) this.f101261a).getClass().getSimpleName();
        this.f101262b.f101266b.mo41176i(Status.Code.OK.name());
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C38205n nVar = new C38205n(this.f101262b, gVar);
        nVar.f101261a = obj;
        return nVar;
    }
}
