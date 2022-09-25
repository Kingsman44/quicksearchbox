package com.google.android.apps.search.assistant.platform.p9080f.p9092d.p9093a;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.assistant.platform.f.d.a.a */
/* compiled from: PG */
public final /* synthetic */ class C120532a {
    /* renamed from: a */
    public static /* synthetic */ boolean m199648a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
