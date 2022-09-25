package com.google.frameworks.client.data.android.p4641h;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.frameworks.client.data.android.h.ah */
/* compiled from: PG */
public final /* synthetic */ class C61475ah {
    /* renamed from: a */
    public static /* synthetic */ boolean m94182a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
