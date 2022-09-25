package com.google.android.libraries.lens.view.p2147k;

import com.google.common.p4526f.p4527a.C58970a;
import java.lang.Thread;

/* renamed from: com.google.android.libraries.lens.view.k.c */
/* compiled from: PG */
final class C27216c implements Runnable {

    /* renamed from: a */
    private final Runnable f74414a;

    public C27216c(Runnable runnable) {
        this.f74414a = runnable;
    }

    public final void run() {
        try {
            this.f74414a.run();
        } catch (Throwable th) {
            ((C58970a) ((C58970a) C27217d.f74415a.mo56225c()).mo56372aa(49287)).mo56386p("Uncaught exception from runnable");
            Thread currentThread = Thread.currentThread();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
            uncaughtExceptionHandler.getClass();
            uncaughtExceptionHandler.uncaughtException(currentThread, th);
        }
    }

    public final String toString() {
        return this.f74414a.toString();
    }
}
