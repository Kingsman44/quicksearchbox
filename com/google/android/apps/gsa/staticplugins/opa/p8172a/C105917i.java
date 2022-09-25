package com.google.android.apps.gsa.staticplugins.opa.p8172a;

import com.google.android.apps.gsa.search.core.p6491a.C84377w;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90066dr;
import com.google.android.libraries.gsa.conversation.p1855h.C22719w;
import com.google.android.libraries.gsa.conversation.p1855h.p1857b.C22698a;
import com.google.assistant.p3897e.p3908d.p3909a.C51174e;
import com.google.assistant.p3897e.p3908d.p3909a.C51175f;
import com.google.assistant.p3897e.p3908d.p3909a.C51178i;
import com.google.assistant.p3897e.p3908d.p3909a.C51180k;
import com.google.assistant.p3897e.p3908d.p3909a.C51181l;
import com.google.assistant.p3897e.p3908d.p3909a.C51182m;
import com.google.assistant.p3897e.p3908d.p3909a.C51183n;
import com.google.assistant.p3897e.p3917i.p3918a.C51271bn;
import com.google.assistant.p3897e.p3917i.p3918a.C51274bq;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52075eh;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52082eo;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.a.i */
/* compiled from: PG */
public final class C105917i implements C84377w {

    /* renamed from: a */
    private final C58485gu f295725a;

    /* renamed from: b */
    private final C68214a f295726b;

    public C105917i(C58485gu guVar, C68214a aVar) {
        this.f295725a = guVar;
        this.f295726b = aVar;
    }

    /* renamed from: b */
    private static C51175f m176491b(int i, List list) {
        C51174e eVar = (C51174e) C51175f.f133205f.createBuilder();
        eVar.copyOnWrite();
        C51175f fVar = (C51175f) eVar.instance;
        fVar.f133207a |= 1;
        fVar.f133208b = i;
        eVar.mo53530a(list);
        return (C51175f) eVar.build();
    }

    /* renamed from: c */
    private static C51181l m176492c(int i, C51180k kVar) {
        C51178i iVar = (C51178i) C51181l.f133221d.createBuilder();
        iVar.copyOnWrite();
        C51181l lVar = (C51181l) iVar.instance;
        lVar.f133224b = kVar.f133220f;
        lVar.f133223a |= 1;
        iVar.mo53543b(i);
        return (C51181l) iVar.build();
    }

    /* renamed from: a */
    public final C52081en mo77935a(C52081en enVar) {
        C51183n nVar;
        C51271bn bnVar;
        C58485gu guVar;
        HashSet hashSet;
        C52076ei eiVar;
        C52076ei eiVar2;
        C52081en enVar2 = enVar;
        C58976aa aaVar = C58975e.f156826a;
        if (!((C86124t) this.f295726b.mo27525b()).mo79746e(C90014bt.f247248da)) {
            return enVar2;
        }
        HashSet hashSet2 = new HashSet();
        C58485gu guVar2 = this.f295725a;
        int i = ((C58724pq) guVar2).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C105916h hVar = (C105916h) guVar2.get(i2);
            if (hVar.mo95178b(enVar2)) {
                hashSet2.add(hVar);
            }
        }
        if (hashSet2.isEmpty()) {
            return enVar2;
        }
        C22719w wVar = new C22719w();
        C52091ex exVar = enVar2.f136685e;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        wVar.mo27876c(exVar);
        C58833ax b = wVar.mo27875b(C51274bq.f133487i);
        int i3 = 0;
        for (C52083ep epVar : enVar2.f136684d) {
            int i4 = epVar.f136694d;
            if (i4 > i3) {
                i3 = i4;
            }
        }
        C105915g gVar = new C105915g(i3);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list = enVar2.f136684d;
        C58485gu guVar3 = this.f295725a;
        int i5 = ((C58724pq) guVar3).f156474d;
        int i6 = 0;
        boolean z = false;
        while (i6 < i5) {
            C105916h hVar2 = (C105916h) guVar3.get(i6);
            if (!hashSet2.contains(hVar2)) {
                hashSet = hashSet2;
                guVar = guVar3;
            } else {
                if (hVar2 instanceof C105909a) {
                    C105909a aVar = (C105909a) hVar2;
                    Iterator it = enVar2.f136684d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C52083ep epVar2 = (C52083ep) it.next();
                        hashSet = hashSet2;
                        guVar = guVar3;
                        if (epVar2.f136692b == 4) {
                            C51809dy dyVar = ((C52076ei) epVar2.f136693c).f136668c;
                            if (dyVar == null) {
                                dyVar = C51809dy.f135933f;
                            }
                            C58833ax a = C105909a.m176473a(dyVar);
                            if (a.mo56113h()) {
                                C51936ep epVar3 = C51936ep.DEFAULT;
                                C51936ep a2 = C51936ep.m86435a(((C51953ff) a.mo56107c()).f136323g);
                                if (a2 == null) {
                                    a2 = C51936ep.DEFAULT;
                                }
                                int ordinal = a2.ordinal();
                                if (ordinal == 5 || (ordinal == 9 ? !aVar.f295712b.mo79746e(C90066dr.f249675R) : ordinal == 10 && !aVar.f295712b.mo79746e(C90066dr.f249676S))) {
                                    C62971cq<C52083ep> cqVar = enVar2.f136684d;
                                    list = C58597ky.m90211b(cqVar);
                                    for (C52083ep epVar4 : cqVar) {
                                        int i7 = epVar4.f136692b;
                                        if (i7 == 4) {
                                            eiVar = (C52076ei) epVar4.f136693c;
                                        } else {
                                            eiVar = C52076ei.f136664f;
                                        }
                                        if ((eiVar.f136666a & 32) != 0) {
                                            if (i7 == 4) {
                                                eiVar2 = (C52076ei) epVar4.f136693c;
                                            } else {
                                                eiVar2 = C52076ei.f136664f;
                                            }
                                            C51809dy dyVar2 = eiVar2.f136668c;
                                            if (dyVar2 == null) {
                                                dyVar2 = C51809dy.f135933f;
                                            }
                                            if ("ui.SHOW_TEXT".equals(dyVar2.f135936b)) {
                                                list.remove(epVar4);
                                                list.add(list.indexOf(aVar.f295711a), epVar4);
                                            }
                                        }
                                    }
                                    z = true;
                                }
                            }
                        }
                        hashSet2 = hashSet;
                        guVar3 = guVar;
                    }
                }
                hashSet = hashSet2;
                guVar = guVar3;
                int intValue = gVar.mo6453a().intValue();
                C51809dy d = hVar2.mo95180d();
                C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
                eoVar.copyOnWrite();
                C52083ep epVar5 = (C52083ep) eoVar.instance;
                epVar5.f136691a |= 1;
                epVar5.f136694d = intValue;
                C52075eh ehVar = (C52075eh) C52076ei.f136664f.createBuilder();
                ehVar.copyOnWrite();
                C52076ei eiVar3 = (C52076ei) ehVar.instance;
                d.getClass();
                eiVar3.f136668c = d;
                eiVar3.f136666a |= 32;
                eoVar.copyOnWrite();
                C52083ep epVar6 = (C52083ep) eoVar.instance;
                C52076ei eiVar4 = (C52076ei) ehVar.build();
                eiVar4.getClass();
                epVar6.f136693c = eiVar4;
                epVar6.f136692b = 4;
                C52083ep epVar7 = (C52083ep) eoVar.build();
                if (hVar2.mo95179c() == 1) {
                    arrayList.add(epVar7);
                } else if (hVar2.mo95179c() == 2) {
                    arrayList2.add(epVar7);
                }
            }
            i6++;
            hashSet2 = hashSet;
            guVar3 = guVar;
        }
        C52079el elVar = (C52079el) enVar.toBuilder();
        elVar.copyOnWrite();
        ((C52081en) elVar.instance).f136684d = C52081en.emptyProtobufList();
        elVar.mo53784a(arrayList);
        elVar.mo53784a(list);
        elVar.mo53784a(arrayList2);
        if (!b.mo56113h() || (((C51274bq) b.mo56107c()).f133489a & 32) == 0 || z) {
            nVar = C22698a.m42264a(list);
        } else {
            nVar = ((C51274bq) b.mo56107c()).f133495g;
            if (nVar == null) {
                nVar = C51183n.f133226e;
            }
        }
        int i8 = 0;
        for (C51175f fVar : nVar.f133229b) {
            int i9 = fVar.f133208b;
            if (i9 > i8) {
                i8 = i9;
            }
        }
        C105915g gVar2 = new C105915g(i8);
        List h = C58597ky.m90217h(arrayList, C105913e.f295722a);
        List h2 = C58597ky.m90217h(arrayList2, C105914f.f295723a);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C51181l lVar : nVar.f133230c) {
            C51180k a3 = C51180k.m86072a(lVar.f133224b);
            if (a3 == null) {
                a3 = C51180k.NO_OP;
            }
            if (a3 != C51180k.START_BBS) {
                C51180k a4 = C51180k.m86072a(lVar.f133224b);
                if (a4 == null) {
                    a4 = C51180k.NO_OP;
                }
                if (a4 != C51180k.JOIN_BBS) {
                    arrayList4.add(lVar);
                }
            }
            arrayList3.add(lVar);
        }
        int intValue2 = gVar2.mo6453a().intValue();
        int intValue3 = gVar2.mo6453a().intValue();
        C51182m mVar = (C51182m) nVar.toBuilder();
        mVar.copyOnWrite();
        ((C51183n) mVar.instance).f133229b = C51183n.emptyProtobufList();
        mVar.copyOnWrite();
        ((C51183n) mVar.instance).f133230c = C51183n.emptyProtobufList();
        mVar.mo53549d(m176491b(intValue2, h));
        mVar.mo53546a(nVar.f133229b);
        mVar.mo53549d(m176491b(intValue3, h2));
        mVar.mo53551f(m176492c(intValue2, C51180k.START_BBS));
        mVar.mo53551f(m176492c(intValue2, C51180k.JOIN_BBS));
        mVar.mo53547b(arrayList3);
        mVar.mo53551f(m176492c(intValue3, C51180k.START_BBS));
        mVar.mo53551f(m176492c(intValue3, C51180k.JOIN_BBS));
        mVar.mo53547b(arrayList4);
        C51183n nVar2 = (C51183n) mVar.build();
        if (b.mo56113h()) {
            bnVar = (C51271bn) ((C51274bq) b.mo56107c()).toBuilder();
        } else {
            bnVar = (C51271bn) C51274bq.f133487i.createBuilder();
        }
        bnVar.copyOnWrite();
        C51274bq bqVar = (C51274bq) bnVar.instance;
        bqVar.f133489a |= 1;
        bqVar.f133490b = true;
        bnVar.copyOnWrite();
        C51274bq bqVar2 = (C51274bq) bnVar.instance;
        nVar2.getClass();
        bqVar2.f133495g = nVar2;
        bqVar2.f133489a |= 32;
        wVar.mo27878e((C51274bq) bnVar.build());
        C52091ex a5 = wVar.mo27874a();
        elVar.copyOnWrite();
        C52081en enVar3 = (C52081en) elVar.instance;
        a5.getClass();
        enVar3.f136685e = a5;
        enVar3.f136681a |= 16;
        return (C52081en) elVar.build();
    }
}
