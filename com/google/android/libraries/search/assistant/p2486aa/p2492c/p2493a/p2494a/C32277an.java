package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51591nj;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import java.util.Collection;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.a.an */
/* compiled from: PG */
final class C32277an {
    /* renamed from: a */
    public static final boolean m60053a(C32849cq cqVar, Optional optional, C32801aw awVar) {
        C32806ba baVar;
        C32806ba baVar2;
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(optional, "requestId");
        C69664n.m101061g(awVar, "contextResult");
        try {
            C33476a aVar = C32278ao.f86503a;
            if (awVar.f87980a == 1) {
                baVar2 = (C32806ba) awVar.f87981b;
            } else {
                baVar2 = C32806ba.f87988c;
            }
            C52230ka kaVar = baVar2.f87991b;
            if (kaVar == null) {
                kaVar = C52230ka.f137057d;
            }
            C62971cq<C51592nk> cqVar2 = ((C51594nm) aVar.mo38880b(kaVar)).f134477b;
            C69664n.m101060f(cqVar2, "timerParams.timerList");
            if ((cqVar2 instanceof Collection) && cqVar2.isEmpty()) {
                return false;
            }
            for (C51592nk nkVar : cqVar2) {
                C51591nj a = C51591nj.m86227a(nkVar.f134468e);
                if (a == null) {
                    a = C51591nj.UNKNOWN_TIMER_STATUS;
                }
                if (a.equals(C51591nj.FIRING)) {
                    return true;
                }
            }
            return false;
        } catch (C62974ct e) {
            C59052c cVar = (C59052c) C32278ao.f86504b.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "Sbcp");
            C59052c cVar2 = (C59052c) cVar.mo56382g(e);
            if (awVar.f87980a == 1) {
                baVar = (C32806ba) awVar.f87981b;
            } else {
                baVar = C32806ba.f87988c;
            }
            C52230ka kaVar2 = baVar.f87991b;
            if (kaVar2 == null) {
                kaVar2 = C52230ka.f137057d;
            }
            String b = C32941s.m60951b(cqVar);
            cVar2.mo56379ah(new C59094n(52592));
            cVar2.mo56359L("Timer params unpacking failed for value %s. SessionToken: %s; RequestId: %s", kaVar2, b, optional);
            return false;
        }
    }
}
