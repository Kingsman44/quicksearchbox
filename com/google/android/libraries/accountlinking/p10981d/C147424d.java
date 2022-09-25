package com.google.android.libraries.accountlinking.p10981d;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.accountlinking.d.d */
/* compiled from: PG */
public final class C147424d implements Executor {

    /* renamed from: a */
    private final Handler f397948a;

    public C147424d(Handler handler) {
        this.f397948a = handler;
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            this.f397948a.post(runnable);
        }
    }
}
