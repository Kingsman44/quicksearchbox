package com.google.android.libraries.performance.primes.metrics.p2416j;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.performance.primes.metrics.j.a */
/* compiled from: PG */
public final class C31529a extends C31545m {

    /* renamed from: a */
    public int f84902a;

    /* renamed from: b */
    public boolean f84903b;

    /* renamed from: c */
    public byte f84904c;

    /* renamed from: d */
    public int f84905d;

    /* renamed from: e */
    public C31546n f84906e;

    /* renamed from: f */
    private final C58833ax f84907f = C58836b.f156633a;

    /* renamed from: a */
    public final C31547o mo37218a() {
        int i;
        C31546n nVar;
        if (this.f84904c == 3 && (i = this.f84905d) != 0 && (nVar = this.f84906e) != null) {
            return new C31534b(i, this.f84902a, nVar, this.f84907f, this.f84903b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f84905d == 0) {
            sb.append(" enablement");
        }
        if ((this.f84904c & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if (this.f84906e == null) {
            sb.append(" dynamicSampler");
        }
        if ((this.f84904c & 2) == 0) {
            sb.append(" recordTimerDuration");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
