package com.google.android.libraries.p1963i.p1967c;

import com.google.common.util.concurrent.C60888db;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.i.c.e */
/* compiled from: PG */
final class C23876e extends AbstractExecutorService {

    /* renamed from: a */
    public final C23880i f65333a;

    /* renamed from: b */
    public final C23882k f65334b;

    /* renamed from: c */
    public final C23886o f65335c;

    /* renamed from: d */
    public final boolean f65336d;

    /* renamed from: e */
    public final C60888db f65337e;

    /* renamed from: f */
    private final AtomicInteger f65338f;

    /* renamed from: g */
    private final ExecutorService f65339g;

    /* renamed from: h */
    private final C23878g f65340h;

    public C23876e(C23882k kVar, C23886o oVar, boolean z, C60888db dbVar, C23880i iVar, ExecutorService executorService, C23878g gVar) {
        this.f65333a = iVar;
        this.f65339g = executorService;
        this.f65340h = gVar;
        this.f65334b = kVar;
        this.f65335c = oVar;
        this.f65336d = z;
        this.f65337e = dbVar;
        this.f65338f = new AtomicInteger(oVar.mo29255b());
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f65339g.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        int a;
        if (C23881j.m44441c(this.f65335c.mo29256c())) {
            this.f65339g.execute(new C23875d(this, runnable));
        } else {
            this.f65339g.execute(runnable);
        }
        if (C23881j.m44441c(this.f65335c.mo29253a()) && (a = this.f65340h.mo29276a()) >= this.f65335c.mo29255b()) {
            while (true) {
                int i = this.f65338f.get();
                if (a >= i) {
                    if (this.f65338f.compareAndSet(i, i + i)) {
                        int b = this.f65335c.mo29255b();
                        C23881j.m44440b(this.f65334b, this.f65333a.mo29278a(), new C23883l("Queue size of " + a + " exceeds starvation threshold of " + b));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final boolean isShutdown() {
        return this.f65339g.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f65339g.isTerminated();
    }

    public final void shutdown() {
        this.f65339g.shutdown();
    }

    public final List shutdownNow() {
        return this.f65339g.shutdownNow();
    }

    public final String toString() {
        String obj = this.f65339g.toString();
        return "Monitoring[" + obj + "]";
    }
}
