package com.google.android.libraries.p1975k.p1981f;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.k.f.a */
/* compiled from: PG */
public final class C24013a {

    /* renamed from: a */
    private static final RejectedExecutionHandler f65631a = new ThreadPoolExecutor.DiscardPolicy();

    /* renamed from: a */
    public static Executor m44610a() {
        return new ThreadPoolExecutor(0, 10, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(10), f65631a);
    }
}
