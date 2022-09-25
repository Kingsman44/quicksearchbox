package com.google.android.libraries.performance.primes.metrics.crash;

/* renamed from: com.google.android.libraries.performance.primes.metrics.crash.a */
/* compiled from: PG */
public final class C31337a extends C31355c {

    /* renamed from: a */
    public float f84387a;

    /* renamed from: b */
    public int f84388b;

    /* renamed from: c */
    public byte f84389c;

    /* renamed from: d */
    public int f84390d;

    /* renamed from: a */
    public final C31356d mo37045a() {
        int i;
        if (this.f84389c == 3 && (i = this.f84390d) != 0) {
            return new C31354b(i, this.f84387a, this.f84388b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f84390d == 0) {
            sb.append(" enablement");
        }
        if ((this.f84389c & 1) == 0) {
            sb.append(" startupSamplePercentage");
        }
        if ((this.f84389c & 2) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
