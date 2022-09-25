package com.google.android.libraries.lens.view.render;

import com.google.android.libraries.lens.view.gleam.C26551eb;
import com.google.android.libraries.lens.view.p2069am.C25293aa;
import com.google.android.libraries.lens.view.p2069am.C25308ap;
import com.google.android.libraries.lens.view.p2069am.C25309aq;
import com.google.android.libraries.lens.view.p2069am.C25310ar;
import com.google.android.libraries.lens.view.p2069am.C25311as;
import com.google.android.libraries.lens.view.p2069am.C25312at;
import com.google.android.libraries.lens.view.p2069am.C25348x;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.lens.p4699e.C62191ad;
import com.google.lens.p4699e.C62195ah;
import com.google.lens.p4699e.C62205ar;
import com.google.lens.p4700f.C62249d;
import com.google.lens.p4707j.C62445bv;
import com.google.lens.p4707j.C62447bx;
import com.google.lens.p4707j.C62493dp;
import com.google.lens.p4708k.C62593a;
import com.google.lens.p4708k.C62594b;
import com.google.lens.p4708k.C62595c;
import com.google.lens.p4708k.C62596d;
import com.google.lens.p4708k.C62599g;
import com.google.lens.p4708k.C62600h;
import com.google.lens.p4708k.C62601i;
import com.google.lens.p4708k.C62602j;
import com.google.lens.p4708k.C62603k;
import com.google.lens.p4708k.C62604l;
import com.google.lens.p4708k.C62605m;
import com.google.lens.p4708k.C62606n;
import com.google.lens.p4708k.C62607o;
import com.google.lens.p4708k.C62608p;
import com.google.lens.p4708k.C62609q;
import com.google.lens.p4708k.C62610r;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.render.p */
/* compiled from: PG */
public final class C27674p {

    /* renamed from: a */
    public final C62596d f75565a;

    /* renamed from: b */
    public final C25312at f75566b;

    public C27674p(C25312at atVar, boolean z, Collection collection) {
        C62191ad adVar;
        C62191ad adVar2;
        C62191ad adVar3;
        C62205ar arVar;
        C62191ad adVar4;
        C62593a aVar = (C62593a) C62596d.f168994g.createBuilder();
        aVar.copyOnWrite();
        C62596d dVar = (C62596d) aVar.instance;
        dVar.f168996a |= 8;
        dVar.f169000e = z;
        C25310ar arVar2 = atVar.f68872a;
        C25309aq aqVar = (C25309aq) (arVar2 == null ? C25310ar.f68865c : arVar2).toBuilder();
        aqVar.copyOnWrite();
        ((C25310ar) aqVar.instance).f68867a = C25310ar.emptyProtobufList();
        C25310ar arVar3 = atVar.f68872a;
        for (C25308ap apVar : (arVar3 == null ? C25310ar.f68865c : arVar3).f68867a) {
            C25349y yVar = C25349y.UNKNOWN;
            C25349y a = C25349y.m46667a(apVar.f68848i);
            if ((a == null ? C25349y.UNRECOGNIZED : a).ordinal() != 8) {
                aqVar.mo30370a(apVar);
            } else if (!C26551eb.m49040e(apVar)) {
                aqVar.mo30370a(apVar);
            } else if (collection.contains(Integer.valueOf(apVar.f68845f))) {
                C25348x xVar = (C25348x) apVar.toBuilder();
                C25349y yVar2 = C25349y.GLEAM;
                xVar.copyOnWrite();
                ((C25308ap) xVar.instance).f68848i = yVar2.getNumber();
                if (apVar.f68843d == 21) {
                    adVar4 = (C62191ad) apVar.f68844e;
                } else {
                    adVar4 = C62191ad.f167916k;
                }
                String str = adVar4.f167921d;
                xVar.copyOnWrite();
                str.getClass();
                ((C25308ap) xVar.instance).f68849j = str;
                aqVar.copyOnWrite();
                C25310ar arVar4 = (C25310ar) aqVar.instance;
                C25308ap apVar2 = (C25308ap) xVar.build();
                apVar2.getClass();
                arVar4.mo30371a();
                arVar4.f68867a.add(apVar2);
            } else {
                C62603k kVar = (C62603k) C62604l.f169022d.createBuilder();
                for (C62195ah ahVar : apVar.f68862w) {
                    if (ahVar.f167933a == 4) {
                        C62599g gVar = (C62599g) C62600h.f169012d.createBuilder();
                        C62493dp dpVar = ahVar.f167935c;
                        dpVar = dpVar == null ? C62493dp.f168716e : dpVar;
                        gVar.copyOnWrite();
                        C62600h hVar = (C62600h) gVar.instance;
                        dpVar.getClass();
                        hVar.f169015b = dpVar;
                        hVar.f169014a |= 1;
                        if (ahVar.f167933a == 4) {
                            arVar = (C62205ar) ahVar.f167934b;
                        } else {
                            arVar = C62205ar.f167954c;
                        }
                        gVar.copyOnWrite();
                        C62600h hVar2 = (C62600h) gVar.instance;
                        arVar.getClass();
                        hVar2.f169016c = arVar;
                        hVar2.f169014a |= 2;
                        kVar.copyOnWrite();
                        C62604l lVar = (C62604l) kVar.instance;
                        C62600h hVar3 = (C62600h) gVar.build();
                        hVar3.getClass();
                        C62971cq cqVar = lVar.f169025b;
                        if (!cqVar.mo58948c()) {
                            lVar.f169025b = C62942bv.mutableCopy(cqVar);
                        }
                        lVar.f169025b.add(hVar3);
                    }
                }
                if (apVar.f68843d == 21) {
                    adVar = (C62191ad) apVar.f68844e;
                } else {
                    adVar = C62191ad.f167916k;
                }
                if ((adVar.f167918a & 8) != 0) {
                    C62601i iVar = (C62601i) C62602j.f169017d.createBuilder();
                    if (apVar.f68843d == 21) {
                        adVar2 = (C62191ad) apVar.f68844e;
                    } else {
                        adVar2 = C62191ad.f167916k;
                    }
                    String str2 = adVar2.f167921d;
                    iVar.copyOnWrite();
                    C62602j jVar = (C62602j) iVar.instance;
                    str2.getClass();
                    jVar.f169019a |= 1;
                    jVar.f169020b = str2;
                    if (apVar.f68843d == 21) {
                        adVar3 = (C62191ad) apVar.f68844e;
                    } else {
                        adVar3 = C62191ad.f167916k;
                    }
                    String str3 = adVar3.f167922e;
                    iVar.copyOnWrite();
                    C62602j jVar2 = (C62602j) iVar.instance;
                    str3.getClass();
                    jVar2.f169019a |= 2;
                    jVar2.f169021c = str3;
                    C62602j jVar3 = (C62602j) iVar.build();
                    kVar.copyOnWrite();
                    C62604l lVar2 = (C62604l) kVar.instance;
                    jVar3.getClass();
                    lVar2.f169026c = jVar3;
                    lVar2.f169024a |= 1;
                }
                C62606n nVar = (C62606n) C62609q.f169033d.createBuilder();
                C62445bv bvVar = apVar.f68847h;
                bvVar = bvVar == null ? C62445bv.f168618e : bvVar;
                nVar.copyOnWrite();
                C62609q qVar = (C62609q) nVar.instance;
                bvVar.getClass();
                qVar.f169036b = bvVar;
                qVar.f169035a |= 1;
                if ((apVar.f68840a & 1) != 0) {
                    C62607o oVar = (C62607o) C62608p.f169027e.createBuilder();
                    C62493dp dpVar2 = apVar.f68859t;
                    dpVar2 = dpVar2 == null ? C62493dp.f168716e : dpVar2;
                    oVar.copyOnWrite();
                    C62608p pVar = (C62608p) oVar.instance;
                    dpVar2.getClass();
                    pVar.f169030b = dpVar2;
                    pVar.f169029a |= 1;
                    float f = apVar.f68857r;
                    oVar.copyOnWrite();
                    C62608p pVar2 = (C62608p) oVar.instance;
                    pVar2.f169029a |= 2;
                    pVar2.f169031c = f;
                    float f2 = apVar.f68858s;
                    oVar.copyOnWrite();
                    C62608p pVar3 = (C62608p) oVar.instance;
                    pVar3.f169029a |= 4;
                    pVar3.f169032d = f2;
                    C62608p pVar4 = (C62608p) oVar.build();
                    nVar.copyOnWrite();
                    C62609q qVar2 = (C62609q) nVar.instance;
                    pVar4.getClass();
                    qVar2.f169037c = pVar4;
                    qVar2.f169035a |= 4;
                }
                C62605m mVar = (C62605m) C62610r.f169038h.createBuilder();
                int i = apVar.f68845f;
                mVar.copyOnWrite();
                C62610r rVar = (C62610r) mVar.instance;
                rVar.f169040a |= 1;
                rVar.f169043d = i;
                C62609q qVar3 = (C62609q) nVar.build();
                mVar.copyOnWrite();
                C62610r rVar2 = (C62610r) mVar.instance;
                qVar3.getClass();
                rVar2.f169044e = qVar3;
                rVar2.f169040a |= 2;
                C25293aa aaVar = apVar.f68855p;
                String str4 = (aaVar == null ? C25293aa.f68800c : aaVar).f68802a;
                mVar.copyOnWrite();
                C62610r rVar3 = (C62610r) mVar.instance;
                str4.getClass();
                rVar3.f169040a |= 16;
                rVar3.f169045f = str4;
                C62249d dVar2 = apVar.f68856q;
                String str5 = (dVar2 == null ? C62249d.f168055c : dVar2).f168058b;
                mVar.copyOnWrite();
                C62610r rVar4 = (C62610r) mVar.instance;
                str5.getClass();
                rVar4.f169040a |= 32;
                rVar4.f169046g = str5;
                mVar.copyOnWrite();
                C62610r rVar5 = (C62610r) mVar.instance;
                C62604l lVar3 = (C62604l) kVar.build();
                lVar3.getClass();
                rVar5.f169042c = lVar3;
                rVar5.f169041b = 4;
                C62610r rVar6 = (C62610r) mVar.build();
                aVar.copyOnWrite();
                C62596d dVar3 = (C62596d) aVar.instance;
                rVar6.getClass();
                C62971cq cqVar2 = dVar3.f168997b;
                if (!cqVar2.mo58948c()) {
                    dVar3.f168997b = C62942bv.mutableCopy(cqVar2);
                }
                dVar3.f168997b.add(rVar6);
            }
            int i2 = apVar.f68840a;
            if (!((i2 & 4) == 0 || (i2 & 2) == 0)) {
                C62594b bVar = (C62594b) C62595c.f168989d.createBuilder();
                C62447bx bxVar = apVar.f68861v;
                bxVar = bxVar == null ? C62447bx.f168624b : bxVar;
                bVar.copyOnWrite();
                C62595c cVar = (C62595c) bVar.instance;
                bxVar.getClass();
                cVar.f168993c = bxVar;
                cVar.f168991a |= 2;
                C62447bx bxVar2 = apVar.f68860u;
                bxVar2 = bxVar2 == null ? C62447bx.f168624b : bxVar2;
                bVar.copyOnWrite();
                C62595c cVar2 = (C62595c) bVar.instance;
                bxVar2.getClass();
                cVar2.f168992b = bxVar2;
                cVar2.f168991a |= 1;
                C62595c cVar3 = (C62595c) bVar.build();
                aVar.copyOnWrite();
                C62596d dVar4 = (C62596d) aVar.instance;
                cVar3.getClass();
                dVar4.f168998c = cVar3;
                dVar4.f168996a |= 2;
            }
        }
        this.f75565a = (C62596d) aVar.build();
        C25311as asVar = (C25311as) atVar.toBuilder();
        asVar.copyOnWrite();
        C25310ar arVar5 = (C25310ar) aqVar.build();
        arVar5.getClass();
        ((C25312at) asVar.instance).f68872a = arVar5;
        this.f75566b = (C25312at) asVar.build();
    }
}
