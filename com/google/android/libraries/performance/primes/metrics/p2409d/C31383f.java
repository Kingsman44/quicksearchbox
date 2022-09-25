package com.google.android.libraries.performance.primes.metrics.p2409d;

import com.google.android.libraries.performance.primes.metrics.C31294b;

/* renamed from: com.google.android.libraries.performance.primes.metrics.d.f */
/* compiled from: PG */
final class C31383f extends C31397r {

    /* renamed from: a */
    private final int f84494a;

    /* renamed from: b */
    private final int f84495b;

    public C31383f(int i, int i2) {
        this.f84495b = i;
        this.f84494a = i2;
    }

    /* renamed from: a */
    public final int mo36979a() {
        return this.f84494a;
    }

    /* renamed from: c */
    public final int mo37085c() {
        return this.f84495b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31397r) {
            C31397r rVar = (C31397r) obj;
            return this.f84495b == rVar.mo37085c() && this.f84494a == rVar.mo36979a();
        }
    }

    public final int hashCode() {
        return ((this.f84495b ^ 1000003) * 1000003) ^ this.f84494a;
    }

    public final String toString() {
        int i = this.f84495b;
        int i2 = this.f84494a;
        return "JankConfigurations{enablement=" + C31294b.m58339a(i) + ", rateLimitPerSecond=" + i2 + "}";
    }
}
