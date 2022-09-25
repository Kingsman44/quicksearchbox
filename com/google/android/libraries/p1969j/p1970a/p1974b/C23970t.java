package com.google.android.libraries.p1969j.p1970a.p1974b;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.j.a.b.t */
/* compiled from: PG */
final class C23970t implements Executor {

    /* renamed from: a */
    private final Handler f65546a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f65546a.post(runnable);
    }
}
