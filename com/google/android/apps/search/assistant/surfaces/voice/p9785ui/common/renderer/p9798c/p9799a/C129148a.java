package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9798c.p9799a;

import com.google.android.libraries.assistant.p1363c.p1386e.p1393b.C17269a;
import com.google.android.libraries.home.p1940a.p1941a.C23347d;
import com.google.android.libraries.home.p1940a.p1941a.C23348e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62971cq;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64302au;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64304aw;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64308b;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.smartdevicecontrol.dataservice.SmartDeviceDataService$deviceDataSource$1", mo61344c = "SmartDeviceDataService.kt", mo61345d = "invokeSuspend", mo61346e = {61})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.c.a.a */
/* compiled from: PG */
public final class C129148a extends C69572j implements C69626l {

    /* renamed from: a */
    Object f354770a;

    /* renamed from: b */
    Object f354771b;

    /* renamed from: c */
    int f354772c;

    /* renamed from: d */
    final /* synthetic */ C129152e f354773d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129148a(C129152e eVar, C69577g gVar) {
        super(1, gVar);
        this.f354773d = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C129148a(this.f354773d, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        C64302au auVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f354772c != 0) {
            obj3 = this.f354771b;
            Object obj4 = this.f354770a;
            C69714l.m101134b(obj);
            obj2 = obj4;
        } else {
            C69714l.m101134b(obj);
            C129152e eVar = this.f354773d;
            C23347d dVar = eVar.f354784d;
            C17269a aVar2 = eVar.f354782b;
            C64308b a = C23348e.m43784a(eVar.f354785e.keySet());
            if (a.f173876a == 2) {
                auVar = (C64302au) a.f173877b;
            } else {
                auVar = C64302au.f173853h;
            }
            C69664n.m101060f(auVar, "QueryCodec.createQueryRe….semanticExecutionRequest");
            C60870cx a2 = aVar2.mo23259a(auVar);
            this.f354770a = eVar;
            this.f354771b = dVar;
            this.f354772c = 1;
            Object c = C71663i.m104690c(a2, this);
            if (c == aVar) {
                return aVar;
            }
            obj3 = dVar;
            obj = c;
            obj2 = eVar;
        }
        C62971cq cqVar = ((C64304aw) obj).f173867a;
        C69664n.m101060f(cqVar, "explicitAutomationClient….targetObjectResponseList");
        ((C129152e) obj2).f354785e = ((C23347d) obj3).mo28842a(cqVar, this.f354773d.f354785e);
        return C69788q.f186170a;
    }
}
