package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.c */
/* compiled from: PG */
final class C2372c {

    /* renamed from: a */
    final Map f6591a = new HashMap();

    /* renamed from: b */
    final Map f6592b;

    public C2372c(Map map) {
        this.f6592b = map;
        for (Map.Entry entry : map.entrySet()) {
            C2382m mVar = (C2382m) entry.getValue();
            List list = (List) this.f6591a.get(mVar);
            if (list == null) {
                list = new ArrayList();
                this.f6591a.put(mVar, list);
            }
            list.add((C2373d) entry.getKey());
        }
    }

    /* renamed from: a */
    public static void m6373a(List list, C2391v vVar, C2382m mVar, Object obj) {
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    C2373d dVar = (C2373d) list.get(size);
                    try {
                        int i = dVar.f6593a;
                        if (i == 0) {
                            dVar.f6594b.invoke(obj, new Object[0]);
                        } else if (i != 1) {
                            dVar.f6594b.invoke(obj, new Object[]{vVar, mVar});
                        } else {
                            dVar.f6594b.invoke(obj, new Object[]{vVar});
                        }
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                } else {
                    return;
                }
            }
        }
    }
}
