package com.google.android.apps.gsa.sidekick.shared.util;

import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7725hq;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C8178yk;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.p */
/* compiled from: PG */
public abstract class C91997p {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo86071a(C7718hj hjVar, C7718hj hjVar2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo86205b(C7726hr hrVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo86159c(C7726hr hrVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo86160d(C7726hr hrVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo86669e(C7726hr hrVar) {
        return true;
    }

    /* renamed from: f */
    public final C7726hr mo86670f(C7726hr hrVar) {
        C7718hj hjVar;
        if (hrVar != null && mo86669e(hrVar)) {
            C7725hq hqVar = (C7725hq) C7726hr.f27008i.createBuilder();
            if ((hrVar.f27010a & 1) != 0) {
                String str = hrVar.f27011b;
                hqVar.copyOnWrite();
                C7726hr hrVar2 = (C7726hr) hqVar.instance;
                str.getClass();
                hrVar2.f27010a |= 1;
                hrVar2.f27011b = str;
            }
            if (hrVar.f27014e.size() > 0) {
                C62971cq cqVar = hrVar.f27014e;
                hqVar.copyOnWrite();
                C7726hr hrVar3 = (C7726hr) hqVar.instance;
                C62971cq cqVar2 = hrVar3.f27014e;
                if (!cqVar2.mo58948c()) {
                    hrVar3.f27014e = C62942bv.mutableCopy(cqVar2);
                }
                C62947c.addAll((Iterable) cqVar, (List) hrVar3.f27014e);
            }
            if ((hrVar.f27010a & 2) != 0) {
                C7718hj hjVar2 = hrVar.f27015f;
                if (hjVar2 == null) {
                    hjVar2 = C7718hj.f26927af;
                }
                hqVar.copyOnWrite();
                C7726hr hrVar4 = (C7726hr) hqVar.instance;
                hjVar2.getClass();
                hrVar4.f27015f = hjVar2;
                hrVar4.f27010a |= 2;
            }
            if ((hrVar.f27010a & 8) != 0) {
                C7718hj hjVar3 = hrVar.f27016g;
                if (hjVar3 == null) {
                    hjVar3 = C7718hj.f26927af;
                }
                hqVar.copyOnWrite();
                C7726hr hrVar5 = (C7726hr) hqVar.instance;
                hjVar3.getClass();
                hrVar5.f27016g = hjVar3;
                hrVar5.f27010a |= 8;
            }
            if ((hrVar.f27010a & 16) != 0) {
                C8178yk ykVar = hrVar.f27017h;
                if (ykVar == null) {
                    ykVar = C8178yk.f28736g;
                }
                hqVar.copyOnWrite();
                C7726hr hrVar6 = (C7726hr) hqVar.instance;
                ykVar.getClass();
                hrVar6.f27017h = ykVar;
                hrVar6.f27010a |= 16;
            }
            ArrayList arrayList = new ArrayList();
            for (C7726hr hrVar7 : hrVar.f27012c) {
                if ((hrVar7.f27010a & 8) != 0) {
                    C7718hj hjVar4 = hrVar7.f27016g;
                    if (hjVar4 == null) {
                        hjVar4 = C7718hj.f26927af;
                    }
                    if (!mo86071a(hjVar4, (C7718hj) null)) {
                    }
                }
                if ((hrVar7.f27010a & 2) != 0) {
                    C7718hj hjVar5 = hrVar7.f27015f;
                    if (hjVar5 == null) {
                        hjVar5 = C7718hj.f26927af;
                    }
                    if (!mo86071a(hjVar5, (C7718hj) null)) {
                    }
                }
                mo86159c(hrVar7);
                C7726hr f = mo86670f(hrVar7);
                if (f != null) {
                    int i = f.f27010a;
                    if (!((i & 8) == 0 && (i & 2) == 0 && f.f27012c.size() == 0 && f.f27013d.size() == 0)) {
                        arrayList.add(f);
                    }
                }
                mo86160d(hrVar7);
            }
            hqVar.mo16948a(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (C7718hj hjVar6 : hrVar.f27013d) {
                if ((hrVar.f27010a & 2) != 0) {
                    hjVar = hrVar.f27015f;
                    if (hjVar == null) {
                        hjVar = C7718hj.f26927af;
                    }
                } else {
                    hjVar = null;
                }
                if (mo86071a(hjVar6, hjVar)) {
                    arrayList2.add(hjVar6);
                }
            }
            hqVar.mo16949b(arrayList2);
            C7726hr hrVar8 = (C7726hr) hqVar.build();
            if (mo86205b(hrVar8)) {
                return hrVar8;
            }
        }
        return null;
    }
}
