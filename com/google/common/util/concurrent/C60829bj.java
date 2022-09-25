package com.google.common.util.concurrent;

import com.google.common.base.C58838bb;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.util.concurrent.bj */
/* compiled from: PG */
public final class C60829bj {

    /* renamed from: a */
    private static final Logger f164901a = Logger.getLogger(C60829bj.class.getName());

    /* renamed from: b */
    private C60828bi f164902b;

    /* renamed from: c */
    private boolean f164903c;

    /* renamed from: c */
    private static void m92852c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f164901a;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.ExecutionList", "executeListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: a */
    public final void mo57297a(Runnable runnable, Executor executor) {
        C58838bb.m90866a(runnable, "Runnable was null.");
        C58838bb.m90866a(executor, "Executor was null.");
        synchronized (this) {
            if (!this.f164903c) {
                this.f164902b = new C60828bi(runnable, executor, this.f164902b);
            } else {
                m92852c(runnable, executor);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        m92852c(r1.f164898a, r1.f164899b);
        r1 = r1.f164900c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r0 == null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r2 = r0.f164900c;
        r0.f164900c = r1;
        r1 = r0;
        r0 = r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo57298b() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f164903c     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            return
        L_0x0007:
            r0 = 1
            r3.f164903c = r0     // Catch:{ all -> 0x0026 }
            com.google.common.util.concurrent.bi r0 = r3.f164902b     // Catch:{ all -> 0x0026 }
            r1 = 0
            r3.f164902b = r1     // Catch:{ all -> 0x0026 }
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
        L_0x0010:
            if (r0 == 0) goto L_0x0019
            com.google.common.util.concurrent.bi r2 = r0.f164900c
            r0.f164900c = r1
            r1 = r0
            r0 = r2
            goto L_0x0010
        L_0x0019:
            if (r1 == 0) goto L_0x0025
            java.lang.Runnable r0 = r1.f164898a
            java.util.concurrent.Executor r2 = r1.f164899b
            m92852c(r0, r2)
            com.google.common.util.concurrent.bi r1 = r1.f164900c
            goto L_0x0019
        L_0x0025:
            return
        L_0x0026:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            goto L_0x002a
        L_0x0029:
            throw r0
        L_0x002a:
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C60829bj.mo57298b():void");
    }
}
