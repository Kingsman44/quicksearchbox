package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90041ct;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107460a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107503d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107473al;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107474am;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107475an;
import com.google.android.libraries.assistant.p1528m.p1529a.C18431p;
import com.google.android.libraries.assistant.p1528m.p1530b.C18432a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3745ab.p3746a.C48177a;
import com.google.assistant.p3745ab.p3746a.C48178b;
import com.google.assistant.p3745ab.p3746a.C48179c;
import com.google.assistant.p3745ab.p3746a.C48185i;
import com.google.assistant.p3745ab.p3746a.C48186j;
import com.google.assistant.p3745ab.p3746a.C48194r;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.assistant.p3897e.p3921j.p3926e.C51842bc;
import com.google.assistant.p3897e.p3921j.p3926e.C51880cn;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import com.google.protos.p4816ai.p4818b.C63196b;
import com.google.speech.p5224k.p5225a.C67187ae;
import com.google.speech.p5224k.p5225a.C67190ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.ag */
/* compiled from: PG */
public final /* synthetic */ class C106008ag implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C106023av f295949a;

    /* renamed from: b */
    public final /* synthetic */ String f295950b;

    /* renamed from: c */
    public final /* synthetic */ boolean f295951c;

    /* renamed from: d */
    public final /* synthetic */ String f295952d;

    public /* synthetic */ C106008ag(C106023av avVar, String str, boolean z, String str2) {
        this.f295949a = avVar;
        this.f295950b = str;
        this.f295951c = z;
        this.f295952d = str2;
    }

    public final void run() {
        String str;
        C106023av avVar = this.f295949a;
        String str2 = this.f295950b;
        boolean z = this.f295951c;
        String str3 = this.f295952d;
        if (!((C106053i) avVar.f295980a.f296006d.mo56107c()).f296078h) {
            C106025ax axVar = avVar.f295980a;
            if (!axVar.f295984A && !axVar.f295987D) {
                ((C106053i) axVar.f296006d.mo56107c()).mo95272e();
                ((C106053i) avVar.f295980a.f296006d.mo56107c()).mo95274g();
                C106025ax axVar2 = avVar.f295980a;
                axVar2.f296025w = str2;
                axVar2.f296026x = z;
                C51880cn cnVar = axVar2.f296023u.f136087f;
                if (cnVar == null) {
                    cnVar = C51880cn.f136067c;
                }
                C67187ae aeVar = (C67187ae) C67190ah.f182619q.createBuilder();
                String str4 = cnVar.f136069a;
                aeVar.copyOnWrite();
                C67190ah ahVar = (C67190ah) aeVar.instance;
                str4.getClass();
                ahVar.f182622a |= 8192;
                ahVar.f182632k = str4;
                String str5 = cnVar.f136070b;
                aeVar.copyOnWrite();
                C67190ah ahVar2 = (C67190ah) aeVar.instance;
                str5.getClass();
                ahVar2.f182622a |= 16384;
                ahVar2.f182633l = str5;
                aeVar.copyOnWrite();
                C67190ah ahVar3 = (C67190ah) aeVar.instance;
                ahVar3.f182628g = 4;
                ahVar3.f182622a |= 128;
                if (!str3.contains("<speak>")) {
                    str = "<speak>" + str3 + "</speak>";
                } else {
                    str = str3;
                }
                boolean contains = str.contains("<mark");
                aeVar.copyOnWrite();
                C67190ah ahVar4 = (C67190ah) aeVar.instance;
                ahVar4.f182622a |= 2;
                ahVar4.f182626e = str;
                aeVar.copyOnWrite();
                C67190ah ahVar5 = (C67190ah) aeVar.instance;
                ahVar5.f182622a |= 33554432;
                ahVar5.f182636o = contains;
                C67190ah ahVar6 = (C67190ah) aeVar.build();
                C107474am amVar = (C107474am) C107475an.f299054e.createBuilder();
                amVar.copyOnWrite();
                C107475an anVar = (C107475an) amVar.instance;
                ahVar6.getClass();
                anVar.f299058c = ahVar6;
                anVar.f299057b = 2;
                C107503d dVar = (C107503d) C107504e.f299115c.createBuilder();
                C107502c cVar = C107502c.OPA_TEXT_TO_SPEECH;
                dVar.copyOnWrite();
                C107504e eVar = (C107504e) dVar.instance;
                eVar.f299118b = cVar.f299114n;
                eVar.f299117a |= 1;
                dVar.mo58885m(C107473al.f299053a, (C107475an) amVar.build());
                C88489j jVar = new C88489j(C87739bu.OPA_SESSION_CLIENT_EVENT);
                jVar.mo82014b(C107460a.f299029a, (C107504e) dVar.build());
                avVar.f295980a.f296011i.mo96219b(jVar.mo82013a());
                if (avVar.f295980a.f296013k.mo79746e(C90041ct.f248693f)) {
                    C106025ax axVar3 = avVar.f295980a;
                    C106030bb bbVar = axVar3.f296015m;
                    C51842bc bcVar = axVar3.f296024v;
                    String str6 = axVar3.f295985B;
                    if (C58837ba.m90859h(str6)) {
                        C59104x d = C106030bb.f296034a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "ImmersiveCanvasErrorLogger");
                        ((C59052c) ((C59052c) d).mo56372aa(24698)).mo56386p("conversationId is null or empty");
                        return;
                    }
                    C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar.copyOnWrite();
                    C60555uf ufVar = (C60555uf) tzVar.instance;
                    ufVar.f164093a |= 2;
                    ufVar.f164258m = 1576;
                    C48179c cVar2 = (C48179c) C48194r.f124712g.createBuilder();
                    C48177a aVar = (C48177a) C18432a.m35904a(bcVar).toBuilder();
                    C52431rm b = C52431rm.m86628b(bcVar.f136003d);
                    if (b == null) {
                        b = C52431rm.UNKNOWN;
                    }
                    aVar.copyOnWrite();
                    C48178b bVar = (C48178b) aVar.instance;
                    bVar.f124664d = b.f137633ah;
                    bVar.f124661a |= 8;
                    String str7 = bcVar.f136004e;
                    aVar.copyOnWrite();
                    C48178b bVar2 = (C48178b) aVar.instance;
                    str7.getClass();
                    bVar2.f124661a |= 16;
                    bVar2.f124665e = str7;
                    String str8 = bcVar.f136005f;
                    aVar.copyOnWrite();
                    C48178b bVar3 = (C48178b) aVar.instance;
                    str8.getClass();
                    bVar3.f124661a |= 64;
                    bVar3.f124667g = str8;
                    aVar.copyOnWrite();
                    C48178b bVar4 = (C48178b) aVar.instance;
                    str6.getClass();
                    bVar4.f124661a |= 32;
                    bVar4.f124666f = str6;
                    C48178b bVar5 = (C48178b) aVar.build();
                    cVar2.copyOnWrite();
                    C48194r rVar = (C48194r) cVar2.instance;
                    bVar5.getClass();
                    rVar.f124715b = bVar5;
                    rVar.f124714a |= 1;
                    C48185i iVar = (C48185i) C48186j.f124682e.createBuilder();
                    iVar.copyOnWrite();
                    C48186j jVar2 = (C48186j) iVar.instance;
                    jVar2.f124684a |= 1;
                    jVar2.f124685b = str3;
                    iVar.copyOnWrite();
                    C48186j jVar3 = (C48186j) iVar.instance;
                    jVar3.f124684a |= 2;
                    jVar3.f124686c = z;
                    C63042fg b2 = C62950b.m95471b(bbVar.f296038d);
                    iVar.copyOnWrite();
                    C48186j jVar4 = (C48186j) iVar.instance;
                    b2.getClass();
                    jVar4.f124687d = b2;
                    jVar4.f124684a |= 4;
                    C48186j jVar5 = (C48186j) iVar.build();
                    cVar2.copyOnWrite();
                    C48194r rVar2 = (C48194r) cVar2.instance;
                    jVar5.getClass();
                    rVar2.f124717d = jVar5;
                    rVar2.f124714a |= 16;
                    C48194r rVar3 = (C48194r) cVar2.build();
                    tzVar.copyOnWrite();
                    C60555uf ufVar2 = (C60555uf) tzVar.instance;
                    rVar3.getClass();
                    ufVar2.f164235cm = rVar3;
                    ufVar2.f164255j |= 8;
                    C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                    return;
                }
                return;
            }
        }
        ((C18431p) avVar.f295980a.f296005c.mo56107c()).mo23970m(str2, 4);
    }
}
