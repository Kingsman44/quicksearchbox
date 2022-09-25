package com.google.android.libraries.p1963i;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.i.ak */
/* compiled from: PG */
public final /* synthetic */ class C23836ak {
    /* renamed from: a */
    public static /* synthetic */ boolean m44378a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
