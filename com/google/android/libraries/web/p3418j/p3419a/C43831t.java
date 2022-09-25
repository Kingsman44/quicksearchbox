package com.google.android.libraries.web.p3418j.p3419a;

import com.google.android.libraries.web.p3418j.C43838c;
import com.google.android.libraries.web.p3418j.C43839d;
import com.google.android.libraries.web.p3418j.C43840e;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.web.j.a.t */
/* compiled from: PG */
public final class C43831t implements C43840e, C43839d {

    /* renamed from: a */
    public volatile Object f114263a;

    /* renamed from: b */
    private final Map f114264b = new ConcurrentHashMap();

    public C43831t(Object obj) {
        this.f114263a = obj;
    }

    /* renamed from: a */
    public final void mo46838a(Object obj, C43838c cVar) {
        this.f114264b.put(obj, cVar);
    }

    /* renamed from: b */
    public final void mo46839b(Object obj) {
        this.f114264b.remove(obj);
    }

    /* renamed from: c */
    public final void mo46840c(Object obj) {
        Object obj2 = this.f114263a;
        this.f114263a = obj;
        Collection.EL.stream(this.f114264b.values()).forEach(new C43830s(obj, obj2));
    }

    /* renamed from: d */
    public final Object mo46841d() {
        return this.f114263a;
    }
}
