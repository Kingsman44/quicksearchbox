package com.google.android.libraries.web.lifecycle.p3426b;

import java.util.Map;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5481k.C69713k;

/* renamed from: com.google.android.libraries.web.lifecycle.b.c */
/* compiled from: PG */
public final class C43881c {

    /* renamed from: a */
    private final C69626l f114335a;

    public C43881c(C69626l lVar) {
        this.f114335a = lVar;
    }

    /* renamed from: a */
    public final Object mo46879a(C43880b bVar, C69713k kVar) {
        C69664n.m101061g(bVar, "thisRef");
        C69664n.m101061g(kVar, "property");
        Map map = bVar.mo46412e().f114334a;
        Object obj = map.get(kVar);
        if (obj != null) {
            return obj;
        }
        Object a = this.f114335a.mo5761a(bVar);
        map.put(kVar, a);
        return a;
    }
}
