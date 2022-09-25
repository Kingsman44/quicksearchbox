package com.google.android.libraries.performance.primes.metrics.storage;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.performance.primes.metrics.storage.c */
/* compiled from: PG */
public final class C31561c extends C31573o {

    /* renamed from: a */
    public C58833ax f84984a = C58836b.f156633a;

    /* renamed from: b */
    public int f84985b;

    /* renamed from: c */
    private boolean f84986c;

    /* renamed from: d */
    private byte f84987d;

    /* renamed from: a */
    public final C31574p mo37256a() {
        int i;
        if (this.f84987d == 1 && (i = this.f84985b) != 0) {
            return new C31562d(i, this.f84986c, this.f84984a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f84985b == 0) {
            sb.append(" enablement");
        }
        if (this.f84987d == 0) {
            sb.append(" manualCapture");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo37257b(boolean z) {
        this.f84986c = z;
        this.f84987d = 1;
    }
}
