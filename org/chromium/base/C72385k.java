package org.chromium.base;

import java.lang.Thread;

/* renamed from: org.chromium.base.k */
/* compiled from: PG */
final class C72385k implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ JavaHandlerThread f192532a;

    public C72385k(JavaHandlerThread javaHandlerThread) {
        this.f192532a = javaHandlerThread;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        this.f192532a.f192498b = th;
    }
}
