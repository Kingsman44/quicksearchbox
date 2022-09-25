package com.google.android.libraries.logging.p2185ve.p2193e.p2195b;

import com.google.android.libraries.logging.p2185ve.C28445o;
import com.google.android.libraries.logging.p2185ve.C28481u;
import com.google.android.libraries.logging.p2185ve.p2188c.p2191c.C28342a;
import com.google.android.libraries.logging.p2185ve.p2188c.p2191c.C28344c;
import com.google.android.libraries.logging.p2185ve.p2192d.C28348a;
import com.google.android.libraries.logging.p2185ve.p2192d.C28352e;
import com.google.android.libraries.logging.p2185ve.p2193e.p2194a.C28359f;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.C60312ny;
import com.google.common.p4552o.C60313nz;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60340ox;
import com.google.common.p4552o.C60341oy;
import com.google.common.p4552o.C60342oz;
import com.google.common.p4552o.C60406pa;
import com.google.common.p4552o.C60407pb;
import com.google.common.p4552o.C60408pc;
import com.google.common.p4552o.C60409pd;
import com.google.common.p4552o.aql;
import com.google.common.p4552o.aqm;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.common.p4552o.p4566l.C60197dh;
import com.google.common.p4552o.p4566l.C60198di;
import com.google.common.p4552o.p4566l.C60200dk;
import com.google.common.p4552o.p4566l.C60202dm;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.logging.ve.e.b.ai */
/* compiled from: PG */
public final /* synthetic */ class C28373ai implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C28352e f77102a;

    /* renamed from: b */
    public final /* synthetic */ C28445o f77103b;

    /* renamed from: c */
    public final /* synthetic */ List f77104c;

    /* renamed from: d */
    public final /* synthetic */ List f77105d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f77106e;

    public /* synthetic */ C28373ai(C28352e eVar, C28445o oVar, List list, List list2, C60870cx cxVar) {
        this.f77102a = eVar;
        this.f77103b = oVar;
        this.f77104c = list;
        this.f77105d = list2;
        this.f77106e = cxVar;
    }

    public final Object call() {
        Object obj;
        Object obj2;
        Object obj3;
        C28352e eVar = this.f77102a;
        C28445o oVar = this.f77103b;
        List<C60870cx> list = this.f77104c;
        List<C60870cx> list2 = this.f77105d;
        C60870cx cxVar = this.f77106e;
        C60320od odVar = (C60320od) C60321oe.f163224i.createBuilder();
        C60218r rVar = eVar.f77074a;
        odVar.copyOnWrite();
        C60321oe oeVar = (C60321oe) odVar.instance;
        rVar.getClass();
        oeVar.f163227b = rVar;
        oeVar.f163226a |= 1;
        if (!eVar.f77078e) {
            C60218r a = C28390k.m53070a(eVar, true);
            C58838bb.m90884s(a != null, "No Parent Event");
            odVar.copyOnWrite();
            C60321oe oeVar2 = (C60321oe) odVar.instance;
            a.getClass();
            oeVar2.f163229d = a;
            oeVar2.f163226a |= 2;
        }
        C28481u a2 = C28348a.m53028a(eVar);
        C62940bt r9 = C62942bv.checkIsLite(C28380ap.f77117a);
        a2.mo58887l(r9);
        if (a2.f169962ag.mo58857o(r9.f169971d)) {
            C60340ox oxVar = (C60340ox) C60341oy.f163326c.createBuilder();
            C60214n nVar = a2.f77290c;
            if (nVar == null) {
                nVar = C60214n.f162914g;
            }
            C60218r rVar2 = nVar.f162921f;
            if (rVar2 == null) {
                rVar2 = C60218r.f162925d;
            }
            oxVar.copyOnWrite();
            C60341oy oyVar = (C60341oy) oxVar.instance;
            rVar2.getClass();
            oyVar.f163329b = rVar2;
            oyVar.f163328a |= 1;
            odVar.copyOnWrite();
            C60321oe oeVar3 = (C60321oe) odVar.instance;
            C60341oy oyVar2 = (C60341oy) oxVar.build();
            oyVar2.getClass();
            oeVar3.f163233h = oyVar2;
            oeVar3.f163226a |= 128;
        }
        C60214n nVar2 = C28348a.m53029b(eVar).f77290c;
        if (nVar2 == null) {
            nVar2 = C60214n.f162914g;
        }
        aql aql = (aql) aqm.f159760n.createBuilder();
        aql.copyOnWrite();
        aqm aqm = (aqm) aql.instance;
        nVar2.getClass();
        aqm.f159763b = nVar2;
        aqm.f159762a |= 1;
        int a3 = C60202dm.m92544a(oVar.f77229b);
        if (a3 == 0) {
            a3 = 1;
        }
        aql.copyOnWrite();
        aqm aqm2 = (aqm) aql.instance;
        aqm2.f159762a |= 16;
        aqm2.f159767f = a3 - 1;
        int a4 = C60202dm.m92544a(oVar.f77229b);
        if (a4 == 0) {
            a4 = 1;
        }
        aql.copyOnWrite();
        aqm aqm3 = (aqm) aql.instance;
        aqm3.f159762a |= 16;
        aqm3.f159767f = a4 - 1;
        for (Integer intValue : oVar.f77230c) {
            switch (intValue.intValue()) {
                case 100000001:
                    C62940bt r10 = C62942bv.checkIsLite(C28342a.f77052b);
                    oVar.mo58887l(r10);
                    Object l = oVar.f169962ag.mo58854l(r10.f169971d);
                    if (l == null) {
                        obj = r10.f169969b;
                    } else {
                        obj = r10.mo58889c(l);
                    }
                    C60200dk a5 = C60200dk.m92542a(((C28344c) obj).f77057b);
                    if (a5 == null) {
                        a5 = C60200dk.UNASSIGNED_DIRECTIONAL_MOVEMENT_ID;
                    }
                    int i = a5.f162873f;
                    aql.copyOnWrite();
                    aqm aqm4 = (aqm) aql.instance;
                    aqm4.f159762a |= 32;
                    aqm4.f159768g = i;
                    break;
                case 100000002:
                    C62940bt r102 = C62942bv.checkIsLite(C28342a.f77053c);
                    oVar.mo58887l(r102);
                    Object l2 = oVar.f169962ag.mo58854l(r102.f169971d);
                    if (l2 == null) {
                        obj2 = r102.f169969b;
                    } else {
                        obj2 = r102.mo58889c(l2);
                    }
                    int a6 = C60197dh.m92541a(((C60198di) obj2).f162865b);
                    if (a6 == 0) {
                        a6 = 1;
                    }
                    aql.copyOnWrite();
                    aqm aqm5 = (aqm) aql.instance;
                    aqm5.f159762a |= 64;
                    aqm5.f159769h = a6 - 1;
                    break;
                case 100000003:
                    C62940bt r103 = C62942bv.checkIsLite(C28376al.f77112d);
                    oVar.mo58887l(r103);
                    Object l3 = oVar.f169962ag.mo58854l(r103.f169971d);
                    if (l3 == null) {
                        obj3 = r103.f169969b;
                    } else {
                        obj3 = r103.mo58889c(l3);
                    }
                    int i2 = ((C28394o) obj3).f77148b;
                    aql.copyOnWrite();
                    aqm aqm6 = (aqm) aql.instance;
                    aqm6.f159762a |= 128;
                    aqm6.f159770i = i2;
                    break;
            }
        }
        C60312ny nyVar = (C60312ny) C60313nz.f163201a.createBuilder();
        C62940bt btVar = C60409pd.f163483b;
        C60342oz ozVar = (C60342oz) C60406pa.f163474c.createBuilder();
        C60407pb pbVar = (C60407pb) C60408pc.f163478c.createBuilder();
        long j = eVar.f77077d;
        pbVar.copyOnWrite();
        C60408pc pcVar = (C60408pc) pbVar.instance;
        pcVar.f163480a |= 1;
        pcVar.f163481b = j;
        C60408pc pcVar2 = (C60408pc) pbVar.build();
        ozVar.copyOnWrite();
        C60406pa paVar = (C60406pa) ozVar.instance;
        pcVar2.getClass();
        paVar.f163477b = pcVar2;
        paVar.f163476a |= 1;
        nyVar.mo58885m(btVar, (C60406pa) ozVar.build());
        if (!list.isEmpty()) {
            for (C60870cx r : list) {
                ((C28359f) C60856cj.m92909r(r)).mo30786a(nyVar);
            }
        }
        aql.copyOnWrite();
        aqm aqm7 = (aqm) aql.instance;
        C60313nz nzVar = (C60313nz) nyVar.build();
        nzVar.getClass();
        aqm7.f159774m = nzVar;
        aqm7.f159762a |= 16384;
        if (!list2.isEmpty()) {
            for (C60870cx r2 : list2) {
                ((C28359f) C60856cj.m92909r(r2)).mo30786a(aql);
            }
        }
        aqp[] aqpArr = (aqp[]) C60856cj.m92909r(cxVar);
        if (aqpArr != null) {
            for (aqp build : aqpArr) {
                aql.copyOnWrite();
                aqm aqm8 = (aqm) aql.instance;
                aqs aqs = (aqs) build.build();
                aqs.getClass();
                C62971cq cqVar = aqm8.f159773l;
                if (!cqVar.mo58948c()) {
                    aqm8.f159773l = C62942bv.mutableCopy(cqVar);
                }
                aqm8.f159773l.add(aqs);
            }
        }
        aqm aqm9 = (aqm) aql.build();
        odVar.copyOnWrite();
        C60321oe oeVar4 = (C60321oe) odVar.instance;
        aqm9.getClass();
        oeVar4.f163230e = aqm9;
        oeVar4.f163226a |= 16;
        return (C60321oe) odVar.build();
    }
}
