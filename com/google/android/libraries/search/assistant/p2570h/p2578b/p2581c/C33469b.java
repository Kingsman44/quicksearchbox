package com.google.android.libraries.search.assistant.p2570h.p2578b.p2581c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.h.b.c.b */
/* compiled from: PG */
public final class C33469b {

    /* renamed from: a */
    private final ConcurrentHashMap f89577a = new ConcurrentHashMap();

    /* renamed from: a */
    public final void mo38874a(C33468a aVar) {
        this.f89577a.put(aVar.f89575a, aVar);
    }

    /* renamed from: b */
    public final C33468a mo38875b(String str) {
        Collection values = this.f89577a.values();
        C69664n.m101060f(values, "childNodes.values");
        return new C33468a(str, C69540x.m100840V(values));
    }

    /* renamed from: c */
    public final void mo38876c(String str, String str2) {
        C69664n.m101061g(str2, "value");
        ConcurrentHashMap concurrentHashMap = this.f89577a;
        concurrentHashMap.put(str, new C33468a(str + " " + str2));
    }

    /* renamed from: d */
    public final void mo38877d(String str, List list) {
        C69664n.m101061g(list, "stringList");
        ConcurrentHashMap concurrentHashMap = this.f89577a;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C33468a((String) it.next()));
        }
        concurrentHashMap.put(str, new C33468a(str, arrayList));
    }
}
