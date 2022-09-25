package com.google.android.libraries.surveys.internal.p3325d;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.surveys.internal.d.c */
/* compiled from: PG */
public final class C43051c {

    /* renamed from: a */
    static volatile Executor f112605a;

    /* renamed from: b */
    private static final Object f112606b = new Object();

    /* renamed from: a */
    public static Executor m75956a() {
        if (f112605a == null) {
            synchronized (f112606b) {
                if (f112605a == null) {
                    f112605a = new ThreadPoolExecutor(1, 3, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C43045b());
                    ((ThreadPoolExecutor) f112605a).allowCoreThreadTimeOut(true);
                }
            }
        }
        return f112605a;
    }
}
