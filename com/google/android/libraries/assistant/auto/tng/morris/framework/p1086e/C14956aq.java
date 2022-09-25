package com.google.android.libraries.assistant.auto.tng.morris.framework.p1086e;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14672al;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14693bf;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14698bk;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14232bp;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14332fh;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14333fi;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14334fj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14501lo;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14502lp;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14542nb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14604pj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14605pk;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14606pl;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14607pm;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14608pn;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14610pp;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14611pq;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14613ps;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14614pt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14615pu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14616pv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14617pw;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14618px;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14619py;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14622qa;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14633w;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14634x;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15388p;
import com.google.assistant.p3994s.p3995a.C53435nu;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.e.aq */
/* compiled from: PG */
public final class C14956aq {

    /* renamed from: a */
    private final C14693bf f44915a;

    /* renamed from: b */
    private final C14672al f44916b;

    /* renamed from: c */
    private final C14686az f44917c;

    /* renamed from: d */
    private final C14698bk f44918d;

    /* renamed from: e */
    private final C86124t f44919e;

    public C14956aq(C14693bf bfVar, C14672al alVar, C14686az azVar, C14698bk bkVar, C86124t tVar) {
        this.f44915a = bfVar;
        this.f44916b = alVar;
        this.f44917c = azVar;
        this.f44918d = bkVar;
        this.f44919e = tVar;
    }

    /* renamed from: a */
    public final void mo21867a(C14232bp bpVar, C14604pj pjVar, C14749d dVar) {
        C14334fj fjVar;
        C14501lo loVar;
        C14542nb nbVar = C14542nb.UNKNOWN_TYPE;
        C14542nb a = C14542nb.m30637a(bpVar.f43074c);
        if (a == null) {
            a = C14542nb.UNRECOGNIZED;
        }
        int i = 2;
        switch (a.ordinal()) {
            case 1:
                C14611pq pqVar = (C14611pq) C14613ps.f44173e.createBuilder();
                if (bpVar.f43072a == 3) {
                    fjVar = C14334fj.m30610a(((Integer) bpVar.f43073b).intValue());
                    if (fjVar == null) {
                        fjVar = C14334fj.UNRECOGNIZED;
                    }
                } else {
                    fjVar = C14334fj.UNSPECIFIED_MEDIA_TILE_SUB_TYPE;
                }
                pqVar.copyOnWrite();
                ((C14613ps) pqVar.instance).f44175a = fjVar.getNumber();
                C14698bk bkVar = this.f44918d;
                if (bkVar.f44411b.isPresent()) {
                    Iterable iterable = (Iterable) bkVar.f44411b.get();
                    pqVar.copyOnWrite();
                    C14613ps psVar = (C14613ps) pqVar.instance;
                    C62971cq cqVar = psVar.f44176b;
                    if (!cqVar.mo58948c()) {
                        psVar.f44176b = C62942bv.mutableCopy(cqVar);
                    }
                    C62947c.addAll(iterable, (List) psVar.f44176b);
                }
                Optional k = this.f44916b.mo21648k(5, dVar);
                if (k.isPresent()) {
                    C14332fh fhVar = (C14332fh) C14333fi.f43350q.createBuilder();
                    C14946ag.m31464a((C14342fr) k.get(), fhVar, this.f44919e);
                    pqVar.copyOnWrite();
                    C14333fi fiVar = (C14333fi) fhVar.build();
                    fiVar.getClass();
                    ((C14613ps) pqVar.instance).f44178d = fiVar;
                }
                int f = this.f44916b.mo21647f();
                pqVar.copyOnWrite();
                ((C14613ps) pqVar.instance).f44177c = f - 2;
                pjVar.copyOnWrite();
                C14622qa qaVar = (C14622qa) pjVar.instance;
                C14613ps psVar2 = (C14613ps) pqVar.build();
                C14622qa qaVar2 = C14622qa.f44192c;
                psVar2.getClass();
                qaVar.f44195b = psVar2;
                qaVar.f44194a = 8;
                return;
            case 2:
                C14693bf bfVar = this.f44915a;
                C14605pk pkVar = (C14605pk) C14608pn.f44168b.createBuilder();
                for (String str : bfVar.f44394p.keySet()) {
                    C14606pl plVar = (C14606pl) C14607pm.f44163d.createBuilder();
                    String e = C15388p.m32017e(bfVar.f44381c, dVar, str);
                    plVar.copyOnWrite();
                    e.getClass();
                    ((C14607pm) plVar.instance).f44165a = e;
                    int intValue = ((Integer) bfVar.f44394p.get(str)).intValue();
                    plVar.copyOnWrite();
                    ((C14607pm) plVar.instance).f44167c = intValue;
                    Optional f2 = C14693bf.m30841f(dVar, str);
                    if (f2.isPresent()) {
                        C14361gj gjVar = (C14361gj) f2.get();
                        plVar.copyOnWrite();
                        gjVar.getClass();
                        ((C14607pm) plVar.instance).f44166b = gjVar;
                    }
                    pkVar.copyOnWrite();
                    C14608pn pnVar = (C14608pn) pkVar.instance;
                    C14607pm pmVar = (C14607pm) plVar.build();
                    pmVar.getClass();
                    C62971cq cqVar2 = pnVar.f44170a;
                    if (!cqVar2.mo58948c()) {
                        pnVar.f44170a = C62942bv.mutableCopy(cqVar2);
                    }
                    pnVar.f44170a.add(pmVar);
                }
                C14608pn pnVar2 = (C14608pn) pkVar.build();
                pjVar.copyOnWrite();
                C14622qa qaVar3 = (C14622qa) pjVar.instance;
                C14622qa qaVar4 = C14622qa.f44192c;
                pnVar2.getClass();
                qaVar3.f44195b = pnVar2;
                qaVar3.f44194a = 2;
                return;
            case 3:
                C14618px pxVar = (C14618px) C14619py.f44188c.createBuilder();
                if (bpVar.f43072a == 4 && (i = C14502lp.m30630b(((Integer) bpVar.f43073b).intValue())) == 0) {
                    i = 1;
                }
                pxVar.copyOnWrite();
                ((C14619py) pxVar.instance).f44191b = C14502lp.m30629a(i);
                C14693bf bfVar2 = this.f44915a;
                C14633w wVar = (C14633w) C14634x.f44218k.createBuilder();
                bfVar2.mo21666n(wVar, dVar);
                pxVar.copyOnWrite();
                C14634x xVar = (C14634x) wVar.build();
                xVar.getClass();
                ((C14619py) pxVar.instance).f44190a = xVar;
                pjVar.copyOnWrite();
                C14622qa qaVar5 = (C14622qa) pjVar.instance;
                C14619py pyVar = (C14619py) pxVar.build();
                C14622qa qaVar6 = C14622qa.f44192c;
                pyVar.getClass();
                qaVar5.f44195b = pyVar;
                qaVar5.f44194a = 9;
                return;
            case 4:
                C14686az azVar = this.f44917c;
                C14614pt ptVar = (C14614pt) C14615pu.f44180b.createBuilder();
                C58485gu h = azVar.f44352b.mo21482h(azVar.f44353c);
                ptVar.copyOnWrite();
                C14615pu puVar = (C14615pu) ptVar.instance;
                C62971cq cqVar3 = puVar.f44182a;
                if (!cqVar3.mo58948c()) {
                    puVar.f44182a = C62942bv.mutableCopy(cqVar3);
                }
                C62947c.addAll((Iterable) h, (List) puVar.f44182a);
                C14615pu puVar2 = (C14615pu) ptVar.build();
                pjVar.copyOnWrite();
                C14622qa qaVar7 = (C14622qa) pjVar.instance;
                C14622qa qaVar8 = C14622qa.f44192c;
                puVar2.getClass();
                qaVar7.f44195b = puVar2;
                qaVar7.f44194a = 3;
                return;
            case 5:
                C14616pv pvVar = (C14616pv) C14617pw.f44183c.createBuilder();
                if (bpVar.f43072a == 2) {
                    loVar = C14501lo.m30628a(((Integer) bpVar.f43073b).intValue());
                    if (loVar == null) {
                        loVar = C14501lo.UNRECOGNIZED;
                    }
                } else {
                    loVar = C14501lo.UNSPECIFIED_NAVIGATION_TILE_SUB_TYPE;
                }
                pvVar.copyOnWrite();
                ((C14617pw) pvVar.instance).f44185a = loVar.getNumber();
                C14698bk bkVar2 = this.f44918d;
                if (bkVar2.f44414e && bkVar2.f44412c.isPresent()) {
                    C53435nu nuVar = (C53435nu) bkVar2.f44412c.get();
                    pvVar.copyOnWrite();
                    nuVar.getClass();
                    ((C14617pw) pvVar.instance).f44186b = nuVar;
                }
                pjVar.copyOnWrite();
                C14622qa qaVar9 = (C14622qa) pjVar.instance;
                C14617pw pwVar = (C14617pw) pvVar.build();
                C14622qa qaVar10 = C14622qa.f44192c;
                pwVar.getClass();
                qaVar9.f44195b = pwVar;
                qaVar9.f44194a = 4;
                return;
            case 6:
                C14610pp ppVar = C14610pp.f44171a;
                pjVar.copyOnWrite();
                C14622qa qaVar11 = (C14622qa) pjVar.instance;
                C14622qa qaVar12 = C14622qa.f44192c;
                ppVar.getClass();
                qaVar11.f44195b = ppVar;
                qaVar11.f44194a = 11;
                return;
            default:
                return;
        }
    }
}
