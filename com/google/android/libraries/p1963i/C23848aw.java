package com.google.android.libraries.p1963i;

import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60919g;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.i.aw */
/* compiled from: PG */
final class C23848aw extends C60919g {

    /* renamed from: a */
    final /* synthetic */ Executor f65293a;

    /* renamed from: b */
    final /* synthetic */ C60888db f65294b;

    public C23848aw(Executor executor, C60888db dbVar) {
        this.f65293a = executor;
        this.f65294b = dbVar;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f65294b.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f65293a.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.f65294b.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f65294b.isTerminated();
    }

    public final void shutdown() {
        this.f65294b.shutdown();
    }

    public final List shutdownNow() {
        return this.f65294b.shutdownNow();
    }

    public final String toString() {
        return this.f65293a.toString();
    }
}
