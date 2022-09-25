package com.google.android.libraries.assistant.p1363c.p1382d.p1384b;

import com.google.android.libraries.assistant.p1363c.p1382d.C17214d;
import com.google.android.libraries.assistant.p1363c.p1382d.p1383a.C17197b;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.c.d.b.d */
/* compiled from: PG */
public final class C17202d {

    /* renamed from: a */
    private final ConcurrentHashMap f49942a = new ConcurrentHashMap();

    /* renamed from: a */
    public final C17214d mo23239a(C17197b bVar) {
        C69664n.m101061g(bVar, "library");
        C17214d dVar = (C17214d) this.f49942a.get(bVar);
        return dVar == null ? C17214d.NOT_LOADED : dVar;
    }

    /* renamed from: b */
    public final void mo23240b(C17197b bVar, C17214d dVar) {
        C69664n.m101061g(bVar, "library");
        C69664n.m101061g(dVar, "source");
        this.f49942a.put(bVar, dVar);
    }
}
