package com.facebook.litho.p329g;

import com.facebook.litho.C6278fu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.litho.g.w */
/* compiled from: PG */
final class C6344w {

    /* renamed from: a */
    public final Map f18765a = new HashMap();

    /* renamed from: b */
    public final Map f18766b = new HashMap();

    /* renamed from: b */
    public static void m17021b(String str, C6278fu fuVar, Map map) {
        List list = (List) map.get(str);
        if (list == null) {
            list = new ArrayList();
            map.put(str, list);
        }
        list.add(fuVar);
    }

    /* renamed from: c */
    public static void m17022c(Map map, Map map2, String str) {
        List list = (List) map2.get(str);
        List list2 = (List) map.remove(str);
        if (!(list == null || list2 == null)) {
            list2.removeAll(list);
        }
        if (list2 != null && !list2.isEmpty()) {
            map.put(str, list2);
        }
    }

    /* renamed from: a */
    public final C6344w mo13362a() {
        C6344w wVar = new C6344w();
        if (this.f18765a.isEmpty()) {
            return wVar;
        }
        for (String str : this.f18765a.keySet()) {
            wVar.f18765a.put(str, new ArrayList((Collection) this.f18765a.get(str)));
        }
        for (String str2 : this.f18766b.keySet()) {
            wVar.f18766b.put(str2, new ArrayList((Collection) this.f18766b.get(str2)));
        }
        return wVar;
    }
}
