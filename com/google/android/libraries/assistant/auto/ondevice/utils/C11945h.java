package com.google.android.libraries.assistant.auto.ondevice.utils;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protos.p4985f.p4988b.p4993d.C64769a;
import com.google.protos.p4985f.p4988b.p4993d.C64782b;
import com.google.protos.p4985f.p4988b.p4993d.C64783c;
import com.google.protos.p4985f.p4988b.p4993d.C64784d;
import com.google.protos.p4985f.p4988b.p4993d.C64785e;
import com.google.protos.p4985f.p4988b.p4993d.C64786f;
import com.google.protos.p4985f.p4988b.p4993d.C64787g;
import com.google.protos.p4985f.p4988b.p4993d.C64788h;
import com.google.protos.p4985f.p4988b.p4993d.C64789i;
import com.google.protos.p4985f.p4988b.p4993d.C64790j;
import com.google.protos.p4985f.p4988b.p4993d.C64791k;
import com.google.protos.p4985f.p4988b.p4993d.C64792l;
import com.google.protos.p4985f.p4988b.p4993d.C64794n;
import com.google.protos.p4985f.p4988b.p4993d.C64797q;
import com.google.protos.p4985f.p4988b.p4993d.C64799s;
import com.google.protos.p4985f.p4988b.p4993d.C64800t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.utils.h */
/* compiled from: PG */
public final class C11945h {

    /* renamed from: a */
    private static final C58974d f38380a = C58974d.m91134h("IntentStateUtils");

    /* renamed from: a */
    public static C64782b m27776a(C64782b bVar, String str, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C64790j jVar = (C64790j) C64791k.f175598d.createBuilder();
            C64787g gVar = (C64787g) C64788h.f175594c.createBuilder();
            gVar.copyOnWrite();
            C64788h hVar = (C64788h) gVar.instance;
            str2.getClass();
            hVar.f175596a = 4;
            hVar.f175597b = str2;
            jVar.copyOnWrite();
            C64791k kVar = (C64791k) jVar.instance;
            C64788h hVar2 = (C64788h) gVar.build();
            hVar2.getClass();
            kVar.f175601b = hVar2;
            kVar.f175600a |= 1;
            arrayList.add((C64791k) jVar.build());
        }
        return m27780e(m27790o(bVar, str, 2), str, arrayList);
    }

    /* renamed from: b */
    public static C64782b m27777b(C64782b bVar, String str, String str2, boolean z, Locale locale) {
        C64791k r = m27793r(bVar, str, str2, z, locale, false);
        if (r == null) {
            r = m27793r(bVar, str, str2, z, locale, true);
        }
        if (r == null) {
            return null;
        }
        C64788h hVar = r.f175601b;
        if (hVar == null) {
            hVar = C64788h.f175594c;
        }
        return m27782g(bVar, str, hVar.f175596a == 4 ? (String) hVar.f175597b : BuildConfig.FLAVOR);
    }

    /* renamed from: c */
    public static C64782b m27778c(String str, C58485gu guVar) {
        C64769a aVar = (C64769a) C64782b.f175579d.createBuilder();
        C64783c cVar = (C64783c) C64784d.f175584d.createBuilder();
        cVar.copyOnWrite();
        C64784d dVar = (C64784d) cVar.instance;
        dVar.f175586a |= 1;
        dVar.f175587b = str;
        ArrayList arrayList = new ArrayList();
        C58724pq pqVar = (C58724pq) guVar;
        int i = pqVar.f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            String str2 = (String) guVar.get(i2);
            C64785e eVar = (C64785e) C64786f.f175589d.createBuilder();
            eVar.copyOnWrite();
            C64786f fVar = (C64786f) eVar.instance;
            str2.getClass();
            fVar.f175591a |= 1;
            fVar.f175592b = str2;
            arrayList.add((C64786f) eVar.build());
        }
        cVar.mo59310a(arrayList);
        aVar.copyOnWrite();
        C64782b bVar = (C64782b) aVar.instance;
        C64784d dVar2 = (C64784d) cVar.build();
        dVar2.getClass();
        bVar.f175582b = dVar2;
        bVar.f175581a |= 2;
        C64789i iVar = (C64789i) C64800t.f175614b.createBuilder();
        HashMap hashMap = new HashMap();
        int i3 = pqVar.f156474d;
        for (int i4 = 0; i4 < i3; i4++) {
            C64792l lVar = (C64792l) C64794n.f175604e.createBuilder();
            lVar.copyOnWrite();
            C64794n nVar = (C64794n) lVar.instance;
            nVar.f175607b = 0;
            nVar.f175606a |= 8;
            lVar.copyOnWrite();
            C64794n nVar2 = (C64794n) lVar.instance;
            nVar2.f175608c = 0;
            nVar2.f175606a |= 16;
            hashMap.put((String) guVar.get(i4), (C64794n) lVar.build());
        }
        iVar.copyOnWrite();
        ((C64800t) iVar.instance).mo59313a().putAll(hashMap);
        aVar.copyOnWrite();
        C64782b bVar2 = (C64782b) aVar.instance;
        C64800t tVar = (C64800t) iVar.build();
        tVar.getClass();
        bVar2.f175583c = tVar;
        bVar2.f175581a |= 4;
        return (C64782b) aVar.build();
    }

    /* renamed from: d */
    public static C64782b m27779d(C64782b bVar, String str, int i) {
        List j = m27785j(bVar, str);
        if (j.size() <= i || i < 0) {
            ((C58970a) ((C58970a) f38380a.mo56225c()).mo56372aa(43891)).mo56393w("index out of bound. Candidates has size: %d while the ordinal is %d", j.size(), i);
            return null;
        }
        C64782b o = m27790o(bVar, str, 4);
        C64788h hVar = ((C64791k) j.get(i)).f175601b;
        if (hVar == null) {
            hVar = C64788h.f175594c;
        }
        return m27781f(o, str, hVar.f175596a == 4 ? (String) hVar.f175597b : BuildConfig.FLAVOR);
    }

    /* renamed from: e */
    public static C64782b m27780e(C64782b bVar, String str, List list) {
        C64800t tVar = bVar.f175583c;
        if (tVar == null) {
            tVar = C64800t.f175614b;
        }
        C62995dn dnVar = tVar.f175616a;
        if (dnVar.containsKey(str)) {
            C64792l lVar = (C64792l) ((C64794n) dnVar.get(str)).toBuilder();
            lVar.copyOnWrite();
            ((C64794n) lVar.instance).f175609d = C64794n.emptyProtobufList();
            lVar.copyOnWrite();
            C64794n nVar = (C64794n) lVar.instance;
            C62971cq cqVar = nVar.f175609d;
            if (!cqVar.mo58948c()) {
                nVar.f175609d = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) nVar.f175609d);
            C64794n nVar2 = (C64794n) lVar.build();
            C64769a aVar = (C64769a) bVar.toBuilder();
            C64800t tVar2 = bVar.f175583c;
            if (tVar2 == null) {
                tVar2 = C64800t.f175614b;
            }
            C64789i iVar = (C64789i) tVar2.toBuilder();
            iVar.mo59311a(str, nVar2);
            aVar.copyOnWrite();
            C64782b bVar2 = (C64782b) aVar.instance;
            C64800t tVar3 = (C64800t) iVar.build();
            tVar3.getClass();
            bVar2.f175583c = tVar3;
            bVar2.f175581a |= 4;
            return (C64782b) aVar.build();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public static C64782b m27781f(C64782b bVar, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        C64784d dVar = bVar.f175582b;
        if (dVar == null) {
            dVar = C64784d.f175584d;
        }
        for (C64786f fVar : dVar.f175588c) {
            if (fVar.f175592b.equals(str)) {
                C64785e eVar = (C64785e) fVar.toBuilder();
                C64787g gVar = (C64787g) C64788h.f175594c.createBuilder();
                gVar.copyOnWrite();
                C64788h hVar = (C64788h) gVar.instance;
                str2.getClass();
                hVar.f175596a = 4;
                hVar.f175597b = str2;
                eVar.copyOnWrite();
                C64786f fVar2 = (C64786f) eVar.instance;
                C64788h hVar2 = (C64788h) gVar.build();
                hVar2.getClass();
                fVar2.f175593c = hVar2;
                fVar2.f175591a |= 2;
                arrayList.add((C64786f) eVar.build());
            } else {
                arrayList.add(fVar);
            }
        }
        C64769a aVar = (C64769a) bVar.toBuilder();
        C64784d dVar2 = bVar.f175582b;
        if (dVar2 == null) {
            dVar2 = C64784d.f175584d;
        }
        C64783c cVar = (C64783c) dVar2.toBuilder();
        cVar.copyOnWrite();
        ((C64784d) cVar.instance).f175588c = C64784d.emptyProtobufList();
        cVar.mo59310a(arrayList);
        aVar.copyOnWrite();
        C64782b bVar2 = (C64782b) aVar.instance;
        C64784d dVar3 = (C64784d) cVar.build();
        dVar3.getClass();
        bVar2.f175582b = dVar3;
        bVar2.f175581a |= 2;
        return (C64782b) aVar.build();
    }

    /* renamed from: g */
    public static C64782b m27782g(C64782b bVar, String str, String str2) {
        return m27781f(m27790o(bVar, str, 4), str, str2);
    }

    /* renamed from: h */
    public static String m27783h(C64782b bVar, String str) {
        C64784d dVar = bVar.f175582b;
        if (dVar == null) {
            dVar = C64784d.f175584d;
        }
        Iterator it = dVar.f175588c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C64786f fVar = (C64786f) it.next();
            if (fVar.f175592b.equals(str)) {
                C64788h hVar = fVar.f175593c;
                if (hVar == null) {
                    hVar = C64788h.f175594c;
                }
                if (hVar.f175596a == 4) {
                    return (String) hVar.f175597b;
                }
            }
        }
        return BuildConfig.FLAVOR;
    }

    /* renamed from: i */
    public static String m27784i(C64782b bVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!m27788m(bVar, str)) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static List m27785j(C64782b bVar, String str) {
        C64800t tVar = bVar.f175583c;
        if (tVar == null) {
            tVar = C64800t.f175614b;
        }
        C62995dn dnVar = tVar.f175616a;
        if (dnVar.containsKey(str)) {
            return ((C64794n) dnVar.get(str)).f175609d;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: k */
    public static boolean m27786k(C64782b bVar, String str) {
        return m27791p(bVar, str) == 2;
    }

    /* renamed from: l */
    public static boolean m27787l(C64782b bVar, String str) {
        C64800t tVar = bVar.f175583c;
        if (tVar == null) {
            tVar = C64800t.f175614b;
        }
        str.getClass();
        C62995dn dnVar = tVar.f175616a;
        if (dnVar.containsKey(str)) {
            int a = C64797q.m96460a(((C64794n) dnVar.get(str)).f175607b);
            return a != 0 && a == 3;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: m */
    public static boolean m27788m(C64782b bVar, String str) {
        return m27791p(bVar, str) == 4;
    }

    /* renamed from: n */
    public static C64782b m27789n(C64782b bVar, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C64790j jVar = (C64790j) C64791k.f175598d.createBuilder();
            C64787g gVar = (C64787g) C64788h.f175594c.createBuilder();
            String str = (String) list.get(i);
            gVar.copyOnWrite();
            C64788h hVar = (C64788h) gVar.instance;
            str.getClass();
            hVar.f175596a = 4;
            hVar.f175597b = str;
            jVar.copyOnWrite();
            C64791k kVar = (C64791k) jVar.instance;
            C64788h hVar2 = (C64788h) gVar.build();
            hVar2.getClass();
            kVar.f175601b = hVar2;
            kVar.f175600a |= 1;
            jVar.mo59312a((String) list2.get(i));
            arrayList.add((C64791k) jVar.build());
        }
        return m27780e(m27790o(bVar, "contact_number", 2), "contact_number", arrayList);
    }

    /* renamed from: o */
    public static C64782b m27790o(C64782b bVar, String str, int i) {
        C64800t tVar = bVar.f175583c;
        if (tVar == null) {
            tVar = C64800t.f175614b;
        }
        C62995dn dnVar = tVar.f175616a;
        if (dnVar.containsKey(str)) {
            C64792l lVar = (C64792l) ((C64794n) dnVar.get(str)).toBuilder();
            lVar.copyOnWrite();
            C64794n nVar = (C64794n) lVar.instance;
            nVar.f175608c = i - 1;
            nVar.f175606a |= 16;
            C64794n nVar2 = (C64794n) lVar.build();
            C64769a aVar = (C64769a) bVar.toBuilder();
            C64800t tVar2 = bVar.f175583c;
            if (tVar2 == null) {
                tVar2 = C64800t.f175614b;
            }
            C64789i iVar = (C64789i) tVar2.toBuilder();
            iVar.mo59311a(str, nVar2);
            aVar.copyOnWrite();
            C64782b bVar2 = (C64782b) aVar.instance;
            C64800t tVar3 = (C64800t) iVar.build();
            tVar3.getClass();
            bVar2.f175583c = tVar3;
            bVar2.f175581a |= 4;
            return (C64782b) aVar.build();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: p */
    public static int m27791p(C64782b bVar, String str) {
        C64800t tVar = bVar.f175583c;
        if (tVar == null) {
            tVar = C64800t.f175614b;
        }
        str.getClass();
        C62995dn dnVar = tVar.f175616a;
        if (dnVar.containsKey(str)) {
            int a = C64799s.m96461a(((C64794n) dnVar.get(str)).f175608c);
            if (a == 0) {
                return 1;
            }
            return a;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: q */
    public static C64782b m27792q(C64782b bVar, String str) {
        C64800t tVar = bVar.f175583c;
        if (tVar == null) {
            tVar = C64800t.f175614b;
        }
        C62995dn dnVar = tVar.f175616a;
        if (dnVar.containsKey(str)) {
            C64792l lVar = (C64792l) ((C64794n) dnVar.get(str)).toBuilder();
            lVar.copyOnWrite();
            C64794n nVar = (C64794n) lVar.instance;
            nVar.f175607b = 2;
            nVar.f175606a |= 8;
            C64794n nVar2 = (C64794n) lVar.build();
            C64769a aVar = (C64769a) bVar.toBuilder();
            C64800t tVar2 = bVar.f175583c;
            if (tVar2 == null) {
                tVar2 = C64800t.f175614b;
            }
            C64789i iVar = (C64789i) tVar2.toBuilder();
            iVar.mo59311a(str, nVar2);
            aVar.copyOnWrite();
            C64782b bVar2 = (C64782b) aVar.instance;
            C64800t tVar3 = (C64800t) iVar.build();
            tVar3.getClass();
            bVar2.f175583c = tVar3;
            bVar2.f175581a |= 4;
            return (C64782b) aVar.build();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: r */
    private static C64791k m27793r(C64782b bVar, String str, String str2, boolean z, Locale locale, boolean z2) {
        boolean z3;
        boolean z4;
        int i = 0;
        C64791k kVar = null;
        for (C64791k kVar2 : m27785j(bVar, str)) {
            if (z) {
                Iterator it = kVar2.f175602c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str3 = (String) it.next();
                    if (z2) {
                        z4 = C11943f.m27774h(str3, str2, locale);
                        continue;
                    } else {
                        z4 = C11943f.m27773g(str3, str2, locale);
                        continue;
                    }
                    if (z4) {
                        break;
                    }
                }
            } else {
                String str4 = BuildConfig.FLAVOR;
                if (z2) {
                    C64788h hVar = kVar2.f175601b;
                    if (hVar == null) {
                        hVar = C64788h.f175594c;
                    }
                    if (hVar.f175596a == 4) {
                        str4 = (String) hVar.f175597b;
                    }
                    z3 = C11943f.m27774h(str4, str2, locale);
                } else {
                    C64788h hVar2 = kVar2.f175601b;
                    if (hVar2 == null) {
                        hVar2 = C64788h.f175594c;
                    }
                    if (hVar2.f175596a == 4) {
                        str4 = (String) hVar2.f175597b;
                    }
                    z3 = C11943f.m27773g(str4, str2, locale);
                }
                if (z3) {
                    i++;
                    kVar = kVar2;
                }
            }
            i++;
            kVar = kVar2;
        }
        if (i == 1) {
            return kVar;
        }
        ((C58970a) ((C58970a) f38380a.mo56226d()).mo56372aa(43892)).mo56396z("There is no unique matched candidate. The number of matched candidates is %d. Used partial match: %b", i, z2);
        return null;
    }
}
