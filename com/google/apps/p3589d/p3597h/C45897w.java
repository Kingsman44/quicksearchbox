package com.google.apps.p3589d.p3597h;

import com.google.apps.p3589d.p3591b.C45712c;
import com.google.apps.p3589d.p3591b.C45719j;
import com.google.apps.p3589d.p3591b.C45723n;
import com.google.apps.p3589d.p3595f.C45819v;
import com.google.apps.p3589d.p3595f.C45823z;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.apps.d.h.w */
/* compiled from: PG */
final class C45897w {
    /* renamed from: a */
    static void m81951a(C45819v vVar, C45719j jVar, double d, C45723n nVar, C45723n nVar2) {
        C45712c cVar;
        C45723n nVar3 = nVar;
        C45723n nVar4 = nVar2;
        int i = 0;
        while (true) {
            double d2 = (vVar.f120480a / 1000.0d) * 50.0d;
            nVar3.f120220a.clear();
            nVar4.f120220a.clear();
            C45712c cVar2 = new C45712c(jVar);
            C45823z zVar = null;
            double d3 = C59203do.f157270a;
            double d4 = Double.POSITIVE_INFINITY;
            while (cVar2.hasNext()) {
                C45823z zVar2 = (C45823z) cVar2.next();
                int i2 = 1;
                if (true == zVar2.mo49958e()) {
                    i2 = i;
                }
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = i2;
                    nVar3.f120220a.add(Integer.valueOf(zVar2.mo49957d()));
                    if (zVar != null) {
                        cVar = cVar2;
                        double b = zVar.mo49955b() - Math.max(Math.min(zVar.mo49954a(), zVar2.mo49956c()), d2);
                        d4 = Math.min(d4, (zVar.mo49955b() - d2) - b);
                        d3 += b;
                    } else {
                        cVar = cVar2;
                    }
                    nVar4.f120220a.add(Double.valueOf(d3));
                    i3++;
                    C45819v vVar2 = vVar;
                    C45719j jVar2 = jVar;
                    zVar = zVar2;
                    cVar2 = cVar;
                    i2 = i4;
                }
                C45819v vVar3 = vVar;
                C45719j jVar3 = jVar;
            }
            if (zVar != null) {
                double b2 = d3 + zVar.mo49955b();
                double size = (double) (nVar3.f120220a.size() - 1);
                Double.isNaN(size);
                double d5 = (d4 * size) + b2;
                if (b2 < d) {
                    if (d <= d5) {
                        double size2 = (double) (nVar3.f120220a.size() - 1);
                        Double.isNaN(size2);
                        double d6 = (d - b2) / size2;
                        for (int i5 = 0; i5 < nVar4.f120220a.size(); i5++) {
                            double doubleValue = ((Double) nVar4.mo49815d(i5)).doubleValue();
                            double d7 = (double) i5;
                            Double.isNaN(d7);
                            nVar4.mo49830i(i5, Double.valueOf(doubleValue + (d7 * d6)));
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            i++;
        }
    }
}
