package com.bumptech.glide.p280a;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.bumptech.glide.a.b */
/* compiled from: PG */
final class C5503b implements ThreadFactory {
    public final synchronized Thread newThread(Runnable runnable) {
        Thread thread;
        thread = new Thread(runnable, "glide-disk-lru-cache-thread");
        thread.setPriority(1);
        return thread;
    }
}
