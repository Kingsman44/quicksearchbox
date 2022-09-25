package com.google.fcp.client;

import java.lang.Thread;

/* renamed from: com.google.fcp.client.d */
/* compiled from: PG */
public final class C61091d {

    /* renamed from: a */
    private final Thread.UncaughtExceptionHandler f165387a;

    public C61091d(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f165387a = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    public final Object mo57645a(C61090c cVar) {
        try {
            return cVar.call();
        } catch (Throwable th) {
            this.f165387a.uncaughtException(Thread.currentThread(), th);
            throw new C61089b(th);
        }
    }

    /* renamed from: b */
    public final void mo57646b(Runnable runnable) {
        mo57645a(new C61088a(runnable));
    }
}
