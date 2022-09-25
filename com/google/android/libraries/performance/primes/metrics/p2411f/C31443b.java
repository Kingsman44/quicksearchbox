package com.google.android.libraries.performance.primes.metrics.p2411f;

import com.google.android.libraries.performance.primes.metrics.C31294b;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.performance.primes.metrics.f.b */
/* compiled from: PG */
final class C31443b extends C31446e {

    /* renamed from: a */
    private final int f84660a;

    /* renamed from: b */
    private final boolean f84661b;

    /* renamed from: c */
    private final C58833ax f84662c;

    /* renamed from: d */
    private final int f84663d;

    public C31443b(int i, int i2, boolean z, C58833ax axVar) {
        this.f84663d = i;
        this.f84660a = i2;
        this.f84661b = z;
        this.f84662c = axVar;
    }

    /* renamed from: c */
    public final int mo37134c() {
        return this.f84660a;
    }

    /* renamed from: d */
    public final C31459r mo37135d() {
        return null;
    }

    /* renamed from: e */
    public final C58833ax mo37136e() {
        return this.f84662c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31446e) {
            C31446e eVar = (C31446e) obj;
            return this.f84663d == eVar.mo37139g() && this.f84660a == eVar.mo37134c() && eVar.mo37135d() == null && this.f84661b == eVar.mo37138f() && this.f84662c.equals(eVar.mo37136e());
        }
    }

    /* renamed from: f */
    public final boolean mo37138f() {
        return this.f84661b;
    }

    /* renamed from: g */
    public final int mo37139g() {
        return this.f84663d;
    }

    public final int hashCode() {
        return ((((((this.f84663d ^ 1000003) * 1000003) ^ this.f84660a) * -721379959) ^ (true != this.f84661b ? 1237 : 1231)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        int i = this.f84663d;
        int i2 = this.f84660a;
        boolean z = this.f84661b;
        String valueOf = String.valueOf(this.f84662c);
        return "NetworkConfigurations{enablement=" + C31294b.m58339a(i) + ", batchSize=" + i2 + ", urlSanitizer=null, enableUrlAutoSanitization=" + z + ", metricExtensionProvider=" + valueOf + "}";
    }
}
