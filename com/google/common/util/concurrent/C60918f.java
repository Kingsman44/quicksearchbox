package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* renamed from: com.google.common.util.concurrent.f */
/* compiled from: PG */
public final /* synthetic */ class C60918f {
    /* renamed from: a */
    public static /* synthetic */ boolean m93036a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
