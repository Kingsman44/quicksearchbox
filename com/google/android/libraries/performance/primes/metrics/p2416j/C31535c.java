package com.google.android.libraries.performance.primes.metrics.p2416j;

/* renamed from: com.google.android.libraries.performance.primes.metrics.j.c */
/* compiled from: PG */
public final class C31535c extends C31549q {

    /* renamed from: a */
    public float f84932a;

    /* renamed from: b */
    public byte f84933b;

    /* renamed from: c */
    public int f84934c;

    /* renamed from: a */
    public final C31550r mo37230a() {
        int i;
        if (this.f84933b == 1 && (i = this.f84934c) != 0) {
            return new C31536d(i, this.f84932a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f84934c == 0) {
            sb.append(" enablement");
        }
        if (this.f84933b == 0) {
            sb.append(" samplingProbability");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
