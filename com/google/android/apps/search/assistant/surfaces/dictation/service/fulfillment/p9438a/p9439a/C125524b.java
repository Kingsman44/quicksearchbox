package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9439a;

import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.nlu.easteregg.AppAndClInfo$clNumber$1", mo61344c = "AppAndClInfo.kt", mo61345d = "invokeSuspend", mo61346e = {31})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.a.b */
/* compiled from: PG */
final class C125524b extends C69572j implements C69626l {

    /* renamed from: a */
    int f346124a;

    /* renamed from: b */
    final /* synthetic */ C125526d f346125b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125524b(C125526d dVar, C69577g gVar) {
        super(1, gVar);
        this.f346125b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C125524b(this.f346125b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f346124a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69585o oVar = this.f346125b.f346130a;
            C125523a aVar2 = new C125523a((C69577g) null);
            this.f346124a = 1;
            obj = C71803m.m105040a(oVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
