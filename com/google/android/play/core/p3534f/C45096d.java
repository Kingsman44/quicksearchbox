package com.google.android.play.core.p3534f;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.play.core.f.d */
/* compiled from: PG */
public final class C45096d {

    /* renamed from: a */
    private static ThreadPoolExecutor f117757a;

    /* renamed from: a */
    public static Executor m80265a() {
        if (f117757a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C45091c());
            f117757a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f117757a;
    }
}
