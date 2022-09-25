package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d;

import kotlinx.coroutines.p5573a.C71360an;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.C70141ae;
import p5488io.grpc.C70148al;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.InitialRequestFactory$getVoiceSearchParams$2$1", mo61344c = "InitialRequestFactory.kt", mo61345d = "invokeSuspend", mo61346e = {181})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.y */
/* compiled from: PG */
final class C126602y extends C69572j implements C69630p {

    /* renamed from: a */
    int f348648a;

    /* renamed from: b */
    final /* synthetic */ C126449aa f348649b;

    /* renamed from: c */
    private /* synthetic */ Object f348650c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126602y(C126449aa aaVar, C69577g gVar) {
        super(2, gVar);
        this.f348649b = aaVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126602y) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348648a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar = (C71361ao) this.f348650c;
            C70141ae aeVar = new C70141ae(C70148al.m102135m().mo61716n());
            aeVar.mo61718p(new C126600w(this.f348649b, aoVar));
            C126601x xVar = new C126601x(aeVar);
            this.f348648a = 1;
            if (C71360an.m104022a(aoVar, xVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C126602y yVar = new C126602y(this.f348649b, gVar);
        yVar.f348650c = obj;
        return yVar;
    }
}
