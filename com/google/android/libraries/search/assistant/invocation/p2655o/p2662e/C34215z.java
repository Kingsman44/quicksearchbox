package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p5462h.p5463a.C69498ao;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.z */
/* compiled from: PG */
public final class C34215z {
    /* renamed from: a */
    public static final String m62844a(C34174at atVar) {
        Set<C34175au> set;
        if (atVar == null || (set = atVar.f90969a) == null) {
            set = C69498ao.f185920a;
        }
        if ((atVar == null || atVar.isEmpty()) && set.isEmpty()) {
            return "  N/A (candidates: N/A)";
        }
        String b = m62845b(atVar);
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append("\n  candidates:");
        if (set.isEmpty()) {
            sb.append(" N/A");
        } else {
            for (C34175au auVar : set) {
                new StringBuilder("\n    ").append(auVar);
                sb.append("\n    ".concat(String.valueOf(auVar)));
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static final String m62845b(Map map) {
        if (map == null || map.isEmpty()) {
            return "  N/A";
        }
        Set<Map.Entry> entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            Object obj = linkedHashMap.get(value);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(value, obj);
            }
            ((List) obj).add((C34043bf) entry.getKey());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C69505av.m100860b(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            List<C34043bf> S = C69540x.m100837S((Iterable) entry2.getValue(), new C34214y());
            ArrayList arrayList = new ArrayList(C69540x.m100804k(S, 10));
            for (C34043bf name : S) {
                arrayList.add(name.name());
            }
            linkedHashMap2.put(key, arrayList);
        }
        return C69540x.m100851ag(C69505av.m100882w(linkedHashMap2), "\n  ", "  ", (CharSequence) null, C34213x.f91043a, 28);
    }
}
