package com.google.apps.tiktok.concurrent;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.apps.tiktok.concurrent.ac */
/* compiled from: PG */
public final /* synthetic */ class C46416ac {
    /* renamed from: a */
    public static /* synthetic */ boolean m82770a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
