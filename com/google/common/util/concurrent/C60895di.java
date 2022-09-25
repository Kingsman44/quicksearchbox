package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.common.util.concurrent.di */
/* compiled from: PG */
public final class C60895di {
    /* renamed from: a */
    public static C60887da m92995a(ExecutorService executorService) {
        C60887da daVar;
        if (executorService instanceof C60887da) {
            return (C60887da) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            daVar = new C60894dh((ScheduledExecutorService) executorService);
        } else {
            daVar = new C60891de(executorService);
        }
        return daVar;
    }

    /* renamed from: b */
    public static C60888db m92996b(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof C60888db) {
            return (C60888db) scheduledExecutorService;
        }
        return new C60894dh(scheduledExecutorService);
    }

    /* renamed from: c */
    static Executor m92997c(Executor executor, C60873d dVar) {
        executor.getClass();
        if (executor == C60826bg.f164896a) {
            return executor;
        }
        return new C60889dc(executor, dVar);
    }
}
