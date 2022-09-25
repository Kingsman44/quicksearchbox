package com.google.ads.interactivemedia.p367v3.internal;

import sun.misc.Unsafe;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atg$$ExternalSyntheticBackportWithForwarding0 */
/* compiled from: PG */
public final /* synthetic */ class atg$$ExternalSyntheticBackportWithForwarding0 {
    /* renamed from: m */
    public static /* synthetic */ boolean m19568m(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
