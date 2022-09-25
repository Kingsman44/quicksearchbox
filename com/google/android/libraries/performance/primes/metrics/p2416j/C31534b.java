package com.google.android.libraries.performance.primes.metrics.p2416j;

import com.google.android.libraries.performance.primes.metrics.C31294b;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.performance.primes.metrics.j.b */
/* compiled from: PG */
final class C31534b extends C31547o {

    /* renamed from: a */
    private final int f84927a;

    /* renamed from: b */
    private final C58833ax f84928b;

    /* renamed from: c */
    private final boolean f84929c;

    /* renamed from: d */
    private final int f84930d;

    /* renamed from: e */
    private final C31546n f84931e;

    public C31534b(int i, int i2, C31546n nVar, C58833ax axVar, boolean z) {
        this.f84930d = i;
        this.f84927a = i2;
        this.f84931e = nVar;
        this.f84928b = axVar;
        this.f84929c = z;
    }

    /* renamed from: a */
    public final int mo36979a() {
        return this.f84927a;
    }

    /* renamed from: c */
    public final C58833ax mo37223c() {
        return this.f84928b;
    }

    /* renamed from: d */
    public final boolean mo37224d() {
        return this.f84929c;
    }

    /* renamed from: e */
    public final int mo37225e() {
        return this.f84930d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31547o) {
            C31547o oVar = (C31547o) obj;
            return this.f84930d == oVar.mo37225e() && this.f84927a == oVar.mo36979a() && this.f84931e.equals(oVar.mo37227f()) && this.f84928b.equals(oVar.mo37223c()) && this.f84929c == oVar.mo37224d();
        }
    }

    /* renamed from: f */
    public final C31546n mo37227f() {
        return this.f84931e;
    }

    public final int hashCode() {
        return ((((((((this.f84930d ^ 1000003) * 1000003) ^ this.f84927a) * 1000003) ^ this.f84931e.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.f84929c ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f84930d;
        int i2 = this.f84927a;
        String obj = this.f84931e.toString();
        boolean z = this.f84929c;
        return "TikTokTraceConfigurations{enablement=" + C31294b.m58339a(i) + ", rateLimitPerSecond=" + i2 + ", dynamicSampler=" + obj + ", traceMetricExtensionProvider=Optional.absent(), recordTimerDuration=" + z + "}";
    }
}
