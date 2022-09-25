package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aua */
/* compiled from: PG */
final class aua extends WeakReference {

    /* renamed from: a */
    private final int f21555a;

    public aua(Throwable th, ReferenceQueue referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f21555a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            aua aua = (aua) obj;
            return this.f21555a == aua.f21555a && get() == aua.get();
        }
    }

    public final int hashCode() {
        return this.f21555a;
    }
}
