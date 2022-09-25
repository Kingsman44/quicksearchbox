package com.google.android.apps.gsa.staticplugins.opa.promo.p8407a;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118837d;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.assistant.p4008y.p4011c.p4012a.C53630g;
import com.google.assistant.p4008y.p4013d.C53652d;
import com.google.assistant.p4008y.p4013d.C53655g;
import com.google.assistant.p4008y.p4013d.C53658j;
import com.google.assistant.p4008y.p4013d.p4014a.C53635d;
import com.google.assistant.p4008y.p4013d.p4014a.C53641j;
import com.google.assistant.p4008y.p4013d.p4014a.C53647p;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.a.s */
/* compiled from: PG */
public final /* synthetic */ class C109897s implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C109902x f306209a;

    /* renamed from: b */
    public final /* synthetic */ long f306210b;

    /* renamed from: c */
    public final /* synthetic */ C118831d f306211c;

    public /* synthetic */ C109897s(C109902x xVar, C118831d dVar, long j) {
        this.f306209a = xVar;
        this.f306211c = dVar;
        this.f306210b = j;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C109902x xVar = this.f306209a;
        C118831d dVar = this.f306211c;
        long j = this.f306210b;
        C53630g gVar = (C53630g) obj;
        xVar.f306225b.mo98224a();
        C58976aa aaVar = C58975e.f156826a;
        C118837d.m197250d(dVar, j);
        int i = gVar.f140760a;
        if (!((i & 2) == 0 || (i & 1) == 0)) {
            C53641j jVar = gVar.f140761b;
            if (jVar == null) {
                jVar = C53641j.f140781l;
            }
            int i2 = jVar.f140788f + jVar.f140789g;
            C53647p pVar = gVar.f140762c;
            if (pVar == null) {
                pVar = C53647p.f140802b;
            }
            if (pVar.f140804a < i2) {
                C59104x c = C109902x.f306224a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OpaAcqNotifRequestTask");
                ((C59052c) ((C59052c) c).mo56372aa(25482)).mo56386p("Invalid server response.");
                xVar.f306228e.mo77944g(C118569b.OPA_ACQUISITION_NOTIFICATION_SERVER_RPC_RESPONSE_VALID_COUNT, C118575h.OPA_ACQUISITION_NOTIFICATION).mo104025g(0);
                return;
            }
        }
        xVar.f306228e.mo77944g(C118569b.OPA_ACQUISITION_NOTIFICATION_SERVER_RPC_RESPONSE_VALID_COUNT, C118575h.OPA_ACQUISITION_NOTIFICATION).mo104025g(1);
        C109889k kVar = xVar.f306229f;
        C53655g gVar2 = (C53655g) C53658j.f140828i.createBuilder();
        gVar2.copyOnWrite();
        C53658j jVar2 = (C53658j) gVar2.instance;
        jVar2.f140835f = 7;
        jVar2.f140830a |= 2;
        C53658j jVar3 = (C53658j) gVar2.build();
        kVar.mo98223c(jVar3);
        kVar.mo98222b(jVar3, (String) null);
        C109889k kVar2 = xVar.f306229f;
        C60870cx h = C60922j.m93045h(((C108013bm) kVar2.f306189d.mo27525b()).mo96369z(), new C109875a(kVar2, gVar.f140763d), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        new C90873ag(h, kVar2.f306190e, "recordNotificationCampaign", C109880b.f306177a).mo85223a(C109881c.f306178a);
        if ((gVar.f140760a & 2) != 0) {
            C53647p pVar2 = gVar.f140762c;
            if (pVar2 == null) {
                pVar2 = C53647p.f140802b;
            }
            C118561t tVar = xVar.f306226c;
            C118522by byVar = C118522by.OPA_ACQUISITION_NOTIFICATION_REQUEST;
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328824d = 1;
            agVar.f328821a |= 4;
            long millis = TimeUnit.SECONDS.toMillis((long) pVar2.f140804a);
            afVar.copyOnWrite();
            C118472ag agVar2 = (C118472ag) afVar.instance;
            agVar2.f328821a |= 1;
            agVar2.f328822b = millis;
            tVar.mo103754e(byVar, (C118472ag) afVar.build());
        }
        if ((gVar.f140760a & 1) != 0) {
            C53641j jVar4 = gVar.f140761b;
            if (jVar4 == null) {
                jVar4 = C53641j.f140781l;
            }
            C118471af afVar2 = (C118471af) C118472ag.f328819i.createBuilder();
            C53652d dVar2 = jVar4.f140790h;
            if (dVar2 == null) {
                dVar2 = C53652d.f140817c;
            }
            if ((dVar2.f140819a & 1) != 0 && dVar2.f140820b) {
                afVar2.copyOnWrite();
                C118472ag agVar3 = (C118472ag) afVar2.instance;
                agVar3.f328824d = 1;
                agVar3.f328821a |= 4;
            }
            int i3 = jVar4.f140783a;
            if ((i3 & 16) == 0 || (i3 & 32) == 0) {
                xVar.f306228e.mo77944g(C118569b.OPA_ACQUISITION_NOTIFICATION_VALID_PAYLOAD_COUNT, C118575h.OPA_ACQUISITION_NOTIFICATION).mo104025g(0);
                C59104x c2 = C109902x.f306224a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "OpaAcqNotifRequestTask");
                ((C59052c) ((C59052c) c2).mo56372aa(25484)).mo56389s("Trigger is missing time constraints: %s", jVar4);
            } else {
                C118561t tVar2 = xVar.f306226c;
                C118522by byVar2 = C118522by.OPA_ACQUISITION_NOTIFICATION_RESPONSE;
                long millis2 = TimeUnit.SECONDS.toMillis((long) jVar4.f140788f);
                afVar2.copyOnWrite();
                C118472ag agVar4 = (C118472ag) afVar2.instance;
                agVar4.f328821a |= 1;
                agVar4.f328822b = millis2;
                long millis3 = TimeUnit.SECONDS.toMillis((long) jVar4.f140789g);
                afVar2.copyOnWrite();
                C118472ag agVar5 = (C118472ag) afVar2.instance;
                agVar5.f328821a |= 2;
                agVar5.f328823c = millis3;
                C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
                ajVar.mo58885m(C109879ad.f306176a, jVar4);
                afVar2.copyOnWrite();
                C118472ag agVar6 = (C118472ag) afVar2.instance;
                C118476ak akVar = (C118476ak) ajVar.build();
                akVar.getClass();
                agVar6.f328827g = akVar;
                agVar6.f328821a |= 32;
                tVar2.mo103754e(byVar2, (C118472ag) afVar2.build());
            }
        }
        if ((gVar.f140760a & 8) != 0) {
            C53635d dVar3 = gVar.f140764e;
            if (dVar3 == null) {
                dVar3 = C53635d.f140770c;
            }
            if ((dVar3.f140772a & 1) != 0 && dVar3.f140773b) {
                C109889k kVar3 = xVar.f306229f;
                new C90873ag(((C108013bm) kVar3.f306189d.mo27525b()).f300493i.mo96377f(5, 6, Collections.emptySet()), kVar3.f306190e, "deleteNotificationInteractionHistory", C109882d.f306179a).mo85223a(C109883e.f306180a);
            }
        }
    }
}
