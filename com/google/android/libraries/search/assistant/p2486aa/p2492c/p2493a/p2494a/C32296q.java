package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51691as;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C51772cy;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.speech.p5218j.p5219a.C66707ak;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Optional;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.a.q */
/* compiled from: PG */
final class C32296q {
    /* renamed from: a */
    public static final C66707ak m60084a(Iterable iterable) {
        return C32289j.m60072a("app-names", "$APP", iterable);
    }

    /* renamed from: b */
    public static final List m60085b(C32849cq cqVar, Optional optional, C32801aw awVar) {
        C32806ba baVar;
        C32806ba baVar2;
        C51058ev evVar;
        C51058ev evVar2;
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(optional, "requestId");
        C69664n.m101061g(awVar, "contextResult");
        try {
            C33476a aVar = C32297r.f86524a;
            if (awVar.f87980a == 1) {
                baVar2 = (C32806ba) awVar.f87981b;
            } else {
                baVar2 = C32806ba.f87988c;
            }
            C52230ka kaVar = baVar2.f87991b;
            if (kaVar == null) {
                kaVar = C52230ka.f137057d;
            }
            C51715bm bmVar = (C51715bm) aVar.mo38880b(kaVar);
            C69664n.m101060f(bmVar, "deviceCapabilities");
            C69664n.m101061g(bmVar, "deviceCapabilities");
            C51772cy cyVar = bmVar.f135671h;
            if (cyVar == null) {
                cyVar = C51772cy.f135824p;
            }
            C62971cq cqVar2 = cyVar.f135829d;
            C69664n.m101060f(cqVar2, "deviceCapabilities.software.appCapabilitiesList");
            ArrayList<C51691as> arrayList = new ArrayList<>();
            for (Object next : cqVar2) {
                C51098gh ghVar = ((C51691as) next).f135613b;
                if (ghVar == null) {
                    ghVar = C51098gh.f133009e;
                }
                if (ghVar.f133012b == 1) {
                    evVar2 = (C51058ev) ghVar.f133013c;
                } else {
                    evVar2 = C51058ev.f132941o;
                }
                String str = evVar2.f132948f;
                C69664n.m101060f(str, "appCapabilities.provider…dAppInfo.localizedAppName");
                if (str.length() > 0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C69540x.m100804k(arrayList, 10));
            for (C51691as asVar : arrayList) {
                C51098gh ghVar2 = asVar.f135613b;
                if (ghVar2 == null) {
                    ghVar2 = C51098gh.f133009e;
                }
                if (ghVar2.f133012b == 1) {
                    evVar = (C51058ev) ghVar2.f133013c;
                } else {
                    evVar = C51058ev.f132941o;
                }
                arrayList2.add(evVar.f132948f);
            }
            return arrayList2;
        } catch (C62974ct e) {
            C59052c cVar = (C59052c) C32297r.f86525b.mo56226d();
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
            cVar2.mo56379ah(new C59094n(52583));
            cVar2.mo56359L("Device capabilities unpacking failed for value %s. SessionToken: %s; RequestId: %s", kaVar2, b, optional);
            return null;
        }
    }
}
