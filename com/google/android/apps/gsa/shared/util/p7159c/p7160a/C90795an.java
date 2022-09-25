package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.common.base.C58881cr;
import java.lang.Thread;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.an */
/* compiled from: PG */
public final class C90795an implements C90783ab {

    /* renamed from: a */
    private final C90783ab f253907a;

    /* renamed from: b */
    private final ExecutorService f253908b;

    public C90795an(C90783ab abVar, ExecutorService executorService) {
        this.f253907a = abVar;
        this.f253908b = executorService;
    }

    /* renamed from: c */
    static /* synthetic */ void m148363c(Runnable runnable) {
        try {
            runnable.run();
        } catch (Error | RuntimeException e) {
            Thread currentThread = Thread.currentThread();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(currentThread, e);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo85115a(C58881cr crVar, Runnable runnable) {
        this.f253907a.mo85115a(crVar, new C90792ak(runnable));
    }

    /* renamed from: b */
    public final void mo85114b(C58881cr crVar, Runnable runnable, long j) {
        this.f253907a.mo85114b(crVar, new C90792ak(runnable), j);
    }
}
