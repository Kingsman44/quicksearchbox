package com.google.android.libraries.p579ar.sceneviewer.utilities;

import android.os.AsyncTask;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.ar.sceneviewer.utilities.ThreadPools */
/* compiled from: PG */
public final class ThreadPools {
    private static Executor mainExecutor;
    private static Executor threadPoolExecutor;

    private ThreadPools() {
    }

    public static Executor getMainExecutor() {
        if (mainExecutor == null) {
            mainExecutor = new C10764c();
        }
        return mainExecutor;
    }

    public static Executor getThreadPoolExecutor() {
        Executor executor = threadPoolExecutor;
        return executor == null ? AsyncTask.THREAD_POOL_EXECUTOR : executor;
    }

    public static void setMainExecutor(Executor executor) {
        mainExecutor = executor;
    }

    public static void setThreadPoolExecutor(Executor executor) {
        threadPoolExecutor = executor;
    }
}
