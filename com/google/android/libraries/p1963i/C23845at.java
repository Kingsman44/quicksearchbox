package com.google.android.libraries.p1963i;

import android.os.Looper;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.libraries.i.at */
/* compiled from: PG */
public final /* synthetic */ class C23845at implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ ThreadFactory f65290a;

    public /* synthetic */ C23845at(ThreadFactory threadFactory) {
        this.f65290a = threadFactory;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f65290a.newThread(runnable);
        if (newThread.getContextClassLoader() == null) {
            newThread.setContextClassLoader(Looper.getMainLooper().getThread().getContextClassLoader());
        }
        return newThread;
    }
}
