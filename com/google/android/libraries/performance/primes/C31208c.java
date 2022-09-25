package com.google.android.libraries.performance.primes;

/* renamed from: com.google.android.libraries.performance.primes.c */
/* compiled from: PG */
final class C31208c extends C31200bs {

    /* renamed from: a */
    public int f84113a;

    /* renamed from: b */
    public int f84114b;

    /* renamed from: c */
    public boolean f84115c;

    /* renamed from: d */
    public byte f84116d;

    /* renamed from: a */
    public final C31201bt mo36931a() {
        if (this.f84116d == 7) {
            return new C31229d(this.f84113a, this.f84114b, this.f84115c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f84116d & 1) == 0) {
            sb.append(" primesMetricExecutorPriority");
        }
        if ((this.f84116d & 2) == 0) {
            sb.append(" primesMetricExecutorPoolSize");
        }
        if ((this.f84116d & 4) == 0) {
            sb.append(" enableDeferredTasks");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
