package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* renamed from: com.google.common.util.concurrent.bg */
/* compiled from: PG */
public enum C60826bg implements Executor {
    ;

    private C60826bg() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
