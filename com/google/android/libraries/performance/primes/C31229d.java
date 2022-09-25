package com.google.android.libraries.performance.primes;

import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.libraries.performance.primes.d */
/* compiled from: PG */
final class C31229d extends C31201bt {

    /* renamed from: a */
    private final int f84137a;

    /* renamed from: b */
    private final int f84138b;

    /* renamed from: c */
    private final boolean f84139c;

    public C31229d(int i, int i2, boolean z) {
        this.f84137a = i;
        this.f84138b = i2;
        this.f84139c = z;
    }

    /* renamed from: a */
    public final int mo36933a() {
        return this.f84138b;
    }

    /* renamed from: b */
    public final int mo36934b() {
        return this.f84137a;
    }

    /* renamed from: c */
    public final C60888db mo36935c() {
        return null;
    }

    /* renamed from: d */
    public final boolean mo36936d() {
        return this.f84139c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31201bt) {
            C31201bt btVar = (C31201bt) obj;
            return btVar.mo36935c() == null && this.f84137a == btVar.mo36934b() && this.f84138b == btVar.mo36933a() && this.f84139c == btVar.mo36936d();
        }
    }

    public final int hashCode() {
        return ((((this.f84137a ^ -721379959) * 1000003) ^ this.f84138b) * 1000003) ^ (true != this.f84139c ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f84137a;
        int i2 = this.f84138b;
        boolean z = this.f84139c;
        return "PrimesThreadsConfigurations{primesExecutorService=null, primesMetricExecutorPriority=" + i + ", primesMetricExecutorPoolSize=" + i2 + ", enableDeferredTasks=" + z + "}";
    }
}
