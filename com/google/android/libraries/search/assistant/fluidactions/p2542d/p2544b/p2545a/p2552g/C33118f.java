package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g;

import com.google.assistant.p3897e.p3902c.p3907c.C50931ac;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
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
import com.google.assistant.p3897e.p3921j.C52475tc;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.assistant.p3897e.p3921j.p3926e.C52056o;
import com.google.common.p4522b.C58331bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59052c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.g.f */
/* compiled from: PG */
public final class C33118f {
    /* renamed from: a */
    public static C52081en m61460a(C58331bb bbVar, C52091ex exVar) {
        C52079el elVar = (C52079el) C52081en.f136679i.createBuilder();
        C58331bb bbVar2 = new C58331bb();
        int i = 100;
        for (Integer num : (List) Collection.EL.stream(bbVar.mo54951D()).sorted().collect(Collectors.toCollection(C33117e.f88637a))) {
            ArrayList arrayList = new ArrayList();
            for (C51809dy dyVar : bbVar.mo55277g(num)) {
                String str = dyVar.f135936b;
                C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
                int i2 = i + 1;
                eoVar.copyOnWrite();
                C52083ep epVar = (C52083ep) eoVar.instance;
                epVar.f136691a |= 1;
                epVar.f136694d = i;
                C52075eh ehVar = (C52075eh) C52076ei.f136664f.createBuilder();
                ehVar.copyOnWrite();
                C52076ei eiVar = (C52076ei) ehVar.instance;
                dyVar.getClass();
                eiVar.f136668c = dyVar;
                eiVar.f136666a |= 32;
                eoVar.copyOnWrite();
                C52083ep epVar2 = (C52083ep) eoVar.instance;
                C52076ei eiVar2 = (C52076ei) ehVar.build();
                eiVar2.getClass();
                epVar2.f136693c = eiVar2;
                epVar2.f136692b = 4;
                arrayList.add((C52083ep) eoVar.build());
                i = i2;
            }
            bbVar2.mo54957J(num, arrayList);
        }
        for (Integer g : (List) Collection.EL.stream(bbVar2.mo54951D()).sorted().collect(Collectors.toCollection(C33117e.f88637a))) {
            for (C52083ep c : bbVar2.mo55277g(g)) {
                elVar.mo53786c(c);
            }
        }
        C51182m mVar = (C51182m) C51183n.f133226e.createBuilder();
        int i3 = 0;
        for (Integer num2 : (List) Collection.EL.stream(bbVar2.mo54951D()).sorted().collect(Collectors.toCollection(C33120h.f88638a))) {
            List<C52083ep> g2 = bbVar2.mo55277g(num2);
            if (g2 == null || g2.isEmpty()) {
                ((C59052c) ((C59052c) C33121i.f88639a.mo56226d()).mo56372aa(50936)).mo56389s("Empty interaction list found at stage: %d", num2);
            } else {
                ArrayList arrayList2 = new ArrayList();
                C51174e eVar = null;
                C51174e eVar2 = null;
                for (C52083ep epVar3 : g2) {
                    if (C33121i.m61473b(epVar3, "tts.OUTPUT")) {
                        if (eVar == null) {
                            arrayList2.add(Integer.valueOf(i3));
                            eVar = (C51174e) C51175f.f133205f.createBuilder();
                            eVar.copyOnWrite();
                            C51175f fVar = (C51175f) eVar.instance;
                            fVar.f133207a |= 1;
                            fVar.f133208b = i3;
                            i3++;
                        }
                        eVar.mo53531b(epVar3.f136694d);
                    } else if (C33121i.m61473b(epVar3, "chat_message.SEND")) {
                        if (eVar2 == null) {
                            arrayList2.add(Integer.valueOf(i3));
                            eVar2 = (C51174e) C51175f.f133205f.createBuilder();
                            eVar2.copyOnWrite();
                            C51175f fVar2 = (C51175f) eVar2.instance;
                            fVar2.f133207a |= 1;
                            fVar2.f133208b = i3;
                            i3++;
                        }
                        eVar2.mo53531b(epVar3.f136694d);
                    } else {
                        arrayList2.add(Integer.valueOf(i3));
                        C51174e eVar3 = (C51174e) C51175f.f133205f.createBuilder();
                        eVar3.copyOnWrite();
                        C51175f fVar3 = (C51175f) eVar3.instance;
                        fVar3.f133207a |= 1;
                        fVar3.f133208b = i3;
                        eVar3.mo53531b(epVar3.f136694d);
                        mVar.mo53548c(eVar3);
                        i3++;
                    }
                }
                if (eVar != null) {
                    mVar.mo53548c(eVar);
                }
                if (eVar2 != null) {
                    mVar.mo53548c(eVar2);
                }
                C33121i.m61472a(mVar, arrayList2);
            }
        }
        C51178i iVar = (C51178i) C51181l.f133221d.createBuilder();
        C51180k kVar = C51180k.SEND_RESPONSE;
        iVar.copyOnWrite();
        C51181l lVar = (C51181l) iVar.instance;
        lVar.f133224b = kVar.f133220f;
        lVar.f133223a |= 1;
        mVar.mo53550e(iVar);
        C51178i iVar2 = (C51178i) C51181l.f133221d.createBuilder();
        C51180k kVar2 = C51180k.FINISH;
        iVar2.copyOnWrite();
        C51181l lVar2 = (C51181l) iVar2.instance;
        lVar2.f133224b = kVar2.f133220f;
        lVar2.f133223a |= 1;
        mVar.mo53550e(iVar2);
        m61464e(elVar, (C51183n) mVar.build(), exVar);
        return (C52081en) elVar.build();
    }

    /* renamed from: b */
    public static C52081en m61461b(List list, C58528ij ijVar, C52091ex exVar) {
        C52076ei eiVar;
        C52076ei eiVar2;
        C52079el elVar = (C52079el) C52081en.f136679i.createBuilder();
        Iterator it = list.iterator();
        int i = 100;
        while (it.hasNext()) {
            C51809dy dyVar = (C51809dy) it.next();
            C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
            int i2 = i + 1;
            eoVar.copyOnWrite();
            C52083ep epVar = (C52083ep) eoVar.instance;
            epVar.f136691a |= 1;
            epVar.f136694d = i;
            C52075eh ehVar = (C52075eh) C52076ei.f136664f.createBuilder();
            ehVar.copyOnWrite();
            C52076ei eiVar3 = (C52076ei) ehVar.instance;
            dyVar.getClass();
            eiVar3.f136668c = dyVar;
            eiVar3.f136666a |= 32;
            eoVar.copyOnWrite();
            C52083ep epVar2 = (C52083ep) eoVar.instance;
            C52076ei eiVar4 = (C52076ei) ehVar.build();
            eiVar4.getClass();
            epVar2.f136693c = eiVar4;
            epVar2.f136692b = 4;
            elVar.mo53785b(eoVar);
            i = i2;
        }
        List<C52083ep> unmodifiableList = Collections.unmodifiableList(((C52081en) elVar.instance).f136684d);
        C51182m mVar = (C51182m) C51183n.f133226e.createBuilder();
        ArrayList arrayList = new ArrayList();
        C51174e eVar = null;
        C51174e eVar2 = null;
        C51174e eVar3 = null;
        int i3 = 0;
        for (C52083ep epVar3 : unmodifiableList) {
            if (C33121i.m61473b(epVar3, "tts.OUTPUT")) {
                if (eVar == null) {
                    arrayList.add(Integer.valueOf(i3));
                    eVar = (C51174e) C51175f.f133205f.createBuilder();
                    eVar.copyOnWrite();
                    C51175f fVar = (C51175f) eVar.instance;
                    fVar.f133207a |= 1;
                    fVar.f133208b = i3;
                    i3++;
                }
                eVar.mo53531b(epVar3.f136694d);
            } else if (C33121i.m61473b(epVar3, "chat_message.SEND")) {
                if (eVar2 == null) {
                    arrayList.add(Integer.valueOf(i3));
                    eVar2 = (C51174e) C51175f.f133205f.createBuilder();
                    eVar2.copyOnWrite();
                    C51175f fVar2 = (C51175f) eVar2.instance;
                    fVar2.f133207a |= 1;
                    fVar2.f133208b = i3;
                    i3++;
                }
                eVar2.mo53531b(epVar3.f136694d);
            } else {
                if (!ijVar.isEmpty()) {
                    if (epVar3.f136692b == 4) {
                        eiVar = (C52076ei) epVar3.f136693c;
                    } else {
                        eiVar = C52076ei.f136664f;
                    }
                    if ((eiVar.f136666a & 32) != 0) {
                        if (epVar3.f136692b == 4) {
                            eiVar2 = (C52076ei) epVar3.f136693c;
                        } else {
                            eiVar2 = C52076ei.f136664f;
                        }
                        C51809dy dyVar2 = eiVar2.f136668c;
                        if (dyVar2 == null) {
                            dyVar2 = C51809dy.f135933f;
                        }
                        if (ijVar.contains(dyVar2.f135936b)) {
                            if (eVar3 == null) {
                                eVar3 = (C51174e) C51175f.f133205f.createBuilder();
                                eVar3.copyOnWrite();
                                C51175f fVar3 = (C51175f) eVar3.instance;
                                fVar3.f133207a |= 1;
                                fVar3.f133208b = i3;
                                i3++;
                            }
                            eVar3.mo53531b(epVar3.f136694d);
                        }
                    }
                }
                arrayList.add(Integer.valueOf(i3));
                C51174e eVar4 = (C51174e) C51175f.f133205f.createBuilder();
                eVar4.copyOnWrite();
                C51175f fVar4 = (C51175f) eVar4.instance;
                fVar4.f133207a |= 1;
                fVar4.f133208b = i3;
                eVar4.mo53531b(epVar3.f136694d);
                mVar.mo53548c(eVar4);
                i3++;
            }
        }
        if (eVar != null) {
            mVar.mo53548c(eVar);
        }
        if (eVar2 != null) {
            mVar.mo53548c(eVar2);
        }
        C33121i.m61472a(mVar, arrayList);
        if (eVar3 != null) {
            mVar.mo53548c(eVar3);
            C33121i.m61472a(mVar, C58485gu.m89846n(Integer.valueOf(((C51175f) eVar3.instance).f133208b)));
        }
        C51178i iVar = (C51178i) C51181l.f133221d.createBuilder();
        C51180k kVar = C51180k.SEND_RESPONSE;
        iVar.copyOnWrite();
        C51181l lVar = (C51181l) iVar.instance;
        lVar.f133224b = kVar.f133220f;
        lVar.f133223a |= 1;
        mVar.mo53550e(iVar);
        C51178i iVar2 = (C51178i) C51181l.f133221d.createBuilder();
        C51180k kVar2 = C51180k.FINISH;
        iVar2.copyOnWrite();
        C51181l lVar2 = (C51181l) iVar2.instance;
        lVar2.f133224b = kVar2.f133220f;
        lVar2.f133223a |= 1;
        mVar.mo53550e(iVar2);
        m61464e(elVar, (C51183n) mVar.build(), exVar);
        return (C52081en) elVar.build();
    }

    /* renamed from: c */
    public static C52081en m61462c(C52081en enVar, C51950fc fcVar, C58528ij ijVar) {
        C52076ei eiVar;
        C52076ei eiVar2;
        C52076ei eiVar3;
        C52079el elVar = (C52079el) enVar.toBuilder();
        elVar.copyOnWrite();
        ((C52081en) elVar.instance).f136684d = C52081en.emptyProtobufList();
        for (C52083ep epVar : enVar.f136684d) {
            C52082eo eoVar = (C52082eo) epVar.toBuilder();
            if (epVar.f136692b == 4) {
                C52075eh ehVar = (C52075eh) ((C52076ei) epVar.f136693c).toBuilder();
                int i = epVar.f136692b;
                if (i == 4) {
                    eiVar = (C52076ei) epVar.f136693c;
                } else {
                    eiVar = C52076ei.f136664f;
                }
                if ((eiVar.f136666a & 32) != 0) {
                    if (i == 4) {
                        eiVar2 = (C52076ei) epVar.f136693c;
                    } else {
                        eiVar2 = C52076ei.f136664f;
                    }
                    C51809dy dyVar = eiVar2.f136668c;
                    if (dyVar == null) {
                        dyVar = C51809dy.f135933f;
                    }
                    if (ijVar.contains(dyVar.f135936b)) {
                        if (epVar.f136692b == 4) {
                            eiVar3 = (C52076ei) epVar.f136693c;
                        } else {
                            eiVar3 = C52076ei.f136664f;
                        }
                        C51809dy dyVar2 = eiVar3.f136668c;
                        if (dyVar2 == null) {
                            dyVar2 = C51809dy.f135933f;
                        }
                        C51809dy o = C33116d.m61456o(dyVar2, fcVar);
                        ehVar.copyOnWrite();
                        C52076ei eiVar4 = (C52076ei) ehVar.instance;
                        o.getClass();
                        eiVar4.f136668c = o;
                        eiVar4.f136666a |= 32;
                    }
                    eoVar.copyOnWrite();
                    C52083ep epVar2 = (C52083ep) eoVar.instance;
                    C52076ei eiVar5 = (C52076ei) ehVar.build();
                    eiVar5.getClass();
                    epVar2.f136693c = eiVar5;
                    epVar2.f136692b = 4;
                    elVar.mo53785b(eoVar);
                }
            }
        }
        return (C52081en) elVar.build();
    }

    /* renamed from: d */
    public static Optional m61463d(C51953ff ffVar, C52091ex exVar, C52490tr trVar, String str) {
        C50936ah ahVar;
        if (trVar.f137798b == 9 && (trVar.f137797a & 1) != 0 && ((C52475tc) trVar.f137799c).f137747b) {
            Optional g = C33136x.m61490g(trVar.f137800d, ffVar);
            if (g.isPresent() && ((C51941eu) g.get()).f136277e == 17) {
                C51941eu euVar = (C51941eu) g.get();
                if (euVar.f136277e == 17) {
                    ahVar = (C50936ah) euVar.f136278f;
                } else {
                    ahVar = C50936ah.f132593m;
                }
                C50931ac a = C50931ac.m85981a(ahVar.f132602h);
                if (a == null) {
                    a = C50931ac.DEFAULT;
                }
                if (a == C50931ac.CANCEL) {
                    C52091ex a2 = C33119g.m61465a(exVar);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(C33116d.m61443b(str));
                    arrayList.add(C33116d.m61448g(C52056o.f136624a));
                    return Optional.m71637of(m61461b(arrayList, C58733pz.f156496a, a2));
                }
            }
        }
        return Optional.empty();
    }

    /* renamed from: e */
    private static void m61464e(C52079el elVar, C51183n nVar, C52091ex exVar) {
        C51271bn bnVar = (C51271bn) C51274bq.f133487i.createBuilder();
        bnVar.copyOnWrite();
        C51274bq bqVar = (C51274bq) bnVar.instance;
        bqVar.f133489a |= 1;
        bqVar.f133490b = true;
        bnVar.copyOnWrite();
        C51274bq bqVar2 = (C51274bq) bnVar.instance;
        nVar.getClass();
        bqVar2.f133495g = nVar;
        bqVar2.f133489a |= 32;
        C52091ex c = C33119g.m61467c(exVar, "asst.client.execution.params", "assistant.api.params.ClientExecutionParams", ((C51274bq) bnVar.build()).toByteString());
        elVar.copyOnWrite();
        C52081en enVar = (C52081en) elVar.instance;
        C52081en enVar2 = C52081en.f136679i;
        c.getClass();
        enVar.f136685e = c;
        enVar.f136681a |= 16;
    }
}
