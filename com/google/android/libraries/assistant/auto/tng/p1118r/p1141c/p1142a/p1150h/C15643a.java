package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1150h;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15671c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3910e.p3911a.C51190e;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.protos.p4850an.C63624h;
import com.google.protos.p4850an.p4855d.p4858c.C63498af;
import com.google.protos.p4850an.p4855d.p4858c.C63500ah;
import com.google.protos.p4883as.p4884a.C63775d;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.h.a */
/* compiled from: PG */
public final /* synthetic */ class C15643a implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C15646d f46759a;

    /* renamed from: b */
    public final /* synthetic */ C15666r f46760b;

    public /* synthetic */ C15643a(C15646d dVar, C15666r rVar) {
        this.f46759a = dVar;
        this.f46760b = rVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        String str;
        C63624h hVar;
        C52078ek ekVar;
        C52070ec ecVar;
        C15646d dVar = this.f46759a;
        C15666r rVar = this.f46760b;
        if (((Boolean) dVar.f46765c.mo17428b()).booleanValue()) {
            int b = rVar.mo22476b().mo22462b();
            int i = b - 1;
            if (b == 0) {
                throw null;
            } else if (i == 0) {
                C59104x b2 = C15646d.f46763a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "OpenAppFulfiller");
                ((C59052c) ((C59052c) b2).mo56372aa(46246)).mo56386p("Handling open app fulfillment through analyzer response");
                C63498af afVar = (C63498af) C15669a.m32464c(rVar.mo22476b().mo22461a(), C63498af.f171735f);
                if (afVar == null) {
                    return C60856cj.m92900i(C58836b.f156633a);
                }
                if (afVar.f171740d.size() == 0) {
                    return C60856cj.m92900i(C58836b.f156633a);
                }
                C63500ah ahVar = (C63500ah) afVar.f171740d.get(0);
                C63624h hVar2 = ahVar.f171758c;
                if (hVar2 == null) {
                    hVar2 = C63624h.f172070b;
                }
                if (hVar2.f172072a.size() > 0) {
                    C63624h hVar3 = ahVar.f171758c;
                    if (hVar3 == null) {
                        hVar3 = C63624h.f172070b;
                    }
                    str = ((C63775d) hVar3.f172072a.get(0)).f172521b;
                } else {
                    str = ahVar.f171756a;
                }
                return dVar.mo22459b(str, (String) null);
            } else if (i == 1) {
                C59104x b3 = C15646d.f46763a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "OpenAppFulfiller");
                ((C59052c) ((C59052c) b3).mo56372aa(46244)).mo56386p("Handling open app fulfillment through intent query");
                C58833ax e = new C15671c(rVar.mo22476b().mo22470d()).mo22500e("app");
                if (!e.mo56113h()) {
                    return C60856cj.m92900i(C58836b.f156633a);
                }
                C58833ax b4 = new C15671c(rVar.mo22476b().mo22470d()).mo22497b("app");
                if (b4.mo56113h()) {
                    C61748j jVar = ((C61746h) b4.mo56107c()).f166797e;
                    if (jVar == null) {
                        jVar = C61748j.f166800d;
                    }
                    if (jVar.f166802a == 15) {
                        hVar = (C63624h) jVar.f166803b;
                    } else {
                        hVar = C63624h.f172070b;
                    }
                    for (C63775d dVar2 : hVar.f172072a) {
                        if ((dVar2.f172520a & 4) != 0) {
                            return dVar.mo22459b((String) e.mo56107c(), dVar2.f172523d);
                        }
                    }
                }
                return dVar.mo22459b((String) e.mo56107c(), (String) null);
            } else if (i == 2) {
                C59104x b5 = C15646d.f46763a.mo56224b();
                b5.mo56378ag(C58975e.f156826a, "OpenAppFulfiller");
                ((C59052c) ((C59052c) b5).mo56372aa(46245)).mo56386p("Handling open app fulfillment through conversation delta");
                for (C52083ep epVar : rVar.mo22476b().mo22466c().f136684d) {
                    if (epVar.f136692b == 3) {
                        ekVar = (C52078ek) epVar.f136693c;
                    } else {
                        ekVar = C52078ek.f136671f;
                    }
                    if (ekVar.f136674b == 3) {
                        ecVar = (C52070ec) ekVar.f136675c;
                    } else {
                        ecVar = C52070ec.f136651d;
                    }
                    C52236kg kgVar = ecVar.f136654b;
                    if (kgVar == null) {
                        kgVar = C52236kg.f137089d;
                    }
                    C52235kf a = C52235kf.m86549a(kgVar.f137092b);
                    if (a == null) {
                        a = C52235kf.OK;
                    }
                    if (a != C52235kf.OK) {
                        return C60922j.m93044g(dVar.f46766d.mo20177a(R.string.punt_open_app), C47810es.m84963c(C15644b.f46761a), dVar.f46764b);
                    }
                }
                C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
                C52081en enVar = C52081en.f136679i;
                eVar.copyOnWrite();
                C51195j jVar2 = (C51195j) eVar.instance;
                enVar.getClass();
                jVar2.f133275j = enVar;
                jVar2.f133266a |= 128;
                return C60856cj.m92900i(C58833ax.m90834k((C51195j) eVar.build()));
            }
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }
}
