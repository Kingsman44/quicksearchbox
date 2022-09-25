package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.common.util.concurrent.dc */
/* compiled from: PG */
final class C60889dc implements Executor {

    /* renamed from: a */
    final /* synthetic */ Executor f164989a;

    /* renamed from: b */
    final /* synthetic */ C60873d f164990b;

    public C60889dc(Executor executor, C60873d dVar) {
        this.f164989a = executor;
        this.f164990b = dVar;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f164989a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f164990b.mo57357o(e);
        }
    }
}
