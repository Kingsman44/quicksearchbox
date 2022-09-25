package androidx.p054b.p055a.p056a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.b.a.a.c */
/* compiled from: PG */
final class C0884c implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f2960a = new AtomicInteger(0);

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f2960a.getAndIncrement());
        return thread;
    }
}
