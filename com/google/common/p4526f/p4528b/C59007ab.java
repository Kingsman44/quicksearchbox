package com.google.common.p4526f.p4528b;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4534f.C59081b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.f.b.ab */
/* compiled from: PG */
final class C59007ab extends C59008ac {

    /* renamed from: a */
    private final Map f156899a;

    public C59007ab(C59037l lVar, C59037l lVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m91210e(linkedHashMap, lVar);
        m91210e(linkedHashMap, lVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((C58976aa) entry.getKey()).f156829c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.f156899a = Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: e */
    private static void m91210e(Map map, C59037l lVar) {
        for (int i = 0; i < lVar.mo56310b(); i++) {
            C58976aa c = lVar.mo56311c(i);
            Object obj = map.get(c);
            if (c.f156829c) {
                List list = (List) obj;
                if (list == null) {
                    list = new ArrayList();
                    map.put(c, list);
                }
                list.add(c.f156828b.cast(lVar.mo56313e(i)));
            } else {
                map.put(c, c.f156828b.cast(lVar.mo56313e(i)));
            }
        }
    }

    /* renamed from: a */
    public final int mo56271a() {
        return this.f156899a.size();
    }

    /* renamed from: b */
    public final Object mo56272b(C58976aa aaVar) {
        C59081b.m91350b(!aaVar.f156829c, "key must be single valued");
        Object obj = this.f156899a.get(aaVar);
        if (obj != null) {
            return obj;
        }
        return null;
    }

    /* renamed from: c */
    public final Set mo56273c() {
        return this.f156899a.keySet();
    }

    /* renamed from: d */
    public final void mo56274d(C59044s sVar, Object obj) {
        for (Map.Entry entry : this.f156899a.entrySet()) {
            C58976aa aaVar = (C58976aa) entry.getKey();
            Object value = entry.getValue();
            if (aaVar.f156829c) {
                sVar.mo56317b(aaVar, ((List) value).iterator(), obj);
            } else {
                sVar.mo56316a(aaVar, value, obj);
            }
        }
    }
}
