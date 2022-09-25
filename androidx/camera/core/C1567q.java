package androidx.camera.core;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.camera.core.q */
/* compiled from: PG */
final class C1567q implements Executor {

    /* renamed from: c */
    private static final ThreadFactory f4292c = new C1566p();

    /* renamed from: a */
    public final Object f4293a = new Object();

    /* renamed from: b */
    public ThreadPoolExecutor f4294b = m4167a();

    /* renamed from: a */
    public static ThreadPoolExecutor m4167a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f4292c);
        threadPoolExecutor.setRejectedExecutionHandler(C1565o.f4290a);
        return threadPoolExecutor;
    }

    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f4293a) {
            this.f4294b.execute(runnable);
        }
    }
}
