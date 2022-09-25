package com.google.common.util.concurrent;

/* renamed from: com.google.common.util.concurrent.dq */
/* compiled from: PG */
final class C60903dq implements Runnable {

    /* renamed from: a */
    Runnable f165003a;

    /* renamed from: b */
    final /* synthetic */ C60904dr f165004b;

    public C60903dq(C60904dr drVar) {
        this.f165004b = drVar;
    }

    public final String toString() {
        Runnable runnable = this.f165003a;
        if (runnable != null) {
            return "SequentialExecutorWorker{running=" + runnable + "}";
        }
        StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
        int i = this.f165004b.f165008d;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        r10.f165004b.f165008d = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r10.f165003a.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r10.f165003a = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0056, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0057, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        com.google.common.util.concurrent.C60904dr.f165005a.logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", "Exception while executing runnable " + r10.f165003a, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r10.f165003a = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 1
            com.google.common.util.concurrent.dr r3 = r10.f165004b     // Catch:{ all -> 0x0052 }
            java.util.Deque r3 = r3.f165006b     // Catch:{ all -> 0x0052 }
            monitor-enter(r3)     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x0025
            com.google.common.util.concurrent.dr r0 = r10.f165004b     // Catch:{ all -> 0x007c }
            int r4 = r0.f165008d     // Catch:{ all -> 0x007c }
            r5 = 4
            if (r4 != r5) goto L_0x001c
            monitor-exit(r3)     // Catch:{ all -> 0x007c }
            if (r1 == 0) goto L_0x0041
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ Error -> 0x0089 }
            r0.interrupt()     // Catch:{ Error -> 0x0089 }
            return
        L_0x001c:
            long r6 = r0.f165007c     // Catch:{ all -> 0x007c }
            r8 = 1
            long r6 = r6 + r8
            r0.f165007c = r6     // Catch:{ all -> 0x007c }
            r0.f165008d = r5     // Catch:{ all -> 0x007c }
        L_0x0025:
            com.google.common.util.concurrent.dr r0 = r10.f165004b     // Catch:{ all -> 0x007c }
            java.util.Deque r0 = r0.f165006b     // Catch:{ all -> 0x007c }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x007c }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x007c }
            r10.f165003a = r0     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0042
            com.google.common.util.concurrent.dr r0 = r10.f165004b     // Catch:{ all -> 0x007c }
            r0.f165008d = r2     // Catch:{ all -> 0x007c }
            monitor-exit(r3)     // Catch:{ all -> 0x007c }
            if (r1 == 0) goto L_0x0041
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ Error -> 0x0089 }
            r0.interrupt()     // Catch:{ Error -> 0x0089 }
        L_0x0041:
            return
        L_0x0042:
            monitor-exit(r3)     // Catch:{ all -> 0x007c }
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0052 }
            r1 = r1 | r0
            r0 = 0
            java.lang.Runnable r3 = r10.f165003a     // Catch:{ RuntimeException -> 0x0056 }
            r3.run()     // Catch:{ RuntimeException -> 0x0056 }
            r10.f165003a = r0     // Catch:{ all -> 0x0052 }
        L_0x0050:
            r0 = 1
            goto L_0x0002
        L_0x0052:
            r0 = move-exception
            goto L_0x007f
        L_0x0054:
            r3 = move-exception
            goto L_0x0079
        L_0x0056:
            r3 = move-exception
            r9 = r3
            java.util.logging.Logger r4 = com.google.common.util.concurrent.C60904dr.f165005a     // Catch:{ all -> 0x0054 }
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x0054 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
            r3.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r6 = "Exception while executing runnable "
            r3.append(r6)     // Catch:{ all -> 0x0054 }
            java.lang.Runnable r6 = r10.f165003a     // Catch:{ all -> 0x0054 }
            r3.append(r6)     // Catch:{ all -> 0x0054 }
            java.lang.String r6 = "com.google.common.util.concurrent.SequentialExecutor$QueueWorker"
            java.lang.String r7 = "workOnQueue"
            java.lang.String r8 = r3.toString()     // Catch:{ all -> 0x0054 }
            r4.logp(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0054 }
            r10.f165003a = r0     // Catch:{ all -> 0x0052 }
            goto L_0x0050
        L_0x0079:
            r10.f165003a = r0     // Catch:{ all -> 0x0052 }
            throw r3     // Catch:{ all -> 0x0052 }
        L_0x007c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x007f:
            if (r1 == 0) goto L_0x0088
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ Error -> 0x0089 }
            r1.interrupt()     // Catch:{ Error -> 0x0089 }
        L_0x0088:
            throw r0     // Catch:{ Error -> 0x0089 }
        L_0x0089:
            r0 = move-exception
            com.google.common.util.concurrent.dr r1 = r10.f165004b
            java.util.Deque r1 = r1.f165006b
            monitor-enter(r1)
            com.google.common.util.concurrent.dr r3 = r10.f165004b     // Catch:{ all -> 0x0095 }
            r3.f165008d = r2     // Catch:{ all -> 0x0095 }
            monitor-exit(r1)     // Catch:{ all -> 0x0095 }
            throw r0
        L_0x0095:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0095 }
            goto L_0x0099
        L_0x0098:
            throw r0
        L_0x0099:
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C60903dq.run():void");
    }
}
