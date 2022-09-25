package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119829bx;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119937f;
import com.google.android.libraries.search.assistant.p2585i.p2586a.C33477a;
import com.google.android.libraries.search.integrations.p3013a.p3014a.C38487e;
import com.google.assistant.p3897e.p3910e.p3911a.C51188c;
import com.google.assistant.p3897e.p3910e.p3911a.C51189d;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51333dv;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61817j;
import com.google.knowledge.p4671b.C61818k;
import com.google.p4017at.p4060h.p4068b.p4069a.C54185b;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.speech.p5208h.C66615cm;
import java.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.m */
/* compiled from: PG */
final class C120371m {

    /* renamed from: a */
    public static final C58881cr f334866a = C58886cw.m90973a(C120370l.f334865a);

    /* renamed from: b */
    private static final C59071e f334867b = C59071e.m91332i("com.google.android.apps.search.assistant.platform.e.b.a.m");

    /* renamed from: a */
    static C51189d m199381a(C119937f fVar, Optional optional, C119829bx bxVar, C120243ca caVar, C66615cm cmVar) {
        C62971cq<C52232kc> cqVar = fVar.mo104571a().f136712a;
        C52090ew ewVar = (C52090ew) C52091ex.f136710b.createBuilder();
        for (C52232kc kcVar : cqVar) {
            if (!kcVar.f137065b.equals("asst.communication.top_contact")) {
                ewVar.mo53792e(kcVar);
            }
        }
        C62971cq<C52232kc> cqVar2 = ((C52091ex) ewVar.build()).f136712a;
        boolean z = bxVar.f333762e && cmVar.f181224b.size() == 0;
        C52090ew ewVar2 = (C52090ew) C52091ex.f136710b.createBuilder();
        try {
            C51303cs csVar = (C51303cs) ((C51334dw) C33477a.f89594c.mo38882c(cqVar2)).toBuilder();
            C120243ca caVar2 = C120243ca.ONLINE_ASR;
            int ordinal = caVar.ordinal();
            if (ordinal == 0) {
                csVar.copyOnWrite();
                C51334dw dwVar = (C51334dw) csVar.instance;
                dwVar.f133676R = 1;
                dwVar.f133688b |= 536870912;
            } else if (ordinal != 1) {
                csVar.copyOnWrite();
                C51334dw dwVar2 = (C51334dw) csVar.instance;
                dwVar2.f133676R = 0;
                dwVar2.f133688b |= 536870912;
            } else {
                csVar.copyOnWrite();
                C51334dw dwVar3 = (C51334dw) csVar.instance;
                dwVar3.f133676R = 2;
                dwVar3.f133688b |= 536870912;
            }
            if (z) {
                C51333dv dvVar = C51333dv.SIGNED_OUT;
                csVar.copyOnWrite();
                C51334dw dwVar4 = (C51334dw) csVar.instance;
                dwVar4.f133703q = dvVar.f133656g;
                dwVar4.f133685a |= C89885b.S3REQUEST_VALUE;
            }
            ewVar2.mo53792e(C33477a.f89594c.mo38881b((C51334dw) csVar.build()));
        } catch (C62974ct e) {
            C59104x d = f334867b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(34675)).mo56386p("#editDeviceProperties: could not parse entry for device properties!");
        }
        for (C52232kc kcVar2 : cqVar2) {
            if (!kcVar2.f137065b.equals(C33477a.f89594c.f89601a)) {
                ewVar2.mo53792e(kcVar2);
            }
        }
        C52091ex exVar = (C52091ex) ewVar2.build();
        C52079el elVar = (C52079el) C52081en.f136679i.createBuilder();
        elVar.copyOnWrite();
        C52081en enVar = (C52081en) elVar.instance;
        exVar.getClass();
        enVar.f136685e = exVar;
        enVar.f136681a |= 16;
        C51188c cVar = (C51188c) C51189d.f133247h.createBuilder();
        cVar.copyOnWrite();
        C51189d dVar = (C51189d) cVar.instance;
        C52081en enVar2 = (C52081en) elVar.build();
        enVar2.getClass();
        dVar.f133255g = enVar2;
        dVar.f133249a |= 64;
        Objects.requireNonNull(cVar);
        optional.ifPresent(new C120369k(cVar));
        return (C51189d) cVar.build();
    }

    /* renamed from: b */
    static Optional m199382b(Map map) {
        if (map.isEmpty()) {
            return Optional.empty();
        }
        C54185b bVar = (C54185b) C54188e.f142203f.createBuilder();
        bVar.mo54072a(map);
        C61818k kVar = (C61818k) ((C61817j) C61818k.f166999r.createBuilder()).build();
        bVar.copyOnWrite();
        C54188e eVar = (C54188e) bVar.instance;
        kVar.getClass();
        eVar.f142207c = kVar;
        eVar.f142205a |= 2;
        return Optional.m71637of((C54188e) bVar.build());
    }

    /* renamed from: c */
    static Optional m199383c(C119937f fVar) {
        return Optional.ofNullable((String) fVar.mo104572b().get("X-Client-Opt-In-Context"));
    }

    /* renamed from: d */
    static Optional m199384d(C119834cb cbVar) {
        return Optional.m71637of(cbVar.f333767a);
    }

    /* renamed from: e */
    static Optional m199385e(C119937f fVar) {
        return fVar.mo104573c();
    }

    /* renamed from: f */
    static Map m199386f(Map map) {
        C58490gz gzVar = new C58490gz(4);
        for (Map.Entry entry : map.entrySet()) {
            if (((Optional) entry.getValue()).isPresent()) {
                gzVar.mo55429h((String) entry.getKey(), (String) ((Optional) entry.getValue()).get());
            }
        }
        return gzVar.mo55427f(false);
    }

    /* renamed from: g */
    static C60870cx m199387g(C38487e eVar) {
        return eVar.mo41441a();
    }
}
