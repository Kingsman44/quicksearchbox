package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.assistant.p3897e.p3917i.p3918a.C51602nu;
import com.google.assistant.p3897e.p3917i.p3918a.C51605nx;
import com.google.assistant.p3897e.p3917i.p3918a.C51606ny;
import com.google.assistant.p3897e.p3917i.p3918a.C51609oa;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.speech.p5218j.p5219a.C66707ak;
import java.util.ArrayList;
import java.util.Iterator;
import p3186j$.util.Optional;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.a.ap */
/* compiled from: PG */
public final class C32279ap {
    /* renamed from: a */
    public static final C66707ak m60056a(C51606ny nyVar) {
        C62971cq<C51602nu> cqVar = nyVar.f134500b;
        C69664n.m101060f(cqVar, "topContacts.topContactsList");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(cqVar, 10));
        for (C51602nu nuVar : cqVar) {
            String str = nuVar.f134487b;
            C69664n.m101060f(str, "contact.name");
            arrayList.add(str);
        }
        return C32289j.m60072a("device-contacts", "$CONTACTS", arrayList);
    }

    /* renamed from: b */
    public static final C51606ny m60057b(C32849cq cqVar, Optional optional, C32801aw awVar) {
        C32806ba baVar;
        C32806ba baVar2;
        Object obj;
        try {
            if (awVar.f87980a == 1) {
                baVar2 = (C32806ba) awVar.f87981b;
            } else {
                baVar2 = C32806ba.f87988c;
            }
            C52230ka kaVar = baVar2.f87991b;
            if (kaVar == null) {
                kaVar = C52230ka.f137057d;
            }
            C69664n.m101060f(kaVar, "contextResult.conversationParamResult.value");
            C62971cq cqVar2 = ((C51609oa) C32280aq.f86505a.mo38880b(kaVar)).f134504a;
            C69664n.m101060f(cqVar2, "topContactParams.topContactListsList");
            Iterator it = cqVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C51605nx a = C51605nx.m86246a(((C51606ny) obj).f134501c);
                if (a == null) {
                    a = C51605nx.UNKNOWN;
                }
                if (a == C51605nx.AGGREGATED) {
                    break;
                }
            }
            C51606ny nyVar = (C51606ny) obj;
            if (nyVar == null) {
                C59052c cVar = (C59052c) C32280aq.f86506b.mo56226d();
                cVar.mo56378ag(C58975e.f156826a, "Sbcp");
                cVar.mo56379ah(new C59094n(52595));
                cVar.mo56386p("Missing AGGREGATED top contact list in the top contacts context. SessionToken: %s & RequestIId: %s");
            }
            return nyVar;
        } catch (C62974ct e) {
            C59052c cVar2 = (C59052c) C32280aq.f86506b.mo56226d();
            cVar2.mo56378ag(C58975e.f156826a, "Sbcp");
            C59052c cVar3 = (C59052c) cVar2.mo56382g(e);
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
            cVar3.mo56379ah(new C59094n(52596));
            cVar3.mo56359L("Top contact params unpacking failed for value %s. SessionToken: %s & RequestIId: %s", kaVar2, b, optional);
            return null;
        }
    }
}
