package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90946l;
import com.google.common.base.C58881cr;
import com.google.common.base.C58885cv;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.d */
/* compiled from: PG */
public final class C90844d extends AbstractExecutorService implements C60887da, C90991b {

    /* renamed from: a */
    public final C90815bg f254018a;

    /* renamed from: b */
    private final ExecutorService f254019b;

    public C90844d(ExecutorService executorService, C90815bg bgVar) {
        this.f254019b = executorService;
        this.f254018a = bgVar;
    }

    /* renamed from: e */
    private static C58881cr m148429e(Object obj) {
        if (obj instanceof C90946l) {
            return ((C90946l) obj).mo85105fL();
        }
        return new C58885cv(obj.toString());
    }

    /* renamed from: a */
    public final C60870cx mo19398a(Runnable runnable) {
        return (C60870cx) super.submit(runnable);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f254019b.awaitTermination(j, timeUnit);
    }

    /* renamed from: b */
    public final C60870cx mo19399b(Callable callable) {
        return (C60870cx) super.submit(callable);
    }

    /* renamed from: c */
    public final C60870cx mo19400c(Runnable runnable, Object obj) {
        return (C60870cx) super.submit(runnable, obj);
    }

    public final void execute(Runnable runnable) {
        if (!(runnable instanceof C90835c)) {
            runnable = newTaskFor(runnable, (Object) null);
        }
        this.f254019b.execute(runnable);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        this.f254018a.mo17602gS(fVar);
    }

    public final boolean isShutdown() {
        return this.f254019b.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f254019b.isTerminated();
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new C90835c(this, new C90805ax(runnable, obj), this.f254018a.mo85156a(m148429e(runnable), 0));
    }

    public final void shutdown() {
        this.f254019b.shutdown();
    }

    public final List shutdownNow() {
        return this.f254019b.shutdownNow();
    }

    public final /* synthetic */ Future submit(Runnable runnable) {
        return (C60870cx) super.submit(runnable);
    }

    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (C60870cx) super.submit(runnable, obj);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Callable callable) {
        return new C90835c(this, new C90805ax(callable), this.f254018a.mo85156a(m148429e(callable), 0));
    }

    public final /* synthetic */ Future submit(Callable callable) {
        return (C60870cx) super.submit(callable);
    }
}
