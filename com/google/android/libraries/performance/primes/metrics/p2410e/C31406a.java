package com.google.android.libraries.performance.primes.metrics.p2410e;

import com.google.android.libraries.performance.primes.metrics.C31294b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;

/* renamed from: com.google.android.libraries.performance.primes.metrics.e.a */
/* compiled from: PG */
public final class C31406a extends C31418d {

    /* renamed from: a */
    private final long f84563a;

    /* renamed from: b */
    private final C58528ij f84564b;

    /* renamed from: c */
    private final int f84565c = 2;

    public C31406a(int i, long j, C58528ij ijVar) {
        this.f84563a = j;
        this.f84564b = ijVar;
    }

    /* renamed from: c */
    public final long mo37100c() {
        return this.f84563a;
    }

    /* renamed from: d */
    public final C58528ij mo37101d() {
        return this.f84564b;
    }

    /* renamed from: e */
    public final int mo37102e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31418d) {
            C31418d dVar = (C31418d) obj;
            return dVar.mo37102e() == 2 && this.f84563a == dVar.mo37100c() && this.f84564b.equals(dVar.mo37101d());
        }
    }

    public final int hashCode() {
        long j = this.f84563a;
        return ((-723379965 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((C58733pz) this.f84564b).f156499d;
    }

    public final String toString() {
        long j = this.f84563a;
        String valueOf = String.valueOf(this.f84564b);
        return "DebugMemoryConfigurations{enablement=" + C31294b.m58339a(2) + ", debugMemoryServiceThrottleMs=" + j + ", debugMemoryEventsToSample=" + valueOf + "}";
    }
}
