package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.common.util.concurrent.C60845bz;
import java.lang.Thread;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.ac */
/* compiled from: PG */
final class C90784ac implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Thread currentThread = Thread.currentThread();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(currentThread, th);
        }
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
    }
}
