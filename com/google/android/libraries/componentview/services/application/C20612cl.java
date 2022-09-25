package com.google.android.libraries.componentview.services.application;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.services.application.cl */
/* compiled from: PG */
public final class C20612cl implements Executor {

    /* renamed from: a */
    private final Handler f57813a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f57813a.post(runnable);
    }
}
