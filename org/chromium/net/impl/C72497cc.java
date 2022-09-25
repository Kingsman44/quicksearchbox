package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.cc */
/* compiled from: PG */
final class C72497cc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C72498cd f192887a;

    public C72497cc(C72498cd cdVar) {
        this.f192887a = cdVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:30|31|32|33|34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r1 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        r0 = r6.f192887a.f192890c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1 = (java.lang.Runnable) r6.f192887a.f192890c.pollFirst();
        r2 = r6.f192887a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r1 == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        r2.f192891d = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0046, code lost:
        monitor-enter(r6.f192887a.f192890c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r2 = r6.f192887a;
        r2.f192891d = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r2.f192888a.execute(r2.f192889b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0053, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0057, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0052 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            org.chromium.net.impl.cd r0 = r6.f192887a
            java.util.ArrayDeque r0 = r0.f192890c
            monitor-enter(r0)
            org.chromium.net.impl.cd r1 = r6.f192887a     // Catch:{ all -> 0x005a }
            boolean r2 = r1.f192891d     // Catch:{ all -> 0x005a }
            if (r2 != 0) goto L_0x0058
            java.util.ArrayDeque r1 = r1.f192890c     // Catch:{ all -> 0x005a }
            java.lang.Object r1 = r1.pollFirst()     // Catch:{ all -> 0x005a }
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x005a }
            org.chromium.net.impl.cd r2 = r6.f192887a     // Catch:{ all -> 0x005a }
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            r2.f192891d = r5     // Catch:{ all -> 0x005a }
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
        L_0x001f:
            if (r1 == 0) goto L_0x0057
            r1.run()     // Catch:{ all -> 0x0041 }
            org.chromium.net.impl.cd r0 = r6.f192887a
            java.util.ArrayDeque r0 = r0.f192890c
            monitor-enter(r0)
            org.chromium.net.impl.cd r1 = r6.f192887a     // Catch:{ all -> 0x003e }
            java.util.ArrayDeque r1 = r1.f192890c     // Catch:{ all -> 0x003e }
            java.lang.Object r1 = r1.pollFirst()     // Catch:{ all -> 0x003e }
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x003e }
            org.chromium.net.impl.cd r2 = r6.f192887a     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x0039
            r5 = 1
            goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            r2.f192891d = r5     // Catch:{ all -> 0x003e }
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            goto L_0x001f
        L_0x003e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            throw r1
        L_0x0041:
            r0 = move-exception
            org.chromium.net.impl.cd r1 = r6.f192887a
            java.util.ArrayDeque r1 = r1.f192890c
            monitor-enter(r1)
            org.chromium.net.impl.cd r2 = r6.f192887a     // Catch:{ all -> 0x0054 }
            r2.f192891d = r4     // Catch:{ all -> 0x0054 }
            java.util.concurrent.Executor r3 = r2.f192888a     // Catch:{ RejectedExecutionException -> 0x0052 }
            java.lang.Runnable r2 = r2.f192889b     // Catch:{ RejectedExecutionException -> 0x0052 }
            r3.execute(r2)     // Catch:{ RejectedExecutionException -> 0x0052 }
        L_0x0052:
            monitor-exit(r1)     // Catch:{ all -> 0x0054 }
            throw r0
        L_0x0054:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0054 }
            throw r0
        L_0x0057:
            return
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return
        L_0x005a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            goto L_0x005e
        L_0x005d:
            throw r1
        L_0x005e:
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.C72497cc.run():void");
    }
}
