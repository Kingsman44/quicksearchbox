package com.google.android.libraries.performance.primes.metrics.p2415i;

import com.google.android.libraries.performance.primes.metrics.C31294b;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.performance.primes.metrics.i.b */
/* compiled from: PG */
final class C31509b extends C31519l {

    /* renamed from: a */
    private final int f84854a;

    /* renamed from: b */
    private final float f84855b;

    /* renamed from: c */
    private final C58833ax f84856c;

    /* renamed from: d */
    private final int f84857d;

    public C31509b(int i, int i2, float f, C58833ax axVar) {
        this.f84857d = i;
        this.f84854a = i2;
        this.f84855b = f;
        this.f84856c = axVar;
    }

    /* renamed from: a */
    public final int mo36979a() {
        return this.f84854a;
    }

    /* renamed from: c */
    public final float mo37201c() {
        return this.f84855b;
    }

    /* renamed from: d */
    public final C58833ax mo37202d() {
        return this.f84856c;
    }

    /* renamed from: e */
    public final int mo37203e() {
        return this.f84857d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31519l) {
            C31519l lVar = (C31519l) obj;
            return this.f84857d == lVar.mo37203e() && this.f84854a == lVar.mo36979a() && Float.floatToIntBits(this.f84855b) == Float.floatToIntBits(lVar.mo37201c()) && this.f84856c.equals(lVar.mo37202d());
        }
    }

    public final int hashCode() {
        return ((((((this.f84857d ^ 1000003) * 1000003) ^ this.f84854a) * 1000003) ^ Float.floatToIntBits(this.f84855b)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        int i = this.f84857d;
        int i2 = this.f84854a;
        float f = this.f84855b;
        String valueOf = String.valueOf(this.f84856c);
        return "TimerConfigurations{enablement=" + C31294b.m58339a(i) + ", rateLimitPerSecond=" + i2 + ", samplingProbability=" + f + ", perEventConfigurationFlags=" + valueOf + "}";
    }
}
