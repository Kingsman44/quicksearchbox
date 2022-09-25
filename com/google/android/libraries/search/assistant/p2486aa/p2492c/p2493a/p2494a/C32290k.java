package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52380pp;
import com.google.assistant.p3897e.p3921j.C52382pr;
import com.google.assistant.p3897e.p3921j.adw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.a.k */
/* compiled from: PG */
public final class C32290k {
    /* renamed from: a */
    public static final C52081en m60078a(C32849cq cqVar, Optional optional, C32801aw awVar) {
        C32806ba baVar;
        C52230ka kaVar;
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(optional, "requestId");
        C69664n.m101061g(awVar, "contextResult");
        if (awVar.f87980a == 1) {
            baVar = (C32806ba) awVar.f87981b;
        } else {
            baVar = C32806ba.f87988c;
        }
        C69664n.m101060f(baVar, "contextResult.conversationParamResult");
        C69664n.m101061g(baVar, "<this>");
        if ((baVar.f87990a & 1) != 0) {
            kaVar = baVar.f87991b;
            if (kaVar == null) {
                kaVar = C52230ka.f137057d;
            }
        } else {
            kaVar = null;
        }
        if (kaVar == null) {
            C59052c cVar = (C59052c) C32291l.f86521a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "Sbcp");
            String b = C32941s.m60951b(cqVar);
            cVar.mo56379ah(new C59094n(52577));
            cVar.mo56354G("Provided conversation param result value is null. SessionToken: %s; RequestId: %s", b, optional);
            return null;
        }
        C52079el elVar = (C52079el) C52081en.f136679i.createBuilder();
        C69664n.m101060f(elVar, "newBuilder()");
        C52380pp a = C69664n.m101061g(elVar, "builder");
        C52090ew ewVar = (C52090ew) C52091ex.f136710b.createBuilder();
        C69664n.m101060f(ewVar, "newBuilder()");
        C52382pr a2 = C69664n.m101061g(ewVar, "builder");
        a2.mo53848b();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        C69664n.m101060f(kbVar, "newBuilder()");
        adw a3 = C69664n.m101061g(kbVar, "builder");
        a3.mo53680b("asst.dialog.state.params");
        a3.mo53681c(kaVar);
        a2.mo53849c(a3.mo53679a());
        a.mo53844b(a2.mo53847a());
        return a.mo53843a();
    }
}
