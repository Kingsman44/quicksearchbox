package com.google.android.libraries.web.coordinator.internal;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.coordinator.internal.c */
/* compiled from: PG */
public final class C43740c {

    /* renamed from: a */
    public final Map f114082a;

    /* renamed from: b */
    private final AtomicReference f114083b;

    public C43740c(Map map, AtomicReference atomicReference) {
        C69664n.m101061g(atomicReference, "webCoordinatorMarker");
        this.f114082a = map;
        this.f114083b = atomicReference;
        Object obj = atomicReference.get();
        C69664n.m101060f(obj, "webCoordinatorMarker.get()");
        if (!((Boolean) obj).booleanValue()) {
            throw new IllegalStateException("Trying to access a WebCoordinatorRetained object from outside of WebCoordinatorFragment or through the wrong ViewModel.");
        }
    }
}
