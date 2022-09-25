package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9099b.p9100a;

import com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119937f;
import com.google.android.apps.search.assistant.platform.p9005b.p9039c.C119938a;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120811d;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120813f;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52380pp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import p3186j$.util.Optional;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.fulfillment.fluidactions.impl.FluidActionsFulfillmentControllerImpl$fulfill$1", mo61344c = "FluidActionsFulfillmentControllerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {60, 74})
/* renamed from: com.google.android.apps.search.assistant.platform.f.f.b.a.e */
/* compiled from: PG */
final class C120588e extends C69572j implements C69630p {

    /* renamed from: a */
    Object f335403a;

    /* renamed from: b */
    int f335404b;

    /* renamed from: c */
    final /* synthetic */ C120811d f335405c;

    /* renamed from: d */
    final /* synthetic */ C120590g f335406d;

    /* renamed from: e */
    private /* synthetic */ Object f335407e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120588e(C120811d dVar, C120590g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f335405c = dVar;
        this.f335406d = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120588e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C71422aw awVar;
        Object obj3;
        C120813f fVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f335404b;
        if (i == 0) {
            C69714l.m101134b(obj);
            C71422aw awVar2 = (C71422aw) this.f335407e;
            C120811d dVar = this.f335405c;
            if (dVar.f335967a == 2) {
                fVar = (C120813f) dVar.f335968b;
            } else {
                fVar = C120813f.f335969b;
            }
            Object obj4 = (C52083ep) fVar.f335971a.get(0);
            C69664n.m101060f(obj4, "request.singleShot.getInteractions(0)");
            C60870cx b = this.f335406d.f335413d.mo104563b(true);
            C69664n.m101060f(b, "contextProvider.fetchIni…BeSentToServer = */ true)");
            C71604be c = C71803m.m105042c(awVar2, (C69585o) null, (C71424ay) null, new C120584a(b, (C69577g) null), 3);
            c.mo62873s(new C120585b(b));
            this.f335407e = awVar2;
            this.f335403a = obj4;
            this.f335404b = 1;
            Object a = c.mo62825a(this);
            if (a == aVar) {
                return aVar;
            }
            Object obj5 = a;
            awVar = awVar2;
            obj = obj5;
            obj3 = obj4;
        } else if (i != 1) {
            obj2 = (C52083ep) this.f335407e;
            C69714l.m101134b(obj);
            Optional optional = (Optional) obj;
            C59052c cVar = (C59052c) C120590g.f335410a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceFulfill");
            cVar.mo56378ag(C119938a.f334011a, String.valueOf(((C52083ep) obj2).f136694d));
            cVar.mo56379ah(new C59094n(35513));
            cVar.mo56386p("Building fulfillment result for FluidAction");
            C69664n.m101060f(optional, "conversationDeltaOptional");
            return C120590g.m199745b(optional);
        } else {
            Object obj6 = this.f335403a;
            awVar = (C71422aw) this.f335407e;
            C69714l.m101134b(obj);
            obj3 = obj6;
        }
        C69664n.m101060f(obj, "awaitAsync { contextProv…rue) }\n          .await()");
        C52079el elVar = (C52079el) C52081en.f136679i.createBuilder();
        C69664n.m101060f(elVar, "newBuilder()");
        C52380pp a2 = C69664n.m101061g(elVar, "builder");
        a2.mo53846d();
        a2.mo53845c((C52083ep) obj3);
        C52091ex a3 = ((C119937f) obj).mo104571a();
        C69664n.m101060f(a3, "initialRequestContext.getConversationParams()");
        a2.mo53844b(a3);
        C52081en a4 = a2.mo53843a();
        C120590g gVar = this.f335406d;
        C60870cx a5 = gVar.f335415f.mo66637a(gVar.f335414e, gVar.f335411b).mo38429a(gVar.f335412c, a4);
        C69664n.m101060f(a5, "fluidActionsFulfillmentF…  .assist(context, delta)");
        C71604be c2 = C71803m.m105042c(awVar, (C69585o) null, (C71424ay) null, new C120586c(a5, (C69577g) null), 3);
        c2.mo62873s(new C120587d(a5));
        this.f335407e = obj3;
        this.f335403a = null;
        this.f335404b = 2;
        obj = c2.mo62825a(this);
        if (obj == aVar) {
            return aVar;
        }
        obj2 = obj3;
        Optional optional2 = (Optional) obj;
        C59052c cVar2 = (C59052c) C120590g.f335410a.mo56224b();
        cVar2.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceFulfill");
        cVar2.mo56378ag(C119938a.f334011a, String.valueOf(((C52083ep) obj2).f136694d));
        cVar2.mo56379ah(new C59094n(35513));
        cVar2.mo56386p("Building fulfillment result for FluidAction");
        C69664n.m101060f(optional2, "conversationDeltaOptional");
        return C120590g.m199745b(optional2);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120588e eVar = new C120588e(this.f335405c, this.f335406d, gVar);
        eVar.f335407e = obj;
        return eVar;
    }
}
