package p5462h.p5463a;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import p5462h.C69685i;
import p5462h.p5463a.p5464a.C69477k;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.a.ax */
/* compiled from: PG */
class C69507ax extends C69506aw {
    /* renamed from: b */
    public static final int m100860b(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i >= 1073741824) {
            return Integer.MAX_VALUE;
        }
        return (int) ((((float) i) / 0.75f) + 1.0f);
    }

    /* renamed from: c */
    public static final Map m100861c(Map map) {
        C69664n.m101061g(map, "builder");
        C69477k kVar = (C69477k) map;
        kVar.mo61117j();
        return kVar;
    }

    /* renamed from: d */
    public static final Map m100862d(C69685i iVar) {
        C69664n.m101061g(iVar, "pair");
        Map singletonMap = Collections.singletonMap(iVar.f186052a, iVar.f186053b);
        C69664n.m101060f(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: e */
    public static final Map m100863e(Map map) {
        C69664n.m101061g(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C69664n.m101060f(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    /* renamed from: f */
    public static final SortedMap m100864f(Map map) {
        C69664n.m101061g(map, "<this>");
        return new TreeMap(map);
    }
}
