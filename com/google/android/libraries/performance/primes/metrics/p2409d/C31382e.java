package com.google.android.libraries.performance.primes.metrics.p2409d;

/* renamed from: com.google.android.libraries.performance.primes.metrics.d.e */
/* compiled from: PG */
public final class C31382e extends C31396q {

    /* renamed from: a */
    public int f84491a;

    /* renamed from: b */
    public byte f84492b;

    /* renamed from: c */
    public int f84493c;

    /* renamed from: a */
    public final C31397r mo37084a() {
        int i;
        if (this.f84492b == 1 && (i = this.f84493c) != 0) {
            return new C31383f(i, this.f84491a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f84493c == 0) {
            sb.append(" enablement");
        }
        if (this.f84492b == 0) {
            sb.append(" rateLimitPerSecond");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
