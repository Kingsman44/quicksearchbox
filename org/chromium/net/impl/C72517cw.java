package org.chromium.net.impl;

import java.util.concurrent.Executor;
import org.chromium.net.NetworkQualityRttListener;

/* renamed from: org.chromium.net.impl.cw */
/* compiled from: PG */
public final class C72517cw extends NetworkQualityRttListener {

    /* renamed from: a */
    public final NetworkQualityRttListener f192963a;

    public C72517cw(NetworkQualityRttListener networkQualityRttListener) {
        super(networkQualityRttListener.getExecutor());
        this.f192963a = networkQualityRttListener;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C72517cw)) {
            return false;
        }
        return this.f192963a.equals(((C72517cw) obj).f192963a);
    }

    public final Executor getExecutor() {
        return this.f192963a.getExecutor();
    }

    public final int hashCode() {
        return this.f192963a.hashCode();
    }

    public final void onRttObservation(int i, long j, int i2) {
        this.f192963a.onRttObservation(i, j, i2);
    }
}
