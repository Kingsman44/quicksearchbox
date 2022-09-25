package com.google.android.libraries.social.populous;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.social.populous.i */
/* compiled from: PG */
public final class C42558i implements Executor {

    /* renamed from: a */
    public final Handler f111639a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f111639a.post(runnable);
    }
}
