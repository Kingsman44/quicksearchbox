package com.google.android.apps.search.googleapp.search.p10410f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p5462h.C69685i;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.f.i */
/* compiled from: PG */
public final class C137433i {
    /* renamed from: a */
    public static final C137435k m223293a(List list, List list2) {
        C69664n.m101061g(list, "items");
        C69664n.m101061g(list2, "columns");
        ArrayList<C137430f> arrayList = new ArrayList<>();
        arrayList.add(new C137430f("timestamp", C137431g.f373800a));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C137430f fVar = (C137430f) it.next();
            arrayList.add(new C137430f(fVar.f373798a, new C137432h(fVar.f373799b)));
        }
        ArrayList arrayList2 = new ArrayList(C69540x.m100804k(arrayList, 10));
        for (C137430f fVar2 : arrayList) {
            arrayList2.add(new C69685i(fVar2.f373798a, fVar2.f373799b));
        }
        C69685i m = C69540x.m100806m(arrayList2);
        List list3 = (List) m.f186052a;
        List<C69626l> list4 = (List) m.f186053b;
        ArrayList arrayList3 = new ArrayList(C69540x.m100804k(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C137448x xVar = (C137448x) it2.next();
            ArrayList arrayList4 = new ArrayList(C69540x.m100804k(list4, 10));
            for (C69626l a : list4) {
                arrayList4.add((String) a.mo5761a(xVar));
            }
            arrayList3.add(arrayList4);
        }
        return new C137435k(list3, arrayList3);
    }
}
