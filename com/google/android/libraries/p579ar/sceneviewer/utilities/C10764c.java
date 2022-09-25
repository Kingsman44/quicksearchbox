package com.google.android.libraries.p579ar.sceneviewer.utilities;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.ar.sceneviewer.utilities.c */
/* compiled from: PG */
final class C10764c implements Executor {

    /* renamed from: a */
    private final Handler f35725a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f35725a.post(runnable);
    }
}
