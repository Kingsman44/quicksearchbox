package com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.logging.C28260b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.aql;
import com.google.common.p4552o.aqm;
import com.google.common.p4552o.p4566l.C60213m;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60217q;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p375ai.p378b.C8176yi;
import com.google.p375ai.p378b.C8178yk;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54783c;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54806z;
import com.google.p4283bv.p4354e.p4356b.C57057b;
import com.google.p4283bv.p4354e.p4356b.C57346f;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.d */
/* compiled from: PG */
public abstract class C91862d {
    /* renamed from: i */
    public static C91861c m150515i(C8178yk ykVar, int i) {
        C91859a aVar = new C91859a();
        if (ykVar != null) {
            aVar.f256176a = ykVar;
            aVar.f256180e = i;
            aVar.mo86372b(false);
            return aVar;
        }
        throw new NullPointerException("Null veInfo");
    }

    /* renamed from: a */
    public abstract C8178yk mo86373a();

    /* renamed from: b */
    public abstract C54806z mo86374b();

    /* renamed from: c */
    public abstract C57057b mo86375c();

    /* renamed from: d */
    public abstract String mo86376d();

    /* renamed from: e */
    public abstract boolean mo86377e();

    /* renamed from: f */
    public abstract int mo86379f();

    /* renamed from: g */
    public abstract int mo86380g();

    /* renamed from: h */
    public final void mo86383h() {
        C8176yi yiVar;
        C8176yi yiVar2;
        C60214n nVar;
        C8176yi yiVar3;
        C8176yi yiVar4;
        C60214n nVar2;
        C8176yi yiVar5;
        if (!mo86373a().f28741d || mo86379f() != 0) {
            if (mo86373a().f28739b != 1) {
                if (!mo86377e()) {
                    ((C59052c) ((C59052c) C91863e.f256191a.mo56226d()).mo56372aa(11922)).mo56386p("VisualElementInfo has no veId and logging with clickTrackingCgi is off.");
                    return;
                } else if (mo86373a().f28739b != 5) {
                    ((C59052c) ((C59052c) C91863e.f256191a.mo56226d()).mo56372aa(11921)).mo56386p("VisualElementInfo has no veId or clickTrackingCgi");
                    return;
                }
            }
            C60320od odVar = (C60320od) C60321oe.f163224i.createBuilder();
            C60218r a = C28260b.m52825a();
            odVar.copyOnWrite();
            C60321oe oeVar = (C60321oe) odVar.instance;
            a.getClass();
            oeVar.f163227b = a;
            oeVar.f163226a |= 1;
            aql aql = (aql) aqm.f159760n.createBuilder();
            int g = mo86380g();
            int i = g - 1;
            if (g != 0) {
                aql.copyOnWrite();
                aqm aqm = (aqm) aql.instance;
                aqm.f159762a |= 16;
                aqm.f159767f = i;
                if (mo86377e()) {
                    if (mo86373a().f28739b == 5) {
                        C8178yk a2 = mo86373a();
                        if (a2.f28739b == 5) {
                            nVar2 = (C60214n) a2.f28740c;
                        } else {
                            nVar2 = C60214n.f162914g;
                        }
                    } else {
                        C8178yk a3 = mo86373a();
                        if (a3.f28739b == 1) {
                            yiVar5 = (C8176yi) a3.f28740c;
                        } else {
                            yiVar5 = C8176yi.f28728f;
                        }
                        C60213m mVar = (C60213m) C60214n.f162914g.createBuilder();
                        C60217q qVar = (C60217q) C28260b.m52825a().toBuilder();
                        C60220t tVar = yiVar5.f28731b;
                        if (tVar == null) {
                            tVar = C60220t.f162931e;
                        }
                        qVar.copyOnWrite();
                        C60218r rVar = (C60218r) qVar.instance;
                        tVar.getClass();
                        rVar.f162928b = tVar;
                        rVar.f162927a |= 1;
                        mVar.copyOnWrite();
                        C60214n nVar3 = (C60214n) mVar.instance;
                        C60218r rVar2 = (C60218r) qVar.build();
                        rVar2.getClass();
                        nVar3.f162921f = rVar2;
                        nVar3.f162916a |= 2048;
                        int i2 = yiVar5.f28732c;
                        mVar.copyOnWrite();
                        C60214n nVar4 = (C60214n) mVar.instance;
                        nVar4.f162916a |= 8;
                        nVar4.f162918c = i2;
                        int i3 = yiVar5.f28733d;
                        mVar.copyOnWrite();
                        C60214n nVar5 = (C60214n) mVar.instance;
                        nVar5.f162916a |= 1;
                        nVar5.f162917b = i3;
                        int i4 = yiVar5.f28734e;
                        mVar.copyOnWrite();
                        C60214n nVar6 = (C60214n) mVar.instance;
                        nVar6.f162916a |= 32;
                        nVar6.f162919d = i4;
                        nVar2 = (C60214n) mVar.build();
                    }
                    aql.copyOnWrite();
                    aqm aqm2 = (aqm) aql.instance;
                    nVar2.getClass();
                    aqm2.f159763b = nVar2;
                    aqm2.f159762a |= 1;
                } else {
                    C8178yk a4 = mo86373a();
                    if (a4.f28739b == 1) {
                        yiVar3 = (C8176yi) a4.f28740c;
                    } else {
                        yiVar3 = C8176yi.f28728f;
                    }
                    int i5 = yiVar3.f28732c;
                    aql.copyOnWrite();
                    aqm aqm3 = (aqm) aql.instance;
                    aqm3.f159762a |= 4;
                    aqm3.f159765d = i5;
                    C8178yk a5 = mo86373a();
                    if (a5.f28739b == 1) {
                        yiVar4 = (C8176yi) a5.f28740c;
                    } else {
                        yiVar4 = C8176yi.f28728f;
                    }
                    int i6 = yiVar4.f28733d;
                    aql.copyOnWrite();
                    aqm aqm4 = (aqm) aql.instance;
                    aqm4.f159762a |= 8;
                    aqm4.f159766e = i6;
                }
                Integer valueOf = (mo86373a().f28738a & 16) != 0 ? Integer.valueOf(mo86373a().f28743f) : null;
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    aql.copyOnWrite();
                    aqm aqm5 = (aqm) aql.instance;
                    aqm5.f159762a |= 128;
                    aqm5.f159770i = intValue;
                }
                C57057b c = mo86375c();
                if (c != null) {
                    aql.mo58885m(C57346f.f153209b, c);
                }
                C54806z b = mo86374b();
                if (b != null) {
                    aql.mo58885m(C54783c.f143723a, b);
                }
                aqm aqm6 = (aqm) aql.build();
                odVar.copyOnWrite();
                C60321oe oeVar2 = (C60321oe) odVar.instance;
                aqm6.getClass();
                oeVar2.f163230e = aqm6;
                oeVar2.f163226a |= 16;
                if (mo86373a().f28739b == 5) {
                    C8178yk a6 = mo86373a();
                    if (a6.f28739b == 5) {
                        nVar = (C60214n) a6.f28740c;
                    } else {
                        nVar = C60214n.f162914g;
                    }
                    C60218r rVar3 = nVar.f162921f;
                    if (rVar3 == null) {
                        rVar3 = C60218r.f162925d;
                    }
                    odVar.copyOnWrite();
                    C60321oe oeVar3 = (C60321oe) odVar.instance;
                    rVar3.getClass();
                    oeVar3.f163229d = rVar3;
                    oeVar3.f163226a |= 2;
                } else {
                    C8178yk a7 = mo86373a();
                    if (a7.f28739b == 1) {
                        yiVar = (C8176yi) a7.f28740c;
                    } else {
                        yiVar = C8176yi.f28728f;
                    }
                    if ((yiVar.f28730a & 1) != 0) {
                        C60217q qVar2 = (C60217q) C60218r.f162925d.createBuilder();
                        C8178yk a8 = mo86373a();
                        if (a8.f28739b == 1) {
                            yiVar2 = (C8176yi) a8.f28740c;
                        } else {
                            yiVar2 = C8176yi.f28728f;
                        }
                        C60220t tVar2 = yiVar2.f28731b;
                        if (tVar2 == null) {
                            tVar2 = C60220t.f162931e;
                        }
                        qVar2.copyOnWrite();
                        C60218r rVar4 = (C60218r) qVar2.instance;
                        tVar2.getClass();
                        rVar4.f162928b = tVar2;
                        rVar4.f162927a = 1 | rVar4.f162927a;
                        odVar.copyOnWrite();
                        C60321oe oeVar4 = (C60321oe) odVar.instance;
                        C60218r rVar5 = (C60218r) qVar2.build();
                        rVar5.getClass();
                        oeVar4.f163229d = rVar5;
                        oeVar4.f163226a |= 2;
                    }
                }
                int f = mo86379f();
                if (f != 0) {
                    odVar.copyOnWrite();
                    C60321oe oeVar5 = (C60321oe) odVar.instance;
                    oeVar5.f163231f = f - 1;
                    oeVar5.f163226a |= 32;
                }
                C60321oe oeVar6 = (C60321oe) odVar.build();
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                ufVar.f164093a |= 2;
                ufVar.f164258m = 1125;
                String d = mo86376d();
                if (d != null) {
                    tzVar.copyOnWrite();
                    C60555uf ufVar2 = (C60555uf) tzVar.instance;
                    ufVar2.f164254i |= 8192;
                    ufVar2.f164166bT = d;
                }
                C58976aa aaVar = C58975e.f156826a;
                C89949q.m146525j((C60555uf) tzVar.build(), oeVar6, (C63196b) null, (String) null);
                return;
            }
            throw null;
        }
        C58976aa aaVar2 = C58975e.f156826a;
    }
}
