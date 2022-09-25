package com.google.android.libraries.performance.primes.metrics.p2414h;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.performance.primes.metrics.h.a */
/* compiled from: PG */
public final class C31477a extends C31485e {

    /* renamed from: a */
    public C58833ax f84771a;

    /* renamed from: b */
    public int f84772b;

    /* renamed from: c */
    private final C58833ax f84773c;

    public C31477a() {
        C58836b bVar = C58836b.f156633a;
        this.f84771a = bVar;
        this.f84773c = bVar;
    }

    /* renamed from: a */
    public final C31486f mo37174a() {
        if (this.f84772b != 0) {
            return new C31482b(this.f84771a, this.f84773c);
        }
        throw new IllegalStateException("Missing required properties: enablement");
    }
}
