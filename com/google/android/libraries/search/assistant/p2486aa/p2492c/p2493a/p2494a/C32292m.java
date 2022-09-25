package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51379fn;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.knowledge.p4671b.C61790ai;
import com.google.knowledge.p4671b.C61814g;
import com.google.protobuf.C62974ct;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.a.m */
/* compiled from: PG */
final class C32292m {
    /* renamed from: a */
    public static final String m60081a(C32849cq cqVar, Optional optional, C32801aw awVar) {
        C32806ba baVar;
        C32806ba baVar2;
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(optional, "requestId");
        C69664n.m101061g(awVar, "contextResult");
        try {
            C33476a aVar = C32293n.f86522a;
            if (awVar.f87980a == 1) {
                baVar2 = (C32806ba) awVar.f87981b;
            } else {
                baVar2 = C32806ba.f87988c;
            }
            C52230ka kaVar = baVar2.f87991b;
            if (kaVar == null) {
                kaVar = C52230ka.f137057d;
            }
            C61790ai aiVar = ((C51379fn) aVar.mo38880b(kaVar)).f133817b;
            if (aiVar == null) {
                aiVar = C61790ai.f166898o;
            }
            C61814g gVar = aiVar.f166903d;
            if (gVar == null) {
                gVar = C61814g.f166984j;
            }
            return gVar.f166987b;
        } catch (C62974ct e) {
            C59052c cVar = (C59052c) C32293n.f86523b.mo56226d();
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
            cVar2.mo56379ah(new C59094n(52580));
            cVar2.mo56359L("Display context params unpacking failed for value %s. SessionToken: %s; RequestId: %s", kaVar2, b, optional);
            return null;
        }
    }
}
