package com.google.android.libraries.performance.primes.metrics.p2406c;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;

/* renamed from: com.google.android.libraries.performance.primes.metrics.c.a */
/* compiled from: PG */
public final class C31321a extends C31324b {
    /* renamed from: c */
    public final double mo37028c() {
        return 5.0d;
    }

    /* renamed from: d */
    public final int mo37029d() {
        return C89885b.NOW_VALUE;
    }

    /* renamed from: e */
    public final int mo37030e() {
        return 30000;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31324b) {
            C31324b bVar = (C31324b) obj;
            return bVar.mo37034h() == 1 && bVar.mo37029d() == 2097152 && bVar.mo37030e() == 30000 && bVar.mo37032f() == 5000 && bVar.mo37033g() == 1000 && Double.doubleToLongBits(5.0d) == Double.doubleToLongBits(bVar.mo37028c());
        }
    }

    /* renamed from: f */
    public final int mo37032f() {
        return 5000;
    }

    /* renamed from: g */
    public final int mo37033g() {
        return 1000;
    }

    /* renamed from: h */
    public final int mo37034h() {
        return 1;
    }

    public final int hashCode() {
        return 388790310 ^ ((int) (Double.doubleToLongBits(5.0d) ^ (Double.doubleToLongBits(5.0d) >>> 32)));
    }

    public final String toString() {
        return "CpuProfilingConfigurations{enablement=DEFAULT, maxBufferSizeBytes=2097152, sampleDurationMs=30000, sampleDurationSkewMs=5000, sampleFrequencyMicro=1000, samplesPerEpoch=5.0}";
    }
}
