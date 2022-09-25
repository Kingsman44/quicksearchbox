package com.google.android.libraries.home.p1940a.p1943c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import p3186j$.util.Optional;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.bc */
/* compiled from: PG */
public final class C23475bc {

    /* renamed from: a */
    public final Map f64206a;

    /* renamed from: b */
    private final Map f64207b;

    public C23475bc(Map map, Map map2) {
        this.f64206a = map;
        this.f64207b = map2;
    }

    /* renamed from: a */
    public final Optional mo28890a(C23574eu euVar, C23553e eVar, Collection collection) {
        C69664n.m101061g(euVar, "type");
        C69664n.m101061g(collection, "parameters");
        C23570eq eqVar = (C23570eq) this.f64207b.get(euVar);
        if (eqVar == null) {
            Optional empty = Optional.empty();
            C69664n.m101060f(empty, "empty()");
            return empty;
        }
        C69664n.m101061g(collection, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : collection) {
            if (((C23544dr) next).mo28914j().isPresent()) {
                arrayList.add(next);
            }
        }
        int b = C69505av.m100860b(C69540x.m100804k(arrayList, 10));
        if (b < 16) {
            b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b);
        for (Object next2 : arrayList) {
            linkedHashMap.put((C23542dp) ((C23544dr) next2).mo28914j().get(), next2);
        }
        Optional of = Optional.m71637of(eqVar.mo28847a(eVar, linkedHashMap));
        C69664n.m101060f(of, "of(factory.create(device…eters.associateByType()))");
        return of;
    }
}
