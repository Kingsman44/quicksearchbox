package com.google.p5238v.p5239a;

import com.google.p5238v.p5239a.p5253h.C67638a;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.v.a.ad */
/* compiled from: PG */
public final class C67533ad {

    /* renamed from: a */
    public final C67531ab f183450a;

    /* renamed from: b */
    public final Class f183451b;

    /* renamed from: c */
    public final C67638a f183452c;

    /* renamed from: d */
    private final ConcurrentMap f183453d;

    public C67533ad(ConcurrentMap concurrentMap, C67531ab abVar, C67638a aVar, Class cls) {
        this.f183453d = concurrentMap;
        this.f183450a = abVar;
        this.f183451b = cls;
        this.f183452c = aVar;
    }

    /* renamed from: a */
    public final Collection mo59909a() {
        return this.f183453d.values();
    }

    /* renamed from: b */
    public final List mo59910b(byte[] bArr) {
        List list = (List) this.f183453d.get(new C67532ac(bArr));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    /* renamed from: c */
    public final boolean mo59911c() {
        return !this.f183452c.f183587b.isEmpty();
    }
}
