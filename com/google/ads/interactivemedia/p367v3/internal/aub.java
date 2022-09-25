package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aub */
/* compiled from: PG */
final class aub {

    /* renamed from: a */
    private final ConcurrentHashMap f21556a = new ConcurrentHashMap(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue f21557b = new ReferenceQueue();

    /* renamed from: a */
    public final List mo15445a(Throwable th, boolean z) {
        ReferenceQueue referenceQueue = this.f21557b;
        while (true) {
            Reference poll = referenceQueue.poll();
            if (poll == null) {
                break;
            }
            this.f21556a.remove(poll);
            referenceQueue = this.f21557b;
        }
        List list = (List) this.f21556a.get(new aua(th, (ReferenceQueue) null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List list2 = (List) this.f21556a.putIfAbsent(new aua(th, this.f21557b), vector);
        return list2 == null ? vector : list2;
    }
}
