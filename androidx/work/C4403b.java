package androidx.work;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.work.b */
/* compiled from: PG */
final class C4403b implements ThreadFactory {

    /* renamed from: a */
    final /* synthetic */ boolean f14050a;

    /* renamed from: b */
    private final AtomicInteger f14051b = new AtomicInteger(0);

    public C4403b(boolean z) {
        this.f14050a = z;
    }

    public final Thread newThread(Runnable runnable) {
        String str = true != this.f14050a ? "androidx.work-" : "WM.task-";
        return new Thread(runnable, str + this.f14051b.incrementAndGet());
    }
}
