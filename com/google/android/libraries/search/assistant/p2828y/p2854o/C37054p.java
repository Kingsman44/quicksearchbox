package com.google.android.libraries.search.assistant.p2828y.p2854o;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4535g.C59203do;
import com.google.p374ah.C7499a;
import com.google.p374ah.C7500b;
import com.google.p374ah.C7501c;
import com.google.p374ah.C7502d;
import com.google.p374ah.C7503e;
import com.google.p374ah.C7504f;
import com.google.p374ah.C7505g;
import com.google.p374ah.C7507i;
import com.google.p4433bz.p4434a.p4435a.p4436a.C57890a;
import com.google.p4433bz.p4434a.p4435a.p4436a.C57892c;
import com.google.p4433bz.p4434a.p4435a.p4436a.C57893d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protos.p4798af.C63153c;
import com.google.protos.p4798af.C63154d;
import com.google.protos.p4798af.C63158h;
import com.google.protos.p4985f.p5030q.p5032b.C65033ar;
import com.google.protos.p5129p.p5131b.C65768az;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.OptionalLong;

/* renamed from: com.google.android.libraries.search.assistant.y.o.p */
/* compiled from: PG */
final class C37054p {

    /* renamed from: a */
    private static final C58485gu f96531a = C58485gu.m89853v("Assistant", "Brightness", "Cast", "ColorSetting", "CommunicationCall", "CommunicationVideoCall", "OnOff", "TemperatureSetting");

    /* renamed from: a */
    public static C7502d m65779a(String str, C58485gu guVar) {
        C7501c cVar = (C7501c) C7502d.f24717d.createBuilder();
        C7499a aVar = (C7499a) C7500b.f24711d.createBuilder();
        aVar.copyOnWrite();
        C7500b bVar = (C7500b) aVar.instance;
        str.getClass();
        bVar.f24713a |= 2;
        bVar.f24715c = str;
        cVar.copyOnWrite();
        C7502d dVar = (C7502d) cVar.instance;
        C7500b bVar2 = (C7500b) aVar.build();
        bVar2.getClass();
        dVar.f24720b = bVar2;
        dVar.f24719a |= 1;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            cVar.mo16922a((C7507i) guVar.get(i2));
        }
        return (C7502d) cVar.build();
    }

    /* renamed from: b */
    public static Optional m65780b(C57893d dVar) {
        C7505g gVar = (C7505g) C7507i.f24728l.createBuilder();
        int a = C57892c.m88558a(dVar.f154859e);
        if (a == 0) {
            a = 1;
        }
        switch (a - 1) {
            case 0:
                gVar.copyOnWrite();
                C7507i iVar = (C7507i) gVar.instance;
                iVar.f24731b = 1;
                iVar.f24730a |= 1;
                C7499a aVar = (C7499a) C7500b.f24711d.createBuilder();
                String str = dVar.f154858d;
                aVar.copyOnWrite();
                C7500b bVar = (C7500b) aVar.instance;
                str.getClass();
                bVar.f24713a = 1 | bVar.f24713a;
                bVar.f24714b = str;
                gVar.copyOnWrite();
                C7507i iVar2 = (C7507i) gVar.instance;
                C7500b bVar2 = (C7500b) aVar.build();
                bVar2.getClass();
                iVar2.f24732c = bVar2;
                iVar2.f24730a |= 2;
                break;
            case 1:
                gVar.copyOnWrite();
                C7507i iVar3 = (C7507i) gVar.instance;
                iVar3.f24731b = 2;
                iVar3.f24730a = 1 | iVar3.f24730a;
                String str2 = dVar.f154858d;
                gVar.copyOnWrite();
                C7507i iVar4 = (C7507i) gVar.instance;
                str2.getClass();
                iVar4.f24730a |= 4;
                iVar4.f24733d = str2;
                String str3 = dVar.f154860f;
                gVar.copyOnWrite();
                C7507i iVar5 = (C7507i) gVar.instance;
                str3.getClass();
                iVar5.f24730a |= 64;
                iVar5.f24737h = str3;
                break;
            case 2:
                gVar.copyOnWrite();
                C7507i iVar6 = (C7507i) gVar.instance;
                iVar6.f24731b = 6;
                iVar6.f24730a = 1 | iVar6.f24730a;
                String str4 = dVar.f154858d;
                gVar.copyOnWrite();
                C7507i iVar7 = (C7507i) gVar.instance;
                str4.getClass();
                iVar7.f24730a |= 4;
                iVar7.f24733d = str4;
                break;
            case 3:
                gVar.copyOnWrite();
                C7507i iVar8 = (C7507i) gVar.instance;
                iVar8.f24731b = 7;
                iVar8.f24730a |= 1;
                if (dVar.f154858d.equals("true")) {
                    gVar.copyOnWrite();
                    C7507i iVar9 = (C7507i) gVar.instance;
                    iVar9.f24730a |= 8;
                    iVar9.f24734e = true;
                    break;
                } else if (dVar.f154858d.equals("false")) {
                    gVar.copyOnWrite();
                    C7507i iVar10 = (C7507i) gVar.instance;
                    iVar10.f24730a |= 8;
                    iVar10.f24734e = false;
                    break;
                } else {
                    return Optional.empty();
                }
            case 4:
                gVar.copyOnWrite();
                C7507i iVar11 = (C7507i) gVar.instance;
                iVar11.f24731b = 8;
                iVar11.f24730a = 1 | iVar11.f24730a;
                try {
                    long parseLong = Long.parseLong(dVar.f154858d);
                    gVar.copyOnWrite();
                    C7507i iVar12 = (C7507i) gVar.instance;
                    iVar12.f24730a |= 16;
                    iVar12.f24735f = parseLong;
                    break;
                } catch (NumberFormatException unused) {
                    return Optional.empty();
                }
            case 5:
                gVar.copyOnWrite();
                C7507i iVar13 = (C7507i) gVar.instance;
                iVar13.f24731b = 2;
                iVar13.f24730a = 1 | iVar13.f24730a;
                String str5 = dVar.f154858d;
                gVar.copyOnWrite();
                C7507i iVar14 = (C7507i) gVar.instance;
                str5.getClass();
                iVar14.f24730a |= 4;
                iVar14.f24733d = str5;
                break;
            case 6:
                gVar.copyOnWrite();
                C7507i iVar15 = (C7507i) gVar.instance;
                iVar15.f24731b = 5;
                iVar15.f24730a = 1 | iVar15.f24730a;
                String str6 = dVar.f154858d;
                gVar.copyOnWrite();
                C7507i iVar16 = (C7507i) gVar.instance;
                str6.getClass();
                iVar16.f24730a |= 4;
                iVar16.f24733d = str6;
                break;
            case 7:
                gVar.copyOnWrite();
                C7507i iVar17 = (C7507i) gVar.instance;
                iVar17.f24731b = 4;
                iVar17.f24730a = 1 | iVar17.f24730a;
                String str7 = dVar.f154858d;
                gVar.copyOnWrite();
                C7507i iVar18 = (C7507i) gVar.instance;
                str7.getClass();
                iVar18.f24730a |= 4;
                iVar18.f24733d = str7;
                break;
            case 8:
                gVar.copyOnWrite();
                C7507i iVar19 = (C7507i) gVar.instance;
                iVar19.f24731b = 9;
                iVar19.f24730a = 1 | iVar19.f24730a;
                try {
                    double parseDouble = Double.parseDouble(dVar.f154858d);
                    gVar.copyOnWrite();
                    C7507i iVar20 = (C7507i) gVar.instance;
                    iVar20.f24730a |= 32;
                    iVar20.f24736g = parseDouble;
                    break;
                } catch (NumberFormatException unused2) {
                    return Optional.empty();
                }
            case 9:
                gVar.copyOnWrite();
                C7507i iVar21 = (C7507i) gVar.instance;
                iVar21.f24731b = 11;
                iVar21.f24730a = 1 | iVar21.f24730a;
                C63088z E = C63088z.m96143E(dVar.f154858d);
                gVar.copyOnWrite();
                C7507i iVar22 = (C7507i) gVar.instance;
                iVar22.f24730a |= 4096;
                iVar22.f24739j = E;
                String str8 = dVar.f154861g;
                gVar.copyOnWrite();
                C7507i iVar23 = (C7507i) gVar.instance;
                str8.getClass();
                iVar23.f24730a |= 16384;
                iVar23.f24740k = str8;
                break;
            default:
                return Optional.empty();
        }
        return Optional.m71637of((C7507i) gVar.build());
    }

    /* renamed from: c */
    public static boolean m65781c(C57893d dVar, C57893d dVar2) {
        if (!dVar2.f154856b.isEmpty() && !dVar.f154856b.equals(dVar2.f154856b)) {
            return false;
        }
        if (!dVar2.f154857c.isEmpty() && !dVar.f154857c.equals(dVar2.f154857c)) {
            return false;
        }
        if (dVar2.f154858d.isEmpty() || dVar.f154858d.equals(dVar2.f154858d)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static C7507i m65782d(C37047i iVar, boolean z, int i) {
        if (i <= 0) {
            return m65790l();
        }
        C58480gp e = C58485gu.m89837e();
        C37051m mVar = new C37051m(iVar);
        Optional c = mVar.mo40595c();
        if (!c.isPresent()) {
            return m65790l();
        }
        C58485gu b = mVar.mo40594b((C37050l) c.get(), "/personal/affinity_relationship");
        int size = b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C58485gu b2 = mVar.mo40594b((C37050l) b.get(i2), "/personal/affinity_relationship/preferred_entity");
            int size2 = b2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C37050l lVar = (C37050l) b2.get(i3);
                if (((C58724pq) e.mo55394f()).f156474d >= i) {
                    break;
                }
                if (z) {
                    if (!lVar.mo40593c(m65785g("/type/object/type", "/music/artist"))) {
                    }
                } else if (lVar.mo40593c(m65785g("/type/object/type", "/music/artist"))) {
                }
                C58480gp e2 = C58485gu.m89837e();
                e2.mo55396h(lVar.mo40592b("/type/object/name", "name"));
                e2.mo55396h(lVar.mo40592b("/common/topic/alias", "name"));
                e.mo55395g(m65779a(lVar.f96528a, C58485gu.m89846n(m65789k(e2.mo55394f()))));
            }
        }
        return m65789k(e.mo55394f());
    }

    /* renamed from: e */
    public static C7507i m65783e(C37047i iVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        C7507i iVar2;
        C37051m mVar = new C37051m(iVar);
        Optional c = mVar.mo40595c();
        if (!c.isPresent()) {
            iVar2 = m65790l();
        } else {
            OptionalLong d = mVar.mo40596d();
            if (!d.isPresent()) {
                iVar2 = m65790l();
            } else {
                C58480gp e = C58485gu.m89837e();
                C58485gu b = mVar.mo40594b((C37050l) c.get(), "/personal/possessor/devices");
                int size = b.size();
                for (int i11 = 0; i11 < size; i11++) {
                    C37050l lVar = (C37050l) b.get(i11);
                    C58485gu guVar = f96531a;
                    int i12 = ((C58724pq) guVar).f156474d;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i12) {
                            break;
                        }
                        int i14 = i13 + 1;
                        if (lVar.mo40593c(m65785g("/personal/smart_device/trait", (String) guVar.get(i13)))) {
                            C58480gp e2 = C58485gu.m89837e();
                            e2.mo55396h(lVar.mo40592b("/personal/smart_device/trait", "trait"));
                            e2.mo55396h(m65787i(lVar));
                            e.mo55395g(m65789k(e2.mo55394f()));
                            break;
                        }
                        i13 = i14;
                    }
                }
                C58485gu f = e.mo55394f();
                C58480gp e3 = C58485gu.m89837e();
                e3.mo55395g(m65779a("/t/264trdfqc8605", f));
                e3.mo55396h(m65788j(mVar, "/personal/homegraph/room", d.getAsLong()));
                e3.mo55396h(m65788j(mVar, "/personal/homegraph/structure", d.getAsLong()));
                iVar2 = m65789k(e3.mo55394f());
            }
        }
        C58490gz gzVar = new C58490gz(4);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h("/personal/homegraph/room", Integer.valueOf(i));
        gzVar2.mo55429h("/personal/homegraph/structure", Integer.valueOf(i2));
        gzVar.mo55429h("type", gzVar2.mo55427f(false));
        C58490gz gzVar3 = new C58490gz(4);
        gzVar3.mo55429h("OnOff", Integer.valueOf(i3));
        gzVar3.mo55429h("Brightness", Integer.valueOf(i4));
        gzVar3.mo55429h("TemperatureSetting", Integer.valueOf(i5));
        gzVar3.mo55429h("ColorSetting", Integer.valueOf(i6));
        gzVar3.mo55429h("Assistant", Integer.valueOf(i7));
        gzVar3.mo55429h("Cast", Integer.valueOf(i8));
        gzVar3.mo55429h("CommunicationCall", Integer.valueOf(i9));
        gzVar3.mo55429h("CommunicationVideoCall", Integer.valueOf(i10));
        gzVar.mo55429h("trait", gzVar3.mo55427f(false));
        C58495hd f2 = gzVar.mo55427f(false);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        C58485gu guVar2 = f96531a;
        int i15 = ((C58724pq) guVar2).f156474d;
        for (int i16 = 0; i16 < i15; i16++) {
            hashMap.put((String) guVar2.get(i16), new ArrayList());
        }
        C7504f fVar = iVar2.f24738i;
        if (fVar == null) {
            fVar = C7504f.f24723b;
        }
        for (C7502d dVar : fVar.f24725a) {
            C7500b bVar = dVar.f24720b;
            if (bVar == null) {
                bVar = C7500b.f24711d;
            }
            if (!bVar.f24715c.equals("/t/264trdfqc8605")) {
                m65791m(dVar.f24721c, hashMap2, "type", false);
            } else {
                m65791m(dVar.f24721c, hashMap, "trait", true);
            }
        }
        C58480gp e4 = C58485gu.m89837e();
        e4.mo55396h(m65786h(hashMap, "trait", f2));
        e4.mo55396h(m65786h(hashMap2, "type", f2));
        return m65789k(e4.mo55394f());
    }

    /* renamed from: f */
    public static C7507i m65784f(C37047i iVar, String str, int i) {
        String str2;
        C58485gu guVar;
        int a;
        int i2 = i;
        if (i2 <= 0) {
            return m65790l();
        }
        C37051m mVar = new C37051m(iVar);
        OptionalLong d = mVar.mo40596d();
        if (!d.isPresent()) {
            return m65790l();
        }
        C65033ar b = mVar.f96530a.mo40590b(d.getAsLong());
        Iterator it = b.f176113a.iterator();
        while (true) {
            if (!it.hasNext()) {
                str2 = null;
                break;
            }
            try {
                C37050l a2 = C37051m.m65771a((C65768az) it.next());
                if (a2.mo40593c(m65785g("/common/collection/collection_hrid", "/collection/people"))) {
                    str2 = a2.f96528a;
                    break;
                }
            } catch (C62974ct e) {
                throw new IllegalStateException(e);
            }
        }
        if (str2 == null) {
            guVar = C58485gu.m89845m();
        } else {
            C58480gp e2 = C58485gu.m89837e();
            for (C65768az a3 : b.f176113a) {
                try {
                    C37050l a4 = C37051m.m65771a(a3);
                    if (a4.mo40593c(m65785g("/common/topic/collection", str2))) {
                        e2.mo55395g(a4);
                    }
                } catch (C62974ct e3) {
                    throw new IllegalStateException(e3);
                }
            }
            guVar = e2.mo55394f();
        }
        C58480gp e4 = C58485gu.m89837e();
        int i3 = ((C58724pq) guVar).f156474d;
        for (int i4 = 0; i4 < i3; i4++) {
            C37050l lVar = (C37050l) guVar.get(i4);
            if ("/t/264trdfqc8605".equals(lVar.f96528a)) {
                String str3 = str;
            } else {
                C58480gp e5 = C58485gu.m89837e();
                double d2 = 0.0d;
                for (C57893d dVar : lVar.f96529b.f154865a) {
                    if ((dVar.f154855a & 4) == 0) {
                        String str4 = str;
                    } else if (dVar.f154857c.equals(str) && (a = C57892c.m88558a(dVar.f154859e)) != 0 && a == 9) {
                        Optional b2 = m65780b(dVar);
                        if (b2.isPresent()) {
                            d2 = Math.max(d2, ((C7507i) b2.get()).f24736g);
                            e5.mo55395g(m65779a("affinity", C58485gu.m89846n((C7507i) b2.get())));
                        }
                    }
                }
                String str5 = str;
                C37040b bVar = new C37040b(d2, e5.mo55394f());
                if (bVar.f96482a > C59203do.f157270a) {
                    C58480gp e6 = C58485gu.m89837e();
                    e6.mo55396h(bVar.f96483b);
                    e6.mo55396h(lVar.mo40592b("/type/object/name", "full_name"));
                    e6.mo55396h(lVar.mo40592b("/people/pkg_person/given_name", "given_name"));
                    e6.mo55396h(lVar.mo40592b("/people/pkg_person/family_name", "family_name"));
                    e6.mo55396h(lVar.mo40592b("/common/topic/alias", "alias_name"));
                    e4.mo55395g(new C37023a(bVar.f96482a, m65779a(lVar.f96528a, C58485gu.m89846n(m65789k(e6.mo55394f())))));
                }
            }
        }
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(e4.mo55394f()).sorted(Comparator.EL.reversed(Comparator.CC.comparingDouble(C37049k.f96527a))).limit((long) i2).collect(C58370cn.f155946a);
        C7503e eVar = (C7503e) C7504f.f24723b.createBuilder();
        int size = guVar2.size();
        for (int i5 = 0; i5 < size; i5++) {
            eVar.mo16923a(((C37052n) guVar2.get(i5)).mo40539b());
        }
        C7505g gVar = (C7505g) C7507i.f24728l.createBuilder();
        gVar.copyOnWrite();
        C7507i iVar2 = (C7507i) gVar.instance;
        iVar2.f24731b = 10;
        iVar2.f24730a |= 1;
        gVar.copyOnWrite();
        C7507i iVar3 = (C7507i) gVar.instance;
        C7504f fVar = (C7504f) eVar.build();
        fVar.getClass();
        iVar3.f24738i = fVar;
        iVar3.f24730a |= 128;
        return (C7507i) gVar.build();
    }

    /* renamed from: g */
    public static C57893d m65785g(String str, String str2) {
        C57890a aVar = (C57890a) C57893d.f154853h.createBuilder();
        aVar.copyOnWrite();
        C57893d dVar = (C57893d) aVar.instance;
        dVar.f154855a |= 1;
        dVar.f154856b = BuildConfig.FLAVOR;
        aVar.copyOnWrite();
        C57893d dVar2 = (C57893d) aVar.instance;
        dVar2.f154855a |= 2;
        dVar2.f154857c = str;
        aVar.copyOnWrite();
        C57893d dVar3 = (C57893d) aVar.instance;
        str2.getClass();
        dVar3.f154855a |= 4;
        dVar3.f154858d = str2;
        return (C57893d) aVar.build();
    }

    /* renamed from: h */
    private static C58485gu m65786h(Map map, String str, C58495hd hdVar) {
        C58480gp e = C58485gu.m89837e();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            int intValue = (!hdVar.containsKey(str) || !((C58495hd) hdVar.get(str)).containsKey(str2)) ? 0 : ((Integer) ((C58495hd) hdVar.get(str)).get(str2)).intValue();
            List list = (List) entry.getValue();
            C58526ih ihVar = new C58526ih();
            int i = 0;
            for (int i2 = 0; i2 < intValue; i2++) {
                Iterator it = list.iterator();
                boolean z = true;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C58485gu guVar = (C58485gu) it.next();
                    if (guVar.size() > i2) {
                        ihVar.mo55373c((String) guVar.get(i2));
                        i++;
                        if (i >= intValue) {
                            z = false;
                            break;
                        }
                        z = false;
                    }
                }
                if (z || i >= intValue) {
                    break;
                }
            }
            C58528ij f = ihVar.mo55486f();
            if (!f.isEmpty()) {
                C58480gp e2 = C58485gu.m89837e();
                C7505g gVar = (C7505g) C7507i.f24728l.createBuilder();
                gVar.copyOnWrite();
                C7507i iVar = (C7507i) gVar.instance;
                iVar.f24731b = 2;
                iVar.f24730a |= 1;
                String str3 = (String) entry.getKey();
                gVar.copyOnWrite();
                C7507i iVar2 = (C7507i) gVar.instance;
                str3.getClass();
                iVar2.f24730a |= 4;
                iVar2.f24733d = str3;
                e2.mo55395g(m65779a(str, C58485gu.m89846n((C7507i) gVar.build())));
                C58480gp e3 = C58485gu.m89837e();
                C58800sl lA = f.iterator();
                while (lA.hasNext()) {
                    String str4 = (String) lA.next();
                    C7505g gVar2 = (C7505g) C7507i.f24728l.createBuilder();
                    gVar2.copyOnWrite();
                    C7507i iVar3 = (C7507i) gVar2.instance;
                    iVar3.f24731b = 2;
                    iVar3.f24730a |= 1;
                    gVar2.copyOnWrite();
                    C7507i iVar4 = (C7507i) gVar2.instance;
                    str4.getClass();
                    iVar4.f24730a |= 4;
                    iVar4.f24733d = str4;
                    e3.mo55395g((C7507i) gVar2.build());
                }
                e2.mo55395g(m65779a("name_variant", e3.mo55394f()));
                C7501c cVar = (C7501c) C7502d.f24717d.createBuilder();
                cVar.mo16922a(m65789k(e2.mo55394f()));
                e.mo55395g((C7502d) cVar.build());
            }
        }
        return e.mo55394f();
    }

    /* renamed from: i */
    private static C58485gu m65787i(C37050l lVar) {
        C58480gp e = C58485gu.m89837e();
        C58485gu a = lVar.mo40591a(m65785g("/type/object/name_variant", BuildConfig.FLAVOR));
        int size = a.size();
        for (int i = 0; i < size; i++) {
            C57893d dVar = (C57893d) a.get(i);
            int a2 = C57892c.m88558a(dVar.f154859e);
            if (a2 != 0 && a2 == 11) {
                try {
                    for (C63153c cVar : ((C63154d) C62942bv.parseFrom((C62942bv) C63154d.f170534b, C63088z.m96143E(dVar.f154858d), C62921ba.m95368a())).f170536a) {
                        if (cVar.f170531a.equals("/common/name_variant/name")) {
                            for (C63158h hVar : cVar.f170532b) {
                                C7505g gVar = (C7505g) C7507i.f24728l.createBuilder();
                                gVar.copyOnWrite();
                                C7507i iVar = (C7507i) gVar.instance;
                                iVar.f24731b = 2;
                                iVar.f24730a |= 1;
                                String str = hVar.f170541a == 2 ? (String) hVar.f170542b : BuildConfig.FLAVOR;
                                gVar.copyOnWrite();
                                C7507i iVar2 = (C7507i) gVar.instance;
                                str.getClass();
                                iVar2.f24730a |= 4;
                                iVar2.f24733d = str;
                                String str2 = hVar.f170543c;
                                gVar.copyOnWrite();
                                C7507i iVar3 = (C7507i) gVar.instance;
                                str2.getClass();
                                iVar3.f24730a |= 64;
                                iVar3.f24737h = str2;
                                e.mo55395g(m65779a("name_variant", C58485gu.m89846n((C7507i) gVar.build())));
                            }
                        }
                    }
                } catch (C62974ct unused) {
                    return C58485gu.m89845m();
                }
            }
        }
        return e.mo55394f();
    }

    /* renamed from: j */
    private static C58485gu m65788j(C37051m mVar, String str, long j) {
        C58480gp e = C58485gu.m89837e();
        C65033ar b = mVar.f96530a.mo40590b(j);
        C58480gp e2 = C58485gu.m89837e();
        for (C65768az a : b.f176113a) {
            try {
                C37050l a2 = C37051m.m65771a(a);
                if (a2.mo40593c(m65785g("/type/object/type", str))) {
                    e2.mo55395g(a2);
                }
            } catch (C62974ct e3) {
                throw new IllegalStateException(e3);
            }
        }
        C58485gu f = e2.mo55394f();
        int i = ((C58724pq) f).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C37050l lVar = (C37050l) f.get(i2);
            C58480gp e4 = C58485gu.m89837e();
            e4.mo55396h(lVar.mo40592b("/type/object/type", "type"));
            e4.mo55396h(m65787i(lVar));
            e.mo55395g(m65779a(lVar.f96528a, C58485gu.m89846n(m65789k(e4.mo55394f()))));
        }
        return e.mo55394f();
    }

    /* renamed from: k */
    private static C7507i m65789k(C58485gu guVar) {
        C7503e eVar = (C7503e) C7504f.f24723b.createBuilder();
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            eVar.mo16923a((C7502d) guVar.get(i2));
        }
        C7505g gVar = (C7505g) C7507i.f24728l.createBuilder();
        gVar.copyOnWrite();
        C7507i iVar = (C7507i) gVar.instance;
        iVar.f24731b = 10;
        iVar.f24730a |= 1;
        gVar.copyOnWrite();
        C7507i iVar2 = (C7507i) gVar.instance;
        C7504f fVar = (C7504f) eVar.build();
        fVar.getClass();
        iVar2.f24738i = fVar;
        iVar2.f24730a |= 128;
        return (C7507i) gVar.build();
    }

    /* renamed from: l */
    private static C7507i m65790l() {
        C7505g gVar = (C7505g) C7507i.f24728l.createBuilder();
        gVar.copyOnWrite();
        C7507i iVar = (C7507i) gVar.instance;
        iVar.f24731b = 10;
        iVar.f24730a |= 1;
        return (C7507i) gVar.build();
    }

    /* renamed from: m */
    private static void m65791m(List list, Map map, String str, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7507i iVar = (C7507i) it.next();
            C58480gp e = C58485gu.m89837e();
            C7504f fVar = iVar.f24738i;
            if (fVar == null) {
                fVar = C7504f.f24723b;
            }
            for (C7502d dVar : fVar.f24725a) {
                C7500b bVar = dVar.f24720b;
                if (bVar == null) {
                    bVar = C7500b.f24711d;
                }
                if (bVar.f24715c.equals("name_variant")) {
                    for (C7507i iVar2 : dVar.f24721c) {
                        e.mo55395g(iVar2.f24733d);
                    }
                }
            }
            C58485gu f = e.mo55394f();
            C7504f fVar2 = iVar.f24738i;
            if (fVar2 == null) {
                fVar2 = C7504f.f24723b;
            }
            for (C7502d dVar2 : fVar2.f24725a) {
                C7500b bVar2 = dVar2.f24720b;
                if (bVar2 == null) {
                    bVar2 = C7500b.f24711d;
                }
                if (bVar2.f24715c.equals(str)) {
                    for (C7507i iVar3 : dVar2.f24721c) {
                        if (!z || map.containsKey(iVar3.f24733d)) {
                            int i = iVar3.f24730a;
                            if ((i & 4) != 0) {
                                String str2 = iVar3.f24733d;
                                Map.EL.putIfAbsent(map, str2, new ArrayList());
                                ((List) map.get(str2)).add(f);
                            } else if ((i & 2) != 0) {
                                C7500b bVar3 = iVar3.f24732c;
                                if (bVar3 == null) {
                                    bVar3 = C7500b.f24711d;
                                }
                                String str3 = bVar3.f24714b;
                                Map.EL.putIfAbsent(map, str3, new ArrayList());
                                ((List) map.get(str3)).add(f);
                            }
                        }
                    }
                }
            }
        }
    }
}
