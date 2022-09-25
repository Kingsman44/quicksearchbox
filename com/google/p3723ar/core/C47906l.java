package com.google.p3723ar.core;

import java.util.Map;

/* renamed from: com.google.ar.core.l */
/* compiled from: PG */
final class C47906l {

    /* renamed from: a */
    final Map f124045a = new C47905k();

    /* renamed from: a */
    public final synchronized AugmentedFace mo52253a(long j, Session session) {
        Map map = this.f124045a;
        Long valueOf = Long.valueOf(j);
        AugmentedFace augmentedFace = (AugmentedFace) map.get(valueOf);
        if (augmentedFace != null) {
            return augmentedFace;
        }
        AugmentedFace augmentedFace2 = new AugmentedFace(j, session);
        this.f124045a.put(valueOf, augmentedFace2);
        return augmentedFace2;
    }
}
