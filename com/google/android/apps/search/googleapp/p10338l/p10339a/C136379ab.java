package com.google.android.apps.search.googleapp.p10338l.p10339a;

import com.google.android.apps.search.googleapp.p10338l.C136376a;
import com.google.android.apps.search.googleapp.p10338l.C136420n;
import java.util.ArrayList;
import java.util.Map;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.l.a.ab */
/* compiled from: PG */
public final class C136379ab {
    /* renamed from: a */
    public static final C136380ac m221604a(Map map, Map map2, Map map3) {
        C69664n.m101061g(map, "keyValue");
        C69664n.m101061g(map2, "complex");
        C69664n.m101061g(map3, "complexItems");
        return new C136380ac(m221605b(map), m221605b(map2), m221605b(map3));
    }

    /* renamed from: b */
    private static final Map m221605b(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            C136420n nVar = (C136420n) entry.getValue();
            C69685i iVar = null;
            C136376a aVar = nVar instanceof C136376a ? (C136376a) nVar : null;
            if (aVar != null) {
                iVar = new C69685i(key, aVar);
            }
            if (iVar != null) {
                arrayList.add(iVar);
            }
        }
        return C69505av.m100874p(arrayList);
    }
}
