package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9259b.C122108a;
import kotlinx.coroutines.C71423ax;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.ondevice.fulfillment.client.impl.OnDeviceNluFulfillmentServiceClientImpl$processConversationStream$1", mo61344c = "OnDeviceNluFulfillmentServiceClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {50})
/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.ai */
/* compiled from: PG */
final class C122482ai extends C69572j implements C69630p {

    /* renamed from: a */
    int f339557a;

    /* renamed from: b */
    final /* synthetic */ C71587n f339558b;

    /* renamed from: c */
    final /* synthetic */ C122483aj f339559c;

    /* renamed from: d */
    final /* synthetic */ C122108a f339560d;

    /* renamed from: e */
    final /* synthetic */ C71389v f339561e;

    /* renamed from: f */
    private /* synthetic */ Object f339562f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122482ai(C71587n nVar, C122483aj ajVar, C122108a aVar, C71389v vVar, C69577g gVar) {
        super(2, gVar);
        this.f339558b = nVar;
        this.f339559c = ajVar;
        this.f339560d = aVar;
        this.f339561e = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C122482ai) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f339557a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C122481ah ahVar = new C122481ah(this.f339558b, (C71588o) this.f339562f, this.f339559c, this.f339560d, this.f339561e, (C69577g) null);
            this.f339557a = 1;
            if (C71423ax.m104196a(ahVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C122482ai aiVar = new C122482ai(this.f339558b, this.f339559c, this.f339560d, this.f339561e, gVar);
        aiVar.f339562f = obj;
        return aiVar;
    }
}
