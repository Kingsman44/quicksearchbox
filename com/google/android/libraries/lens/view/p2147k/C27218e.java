package com.google.android.libraries.lens.view.p2147k;

import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.k.e */
/* compiled from: PG */
public final /* synthetic */ class C27218e implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Executor f74416a;

    public /* synthetic */ C27218e(Executor executor) {
        this.f74416a = executor;
    }

    public final void execute(Runnable runnable) {
        Executor executor = this.f74416a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            executor.execute(runnable);
        }
    }
}
