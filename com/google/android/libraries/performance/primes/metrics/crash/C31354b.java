package com.google.android.libraries.performance.primes.metrics.crash;

import com.google.android.libraries.performance.primes.metrics.C31294b;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.performance.primes.metrics.crash.b */
/* compiled from: PG */
final class C31354b extends C31356d {

    /* renamed from: a */
    private final float f84420a;

    /* renamed from: b */
    private final int f84421b;

    /* renamed from: c */
    private final int f84422c;

    public C31354b(int i, float f, int i2) {
        this.f84422c = i;
        this.f84420a = f;
        this.f84421b = i2;
    }

    /* renamed from: c */
    public final float mo37060c() {
        return this.f84420a;
    }

    /* renamed from: d */
    public final int mo37061d() {
        return this.f84421b;
    }

    /* renamed from: e */
    public final C69464a mo37062e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31356d) {
            C31356d dVar = (C31356d) obj;
            return this.f84422c == dVar.mo37064f() && Float.floatToIntBits(this.f84420a) == Float.floatToIntBits(dVar.mo37060c()) && this.f84421b == dVar.mo37061d() && dVar.mo37062e() == null;
        }
    }

    /* renamed from: f */
    public final int mo37064f() {
        return this.f84422c;
    }

    public final int hashCode() {
        return (((((this.f84422c ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f84420a)) * 1000003) ^ this.f84421b) * 1000003;
    }

    public final String toString() {
        int i = this.f84422c;
        float f = this.f84420a;
        int i2 = this.f84421b;
        return "CrashConfigurations{enablement=" + C31294b.m58339a(i) + ", startupSamplePercentage=" + f + ", debugLogsSize=" + i2 + ", metricExtensionProvider=null}";
    }
}
