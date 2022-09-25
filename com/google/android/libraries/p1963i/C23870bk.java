package com.google.android.libraries.p1963i;

import android.os.Handler;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60919g;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.i.bk */
/* compiled from: PG */
public final class C23870bk extends C60919g implements C60888db {

    /* renamed from: c */
    public static final /* synthetic */ int f65323c = 0;

    /* renamed from: a */
    public final C21370a f65324a;

    /* renamed from: b */
    public final Handler f65325b;

    public C23870bk(C21370a aVar, Handler handler) {
        this.f65324a = aVar;
        this.f65325b = handler;
    }

    /* renamed from: h */
    public static int m44423h(Delayed delayed, Delayed delayed2) {
        long delay = delayed2.getDelay(TimeUnit.MILLISECONDS);
        long delay2 = delayed.getDelay(TimeUnit.MILLISECONDS);
        if (delay > delay2) {
            return -1;
        }
        return delay == delay2 ? 0 : 1;
    }

    /* renamed from: i */
    private final C60872cz m44424i(Runnable runnable, long j, long j2, TimeUnit timeUnit, boolean z) {
        TimeUnit timeUnit2 = timeUnit;
        long j3 = j;
        long millis = timeUnit2.toMillis(j);
        long c = this.f65324a.mo26871c();
        long j4 = millis + c;
        C23868bi biVar = new C23868bi(this, runnable, j4, timeUnit2.toMillis(j2), z);
        this.f65325b.postDelayed(biVar, millis);
        m44425j(biVar, biVar);
        return biVar;
    }

    /* renamed from: j */
    private final void m44425j(C60870cx cxVar, Runnable runnable) {
        cxVar.mo4106b(new C23866bg(this, runnable), C60826bg.f164896a);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final C60870cx mo19399b(Callable callable) {
        SettableFuture settableFuture = new SettableFuture();
        this.f65325b.post(new C23867bh(settableFuture, callable));
        return settableFuture;
    }

    /* renamed from: d */
    public final C60872cz mo29164d(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(Executors.callable(runnable), j, timeUnit);
    }

    /* renamed from: e */
    public final C60872cz schedule(Callable callable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        C23869bj bjVar = new C23869bj(this, callable, this.f65324a.mo26871c() + millis);
        this.f65325b.postDelayed(bjVar, millis);
        m44425j(bjVar, bjVar);
        return bjVar;
    }

    public final void execute(Runnable runnable) {
        this.f65325b.post(runnable);
    }

    /* renamed from: f */
    public final C60872cz mo29166f(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return m44424i(runnable, j, j2, timeUnit, true);
    }

    /* renamed from: g */
    public final C60872cz mo29167g(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return m44424i(runnable, j, j2, timeUnit, false);
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(Executors.callable(runnable), j, timeUnit);
    }

    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return m44424i(runnable, j, j2, timeUnit, true);
    }

    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return m44424i(runnable, j, j2, timeUnit, false);
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Future submit(Callable callable) {
        return submit(callable);
    }
}
