package com.google.common.util.concurrent;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.de */
/* compiled from: PG */
class C60891de extends C60919g {

    /* renamed from: a */
    private final ExecutorService f164994a;

    public C60891de(ExecutorService executorService) {
        executorService.getClass();
        this.f164994a = executorService;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f164994a.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f164994a.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.f164994a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f164994a.isTerminated();
    }

    public final void shutdown() {
        this.f164994a.shutdown();
    }

    public final List shutdownNow() {
        return this.f164994a.shutdownNow();
    }

    public final String toString() {
        return super.toString() + "[" + this.f164994a + "]";
    }
}
