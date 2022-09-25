package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.an */
/* compiled from: PG */
final class C34168an extends C69665o implements C69626l {
    public C34168an() {
        super(1);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C34174at atVar = (C34174at) obj;
        C69664n.m101061g(atVar, "it");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C69505av.m100860b(atVar.mo39237a()));
        for (Map.Entry entry : atVar.mo39238b()) {
            linkedHashMap.put(entry.getKey(), C34173as.m62795c((C34175au) entry.getValue()));
        }
        Set<C34175au> set = atVar.f90969a;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(set, 10));
        for (C34175au c : set) {
            arrayList.add(C34173as.m62795c(c));
        }
        return new C69685i(linkedHashMap, arrayList);
    }
}
