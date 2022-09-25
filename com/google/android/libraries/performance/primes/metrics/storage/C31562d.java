package com.google.android.libraries.performance.primes.metrics.storage;

import com.google.android.libraries.performance.primes.metrics.C31294b;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.performance.primes.metrics.storage.d */
/* compiled from: PG */
final class C31562d extends C31574p {

    /* renamed from: a */
    private final boolean f84988a;

    /* renamed from: b */
    private final C58833ax f84989b;

    /* renamed from: c */
    private final int f84990c;

    public C31562d(int i, boolean z, C58833ax axVar) {
        this.f84990c = i;
        this.f84988a = z;
        this.f84989b = axVar;
    }

    /* renamed from: c */
    public final C58833ax mo37258c() {
        return this.f84989b;
    }

    /* renamed from: d */
    public final boolean mo37259d() {
        return this.f84988a;
    }

    /* renamed from: e */
    public final int mo37260e() {
        return this.f84990c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31574p) {
            C31574p pVar = (C31574p) obj;
            return this.f84990c == pVar.mo37260e() && this.f84988a == pVar.mo37259d() && this.f84989b.equals(pVar.mo37258c());
        }
    }

    public final int hashCode() {
        return ((((this.f84990c ^ 1000003) * 1000003) ^ (true != this.f84988a ? 1237 : 1231)) * 1000003) ^ this.f84989b.hashCode();
    }

    public final String toString() {
        int i = this.f84990c;
        boolean z = this.f84988a;
        String valueOf = String.valueOf(this.f84989b);
        return "StorageConfigurations{enablement=" + C31294b.m58339a(i) + ", manualCapture=" + z + ", dirStatsConfigurations=" + valueOf + "}";
    }
}
