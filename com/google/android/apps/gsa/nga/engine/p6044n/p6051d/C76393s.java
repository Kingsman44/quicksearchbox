package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.conversation.p1855h.C22719w;
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
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.s */
/* compiled from: PG */
public final class C76393s {

    /* renamed from: a */
    private final C91142g f211534a;

    public C76393s(C91142g gVar) {
        this.f211534a = gVar;
    }

    /* renamed from: b */
    public static C52081en m123006b(List list) {
        C52079el elVar = (C52079el) C52081en.f136679i.createBuilder();
        C58480gp e = C58485gu.m89837e();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C51809dy dyVar = (C51809dy) it.next();
            C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
            int i2 = i + 1;
            eoVar.copyOnWrite();
            C52083ep epVar = (C52083ep) eoVar.instance;
            epVar.f136691a = 1 | epVar.f136691a;
            epVar.f136694d = m123007c(i);
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
            e.mo55395g((C52083ep) eoVar.build());
            i = i2;
        }
        C58485gu f = e.mo55394f();
        C51174e eVar = (C51174e) C51175f.f133205f.createBuilder();
        eVar.copyOnWrite();
        C51175f fVar = (C51175f) eVar.instance;
        fVar.f133207a |= 1;
        fVar.f133208b = 0;
        int i3 = ((C58724pq) f).f156474d;
        for (int i4 = 0; i4 < i3; i4++) {
            eVar.mo53531b(((C52083ep) f.get(i4)).f136694d);
        }
        C51182m mVar = (C51182m) C51183n.f133226e.createBuilder();
        mVar.mo53548c(eVar);
        C51178i iVar = (C51178i) C51181l.f133221d.createBuilder();
        C51180k kVar = C51180k.START_BBS;
        iVar.copyOnWrite();
        C51181l lVar = (C51181l) iVar.instance;
        lVar.f133224b = kVar.f133220f;
        lVar.f133223a |= 1;
        iVar.mo53543b(0);
        mVar.mo53550e(iVar);
        C51178i iVar2 = (C51178i) C51181l.f133221d.createBuilder();
        C51180k kVar2 = C51180k.JOIN_BBS;
        iVar2.copyOnWrite();
        C51181l lVar2 = (C51181l) iVar2.instance;
        lVar2.f133224b = kVar2.f133220f;
        lVar2.f133223a |= 1;
        iVar2.mo53543b(0);
        mVar.mo53550e(iVar2);
        C51178i iVar3 = (C51178i) C51181l.f133221d.createBuilder();
        C51180k kVar3 = C51180k.FINISH;
        iVar3.copyOnWrite();
        C51181l lVar3 = (C51181l) iVar3.instance;
        lVar3.f133224b = kVar3.f133220f;
        lVar3.f133223a |= 1;
        mVar.mo53550e(iVar3);
        C51183n nVar = (C51183n) mVar.build();
        elVar.mo53784a(f);
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
        C22719w wVar = new C22719w();
        wVar.mo27878e((C51274bq) bnVar.build());
        C52091ex a = wVar.mo27874a();
        elVar.copyOnWrite();
        C52081en enVar = (C52081en) elVar.instance;
        a.getClass();
        enVar.f136685e = a;
        enVar.f136681a |= 16;
        return (C52081en) elVar.build();
    }

    /* renamed from: c */
    private static int m123007c(int i) {
        return (i << 3) | 1;
    }

    /* renamed from: a */
    public final C52081en mo72185a(List list, Map map) {
        int i;
        int i2;
        if (list == null) {
            return C52081en.f136679i;
        }
        boolean j = this.f211534a.mo85405j(C90126fx.f251330gl);
        C52079el elVar = (C52079el) C52081en.f136679i.createBuilder();
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            C51809dy dyVar = (C51809dy) it.next();
            C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
            if (j) {
                i = i3 + 1;
                i2 = m123007c(i3);
            } else {
                i = i3;
                i2 = 0;
            }
            eoVar.copyOnWrite();
            C52083ep epVar = (C52083ep) eoVar.instance;
            epVar.f136691a |= 1;
            epVar.f136694d = i2;
            C52075eh ehVar = (C52075eh) C52076ei.f136664f.createBuilder();
            ehVar.copyOnWrite();
            C52076ei eiVar = (C52076ei) ehVar.instance;
            dyVar.getClass();
            eiVar.f136668c = dyVar;
            eiVar.f136666a |= 32;
            C52076ei eiVar2 = (C52076ei) ehVar.build();
            eoVar.copyOnWrite();
            C52083ep epVar2 = (C52083ep) eoVar.instance;
            eiVar2.getClass();
            epVar2.f136693c = eiVar2;
            epVar2.f136692b = 4;
            elVar.mo53786c((C52083ep) eoVar.build());
            i3 = i;
        }
        if (!map.isEmpty()) {
            C52090ew ewVar = (C52090ew) C52091ex.f136710b.createBuilder();
            Map.EL.forEach(map, new C76392r(ewVar));
            C52091ex exVar = (C52091ex) ewVar.build();
            elVar.copyOnWrite();
            C52081en enVar = (C52081en) elVar.instance;
            exVar.getClass();
            enVar.f136685e = exVar;
            enVar.f136681a |= 16;
        }
        return (C52081en) elVar.build();
    }
}
