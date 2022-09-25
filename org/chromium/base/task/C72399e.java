package org.chromium.base.task;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: org.chromium.base.task.e */
/* compiled from: PG */
final class C72399e implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f192551a = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        C72398d dVar = new C72398d(runnable);
        int andIncrement = this.f192551a.getAndIncrement();
        return new Thread(dVar, "CrAsyncTask #" + andIncrement);
    }
}
