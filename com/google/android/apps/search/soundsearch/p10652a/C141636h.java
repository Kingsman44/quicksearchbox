package com.google.android.apps.search.soundsearch.p10652a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.search.soundsearch.a.h */
/* compiled from: PG */
final class C141636h {
    /* renamed from: a */
    public static List m229852a(List list) {
        List list2 = list;
        int size = list.size();
        int i = 0;
        if (size == 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((C141635g) list2.get(0));
            return arrayList;
        }
        List a = m229852a(m229853b(list2, 0));
        List a2 = m229852a(m229853b(list2, 1));
        int i2 = size / 2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        while (i < i2) {
            double d = (double) i;
            Double.isNaN(d);
            double d2 = (double) size;
            Double.isNaN(d2);
            double d3 = (d * -6.283185307179586d) / d2;
            C141635g gVar = new C141635g(Math.cos(d3), Math.sin(d3));
            C141635g gVar2 = (C141635g) a2.get(i);
            double d4 = gVar.f384455a;
            double d5 = gVar2.f384455a;
            double d6 = gVar.f384456b;
            double d7 = gVar2.f384456b;
            List list3 = a2;
            C141635g gVar3 = new C141635g((d4 * d5) - (d6 * d7), (d4 * d7) + (d6 * d5));
            C141635g gVar4 = (C141635g) a.get(i);
            arrayList2.add(new C141635g(gVar4.f384455a + gVar3.f384455a, gVar4.f384456b + gVar3.f384456b));
            arrayList3.add(new C141635g(gVar4.f384455a - gVar3.f384455a, gVar4.f384456b - gVar3.f384456b));
            i++;
            a2 = list3;
            size = size;
        }
        arrayList2.addAll(arrayList3);
        return arrayList2;
    }

    /* renamed from: b */
    private static List m229853b(List list, int i) {
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        while (i < size) {
            arrayList.add((C141635g) list.get(i));
            i += 2;
        }
        return arrayList;
    }
}
