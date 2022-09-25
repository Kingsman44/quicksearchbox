package org.chromium.net.impl;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: org.chromium.net.impl.cd */
/* compiled from: PG */
final class C72498cd implements Executor {

    /* renamed from: a */
    public final Executor f192888a;

    /* renamed from: b */
    public final Runnable f192889b = new C72497cc(this);

    /* renamed from: c */
    public final ArrayDeque f192890c = new ArrayDeque();

    /* renamed from: d */
    public boolean f192891d;

    public C72498cd(Executor executor) {
        this.f192888a = executor;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|4|5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void execute(java.lang.Runnable r3) {
        /*
            r2 = this;
            java.util.ArrayDeque r0 = r2.f192890c
            monitor-enter(r0)
            java.util.ArrayDeque r1 = r2.f192890c     // Catch:{ all -> 0x0017 }
            r1.addLast(r3)     // Catch:{ all -> 0x0017 }
            java.util.concurrent.Executor r3 = r2.f192888a     // Catch:{ RejectedExecutionException -> 0x0010 }
            java.lang.Runnable r1 = r2.f192889b     // Catch:{ RejectedExecutionException -> 0x0010 }
            r3.execute(r1)     // Catch:{ RejectedExecutionException -> 0x0010 }
            goto L_0x0015
        L_0x0010:
            java.util.ArrayDeque r3 = r2.f192890c     // Catch:{ all -> 0x0017 }
            r3.removeLast()     // Catch:{ all -> 0x0017 }
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return
        L_0x0017:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.C72498cd.execute(java.lang.Runnable):void");
    }
}
