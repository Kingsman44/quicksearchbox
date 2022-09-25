package com.google.android.libraries.performance.primes.metrics.p2414h;

import android.app.Activity;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.performance.primes.C31164au;

/* renamed from: com.google.android.libraries.performance.primes.metrics.h.r */
/* compiled from: PG */
public final class C31499r {

    /* renamed from: a */
    public static final C31499r f84816a = new C31499r();

    /* renamed from: b */
    public volatile boolean f84817b;

    /* renamed from: c */
    public volatile long f84818c;

    /* renamed from: d */
    public volatile long f84819d;

    /* renamed from: e */
    public volatile long f84820e;

    /* renamed from: f */
    public volatile long f84821f;

    /* renamed from: g */
    public volatile long f84822g;

    /* renamed from: h */
    public volatile long f84823h;

    /* renamed from: i */
    public volatile long f84824i;

    /* renamed from: j */
    public volatile long f84825j;

    /* renamed from: k */
    public volatile C31164au f84826k;

    /* renamed from: l */
    public final C31498q f84827l = new C31498q();

    /* renamed from: m */
    public final C31488h f84828m = new C31488h();

    /* renamed from: n */
    public final C31488h f84829n = new C31488h();

    /* renamed from: c */
    public static void m58712c(String str, long j) {
        Trace.setCounter(str, j - Process.getStartElapsedRealtime());
        Trace.setCounter(str, 0);
    }

    /* renamed from: a */
    public final void mo37197a(Activity activity) {
        if (C19559g.m37305d(Thread.currentThread()) && this.f84825j == 0) {
            this.f84825j = SystemClock.elapsedRealtime();
            m58712c("Primes-tti-end-and-length-ms", this.f84825j);
            this.f84827l.f84815k = true;
            if (activity != null) {
                try {
                    activity.reportFullyDrawn();
                } catch (RuntimeException e) {
                    Log.d("PrimesStartupMeasure", "Failed to report App usable time.", e);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo37198b(long j) {
        if (C19559g.m37305d(Thread.currentThread()) && this.f84818c > 0 && j <= SystemClock.elapsedRealtime()) {
            if ((this.f84828m.f84790b == null || j <= this.f84828m.f84790b.longValue()) && this.f84820e == 0) {
                this.f84820e = j;
                this.f84827l.f84810f = true;
            }
        }
    }
}
