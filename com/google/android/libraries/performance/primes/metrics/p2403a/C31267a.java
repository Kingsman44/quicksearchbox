package com.google.android.libraries.performance.primes.metrics.p2403a;

/* renamed from: com.google.android.libraries.performance.primes.metrics.a.a */
/* compiled from: PG */
public final class C31267a extends C31273f {

    /* renamed from: a */
    private final C31272e f84215a;

    public C31267a(C31272e eVar) {
        this.f84215a = eVar;
    }

    /* renamed from: c */
    public final int mo36981c() {
        return 2;
    }

    /* renamed from: d */
    public final C31272e mo36982d() {
        return this.f84215a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31273f) {
            C31273f fVar = (C31273f) obj;
            return fVar.mo36981c() == 2 && this.f84215a.equals(fVar.mo36982d());
        }
    }

    public final int hashCode() {
        return this.f84215a.hashCode() ^ -723379965;
    }

    public final String toString() {
        String obj = this.f84215a.toString();
        return "BatteryConfigurations{enablement=EXPLICITLY_DISABLED, metricExtensionProvider=" + obj + "}";
    }
}
