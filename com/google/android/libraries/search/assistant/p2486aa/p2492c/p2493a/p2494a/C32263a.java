package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51419h;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import java.util.Collection;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.a.a */
/* compiled from: PG */
final class C32263a {
    /* renamed from: a */
    public static final boolean m60052a(C32849cq cqVar, Optional optional, C32801aw awVar) {
        C32806ba baVar;
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(optional, "requestId");
        C69664n.m101061g(awVar, "contextResult");
        try {
            C33476a aVar = C32281b.f86507a;
            if (awVar.f87980a == 1) {
                baVar = (C32806ba) awVar.f87981b;
            } else {
                baVar = C32806ba.f87988c;
            }
            C52230ka kaVar = baVar.f87991b;
            if (kaVar == null) {
                kaVar = C52230ka.f137057d;
            }
            C62971cq<C51473j> cqVar2 = ((C51527l) aVar.mo38880b(kaVar)).f134276b;
            C69664n.m101060f(cqVar2, "alarmParams.alarmList");
            if ((cqVar2 instanceof Collection) && cqVar2.isEmpty()) {
                return false;
            }
            for (C51473j jVar : cqVar2) {
                C51419h a = C51419h.m86180a(jVar.f134097f);
                if (a == null) {
                    a = C51419h.UNKNOWN_ALARM_STATUS;
                }
                if (a.equals(C51419h.FIRING)) {
                    return true;
                }
            }
            return false;
        } catch (C62974ct e) {
            C59052c cVar = (C59052c) C32281b.f86508b.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "Sbcp");
            C59052c cVar2 = (C59052c) cVar.mo56382g(e);
            String b = C32941s.m60951b(cqVar);
            cVar2.mo56379ah(new C59094n(52564));
            cVar2.mo56354G("Alarm params unpacking failed. SessionToken: %s; RequestId: %s.", b, optional);
            return false;
        }
    }
}
