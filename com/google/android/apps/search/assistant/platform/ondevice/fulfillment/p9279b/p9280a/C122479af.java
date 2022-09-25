package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122443ch;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122093b;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122095d;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9259b.C122108a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71389v;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.ondevice.fulfillment.client.impl.OnDeviceNluFulfillmentServiceClientImpl$processConversationStream$1$1$1$1", mo61344c = "OnDeviceNluFulfillmentServiceClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {59, 60})
/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.af */
/* compiled from: PG */
final class C122479af extends C69572j implements C69630p {

    /* renamed from: a */
    int f339540a;

    /* renamed from: b */
    final /* synthetic */ C122483aj f339541b;

    /* renamed from: c */
    final /* synthetic */ C122108a f339542c;

    /* renamed from: d */
    final /* synthetic */ C122443ch f339543d;

    /* renamed from: e */
    final /* synthetic */ C71389v f339544e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122479af(C122483aj ajVar, C122108a aVar, C122443ch chVar, C71389v vVar, C69577g gVar) {
        super(2, gVar);
        this.f339541b = ajVar;
        this.f339542c = aVar;
        this.f339543d = chVar;
        this.f339544e = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C122479af) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C122093b bVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f339540a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C122483aj ajVar = this.f339541b;
            C122108a aVar2 = this.f339542c;
            C122443ch chVar = this.f339543d;
            if (chVar.f339447a == 2) {
                bVar = (C122093b) chVar.f339448b;
            } else {
                bVar = C122093b.f338729e;
            }
            C69664n.m101060f(bVar, "value.contextRequest");
            this.f339540a = 1;
            obj = ajVar.mo105640b(aVar2, bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        C71389v vVar = this.f339544e;
        this.f339540a = 2;
        if (vVar.mo62729v((C122095d) obj, this) == aVar) {
            return aVar;
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C122479af(this.f339541b, this.f339542c, this.f339543d, this.f339544e, gVar);
    }
}
