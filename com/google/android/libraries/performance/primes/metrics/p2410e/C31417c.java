package com.google.android.libraries.performance.primes.metrics.p2410e;

import com.google.android.libraries.performance.primes.metrics.C31294b;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.performance.primes.metrics.e.c */
/* compiled from: PG */
final class C31417c extends C31423i {

    /* renamed from: a */
    private final int f84616a;

    /* renamed from: b */
    private final C58833ax f84617b;

    /* renamed from: c */
    private final boolean f84618c;

    /* renamed from: d */
    private final int f84619d;

    public C31417c(int i, int i2, C58833ax axVar, boolean z) {
        this.f84619d = i;
        this.f84616a = i2;
        this.f84617b = axVar;
        this.f84618c = z;
    }

    /* renamed from: a */
    public final int mo36979a() {
        return this.f84616a;
    }

    /* renamed from: c */
    public final C58833ax mo37116c() {
        return this.f84617b;
    }

    /* renamed from: d */
    public final boolean mo37117d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo37118e() {
        return this.f84618c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31423i) {
            C31423i iVar = (C31423i) obj;
            return this.f84619d == iVar.mo37122h() && this.f84616a == iVar.mo36979a() && !iVar.mo37121g() && this.f84617b.equals(iVar.mo37116c()) && !iVar.mo37120f() && !iVar.mo37117d() && this.f84618c == iVar.mo37118e();
        }
    }

    /* renamed from: f */
    public final boolean mo37120f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo37121g() {
        return false;
    }

    /* renamed from: h */
    public final int mo37122h() {
        return this.f84619d;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = (((((((((((this.f84619d ^ 1000003) * 1000003) ^ this.f84616a) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003;
        if (true == this.f84618c) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        int i = this.f84619d;
        int i2 = this.f84616a;
        String valueOf = String.valueOf(this.f84617b);
        boolean z = this.f84618c;
        return "MemoryConfigurations{enablement=" + C31294b.m58339a(i) + ", rateLimitPerSecond=" + i2 + ", recordMetricPerProcess=false, metricExtensionProvider=" + valueOf + ", forceGcBeforeRecordMemory=false, captureDebugMetrics=false, captureMemoryInfo=" + z + "}";
    }
}
