package androidx.camera.core.p069a.p070a.p071a;

import android.os.Handler;
import android.os.SystemClock;
import androidx.camera.core.p069a.p070a.p072b.C1265n;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.camera.core.a.a.a.g */
/* compiled from: PG */
public final class C1244g extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: a */
    private final Handler f3638a;

    static {
        new C1239b();
    }

    public C1244g(Handler handler) {
        this.f3638a = handler;
    }

    /* renamed from: a */
    private final RejectedExecutionException m3412a() {
        StringBuilder sb = new StringBuilder();
        Handler handler = this.f3638a;
        sb.append(handler);
        return new RejectedExecutionException(String.valueOf(handler).concat(" is shutting down"));
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(C30325g.f82003a.concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    public final void execute(Runnable runnable) {
        if (!this.f3638a.post(runnable)) {
            throw m3412a();
        }
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule((Callable) new C1240c(runnable), j, timeUnit);
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(C30325g.f82003a.concat(" does not yet support fixed-rate scheduling."));
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(C30325g.f82003a.concat(" does not yet support fixed-delay scheduling."));
    }

    public final void shutdown() {
        throw new UnsupportedOperationException(C30325g.f82003a.concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException(C30325g.f82003a.concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        long uptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j, timeUnit);
        C1243f fVar = new C1243f(this.f3638a, uptimeMillis, callable);
        if (this.f3638a.postAtTime(fVar, uptimeMillis)) {
            return fVar;
        }
        return new C1265n(m3412a());
    }
}
