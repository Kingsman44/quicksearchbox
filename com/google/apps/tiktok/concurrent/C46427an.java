package com.google.apps.tiktok.concurrent;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60901do;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.apps.tiktok.concurrent.an */
/* compiled from: PG */
public final class C46427an implements ExecutorService {

    /* renamed from: a */
    public final Deque f121497a = new ArrayDeque();

    /* renamed from: b */
    public int f121498b = 1;

    /* renamed from: c */
    private final Executor f121499c;

    /* renamed from: d */
    private final boolean f121500d;

    /* renamed from: e */
    private boolean f121501e;

    /* renamed from: f */
    private C60870cx f121502f;

    /* renamed from: g */
    private final C46426am f121503g = new C46426am(this);

    public C46427an(Executor executor, boolean z) {
        this.f121499c = executor;
        this.f121500d = z;
    }

    /* renamed from: a */
    public final Queue mo50404a() {
        ArrayDeque arrayDeque;
        synchronized (this.f121497a) {
            C58838bb.m90884s(this.f121501e, "Executor may only be drained when it is suspended.");
            arrayDeque = new ArrayDeque(this.f121497a);
            this.f121497a.clear();
        }
        return arrayDeque;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo50406b() {
        C19559g.m37304c();
        synchronized (this.f121497a) {
            this.f121501e = false;
        }
        execute(C60901do.f165001a);
    }

    /* renamed from: c */
    public final void mo50407c() {
        C19559g.m37304c();
        synchronized (this.f121497a) {
            this.f121501e = true;
            this.f121498b = 1;
            C60870cx cxVar = this.f121502f;
            if (cxVar != null) {
                cxVar.cancel(false);
                this.f121502f = null;
            }
        }
    }

    public final List invokeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object invokeAny(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public final Future submit(Runnable runnable) {
        return C60856cj.m92903l(runnable, this);
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final Future submit(Runnable runnable, Object obj) {
        return C60856cj.m92904m(new C46425al(runnable, obj), this);
    }

    public final Future submit(Callable callable) {
        return C60856cj.m92904m(callable, this);
    }

    public final void execute(Runnable runnable) {
        boolean z;
        int i;
        runnable.getClass();
        synchronized (this.f121497a) {
            if (!this.f121501e && (i = this.f121498b) != 3) {
                if (i != 2) {
                    this.f121497a.add(runnable);
                    this.f121502f = C60856cj.m92903l(C47810es.m84977q(this.f121503g), this.f121499c);
                    this.f121498b = 2;
                }
            }
            this.f121497a.add(runnable);
        }
        synchronized (this.f121497a) {
            z = false;
            if (C19559g.m37305d(Thread.currentThread()) && this.f121500d && !this.f121501e && this.f121498b != 3) {
                C58838bb.m90866a(this.f121502f, "UI-threaded caller must have scheduled the worker in `executeInternal()` call prior to this point, and that worker will not have been given execution priority on this thread.");
                this.f121502f.cancel(false);
                this.f121502f = null;
                this.f121498b = 2;
                z = true;
            }
        }
        if (z) {
            this.f121503g.run();
        }
    }
}
