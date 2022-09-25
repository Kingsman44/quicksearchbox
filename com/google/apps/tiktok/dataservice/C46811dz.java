package com.google.apps.tiktok.dataservice;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.apps.tiktok.dataservice.dz */
/* compiled from: PG */
public final /* synthetic */ class C46811dz {
    /* renamed from: a */
    public static /* synthetic */ boolean m83389a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
