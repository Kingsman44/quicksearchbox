package com.google.android.libraries.performance.primes.metrics.p2414h;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.performance.primes.metrics.h.b */
/* compiled from: PG */
final class C31482b extends C31486f {

    /* renamed from: a */
    private final C58833ax f84785a;

    /* renamed from: b */
    private final C58833ax f84786b;

    public C31482b(C58833ax axVar, C58833ax axVar2) {
        this.f84785a = axVar;
        this.f84786b = axVar2;
    }

    /* renamed from: c */
    public final C58833ax mo37175c() {
        return this.f84786b;
    }

    /* renamed from: d */
    public final C58833ax mo37176d() {
        return this.f84785a;
    }

    /* renamed from: e */
    public final int mo37177e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31486f) {
            C31486f fVar = (C31486f) obj;
            return fVar.mo37177e() == 1 && this.f84785a.equals(fVar.mo37176d()) && this.f84786b.equals(fVar.mo37175c());
        }
    }

    public final int hashCode() {
        return ((this.f84785a.hashCode() ^ -722379962) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f84785a);
        return "StartupConfigurations{enablement=DEFAULT, metricExtensionProvider=" + valueOf + ", customTimestampProvider=Optional.absent()}";
    }
}
