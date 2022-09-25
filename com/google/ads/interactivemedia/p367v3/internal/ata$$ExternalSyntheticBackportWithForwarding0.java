package com.google.ads.interactivemedia.p367v3.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ata$$ExternalSyntheticBackportWithForwarding0 */
/* compiled from: PG */
public final /* synthetic */ class ata$$ExternalSyntheticBackportWithForwarding0 {
    /* renamed from: m */
    public static /* synthetic */ boolean m19556m(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
