package com.google.android.libraries.lens.view.p2070an.p2071a;

import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.ama;
import com.google.common.p4552o.amc;
import com.google.common.p4552o.amf;
import com.google.common.p4552o.amg;
import com.google.common.p4552o.p4563i.C59867ac;
import com.google.common.p4552o.p4563i.C59868ad;
import com.google.lens.p4694a.C62045ax;
import com.google.p4017at.p4056g.p4057a.p4058a.C54024ce;
import com.google.p4017at.p4056g.p4057a.p4058a.C54030ck;
import com.google.p4017at.p4056g.p4057a.p4058a.C54045cz;
import com.google.p4017at.p4056g.p4057a.p4058a.C54058j;
import com.google.p4017at.p4056g.p4057a.p4058a.C54060l;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56278ce;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.protos.p4963bf.p4964a.p4965a.C64595bq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.an.a.h */
/* compiled from: PG */
public final class C25359h {

    /* renamed from: a */
    private static final C58974d f69068a = C58974d.m91135i("LogDataHelper");

    /* renamed from: b */
    private final C27232l f69069b;

    public C25359h(C27232l lVar) {
        this.f69069b = lVar;
    }

    /* renamed from: d */
    private static C58485gu m46709d(List list) {
        C54030ck ckVar;
        C54030ck ckVar2;
        C54030ck ckVar3;
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            C54024ce ceVar = (C54024ce) G.next();
            int i3 = ceVar.f141747a;
            if (i3 == 6) {
                for (C54058j jVar : ((C54060l) ceVar.f141748b).f141842a) {
                    amf amf = (amf) amg.f159140f.createBuilder();
                    amf.copyOnWrite();
                    amg amg = (amg) amf.instance;
                    amg.f159142a |= 1;
                    amg.f159143b = 2;
                    C54045cz czVar = jVar.f141834e;
                    if (czVar == null) {
                        czVar = C54045cz.f141801b;
                    }
                    int i4 = czVar.f141803a;
                    amf.copyOnWrite();
                    amg amg2 = (amg) amf.instance;
                    amg2.f159142a |= 4;
                    amg2.f159145d = i4;
                    arrayList.add((amg) amf.build());
                }
            } else if (i3 == 5) {
                amf amf2 = (amf) amg.f159140f.createBuilder();
                amf2.copyOnWrite();
                amg amg3 = (amg) amf2.instance;
                amg3.f159142a |= 1;
                amg3.f159143b = 3;
                arrayList.add((amg) amf2.build());
            } else {
                if (i3 == 2) {
                    ckVar = (C54030ck) ceVar.f141748b;
                } else {
                    ckVar = C54030ck.f141757c;
                }
                C62045ax axVar = ckVar.f141760b;
                if (axVar == null) {
                    axVar = C62045ax.f167623c;
                }
                if (axVar.f167625a == 41) {
                    amf amf3 = (amf) amg.f159140f.createBuilder();
                    amf3.copyOnWrite();
                    amg amg4 = (amg) amf3.instance;
                    amg4.f159142a |= 1;
                    amg4.f159143b = 1;
                    i = i2 + 1;
                    amf3.copyOnWrite();
                    amg amg5 = (amg) amf3.instance;
                    amg5.f159142a |= 8;
                    amg5.f159146e = i2;
                    amf3.copyOnWrite();
                    amg amg6 = (amg) amf3.instance;
                    amg6.f159142a |= 4;
                    amg6.f159145d = 90588;
                    arrayList.add((amg) amf3.build());
                } else {
                    int i5 = ceVar.f141747a;
                    if (i5 == 2) {
                        ckVar2 = (C54030ck) ceVar.f141748b;
                    } else {
                        ckVar2 = C54030ck.f141757c;
                    }
                    C62045ax axVar2 = ckVar2.f141760b;
                    if (axVar2 == null) {
                        axVar2 = C62045ax.f167623c;
                    }
                    if (axVar2.f167625a == 56) {
                        amf amf4 = (amf) amg.f159140f.createBuilder();
                        amf4.copyOnWrite();
                        amg amg7 = (amg) amf4.instance;
                        amg7.f159142a |= 1;
                        amg7.f159143b = 1;
                        i = i2 + 1;
                        amf4.copyOnWrite();
                        amg amg8 = (amg) amf4.instance;
                        amg8.f159142a |= 8;
                        amg8.f159146e = i2;
                        amf4.copyOnWrite();
                        amg amg9 = (amg) amf4.instance;
                        amg9.f159142a |= 4;
                        amg9.f159145d = 143417;
                        arrayList.add((amg) amf4.build());
                    } else {
                        if (i5 == 2) {
                            ckVar3 = (C54030ck) ceVar.f141748b;
                        } else {
                            ckVar3 = C54030ck.f141757c;
                        }
                        C62045ax axVar3 = ckVar3.f141760b;
                        if (axVar3 == null) {
                            axVar3 = C62045ax.f167623c;
                        }
                        if (axVar3.f167625a == 27) {
                            amf amf5 = (amf) amg.f159140f.createBuilder();
                            amf5.copyOnWrite();
                            amg amg10 = (amg) amf5.instance;
                            amg10.f159142a |= 1;
                            amg10.f159143b = 1;
                            i = i2 + 1;
                            amf5.copyOnWrite();
                            amg amg11 = (amg) amf5.instance;
                            amg11.f159142a |= 8;
                            amg11.f159146e = i2;
                            amf5.copyOnWrite();
                            amg amg12 = (amg) amf5.instance;
                            amg12.f159142a |= 4;
                            amg12.f159145d = 72527;
                            arrayList.add((amg) amf5.build());
                        } else {
                            ((C58970a) ((C58970a) f69068a.mo56226d()).mo56372aa(49875)).mo56386p("Unexpected presentation result not included in presentation log data");
                        }
                    }
                }
                i2 = i;
            }
        }
        return C58485gu.m89842j(arrayList);
    }

    /* renamed from: e */
    private static C56306df m46710e(C56280cg cgVar) {
        if (cgVar.f149994a.size() == 0 || (((C56278ce) cgVar.f149994a.get(0)).f149988a & 1) == 0) {
            return C56306df.UNKNOWN_FILTER_TYPE;
        }
        C56306df a = C56306df.m87964a(((C56278ce) cgVar.f149994a.get(0)).f149991d);
        return a == null ? C56306df.UNKNOWN_FILTER_TYPE : a;
    }

    /* renamed from: a */
    public final ama mo30407a(C56280cg cgVar, C58833ax axVar) {
        C56306df e = m46710e(cgVar);
        ama ama = (ama) amc.f159123i.createBuilder();
        ama.copyOnWrite();
        amc amc = (amc) ama.instance;
        amc.f159129e = e.f150068m;
        amc.f159125a |= 4;
        ama.copyOnWrite();
        amc amc2 = (amc) ama.instance;
        amc2.f159128d = 0;
        amc2.f159125a |= 2;
        if (axVar.mo56113h() && (((amc) axVar.mo56107c()).f159125a & 64) != 0) {
            C59868ad adVar = ((amc) ama.instance).f159132h;
            if (adVar == null) {
                adVar = C59868ad.f161796c;
            }
            C59867ac acVar = (C59867ac) C59868ad.f161796c.createBuilder(adVar);
            C59868ad adVar2 = ((amc) axVar.mo56107c()).f159132h;
            if (adVar2 == null) {
                adVar2 = C59868ad.f161796c;
            }
            int a = C64595bq.m96409a(adVar2.f161799b);
            if (a == 0) {
                a = 1;
            }
            acVar.copyOnWrite();
            C59868ad adVar3 = (C59868ad) acVar.instance;
            adVar3.f161799b = a - 1;
            adVar3.f161798a |= 1;
            ama.copyOnWrite();
            amc amc3 = (amc) ama.instance;
            C59868ad adVar4 = (C59868ad) acVar.build();
            adVar4.getClass();
            amc3.f159132h = adVar4;
            amc3.f159125a |= 64;
        }
        if (this.f69069b.mo32701h().mo56113h()) {
            String str = (String) this.f69069b.mo32701h().mo56107c();
            ama.copyOnWrite();
            amc amc4 = (amc) ama.instance;
            str.getClass();
            amc4.f159125a |= 32;
            amc4.f159131g = str;
        }
        return ama;
    }

    /* renamed from: b */
    public final amc mo30408b(C56280cg cgVar, List list, C58833ax axVar) {
        ama a = mo30407a(cgVar, axVar);
        a.copyOnWrite();
        amc amc = (amc) a.instance;
        amc amc2 = amc.f159123i;
        amc.f159125a |= 1;
        amc.f159126b = 13;
        a.mo57023a(m46709d(list));
        a.copyOnWrite();
        amc amc3 = (amc) a.instance;
        amc3.f159125a |= 8;
        amc3.f159130f = true;
        return (amc) a.build();
    }

    /* renamed from: c */
    public final amc mo30409c(C56280cg cgVar, List list, C58833ax axVar) {
        int i;
        C56306df dfVar = C56306df.UNKNOWN_FILTER_TYPE;
        switch (m46710e(cgVar).ordinal()) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i = 4;
                break;
            case 3:
                i = 17;
                break;
            default:
                i = 1;
                break;
        }
        ama a = mo30407a(cgVar, axVar);
        a.copyOnWrite();
        amc amc = (amc) a.instance;
        amc amc2 = amc.f159123i;
        amc.f159125a = 1 | amc.f159125a;
        amc.f159126b = i - 1;
        a.mo57023a(m46709d(list));
        a.copyOnWrite();
        amc amc3 = (amc) a.instance;
        amc3.f159125a |= 8;
        amc3.f159130f = false;
        return (amc) a.build();
    }
}
