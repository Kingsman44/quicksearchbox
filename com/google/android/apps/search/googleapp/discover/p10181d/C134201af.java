package com.google.android.apps.search.googleapp.discover.p10181d;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.af */
/* compiled from: PG */
public final /* synthetic */ class C134201af {
    /* renamed from: a */
    public static /* synthetic */ boolean m217698a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
