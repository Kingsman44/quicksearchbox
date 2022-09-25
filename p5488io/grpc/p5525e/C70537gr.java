package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.e.gr */
/* compiled from: PG */
final class C70537gr implements ScheduledExecutorService {

    /* renamed from: a */
    final ScheduledExecutorService f187940a;

    public C70537gr(ScheduledExecutorService scheduledExecutorService) {
        C58838bb.m90866a(scheduledExecutorService, "delegate");
        this.f187940a = scheduledExecutorService;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f187940a.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f187940a.execute(runnable);
    }

    public final List invokeAll(Collection collection) {
        return this.f187940a.invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) {
        return this.f187940a.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.f187940a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f187940a.isTerminated();
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f187940a.schedule(runnable, j, timeUnit);
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f187940a.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f187940a.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    public final void shutdown() {
        throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
    }

    public final Future submit(Runnable runnable) {
        return this.f187940a.submit(runnable);
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f187940a.invokeAll(collection, j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f187940a.invokeAny(collection, j, timeUnit);
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.f187940a.schedule(callable, j, timeUnit);
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.f187940a.submit(runnable, obj);
    }

    public final Future submit(Callable callable) {
        return this.f187940a.submit(callable);
    }
}
