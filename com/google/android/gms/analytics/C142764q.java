package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.p10733a.C142680a;
import com.google.android.gms.common.internal.C143919bh;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.analytics.q */
/* compiled from: PG */
public final class C142764q {

    /* renamed from: a */
    public static volatile C142764q f387398a;

    /* renamed from: b */
    public final Context f387399b;

    /* renamed from: c */
    public final List f387400c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public final C142761n f387401d = new C142761n(this);

    /* renamed from: e */
    public volatile C142680a f387402e;

    /* renamed from: f */
    public Thread.UncaughtExceptionHandler f387403f;

    public C142764q(Context context) {
        Context applicationContext = context.getApplicationContext();
        C143919bh.m233958a(applicationContext);
        this.f387399b = applicationContext;
        new C142700g();
    }

    /* renamed from: b */
    public static void m231686b() {
        if (!(Thread.currentThread() instanceof C142763p)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: a */
    public final Future mo117602a(Callable callable) {
        C143919bh.m233958a(callable);
        if (!(Thread.currentThread() instanceof C142763p)) {
            return this.f387401d.submit(callable);
        }
        FutureTask futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    /* renamed from: c */
    public final void mo117603c(Runnable runnable) {
        C143919bh.m233958a(runnable);
        this.f387401d.submit(runnable);
    }
}
