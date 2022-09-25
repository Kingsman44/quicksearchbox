package com.google.android.libraries.lens.view.p2096f;

import java.lang.Thread;

/* renamed from: com.google.android.libraries.lens.view.f.h */
/* compiled from: PG */
public final /* synthetic */ class C25805h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Runnable f70107a;

    public /* synthetic */ C25805h(Runnable runnable) {
        this.f70107a = runnable;
    }

    public final void run() {
        try {
            this.f70107a.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
            if (uncaughtExceptionHandler == null) {
                throw null;
            }
            uncaughtExceptionHandler.uncaughtException(currentThread, th);
            throw th;
        }
    }
}
