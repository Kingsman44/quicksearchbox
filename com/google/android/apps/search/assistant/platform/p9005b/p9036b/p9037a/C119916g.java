package com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a;

import com.google.android.apps.search.assistant.platform.p9080f.p9120k.C120779b;
import com.google.android.apps.search.assistant.platform.p9080f.p9120k.C120782c;
import com.google.android.libraries.search.assistant.p2585i.p2586a.C33477a;
import com.google.assistant.p3897e.p3921j.C51714bl;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C51771cx;
import com.google.assistant.p3897e.p3921j.C51772cy;
import com.google.assistant.p3897e.p3921j.C51786db;
import com.google.assistant.p3897e.p3921j.C51787dc;
import com.google.assistant.p3897e.p3921j.C52413qv;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.assistant.p3897e.p3921j.akn;
import com.google.assistant.p3897e.p3921j.amb;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Optional;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.conversation.context.impl.ContextController$fetchConversationParams$capabilitiesParam$1", mo61344c = "ContextController.kt", mo61345d = "invokeSuspend", mo61346e = {192, 195})
/* renamed from: com.google.android.apps.search.assistant.platform.b.b.a.g */
/* compiled from: PG */
final class C119916g extends C69572j implements C69630p {

    /* renamed from: a */
    int f333945a;

    /* renamed from: b */
    final /* synthetic */ C119927r f333946b;

    /* renamed from: c */
    final /* synthetic */ C52428rj f333947c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119916g(C119927r rVar, C52428rj rjVar, C69577g gVar) {
        super(2, gVar);
        this.f333946b = rVar;
        this.f333947c = rjVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C119916g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C58485gu guVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f333945a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C60870cx a = this.f333946b.f333996f.mo104931a();
            this.f333945a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            guVar = (C58485gu) obj;
            C52428rj rjVar = this.f333947c;
            C51714bl blVar = (C51714bl) C51715bm.f135662t.createBuilder();
            C69664n.m101060f(blVar, "newBuilder()");
            C52413qv a2 = C69664n.m101061g(blVar, "builder");
            a2.mo53861c(rjVar);
            C51771cx cxVar = (C51771cx) C51772cy.f135824p.createBuilder();
            C69664n.m101060f(cxVar, "newBuilder()");
            akn a3 = C69664n.m101061g(cxVar, "builder");
            List unmodifiableList = Collections.unmodifiableList(((C51772cy) a3.f135278a.instance).f135827b);
            C69664n.m101060f(unmodifiableList, "_builder.getSupportedClientOpList()");
            new C62883b(unmodifiableList);
            C69664n.m101060f(guVar, "clientOps");
            C69664n.m101061g(guVar, "values");
            a3.f135278a.mo53723b(guVar);
            C51786db dbVar = (C51786db) C51787dc.f135881c.createBuilder();
            C69664n.m101060f(dbVar, "newBuilder()");
            amb a4 = C69664n.m101061g(dbVar, "builder");
            a4.mo53702b();
            a3.mo53693c(a4.mo53701a());
            a2.mo53862d(a3.mo53691a());
            a2.mo53863e("OPA_AGSA");
            return C33477a.f89593b.mo38881b(a2.mo53859a());
        } else {
            C69714l.m101134b(obj);
        }
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            C60870cx d = ((C120782c) optional.get()).mo104928d();
            C69664n.m101060f(d, "opaHandoverControllerOpt…et().supportedClientOps()");
            this.f333945a = 2;
            obj = C71663i.m104690c(d, this);
            if (obj == aVar) {
                return aVar;
            }
            guVar = (C58485gu) obj;
            C52428rj rjVar2 = this.f333947c;
            C51714bl blVar2 = (C51714bl) C51715bm.f135662t.createBuilder();
            C69664n.m101060f(blVar2, "newBuilder()");
            C52413qv a22 = C69664n.m101061g(blVar2, "builder");
            a22.mo53861c(rjVar2);
            C51771cx cxVar2 = (C51771cx) C51772cy.f135824p.createBuilder();
            C69664n.m101060f(cxVar2, "newBuilder()");
            akn a32 = C69664n.m101061g(cxVar2, "builder");
            List unmodifiableList2 = Collections.unmodifiableList(((C51772cy) a32.f135278a.instance).f135827b);
            C69664n.m101060f(unmodifiableList2, "_builder.getSupportedClientOpList()");
            new C62883b(unmodifiableList2);
            C69664n.m101060f(guVar, "clientOps");
            C69664n.m101061g(guVar, "values");
            a32.f135278a.mo53723b(guVar);
            C51786db dbVar2 = (C51786db) C51787dc.f135881c.createBuilder();
            C69664n.m101060f(dbVar2, "newBuilder()");
            amb a42 = C69664n.m101061g(dbVar2, "builder");
            a42.mo53702b();
            a32.mo53693c(a42.mo53701a());
            a22.mo53862d(a32.mo53691a());
            a22.mo53863e("OPA_AGSA");
            return C33477a.f89593b.mo38881b(a22.mo53859a());
        }
        guVar = C120779b.m199974a(this.f333946b.f333992b.mo104605c());
        C52428rj rjVar22 = this.f333947c;
        C51714bl blVar22 = (C51714bl) C51715bm.f135662t.createBuilder();
        C69664n.m101060f(blVar22, "newBuilder()");
        C52413qv a222 = C69664n.m101061g(blVar22, "builder");
        a222.mo53861c(rjVar22);
        C51771cx cxVar22 = (C51771cx) C51772cy.f135824p.createBuilder();
        C69664n.m101060f(cxVar22, "newBuilder()");
        akn a322 = C69664n.m101061g(cxVar22, "builder");
        List unmodifiableList22 = Collections.unmodifiableList(((C51772cy) a322.f135278a.instance).f135827b);
        C69664n.m101060f(unmodifiableList22, "_builder.getSupportedClientOpList()");
        new C62883b(unmodifiableList22);
        C69664n.m101060f(guVar, "clientOps");
        C69664n.m101061g(guVar, "values");
        a322.f135278a.mo53723b(guVar);
        C51786db dbVar22 = (C51786db) C51787dc.f135881c.createBuilder();
        C69664n.m101060f(dbVar22, "newBuilder()");
        amb a422 = C69664n.m101061g(dbVar22, "builder");
        a422.mo53702b();
        a322.mo53693c(a422.mo53701a());
        a222.mo53862d(a322.mo53691a());
        a222.mo53863e("OPA_AGSA");
        return C33477a.f89593b.mo38881b(a222.mo53859a());
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C119916g(this.f333946b, this.f333947c, gVar);
    }
}
