package com.google.android.libraries.performance.primes.metrics.p2410e;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.performance.primes.metrics.e.b */
/* compiled from: PG */
public final class C31416b extends C31422h {

    /* renamed from: a */
    public int f84611a;

    /* renamed from: b */
    public C58833ax f84612b = C58836b.f156633a;

    /* renamed from: c */
    public boolean f84613c;

    /* renamed from: d */
    public byte f84614d;

    /* renamed from: e */
    public int f84615e;

    /* renamed from: a */
    public final C31423i mo37115a() {
        int i;
        if (this.f84614d == 31 && (i = this.f84615e) != 0) {
            return new C31417c(i, this.f84611a, this.f84612b, this.f84613c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f84615e == 0) {
            sb.append(" enablement");
        }
        if ((this.f84614d & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.f84614d & 2) == 0) {
            sb.append(" recordMetricPerProcess");
        }
        if ((this.f84614d & 4) == 0) {
            sb.append(" forceGcBeforeRecordMemory");
        }
        if ((this.f84614d & 8) == 0) {
            sb.append(" captureDebugMetrics");
        }
        if ((this.f84614d & 16) == 0) {
            sb.append(" captureMemoryInfo");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
