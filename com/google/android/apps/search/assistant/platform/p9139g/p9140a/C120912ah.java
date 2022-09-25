package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.rendering.widgets.ActionsServiceSessionImpl$requestFulfillmentAsync$1$1", mo61344c = "ActionsServiceSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {257})
/* renamed from: com.google.android.apps.search.assistant.platform.g.a.ah */
/* compiled from: PG */
final class C120912ah extends C69572j implements C69630p {

    /* renamed from: a */
    int f336161a;

    /* renamed from: b */
    final /* synthetic */ C52897d f336162b;

    /* renamed from: c */
    final /* synthetic */ C120917am f336163c;

    /* renamed from: d */
    final /* synthetic */ C71816z f336164d;

    /* renamed from: e */
    private /* synthetic */ Object f336165e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120912ah(C52897d dVar, C71816z zVar, C120917am amVar, C69577g gVar) {
        super(2, gVar);
        this.f336162b = dVar;
        this.f336164d = zVar;
        this.f336163c = amVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120912ah) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f336161a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar = (C71361ao) this.f336165e;
            C70862aj b = this.f336162b.mo53946b(new C120911ag(this.f336163c, aoVar));
            this.f336164d.mo62909P(b);
            C120910af afVar = new C120910af(b);
            this.f336161a = 1;
            if (C71360an.m104022a(aoVar, afVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120912ah ahVar = new C120912ah(this.f336162b, this.f336164d, this.f336163c, gVar);
        ahVar.f336165e = obj;
        return ahVar;
    }
}
