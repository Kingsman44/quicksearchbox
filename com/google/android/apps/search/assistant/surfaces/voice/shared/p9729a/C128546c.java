package com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.a.c */
/* compiled from: PG */
public final /* synthetic */ class C128546c {
    /* renamed from: a */
    public static /* synthetic */ boolean m209791a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
