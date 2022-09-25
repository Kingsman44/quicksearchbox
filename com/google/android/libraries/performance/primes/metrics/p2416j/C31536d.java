package com.google.android.libraries.performance.primes.metrics.p2416j;

import com.google.android.libraries.performance.primes.metrics.C31294b;

/* renamed from: com.google.android.libraries.performance.primes.metrics.j.d */
/* compiled from: PG */
final class C31536d extends C31550r {

    /* renamed from: a */
    private final float f84935a;

    /* renamed from: b */
    private final int f84936b;

    public C31536d(int i, float f) {
        this.f84936b = i;
        this.f84935a = f;
    }

    /* renamed from: c */
    public final float mo37231c() {
        return this.f84935a;
    }

    /* renamed from: d */
    public final int mo37232d() {
        return this.f84936b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31550r) {
            C31550r rVar = (C31550r) obj;
            return this.f84936b == rVar.mo37232d() && Float.floatToIntBits(this.f84935a) == Float.floatToIntBits(rVar.mo37231c());
        }
    }

    public final int hashCode() {
        return ((this.f84936b ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f84935a);
    }

    public final String toString() {
        int i = this.f84936b;
        float f = this.f84935a;
        return "TraceConfigurations{enablement=" + C31294b.m58339a(i) + ", samplingProbability=" + f + "}";
    }
}
