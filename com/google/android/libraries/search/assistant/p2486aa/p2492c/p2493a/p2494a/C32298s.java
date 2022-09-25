package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4813ah.p4814a.p4815a.C63175h;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;
import com.google.speech.p5218j.p5219a.C66714ar;
import com.google.speech.p5218j.p5219a.C66716at;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.a.s */
/* compiled from: PG */
final class C32298s {
    /* renamed from: a */
    public static final C66716at m60088a(C32849cq cqVar, Optional optional, C66714ar arVar, C32801aw awVar) {
        C32806ba baVar;
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(optional, "requestId");
        C69664n.m101061g(arVar, "featuresBuilder");
        C69664n.m101061g(awVar, "contextResult");
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(optional, "requestId");
        C69664n.m101061g(awVar, "contextResult");
        C63179l lVar = null;
        try {
            C33476a aVar = C32299t.f86526a;
            if (awVar.f87980a == 1) {
                baVar = (C32806ba) awVar.f87981b;
            } else {
                baVar = C32806ba.f87988c;
            }
            C52230ka kaVar = baVar.f87991b;
            if (kaVar == null) {
                kaVar = C52230ka.f137057d;
            }
            C51334dw dwVar = (C51334dw) aVar.mo38880b(kaVar);
            if ((dwVar.f133685a & 8192) != 0) {
                C63179l lVar2 = dwVar.f133700n;
                lVar = lVar2 == null ? C63179l.f170583h : lVar2;
            } else {
                C59052c cVar = (C59052c) C32299t.f86527b.mo56224b();
                cVar.mo56378ag(C58975e.f156826a, "Sbcp");
                String b = C32941s.m60951b(cqVar);
                cVar.mo56379ah(new C59094n(52586));
                cVar.mo56354G("Location is missing from the device properties. SessionToken: %s; RequestId: %s", b, optional);
            }
        } catch (C62974ct e) {
            C59052c cVar2 = (C59052c) C32299t.f86527b.mo56226d();
            cVar2.mo56378ag(C58975e.f156826a, "Sbcp");
            C59052c cVar3 = (C59052c) cVar2.mo56382g(e);
            String b2 = C32941s.m60951b(cqVar);
            cVar3.mo56379ah(new C59094n(52587));
            cVar3.mo56354G("Unpacking device properties failed. SessionToken: %s; RequestId: %s", b2, optional);
        }
        if (lVar != null) {
            C63175h hVar = lVar.f170589e;
            if (hVar == null) {
                hVar = C63175h.f170573d;
            }
            C32289j.m60076e(arVar, "latitude", ((float) hVar.f170576b) / 1.0E7f);
            C63175h hVar2 = lVar.f170589e;
            if (hVar2 == null) {
                hVar2 = C63175h.f170573d;
            }
            C32289j.m60076e(arVar, "longitude", ((float) hVar2.f170577c) / 1.0E7f);
        }
        C62942bv build = arVar.build();
        C69664n.m101060f(build, "featuresBuilder.build()");
        return (C66716at) build;
    }
}
