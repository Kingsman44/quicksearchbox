package com.google.android.libraries.performance.primes.metrics.crash.p2408a;

/* renamed from: com.google.android.libraries.performance.primes.metrics.crash.a.m */
/* compiled from: PG */
public final class C31350m extends C31338a {

    /* renamed from: a */
    public String f84415a;

    /* renamed from: b */
    public int f84416b;

    /* renamed from: a */
    public final C31339b mo37046a() {
        String str;
        int i = this.f84416b;
        if (i != 0 && (str = this.f84415a) != null) {
            return new C31351n(i, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f84416b == 0) {
            sb.append(" enablement");
        }
        if (this.f84415a == null) {
            sb.append(" reportingProcessShortName");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
