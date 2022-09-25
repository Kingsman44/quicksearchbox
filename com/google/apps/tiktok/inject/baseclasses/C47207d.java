package com.google.apps.tiktok.inject.baseclasses;

import android.os.SystemClock;
import com.google.android.libraries.performance.primes.metrics.p2414h.C31480ac;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58833ax;

/* renamed from: com.google.apps.tiktok.inject.baseclasses.d */
/* compiled from: PG */
public final class C47207d {

    /* renamed from: com.google.apps.tiktok.inject.baseclasses.d$a */
    /* compiled from: PG */
    public interface C47208a {
        /* renamed from: bT */
        C47770dh mo51109bT();
    }

    /* renamed from: a */
    public static final long m83965a(long j) {
        return Math.max(0, System.currentTimeMillis() - Math.max(0, SystemClock.elapsedRealtime() - j));
    }

    /* renamed from: b */
    public static final long m83966b() {
        C58833ax a = C31480ac.m58694a();
        if (a.mo56113h()) {
            return ((Long) a.mo56107c()).longValue();
        }
        return C47206c.m83963h();
    }
}
