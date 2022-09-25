package com.google.apps.tiktok.coroutines;

import com.google.common.p4522b.C58373cq;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p5462h.p5466c.C69553a;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.k */
/* compiled from: PG */
public final class C46658k extends C69553a implements CoroutineExceptionHandler, ScheduledExecutorService {

    /* renamed from: a */
    public final ThreadLocal f121912a = new ThreadLocal();

    /* renamed from: c */
    private final ScheduledExecutorService f121913c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46658k(ScheduledExecutorService scheduledExecutorService) {
        super(CoroutineExceptionHandler.f190535b);
        C69664n.m101061g(scheduledExecutorService, "delegate");
        this.f121913c = scheduledExecutorService;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        C69664n.m101061g(timeUnit, "unit");
        return this.f121913c.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        C69664n.m101061g(runnable, "command");
        this.f121913c.execute(new C46654g(runnable, this));
    }

    public final void handleException(C69585o oVar, Throwable th) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(th, "exception");
        this.f121912a.set(th);
    }

    public final List invokeAll(Collection collection) {
        C69664n.m101061g(collection, "tasks");
        List invokeAll = this.f121913c.invokeAll(new C58373cq(collection, new C46655h(this)));
        C69664n.m101060f(invokeAll, "delegate.invokeAll(Colle…rrorPropagatingCallable))");
        return invokeAll;
    }

    public final Object invokeAny(Collection collection) {
        C69664n.m101061g(collection, "tasks");
        return this.f121913c.invokeAny(new C58373cq(collection, new C46657j(this)));
    }

    public final boolean isShutdown() {
        return this.f121913c.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f121913c.isTerminated();
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        C69664n.m101061g(runnable, "command");
        C69664n.m101061g(timeUnit, "unit");
        ScheduledFuture<?> schedule = this.f121913c.schedule(new C46654g(runnable, this), j, timeUnit);
        C69664n.m101060f(schedule, "delegate.schedule(asErro…le(command), delay, unit)");
        return schedule;
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C69664n.m101061g(runnable, "command");
        C69664n.m101061g(timeUnit, "unit");
        ScheduledFuture<?> scheduleAtFixedRate = this.f121913c.scheduleAtFixedRate(new C46654g(runnable, this), j, j2, timeUnit);
        C69664n.m101060f(scheduleAtFixedRate, "delegate.scheduleAtFixed…itialDelay, period, unit)");
        return scheduleAtFixedRate;
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C69664n.m101061g(runnable, "command");
        C69664n.m101061g(timeUnit, "unit");
        ScheduledFuture<?> scheduleWithFixedDelay = this.f121913c.scheduleWithFixedDelay(new C46654g(runnable, this), j, j2, timeUnit);
        C69664n.m101060f(scheduleWithFixedDelay, "delegate.scheduleWithFix…nitialDelay, delay, unit)");
        return scheduleWithFixedDelay;
    }

    public final void shutdown() {
        this.f121913c.shutdown();
    }

    public final List shutdownNow() {
        List shutdownNow = this.f121913c.shutdownNow();
        C69664n.m101060f(shutdownNow, "delegate.shutdownNow()");
        return shutdownNow;
    }

    public final Future submit(Runnable runnable) {
        C69664n.m101061g(runnable, "task");
        Future submit = this.f121913c.submit(new C46654g(runnable, this));
        C69664n.m101060f(submit, "delegate.submit(asErrorPropagatingRunnable(task))");
        return submit;
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        C69664n.m101061g(callable, "callable");
        C69664n.m101061g(timeUnit, "unit");
        ScheduledFuture schedule = this.f121913c.schedule(new C46653f(callable, this), j, timeUnit);
        C69664n.m101060f(schedule, "delegate.schedule(asErro…e(callable), delay, unit)");
        return schedule;
    }

    public final Future submit(Runnable runnable, Object obj) {
        C69664n.m101061g(runnable, "task");
        Future submit = this.f121913c.submit(new C46654g(runnable, this), obj);
        C69664n.m101060f(submit, "delegate.submit(asErrorP…ngRunnable(task), result)");
        return submit;
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        C69664n.m101061g(collection, "tasks");
        C69664n.m101061g(timeUnit, "unit");
        List invokeAll = this.f121913c.invokeAll(new C58373cq(collection, new C46656i(this)), j, timeUnit);
        C69664n.m101060f(invokeAll, "delegate.invokeAll(Colle…Callable), timeout, unit)");
        return invokeAll;
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        C69664n.m101061g(collection, "tasks");
        C69664n.m101061g(timeUnit, "unit");
        return this.f121913c.invokeAny(collection, j, timeUnit);
    }

    public final Future submit(Callable callable) {
        C69664n.m101061g(callable, "task");
        Future submit = this.f121913c.submit(new C46653f(callable, this));
        C69664n.m101060f(submit, "delegate.submit(asErrorPropagatingCallable(task))");
        return submit;
    }
}
