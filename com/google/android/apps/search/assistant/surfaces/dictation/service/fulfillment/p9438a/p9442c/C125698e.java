package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122459n;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125708c;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52077ej;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52082eo;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.protobuf.C62942bv;
import com.google.protos.p4985f.p5030q.C65189ew;
import com.google.protos.p4985f.p5030q.C65190ex;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.nlu.nlufservice.NlufServiceNluFulfillmentHandler$fulfill$2", mo61344c = "NlufServiceNluFulfillmentHandler.kt", mo61345d = "invokeSuspend", mo61346e = {115})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.c.e */
/* compiled from: PG */
public final class C125698e extends C69572j implements C69630p {

    /* renamed from: a */
    int f346439a;

    /* renamed from: b */
    final /* synthetic */ C125702i f346440b;

    /* renamed from: c */
    final /* synthetic */ C51805du f346441c;

    /* renamed from: d */
    final /* synthetic */ C125708c f346442d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125698e(C125702i iVar, C51805du duVar, C125708c cVar, C69577g gVar) {
        super(2, gVar);
        this.f346440b = iVar;
        this.f346441c = duVar;
        this.f346442d = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125698e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f346439a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C125702i iVar = this.f346440b;
            C51805du duVar = this.f346441c;
            C125708c cVar = this.f346442d;
            this.f346439a = 1;
            C122459n nVar = (C122459n) C122461p.f339487e.createBuilder();
            C65189ew ewVar = (C65189ew) C65190ex.f176421b.createBuilder();
            C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
            C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
            ejVar.copyOnWrite();
            C52078ek ekVar = (C52078ek) ejVar.instance;
            duVar.getClass();
            ekVar.f136675c = duVar;
            ekVar.f136674b = 5;
            eoVar.copyOnWrite();
            C52083ep epVar = (C52083ep) eoVar.instance;
            C52078ek ekVar2 = (C52078ek) ejVar.build();
            ekVar2.getClass();
            epVar.f136693c = ekVar2;
            epVar.f136692b = 3;
            ewVar.copyOnWrite();
            C65190ex exVar = (C65190ex) ewVar.instance;
            C52083ep epVar2 = (C52083ep) eoVar.build();
            epVar2.getClass();
            exVar.mo59350a();
            exVar.f176423a.add(epVar2);
            nVar.copyOnWrite();
            C122461p pVar = (C122461p) nVar.instance;
            C65190ex exVar2 = (C65190ex) ewVar.build();
            exVar2.getClass();
            pVar.f339491c = exVar2;
            pVar.f339490b = 2;
            C62942bv build = nVar.build();
            C69664n.m101060f(build, "newBuilder()\n        .se…       )\n        .build()");
            obj = iVar.mo107087a((C122461p) build, cVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125698e(this.f346440b, this.f346441c, this.f346442d, gVar);
    }
}
