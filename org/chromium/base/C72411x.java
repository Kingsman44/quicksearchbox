package org.chromium.base;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Log;
import p000J.C0000N;

/* renamed from: org.chromium.base.x */
/* compiled from: PG */
final class C72411x extends C72410w implements MessageQueue.IdleHandler {

    /* renamed from: a */
    private long f192587a;

    /* renamed from: b */
    private long f192588b;

    /* renamed from: c */
    private int f192589c;

    /* renamed from: d */
    private int f192590d;

    /* renamed from: e */
    private int f192591e;

    /* renamed from: f */
    private boolean f192592f;

    /* renamed from: c */
    private final void m107069c() {
        if (TraceEvent.f192510a && !this.f192592f) {
            this.f192587a = SystemClock.elapsedRealtime();
            Looper.myQueue().addIdleHandler(this);
            this.f192592f = true;
            Log.v("TraceEvent_LooperMonitor", "attached idle handler");
        } else if (this.f192592f && !TraceEvent.f192510a) {
            Looper.myQueue().removeIdleHandler(this);
            this.f192592f = false;
            Log.v("TraceEvent_LooperMonitor", "detached idle handler");
        }
    }

    /* renamed from: d */
    private static void m107070d(int i, String str) {
        if (TraceEvent.f192510a) {
            C0000N.ML40H8ed("TraceEvent.LooperMonitor:IdleStats", str);
        }
        Log.println(i, "TraceEvent_LooperMonitor", str);
    }

    /* renamed from: a */
    public final void mo63875a(String str) {
        if (this.f192591e == 0) {
            TraceEvent.m107031b("Looper.queueIdle", 0);
        }
        this.f192588b = SystemClock.elapsedRealtime();
        m107069c();
        super.mo63875a(str);
    }

    /* renamed from: b */
    public final void mo63876b(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f192588b;
        if (elapsedRealtime > 16) {
            m107070d(5, "observed a task that took " + elapsedRealtime + "ms: " + str);
        }
        super.mo63876b(str);
        m107069c();
        this.f192589c++;
        this.f192591e++;
    }

    public final boolean queueIdle() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f192587a;
        if (j == 0) {
            this.f192587a = elapsedRealtime;
            j = elapsedRealtime;
        }
        long j2 = elapsedRealtime - j;
        this.f192590d++;
        TraceEvent.m107030a("Looper.queueIdle", this.f192591e + " tasks since last idle.");
        if (j2 > 48) {
            m107070d(3, this.f192589c + " tasks and " + this.f192590d + " idles processed so far, " + this.f192591e + " tasks bursted and " + j2 + "ms elapsed since last idle");
        }
        this.f192587a = elapsedRealtime;
        this.f192591e = 0;
        return true;
    }
}
