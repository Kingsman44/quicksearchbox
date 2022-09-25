package com.google.android.gms.analytics.internal;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.analytics.internal.az */
/* compiled from: PG */
final class C142729az {

    /* renamed from: a */
    public long f387316a;

    public C142729az() {
    }

    public C142729az(long j) {
        this.f387316a = j;
    }

    /* renamed from: a */
    public final boolean mo117526a(long j) {
        return this.f387316a == 0 || SystemClock.elapsedRealtime() - this.f387316a > j;
    }
}
