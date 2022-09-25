package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.p10214s.C134560ay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.aj */
/* compiled from: PG */
public final class C135138aj {
    /* renamed from: a */
    public static final Map m219167a(List list) {
        ArrayList<Object> arrayList = new ArrayList<>(C69540x.m100804k(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C134560ay ayVar = (C134560ay) it.next();
            if (1 != (ayVar.f366455a & 1)) {
                ayVar = null;
            }
            arrayList.add(ayVar);
        }
        for (Object obj : arrayList) {
            if (obj == null) {
                throw new IllegalArgumentException("null element found in " + arrayList + '.');
            }
        }
        int b = C69505av.m100860b(C69540x.m100804k(arrayList, 10));
        if (b < 16) {
            b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C134560ay ayVar2 = (C134560ay) it2.next();
            C69685i iVar = new C69685i(ayVar2.f366458d, ayVar2.toByteString());
            linkedHashMap.put(iVar.f186052a, iVar.f186053b);
        }
        return linkedHashMap;
    }
}
