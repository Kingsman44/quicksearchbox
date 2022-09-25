package com.google.android.libraries.logging.p2185ve.p2193e.p2195b;

import com.google.android.libraries.logging.p2185ve.C28481u;
import com.google.android.libraries.logging.p2185ve.p2192d.C28348a;
import com.google.android.libraries.logging.p2185ve.p2192d.C28350c;
import com.google.android.libraries.logging.p2185ve.p2192d.C28351d;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60340ox;
import com.google.common.p4552o.C60341oy;
import com.google.common.p4552o.C60342oz;
import com.google.common.p4552o.C60406pa;
import com.google.common.p4552o.C60407pb;
import com.google.common.p4552o.C60408pc;
import com.google.common.p4552o.C60409pd;
import com.google.common.p4552o.C60446qi;
import com.google.common.p4552o.C60448qk;
import com.google.common.p4552o.C60449ql;
import com.google.common.p4552o.C60450qm;
import com.google.common.p4552o.C60451qn;
import com.google.common.p4552o.C60452qo;
import com.google.common.p4552o.aql;
import com.google.common.p4552o.aqm;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.logging.ve.e.b.af */
/* compiled from: PG */
public final /* synthetic */ class C28370af implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C28351d f77097a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f77098b;

    public /* synthetic */ C28370af(C28351d dVar, C60870cx cxVar) {
        this.f77097a = dVar;
        this.f77098b = cxVar;
    }

    public final Object call() {
        Object obj;
        Object obj2;
        C28351d dVar = this.f77097a;
        aqp[] aqpArr = (aqp[]) C60856cj.m92909r(this.f77098b);
        C60320od odVar = (C60320od) C60321oe.f163224i.createBuilder();
        C60449ql qlVar = (C60449ql) C60450qm.f163590b.createBuilder();
        for (C28350c cVar : dVar.f77070b) {
            int i = 3;
            if (cVar.f77067b - 1 != 0) {
                C60218r a = C28390k.m53070a(cVar, true);
                C58838bb.m90866a(a, "SHOW and HIDE grafts must have a parent.");
                C28385f.m53065b(a, cVar, dVar, odVar);
                C28481u b = C28348a.m53029b(cVar);
                C60451qn qnVar = (C60451qn) C60452qo.f163594e.createBuilder();
                C60214n nVar = b.f77290c;
                if (nVar == null) {
                    nVar = C60214n.f162914g;
                }
                qnVar.copyOnWrite();
                C60452qo qoVar = (C60452qo) qnVar.instance;
                nVar.getClass();
                qoVar.f163599d = nVar;
                qoVar.f163598c = 2;
                if ((a.f162927a & 2) != 0) {
                    qnVar.copyOnWrite();
                    C60452qo qoVar2 = (C60452qo) qnVar.instance;
                    a.getClass();
                    qoVar2.f163597b = a;
                    qoVar2.f163596a = 3;
                } else {
                    C60220t tVar = a.f162928b;
                    if (tVar == null) {
                        tVar = C60220t.f162931e;
                    }
                    qnVar.copyOnWrite();
                    C60452qo qoVar3 = (C60452qo) qnVar.instance;
                    tVar.getClass();
                    qoVar3.f163597b = tVar;
                    qoVar3.f163596a = 1;
                }
                C60446qi qiVar = (C60446qi) C60448qk.f163581g.createBuilder();
                int i2 = cVar.f77067b - 1;
                if (i2 == 0) {
                    i = 4;
                } else if (i2 == 1) {
                    i = 2;
                }
                qiVar.copyOnWrite();
                C60448qk qkVar = (C60448qk) qiVar.instance;
                qkVar.f163585c = i - 1;
                qkVar.f163583a |= 2;
                C60452qo qoVar4 = (C60452qo) qnVar.build();
                qiVar.copyOnWrite();
                C60448qk qkVar2 = (C60448qk) qiVar.instance;
                qoVar4.getClass();
                qkVar2.f163584b = qoVar4;
                qkVar2.f163583a |= 1;
                if ((b.f77288a & 4) != 0) {
                    long j = b.f77292e;
                    qiVar.copyOnWrite();
                    C60448qk qkVar3 = (C60448qk) qiVar.instance;
                    qkVar3.f163583a |= 16;
                    qkVar3.f163587e = j;
                }
                qlVar.mo57091b((C60448qk) qiVar.build());
            } else {
                C60218r rVar = dVar.f77069a;
                odVar.copyOnWrite();
                C60321oe oeVar = (C60321oe) odVar.instance;
                rVar.getClass();
                oeVar.f163227b = rVar;
                oeVar.f163226a |= 1;
                C28481u b2 = C28348a.m53029b(cVar);
                if ((b2.f77288a & 4) != 0) {
                    C60214n nVar2 = b2.f77290c;
                    if (nVar2 == null) {
                        nVar2 = C60214n.f162914g;
                    }
                    aqp aqp = aqpArr[nVar2.f162917b];
                    C62940bt btVar = C60409pd.f163482a;
                    C60342oz ozVar = (C60342oz) C60406pa.f163474c.createBuilder();
                    C60407pb pbVar = (C60407pb) C60408pc.f163478c.createBuilder();
                    long j2 = b2.f77292e;
                    pbVar.copyOnWrite();
                    C60408pc pcVar = (C60408pc) pbVar.instance;
                    pcVar.f163480a |= 1;
                    pcVar.f163481b = j2 / 1000;
                    C60408pc pcVar2 = (C60408pc) pbVar.build();
                    ozVar.copyOnWrite();
                    C60406pa paVar = (C60406pa) ozVar.instance;
                    pcVar2.getClass();
                    paVar.f163477b = pcVar2;
                    paVar.f163476a |= 1;
                    aqp.mo58885m(btVar, (C60406pa) ozVar.build());
                }
                boolean z = false;
                C60218r a2 = C28390k.m53070a(cVar, false);
                if (a2 == null) {
                    C58838bb.m90884s(dVar.f77070b.size() == 1, "Impressions must be in their own event.");
                    C28481u a3 = C28348a.m53028a(dVar);
                    C62940bt r2 = C62942bv.checkIsLite(C28377am.f77113a);
                    a3.mo58887l(r2);
                    if (a3.f169962ag.mo58857o(r2.f169971d)) {
                        C62940bt r22 = C62942bv.checkIsLite(C28377am.f77113a);
                        a3.mo58887l(r22);
                        Object l = a3.f169962ag.mo58854l(r22.f169971d);
                        if (l == null) {
                            obj2 = r22.f169969b;
                        } else {
                            obj2 = r22.mo58889c(l);
                        }
                        aql aql = (aql) aqm.f159760n.createBuilder();
                        int i3 = ((C28392m) obj2).f77144b;
                        aql.copyOnWrite();
                        aqm aqm = (aqm) aql.instance;
                        aqm.f159762a |= 4;
                        aqm.f159765d = i3;
                        aqm aqm2 = (aqm) aql.build();
                        odVar.copyOnWrite();
                        C60321oe oeVar2 = (C60321oe) odVar.instance;
                        aqm2.getClass();
                        oeVar2.f163230e = aqm2;
                        oeVar2.f163226a |= 16;
                    }
                    C62940bt r23 = C62942bv.checkIsLite(C28377am.f77114b);
                    a3.mo58887l(r23);
                    if (a3.f169962ag.mo58857o(r23.f169971d)) {
                        C62940bt r24 = C62942bv.checkIsLite(C28377am.f77114b);
                        a3.mo58887l(r24);
                        Object l2 = a3.f169962ag.mo58854l(r24.f169971d);
                        if (l2 == null) {
                            obj = r24.f169969b;
                        } else {
                            obj = r24.mo58889c(l2);
                        }
                        C60218r rVar2 = (C60218r) obj;
                        odVar.copyOnWrite();
                        C60321oe oeVar3 = (C60321oe) odVar.instance;
                        rVar2.getClass();
                        oeVar3.f163229d = rVar2;
                        oeVar3.f163226a |= 2;
                    }
                    C28385f.m53064a(cVar.mo33864c(), false, odVar, aqpArr, qlVar, dVar);
                } else {
                    C60214n nVar3 = ((C28481u) cVar.f77066a.get(1)).f77290c;
                    if (nVar3 == null) {
                        nVar3 = C60214n.f162914g;
                    }
                    if ((nVar3.f162916a & 2048) != 0) {
                        z = true;
                    }
                    C58838bb.m90883r(z);
                    C60446qi qiVar2 = (C60446qi) C60448qk.f163581g.createBuilder();
                    qiVar2.copyOnWrite();
                    C60448qk qkVar4 = (C60448qk) qiVar2.instance;
                    qkVar4.f163585c = 3;
                    qkVar4.f163583a |= 2;
                    C60451qn qnVar2 = (C60451qn) C60452qo.f163594e.createBuilder();
                    qnVar2.copyOnWrite();
                    C60452qo qoVar5 = (C60452qo) qnVar2.instance;
                    qoVar5.f163597b = a2;
                    qoVar5.f163596a = 3;
                    qnVar2.copyOnWrite();
                    C60452qo qoVar6 = (C60452qo) qnVar2.instance;
                    nVar3.getClass();
                    qoVar6.f163599d = nVar3;
                    qoVar6.f163598c = 2;
                    C60452qo qoVar7 = (C60452qo) qnVar2.build();
                    qiVar2.copyOnWrite();
                    C60448qk qkVar5 = (C60448qk) qiVar2.instance;
                    qoVar7.getClass();
                    qkVar5.f163584b = qoVar7;
                    qkVar5.f163583a |= 1;
                    C28481u b3 = C28348a.m53029b(cVar);
                    C62940bt r25 = C62942bv.checkIsLite(C28376al.f77110b);
                    b3.mo58887l(r25);
                    boolean o = b3.f169962ag.mo58857o(r25.f169971d);
                    if (o) {
                        qiVar2.copyOnWrite();
                        C60448qk qkVar6 = (C60448qk) qiVar2.instance;
                        qkVar6.f163583a |= 32;
                        qkVar6.f163588f = true;
                    }
                    C28385f.m53064a(cVar.mo33864c(), o, odVar, aqpArr, qlVar, dVar);
                    if (dVar.f77070b.size() == 1) {
                        qlVar.mo57091b((C60448qk) qiVar2.build());
                    } else {
                        C60451qn qnVar3 = (C60451qn) C60452qo.f163594e.createBuilder();
                        C60214n nVar4 = C28348a.m53029b(cVar).f77290c;
                        if (nVar4 == null) {
                            nVar4 = C60214n.f162914g;
                        }
                        qnVar3.copyOnWrite();
                        C60452qo qoVar8 = (C60452qo) qnVar3.instance;
                        nVar4.getClass();
                        qoVar8.f163599d = nVar4;
                        qoVar8.f163598c = 2;
                        C60452qo qoVar9 = (C60452qo) qnVar3.build();
                        qiVar2.copyOnWrite();
                        C60448qk qkVar7 = (C60448qk) qiVar2.instance;
                        qoVar9.getClass();
                        qkVar7.f163586d = qoVar9;
                        qkVar7.f163583a |= 4;
                        qlVar.mo57090a(qiVar2);
                    }
                    C28385f.m53065b(a2, cVar, dVar, odVar);
                }
            }
        }
        C28481u a4 = C28348a.m53028a(dVar);
        C62940bt r3 = C62942bv.checkIsLite(C28380ap.f77117a);
        a4.mo58887l(r3);
        if (a4.f169962ag.mo58857o(r3.f169971d)) {
            C60340ox oxVar = (C60340ox) C60341oy.f163326c.createBuilder();
            C60214n nVar5 = a4.f77290c;
            if (nVar5 == null) {
                nVar5 = C60214n.f162914g;
            }
            C60218r rVar3 = nVar5.f162921f;
            if (rVar3 == null) {
                rVar3 = C60218r.f162925d;
            }
            oxVar.copyOnWrite();
            C60341oy oyVar = (C60341oy) oxVar.instance;
            rVar3.getClass();
            oyVar.f163329b = rVar3;
            oyVar.f163328a |= 1;
            C60341oy oyVar2 = (C60341oy) oxVar.build();
            odVar.copyOnWrite();
            C60321oe oeVar4 = (C60321oe) odVar.instance;
            oyVar2.getClass();
            oeVar4.f163233h = oyVar2;
            oeVar4.f163226a |= 128;
        }
        if (((C60450qm) qlVar.instance).f163592a.size() > 0) {
            C60450qm qmVar = (C60450qm) qlVar.build();
            odVar.copyOnWrite();
            C60321oe oeVar5 = (C60321oe) odVar.instance;
            qmVar.getClass();
            oeVar5.f163232g = qmVar;
            oeVar5.f163226a |= 64;
        }
        for (aqp b4 : aqpArr) {
            odVar.mo57082b(b4);
        }
        return (C60321oe) odVar.build();
    }
}
