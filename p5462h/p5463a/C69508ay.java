package p5462h.p5463a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import p5462h.C69685i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.a.ay */
/* compiled from: PG */
class C69508ay extends C69507ax {
    /* renamed from: g */
    public static final Object m100865g(Map map, Object obj) {
        C69664n.m101061g(map, "<this>");
        C69664n.m101061g(map, "<this>");
        if (map instanceof C69504au) {
            C69504au auVar = (C69504au) map;
            Map map2 = auVar.f185926a;
            Object obj2 = map2.get(obj);
            if (obj2 != null || map2.containsKey(obj)) {
                return obj2;
            }
            return auVar.f185927b.mo5761a(obj);
        }
        Object obj3 = map.get(obj);
        if (obj3 != null || map.containsKey(obj)) {
            return obj3;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* renamed from: h */
    public static final HashMap m100866h(C69685i... iVarArr) {
        HashMap hashMap = new HashMap(C69505av.m100860b(iVarArr.length));
        C69505av.m100878t(hashMap, iVarArr);
        return hashMap;
    }

    /* renamed from: i */
    public static final Map m100867i(C69685i... iVarArr) {
        C69664n.m101061g(iVarArr, "pairs");
        int length = iVarArr.length;
        if (length <= 0) {
            return C69497an.f185919a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C69505av.m100860b(length));
        C69505av.m100880v(iVarArr, linkedHashMap);
        return linkedHashMap;
    }

    /* renamed from: j */
    public static final Map m100868j(Map map, Iterable iterable) {
        C69664n.m101061g(map, "<this>");
        C69664n.m101061g(iterable, "keys");
        Map r = C69505av.m100876r(map);
        C69540x.m100813t(r.keySet(), iterable);
        return C69505av.m100870l(r);
    }

    /* renamed from: k */
    public static final Map m100869k(Map map, Object obj) {
        C69664n.m101061g(map, "<this>");
        Map r = C69505av.m100876r(map);
        r.remove(obj);
        return C69505av.m100870l(r);
    }

    /* renamed from: l */
    public static final Map m100870l(Map map) {
        C69664n.m101061g(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return C69497an.f185919a;
        }
        if (size != 1) {
            return map;
        }
        return C69505av.m100863e(map);
    }

    /* renamed from: m */
    public static final Map m100871m(Map map, Iterable iterable) {
        C69664n.m101061g(map, "<this>");
        if (map.isEmpty()) {
            return C69505av.m100874p(iterable);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        C69505av.m100877s(linkedHashMap, iterable);
        return linkedHashMap;
    }

    /* renamed from: n */
    public static final Map m100872n(Map map, Map map2) {
        C69664n.m101061g(map, "<this>");
        C69664n.m101061g(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* renamed from: o */
    public static final Map m100873o(Map map, C69685i iVar) {
        C69664n.m101061g(map, "<this>");
        if (map.isEmpty()) {
            return C69505av.m100862d(iVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(iVar.f186052a, iVar.f186053b);
        return linkedHashMap;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List, java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map m100874p(java.lang.Iterable r2) {
        /*
            java.lang.String r0 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r0)
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x003f
            int r0 = r2.size()
            if (r0 == 0) goto L_0x003c
            r1 = 1
            if (r0 == r1) goto L_0x0023
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.size()
            int r1 = p5462h.p5463a.C69505av.m100860b(r1)
            r0.<init>(r1)
            p5462h.p5463a.C69505av.m100879u(r2, r0)
            goto L_0x003e
        L_0x0023:
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L_0x002d
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            goto L_0x0035
        L_0x002d:
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r2.next()
        L_0x0035:
            h.i r2 = (p5462h.C69685i) r2
            java.util.Map r0 = p5462h.p5463a.C69505av.m100862d(r2)
            goto L_0x003e
        L_0x003c:
            h.a.an r0 = p5462h.p5463a.C69497an.f185919a
        L_0x003e:
            return r0
        L_0x003f:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            p5462h.p5463a.C69505av.m100879u(r2, r0)
            java.util.Map r2 = p5462h.p5463a.C69505av.m100870l(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p5462h.p5463a.C69508ay.m100874p(java.lang.Iterable):java.util.Map");
    }

    /* renamed from: q */
    public static final Map m100875q(Map map) {
        C69664n.m101061g(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return C69497an.f185919a;
        }
        if (size != 1) {
            return C69505av.m100876r(map);
        }
        return C69505av.m100863e(map);
    }

    /* renamed from: r */
    public static final Map m100876r(Map map) {
        C69664n.m101061g(map, "<this>");
        return new LinkedHashMap(map);
    }

    /* renamed from: s */
    public static final void m100877s(Map map, Iterable iterable) {
        C69664n.m101061g(map, "<this>");
        C69664n.m101061g(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C69685i iVar = (C69685i) it.next();
            map.put(iVar.f186052a, iVar.f186053b);
        }
    }

    /* renamed from: t */
    public static final void m100878t(Map map, C69685i[] iVarArr) {
        C69664n.m101061g(iVarArr, "pairs");
        for (C69685i iVar : iVarArr) {
            map.put(iVar.f186052a, iVar.f186053b);
        }
    }

    /* renamed from: u */
    public static final void m100879u(Iterable iterable, Map map) {
        C69664n.m101061g(iterable, "<this>");
        C69505av.m100877s(map, iterable);
    }

    /* renamed from: v */
    public static final void m100880v(C69685i[] iVarArr, Map map) {
        C69664n.m101061g(iVarArr, "<this>");
        C69505av.m100878t(map, iVarArr);
    }
}
