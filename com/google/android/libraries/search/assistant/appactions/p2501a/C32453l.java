package com.google.android.libraries.search.assistant.appactions.p2501a;

import com.google.assistant.p3931f.p3940d.p3941a.C52897d;
import kotlinx.coroutines.C71816z;
import kotlinx.coroutines.p5573a.C71360an;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.p5533i.C70862aj;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.appactions.actionsservice.ActionsServiceSessionImpl$requestFulfillmentAsync$1$1", mo61344c = "ActionsServiceSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {240})
/* renamed from: com.google.android.libraries.search.assistant.appactions.a.l */
/* compiled from: PG */
final class C32453l extends C69572j implements C69630p {

    /* renamed from: a */
    int f86953a;

    /* renamed from: b */
    final /* synthetic */ C52897d f86954b;

    /* renamed from: c */
    final /* synthetic */ C32458q f86955c;

    /* renamed from: d */
    final /* synthetic */ C71816z f86956d;

    /* renamed from: e */
    private /* synthetic */ Object f86957e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32453l(C52897d dVar, C71816z zVar, C32458q qVar, C69577g gVar) {
        super(2, gVar);
        this.f86954b = dVar;
        this.f86956d = zVar;
        this.f86955c = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32453l) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f86953a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar = (C71361ao) this.f86957e;
            C70862aj b = this.f86954b.mo53946b(new C32452k(this.f86955c, aoVar));
            this.f86956d.mo62909P(b);
            C32451j jVar = new C32451j(b);
            this.f86953a = 1;
            if (C71360an.m104022a(aoVar, jVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C32453l lVar = new C32453l(this.f86954b, this.f86956d, this.f86955c, gVar);
        lVar.f86957e = obj;
        return lVar;
    }
}
