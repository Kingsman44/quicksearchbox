package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

import com.google.assistant.p3931f.p3940d.p3941a.C52896c;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71548cy;
import p5462h.C69596e;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.p5533i.C70862aj;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.rendering.widgets.ActionsServiceSessionImpl$1$1$1", mo61344c = "ActionsServiceSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {118})
/* renamed from: com.google.android.apps.search.assistant.platform.g.a.g */
/* compiled from: PG */
final class C120951g extends C69572j implements C69630p {

    /* renamed from: a */
    int f336278a;

    /* renamed from: b */
    final /* synthetic */ C120917am f336279b;

    /* renamed from: c */
    final /* synthetic */ C70862aj f336280c;

    /* renamed from: d */
    final /* synthetic */ int f336281d;

    /* renamed from: e */
    final /* synthetic */ C52896c f336282e;

    /* renamed from: f */
    private /* synthetic */ Object f336283f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120951g(C120917am amVar, C70862aj ajVar, int i, C52896c cVar, C69577g gVar) {
        super(2, gVar);
        this.f336279b = amVar;
        this.f336280c = ajVar;
        this.f336281d = i;
        this.f336282e = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120951g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f336278a == 0) {
            C69714l.m101134b(obj);
            C120917am amVar = this.f336279b;
            C71548cy cyVar = amVar.f336185f;
            C120950f fVar = new C120950f(this.f336280c, this.f336281d, amVar, (C71422aw) this.f336283f, this.f336282e);
            this.f336278a = 1;
            if (cyVar.mo38165mp(fVar, this) == aVar) {
                return aVar;
            }
        } else {
            C69714l.m101134b(obj);
        }
        throw new C69596e();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120951g gVar2 = new C120951g(this.f336279b, this.f336280c, this.f336281d, this.f336282e, gVar);
        gVar2.f336283f = obj;
        return gVar2;
    }
}
