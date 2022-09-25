package com.google.android.setupcompat.internal;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.setupcompat.internal.b */
/* compiled from: PG */
public final class C45254b {

    /* renamed from: a */
    public static final C45254b f118201a = new C45254b(new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new ArrayBlockingQueue(50), new C45253a()));

    /* renamed from: b */
    public final Executor f118202b;

    private C45254b(Executor executor) {
        this.f118202b = executor;
    }
}
