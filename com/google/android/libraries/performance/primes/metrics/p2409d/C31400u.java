package com.google.android.libraries.performance.primes.metrics.p2409d;

import android.os.Build;
import android.view.FrameMetrics;

/* renamed from: com.google.android.libraries.performance.primes.metrics.d.u */
/* compiled from: PG */
final class C31400u {

    /* renamed from: a */
    long f84556a;

    /* renamed from: b */
    static boolean m58545b() {
        return Build.VERSION.SDK_INT <= 30;
    }

    /* renamed from: a */
    public long mo37099a(FrameMetrics frameMetrics, long j) {
        long metric = frameMetrics.getMetric(10);
        long metric2 = frameMetrics.getMetric(8);
        long j2 = metric + metric2;
        long max = Math.max(this.f84556a + j, metric + j);
        this.f84556a = max;
        long j3 = max - metric;
        if (j2 >= max && metric2 >= j) {
            this.f84556a = (j2 - ((j2 - frameMetrics.getMetric(11)) % j)) + j;
        }
        return j3;
    }
}
