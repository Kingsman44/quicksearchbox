package org.chromium.net.impl;

import java.util.concurrent.Executor;
import org.chromium.net.NetworkQualityThroughputListener;

/* renamed from: org.chromium.net.impl.cx */
/* compiled from: PG */
public final class C72518cx extends NetworkQualityThroughputListener {

    /* renamed from: a */
    public final NetworkQualityThroughputListener f192964a;

    public C72518cx(NetworkQualityThroughputListener networkQualityThroughputListener) {
        super(networkQualityThroughputListener.getExecutor());
        this.f192964a = networkQualityThroughputListener;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C72518cx)) {
            return false;
        }
        return this.f192964a.equals(((C72518cx) obj).f192964a);
    }

    public final Executor getExecutor() {
        return this.f192964a.getExecutor();
    }

    public final int hashCode() {
        return this.f192964a.hashCode();
    }

    public final void onThroughputObservation(int i, long j, int i2) {
        this.f192964a.onThroughputObservation(i, j, i2);
    }
}
