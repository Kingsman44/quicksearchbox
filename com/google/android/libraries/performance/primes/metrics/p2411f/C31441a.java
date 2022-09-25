package com.google.android.libraries.performance.primes.metrics.p2411f;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.performance.primes.metrics.f.a */
/* compiled from: PG */
public final class C31441a extends C31445d {

    /* renamed from: a */
    public int f84654a;

    /* renamed from: b */
    public C58833ax f84655b = C58836b.f156633a;

    /* renamed from: c */
    public byte f84656c;

    /* renamed from: d */
    public int f84657d;

    /* renamed from: e */
    private boolean f84658e;

    /* renamed from: a */
    public final C31446e mo37132a() {
        int i;
        if (this.f84656c == 3 && (i = this.f84657d) != 0) {
            return new C31443b(i, this.f84654a, this.f84658e, this.f84655b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f84657d == 0) {
            sb.append(" enablement");
        }
        if ((this.f84656c & 1) == 0) {
            sb.append(" batchSize");
        }
        if ((this.f84656c & 2) == 0) {
            sb.append(" enableUrlAutoSanitization");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo37133b(boolean z) {
        this.f84658e = z;
        this.f84656c = (byte) (this.f84656c | 2);
    }
}
