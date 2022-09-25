package com.google.android.libraries.performance.primes.metrics.p2413g;

import com.google.android.libraries.performance.primes.metrics.C31294b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.performance.primes.metrics.g.b */
/* compiled from: PG */
final class C31461b extends C31463d {

    /* renamed from: a */
    private final int f84730a;

    /* renamed from: b */
    private final int f84731b;

    /* renamed from: c */
    private final int f84732c;

    /* renamed from: d */
    private final int f84733d;

    /* renamed from: e */
    private final C58485gu f84734e;

    /* renamed from: f */
    private final int f84735f;

    public C31461b(int i, int i2, int i3, int i4, C58485gu guVar, int i5) {
        this.f84730a = i;
        this.f84731b = i2;
        this.f84732c = i3;
        this.f84733d = i4;
        this.f84734e = guVar;
        this.f84735f = i5;
    }

    /* renamed from: c */
    public final int mo37153c() {
        return this.f84731b;
    }

    /* renamed from: d */
    public final int mo37154d() {
        return this.f84730a;
    }

    /* renamed from: e */
    public final int mo37155e() {
        return this.f84732c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31463d) {
            C31463d dVar = (C31463d) obj;
            return this.f84730a == dVar.mo37154d() && this.f84731b == dVar.mo37153c() && this.f84732c == dVar.mo37155e() && this.f84733d == dVar.mo37157f() && C58597ky.m90218i(this.f84734e, dVar.mo37158g()) && this.f84735f == dVar.mo37159h();
        }
    }

    /* renamed from: f */
    public final int mo37157f() {
        return this.f84733d;
    }

    /* renamed from: g */
    public final C58485gu mo37158g() {
        return this.f84734e;
    }

    /* renamed from: h */
    public final int mo37159h() {
        return this.f84735f;
    }

    public final int hashCode() {
        return ((((((((((this.f84730a ^ 1000003) * 1000003) ^ this.f84731b) * 1000003) ^ this.f84732c) * 1000003) ^ this.f84733d) * 1000003) ^ this.f84734e.hashCode()) * 1000003) ^ this.f84735f;
    }

    public final String toString() {
        int i = this.f84730a;
        int i2 = this.f84731b;
        int i3 = this.f84732c;
        int i4 = this.f84733d;
        String obj = this.f84734e.toString();
        int i5 = this.f84735f;
        return "StallConfigurations{initialMonitoringDelayMs=" + i + ", checkForResponseIntervalMs=" + i2 + ", midStallCheckForResponseIntervalMs=" + i3 + ", postToMainIntervalMs=" + i4 + ", stallThresholdsMs=" + obj + ", enablement=" + C31294b.m58339a(i5) + "}";
    }
}
