package org.p5633c.p5634a.p5639e;

import java.util.List;

/* renamed from: org.c.a.e.y */
/* compiled from: PG */
public final class C72268y {

    /* renamed from: a */
    private static C72269z f192346a;

    /* renamed from: a */
    public static C72269z m106711a() {
        C72240af afVar;
        if (f192346a == null) {
            C72242ah ahVar = new C72242ah();
            C72238ad adVar = new C72238ad("P");
            ahVar.mo63592c(adVar, adVar);
            ahVar.mo63594e(0);
            ahVar.mo63593d("Y");
            ahVar.mo63594e(1);
            ahVar.mo63593d("M");
            ahVar.mo63594e(2);
            ahVar.mo63593d("W");
            ahVar.mo63594e(3);
            ahVar.mo63593d("D");
            List list = ahVar.f192227a;
            if (list.size() == 0) {
                C72238ad adVar2 = C72238ad.f192218a;
                C72240af afVar2 = new C72240af(adVar2, adVar2);
                ahVar.mo63592c(afVar2, afVar2);
            } else {
                int size = list.size();
                while (true) {
                    int i = size - 1;
                    if (i < 0) {
                        afVar = null;
                        break;
                    } else if (list.get(i) instanceof C72240af) {
                        afVar = (C72240af) list.get(i);
                        list = list.subList(i + 1, list.size());
                        break;
                    } else {
                        size = i - 1;
                    }
                }
                if (afVar == null || list.size() != 0) {
                    Object[] b = C72242ah.m106552b(list);
                    list.clear();
                    C72240af afVar3 = new C72240af((C72244aj) b[0], (C72243ai) b[1]);
                    list.add(afVar3);
                    list.add(afVar3);
                } else {
                    throw new IllegalStateException("Cannot have two adjacent separators");
                }
            }
            ahVar.mo63594e(4);
            ahVar.mo63593d("H");
            ahVar.mo63594e(5);
            ahVar.mo63593d("M");
            ahVar.mo63594e(9);
            ahVar.mo63593d("S");
            f192346a = ahVar.mo63591a();
        }
        return f192346a;
    }
}
