package com.google.apps.tiktok.experiments.phenotype;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.dd */
/* compiled from: PG */
public final /* synthetic */ class C46991dd {
    /* renamed from: a */
    public static /* synthetic */ boolean m83639a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
