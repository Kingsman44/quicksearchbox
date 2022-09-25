package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32853cu;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.cv */
/* compiled from: PG */
public final class C32680cv {

    /* renamed from: a */
    public static final C32679cu f87585a = new C32679cu();

    /* renamed from: b */
    public final List f87586b;

    /* renamed from: c */
    private final Map f87587c;

    public C32680cv(List list) {
        C69664n.m101061g(list, "supportedKeys");
        this.f87586b = list;
        int b = C69505av.m100860b(C69540x.m100804k(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(b < 16 ? 16 : b);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C32853cu cuVar = (C32853cu) it.next();
            C32796ar arVar = cuVar.f88070b;
            if (arVar == null) {
                arVar = C32796ar.f87973c;
            }
            linkedHashMap.put(arVar, cuVar);
        }
        this.f87587c = linkedHashMap;
    }

    /* renamed from: a */
    public final C32853cu mo38240a(C32796ar arVar) {
        C69664n.m101061g(arVar, "key");
        return (C32853cu) this.f87587c.get(arVar);
    }

    /* renamed from: b */
    public final boolean mo38241b(C32796ar arVar) {
        C69664n.m101061g(arVar, "key");
        return mo38240a(arVar) != null;
    }
}
