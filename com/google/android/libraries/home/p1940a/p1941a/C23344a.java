package com.google.android.libraries.home.p1940a.p1941a;

import com.google.android.libraries.home.p1940a.p1942b.C23351a;
import com.google.android.libraries.home.p1940a.p1943c.C23404ag;
import com.google.android.libraries.home.p1940a.p1943c.C23410am;
import com.google.android.libraries.home.p1940a.p1943c.C23416as;
import com.google.android.libraries.home.p1940a.p1943c.C23419av;
import com.google.android.libraries.home.p1940a.p1943c.C23499c;
import com.google.android.libraries.home.p1940a.p1943c.C23553e;
import com.google.android.libraries.home.p1940a.p1943c.C23573et;
import com.google.android.libraries.home.p1940a.p1943c.C23574eu;
import com.google.assistant.p3897e.p3921j.p3926e.C52019hr;
import com.google.assistant.p3897e.p3921j.p3926e.C52026hy;
import com.google.common.p4522b.C58479go;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63037fb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p3186j$.util.Optional;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.a.a */
/* compiled from: PG */
public final class C23344a {
    /* renamed from: a */
    public static final C23404ag m43782a(C52026hy hyVar) {
        C23419av avVar;
        C69664n.m101061g(hyVar, "<this>");
        String str = hyVar.f136547b;
        C69664n.m101060f(str, "deviceId");
        C52019hr hrVar = hyVar.f136548c;
        if (hrVar == null) {
            hrVar = C52019hr.f136523g;
        }
        String str2 = hrVar.f136529e;
        C69664n.m101060f(str2, "deviceInfo.primaryName");
        Map map = C23419av.f64032a;
        C52019hr hrVar2 = hyVar.f136548c;
        if (hrVar2 == null) {
            hrVar2 = C52019hr.f136523g;
        }
        C62971cq cqVar = hrVar2.f136525a;
        C69664n.m101060f(cqVar, "deviceInfo.deviceTypesList");
        String str3 = (String) C69540x.m100821C(cqVar);
        if (str3 == null) {
            avVar = C23419av.UNKNOWN;
        } else {
            Object obj = C23419av.f64032a.get(str3);
            if (obj == null) {
                obj = C23419av.UNKNOWN;
            }
            avVar = (C23419av) obj;
        }
        C23419av avVar2 = avVar;
        C52019hr hrVar3 = hyVar.f136548c;
        if (hrVar3 == null) {
            hrVar3 = C52019hr.f136523g;
        }
        String str4 = hrVar3.f136527c;
        C69664n.m101060f(str4, "deviceInfo.agentId");
        C23499c cVar = new C23499c(str4);
        C52019hr hrVar4 = hyVar.f136548c;
        if (hrVar4 == null) {
            hrVar4 = C52019hr.f136523g;
        }
        C63037fb fbVar = hrVar4.f136528d;
        if (fbVar == null) {
            fbVar = C63037fb.f170144b;
        }
        C69664n.m101060f(fbVar, "deviceInfo.attributes");
        C69664n.m101061g(fbVar, "<this>");
        C23553e eVar = new C23553e(C23351a.m43787b(fbVar));
        C52019hr hrVar5 = hyVar.f136548c;
        if (hrVar5 == null) {
            hrVar5 = C52019hr.f136523g;
        }
        C62971cq<String> cqVar2 = hrVar5.f136526b;
        C69664n.m101060f(cqVar2, "deviceInfo.deviceTraitsList");
        Map map2 = C23574eu.f64530a;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(cqVar2, 10));
        for (String a : cqVar2) {
            arrayList.add(C23573et.m43993a(a));
        }
        C58528ij f = C58479go.m89814f(arrayList);
        int i = C23410am.f63978a;
        C52019hr hrVar6 = hyVar.f136548c;
        if (hrVar6 == null) {
            hrVar6 = C52019hr.f136523g;
        }
        String str5 = hrVar6.f136530f;
        C69664n.m101060f(str5, "deviceInfo.manufacturer");
        C69664n.m101061g(str5, "manufacturer");
        C23410am amVar = new C23410am(str5);
        C58733pz pzVar = C58733pz.f156496a;
        C69664n.m101060f(pzVar, "of()");
        Optional empty = Optional.empty();
        C69664n.m101060f(empty, "empty()");
        Optional empty2 = Optional.empty();
        C69664n.m101060f(empty2, "empty()");
        Optional empty3 = Optional.empty();
        C69664n.m101060f(empty3, "empty()");
        return new C23404ag(new C23416as(str, str2, avVar2, cVar, pzVar, empty, empty2, eVar, f, amVar, empty3), (Collection) C69496am.f185918a);
    }
}
