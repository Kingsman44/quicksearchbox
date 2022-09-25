package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9259b.C122108a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71389v;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.ondevice.fulfillment.client.impl.OnDeviceNluFulfillmentServiceClientImpl$processConversationStream$1$1", mo61344c = "OnDeviceNluFulfillmentServiceClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {51})
/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.ah */
/* compiled from: PG */
final class C122481ah extends C69572j implements C69630p {

    /* renamed from: a */
    int f339550a;

    /* renamed from: b */
    final /* synthetic */ C71587n f339551b;

    /* renamed from: c */
    final /* synthetic */ C71588o f339552c;

    /* renamed from: d */
    final /* synthetic */ C122483aj f339553d;

    /* renamed from: e */
    final /* synthetic */ C122108a f339554e;

    /* renamed from: f */
    final /* synthetic */ C71389v f339555f;

    /* renamed from: g */
    private /* synthetic */ Object f339556g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122481ah(C71587n nVar, C71588o oVar, C122483aj ajVar, C122108a aVar, C71389v vVar, C69577g gVar) {
        super(2, gVar);
        this.f339551b = nVar;
        this.f339552c = oVar;
        this.f339553d = ajVar;
        this.f339554e = aVar;
        this.f339555f = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C122481ah) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f339550a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n nVar = this.f339551b;
            C122480ag agVar = new C122480ag((C71422aw) this.f339556g, this.f339552c, this.f339553d, this.f339554e, this.f339555f);
            this.f339550a = 1;
            if (nVar.mo38165mp(agVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C122481ah ahVar = new C122481ah(this.f339551b, this.f339552c, this.f339553d, this.f339554e, this.f339555f, gVar);
        ahVar.f339556g = obj;
        return ahVar;
    }
}
