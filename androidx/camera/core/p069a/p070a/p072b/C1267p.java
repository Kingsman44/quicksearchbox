package androidx.camera.core.p069a.p070a.p072b;

import androidx.camera.core.C1477bw;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.camera.core.a.a.b.p */
/* compiled from: PG */
abstract class C1267p implements C60870cx {
    public final boolean cancel(boolean z) {
        return false;
    }

    public abstract Object get();

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }

    /* renamed from: b */
    public final void mo4106b(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            C1477bw.m3981d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }
}
