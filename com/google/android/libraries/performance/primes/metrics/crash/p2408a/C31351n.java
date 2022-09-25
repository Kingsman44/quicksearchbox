package com.google.android.libraries.performance.primes.metrics.crash.p2408a;

import com.google.android.libraries.performance.primes.metrics.C31294b;

/* renamed from: com.google.android.libraries.performance.primes.metrics.crash.a.n */
/* compiled from: PG */
final class C31351n extends C31339b {

    /* renamed from: a */
    private final String f84417a;

    /* renamed from: b */
    private final int f84418b;

    public C31351n(int i, String str) {
        this.f84418b = i;
        this.f84417a = str;
    }

    /* renamed from: d */
    public final String mo37047d() {
        return this.f84417a;
    }

    /* renamed from: e */
    public final int mo37048e() {
        return this.f84418b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31339b) {
            C31339b bVar = (C31339b) obj;
            return this.f84418b == bVar.mo37048e() && this.f84417a.equals(bVar.mo37047d());
        }
    }

    public final int hashCode() {
        return ((this.f84418b ^ 1000003) * 1000003) ^ this.f84417a.hashCode();
    }

    public final String toString() {
        int i = this.f84418b;
        String str = this.f84417a;
        return "ApplicationExitConfigurations{enablement=" + C31294b.m58339a(i) + ", reportingProcessShortName=" + str + "}";
    }
}
