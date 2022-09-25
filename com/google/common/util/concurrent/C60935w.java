package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.common.util.concurrent.w */
/* compiled from: PG */
public final /* synthetic */ class C60935w {
    /* renamed from: a */
    public static /* synthetic */ boolean m93076a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
