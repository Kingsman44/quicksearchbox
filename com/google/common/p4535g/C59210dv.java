package com.google.common.p4535g;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58597ky;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.common.g.dv */
/* compiled from: PG */
final class C59210dv {
    /* renamed from: a */
    static double m91843a(List list) {
        List list2;
        C59206dr drVar;
        if (list.isEmpty()) {
            return -6.283185307179586d;
        }
        ArrayList d = C58597ky.m90213d(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C59136bb bbVar = (C59136bb) it.next();
            if (d.isEmpty() || !bbVar.mo56506q((C59136bb) C58557jl.m90131l(d))) {
                if (d.size() < 2 || !bbVar.mo56506q((C59136bb) d.get(d.size() - 2))) {
                    d.add(bbVar);
                } else {
                    d.remove(d.size() - 1);
                }
            }
        }
        int i = 0;
        if (d.size() < 3) {
            list2 = C58485gu.m89845m();
        } else {
            if (((C59136bb) d.get(0)).mo56506q((C59136bb) C58557jl.m90131l(d))) {
                d.remove(d.size() - 1);
            }
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (!((C59136bb) d.get(i3)).mo56506q((C59136bb) d.get((d.size() - i2) - 1))) {
                    break;
                }
                i2 = i3;
            }
            list2 = d.subList(i2, d.size() - i2);
        }
        if (list2.isEmpty()) {
            return 6.283185307179586d;
        }
        if (list2.isEmpty()) {
            drVar = new C59206dr(0, 1);
        } else {
            ArrayList c = C58597ky.m90212c(0);
            for (int i4 = 1; i4 < list2.size(); i4++) {
                if (((C59136bb) list2.get(i4)).compareTo((C59136bb) list2.get(((Integer) c.get(0)).intValue())) <= 0) {
                    if (((C59136bb) list2.get(i4)).compareTo((C59136bb) list2.get(((Integer) c.get(0)).intValue())) < 0) {
                        c.clear();
                    }
                    c.add(Integer.valueOf(i4));
                }
            }
            C59206dr drVar2 = new C59206dr(((Integer) c.get(0)).intValue(), 1);
            C59208dt dtVar = new C59208dt(list2);
            int size = c.size();
            for (int i5 = 0; i5 < size; i5++) {
                int intValue = ((Integer) c.get(i5)).intValue();
                C59206dr drVar3 = new C59206dr(intValue, 1);
                C59206dr drVar4 = new C59206dr(intValue + list2.size(), -1);
                if (dtVar.compare(drVar3, drVar2) < 0) {
                    drVar2 = drVar3;
                }
                if (dtVar.compare(drVar4, drVar2) < 0) {
                    drVar2 = drVar4;
                }
            }
            drVar = drVar2;
        }
        int i6 = drVar.f157278a;
        int i7 = drVar.f157279b;
        int size2 = list2.size();
        double d2 = C59222p.m91898d((C59136bb) list2.get(((i6 + size2) - i7) % size2), (C59136bb) list2.get(i6 % size2), (C59136bb) list2.get((i6 + i7) % size2));
        double d3 = C59203do.f157270a;
        while (i < size2 - 1) {
            i6 += i7;
            double d4 = C59222p.m91898d((C59136bb) list2.get((i6 - i7) % size2), (C59136bb) list2.get(i6 % size2), (C59136bb) list2.get((i6 + i7) % size2)) + d3;
            double d5 = d2 + d4;
            i++;
            double d6 = (d2 - d5) + d4;
            d2 = d5;
            d3 = d6;
        }
        double d7 = 6.283185307179586d - (C59222p.f157311c * 4.0d);
        double d8 = (double) i7;
        Double.isNaN(d8);
        return Math.max(-d7, Math.min(d7, d8 * (d2 + d3)));
    }
}
