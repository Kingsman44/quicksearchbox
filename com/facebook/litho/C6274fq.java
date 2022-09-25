package com.facebook.litho;

/* renamed from: com.facebook.litho.fq */
/* compiled from: PG */
final class C6274fq implements Runnable {

    /* renamed from: a */
    Runnable f18528a;

    /* renamed from: b */
    final /* synthetic */ C6275fr f18529b;

    public C6274fq(C6275fr frVar) {
        this.f18529b = frVar;
    }

    public final String toString() {
        Runnable runnable = this.f18528a;
        if (runnable != null) {
            String obj = runnable.toString();
            return "SequentialLithoHandler{running=" + obj + "}";
        }
        int i = this.f18529b.f18532c;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE";
        return "SequentialLithoHandler{state=" + str + "}";
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
        r10.f18529b.f18532c = 1;
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
        r10.f18528a.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r10.f18528a = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
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
            com.facebook.litho.fr r3 = r10.f18529b     // Catch:{ all -> 0x0052 }
            java.util.Deque r3 = r3.f18530a     // Catch:{ all -> 0x0052 }
            monitor-enter(r3)     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x0025
            com.facebook.litho.fr r0 = r10.f18529b     // Catch:{ all -> 0x0077 }
            int r4 = r0.f18532c     // Catch:{ all -> 0x0077 }
            r5 = 4
            if (r4 != r5) goto L_0x001c
            monitor-exit(r3)     // Catch:{ all -> 0x0077 }
            if (r1 == 0) goto L_0x0041
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ Error -> 0x0084 }
            r0.interrupt()     // Catch:{ Error -> 0x0084 }
            return
        L_0x001c:
            long r6 = r0.f18531b     // Catch:{ all -> 0x0077 }
            r8 = 1
            long r6 = r6 + r8
            r0.f18531b = r6     // Catch:{ all -> 0x0077 }
            r0.f18532c = r5     // Catch:{ all -> 0x0077 }
        L_0x0025:
            com.facebook.litho.fr r0 = r10.f18529b     // Catch:{ all -> 0x0077 }
            java.util.Deque r0 = r0.f18530a     // Catch:{ all -> 0x0077 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0077 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x0077 }
            r10.f18528a = r0     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0042
            com.facebook.litho.fr r0 = r10.f18529b     // Catch:{ all -> 0x0077 }
            r0.f18532c = r2     // Catch:{ all -> 0x0077 }
            monitor-exit(r3)     // Catch:{ all -> 0x0077 }
            if (r1 == 0) goto L_0x0041
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ Error -> 0x0084 }
            r0.interrupt()     // Catch:{ Error -> 0x0084 }
        L_0x0041:
            return
        L_0x0042:
            monitor-exit(r3)     // Catch:{ all -> 0x0077 }
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0052 }
            r1 = r1 | r0
            r0 = 0
            java.lang.Runnable r3 = r10.f18528a     // Catch:{ RuntimeException -> 0x0056 }
            r3.run()     // Catch:{ RuntimeException -> 0x0056 }
            r10.f18528a = r0     // Catch:{ all -> 0x0052 }
            r0 = 1
            goto L_0x0002
        L_0x0052:
            r0 = move-exception
            goto L_0x007a
        L_0x0054:
            r3 = move-exception
            goto L_0x0074
        L_0x0056:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0054 }
            java.lang.Runnable r5 = r10.f18528a     // Catch:{ all -> 0x0054 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0054 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
            r6.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch:{ all -> 0x0054 }
            r6.append(r5)     // Catch:{ all -> 0x0054 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x0054 }
            r4.<init>(r5, r3)     // Catch:{ all -> 0x0054 }
            throw r4     // Catch:{ all -> 0x0054 }
        L_0x0074:
            r10.f18528a = r0     // Catch:{ all -> 0x0052 }
            throw r3     // Catch:{ all -> 0x0052 }
        L_0x0077:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0077 }
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x007a:
            if (r1 == 0) goto L_0x0083
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ Error -> 0x0084 }
            r1.interrupt()     // Catch:{ Error -> 0x0084 }
        L_0x0083:
            throw r0     // Catch:{ Error -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            com.facebook.litho.fr r1 = r10.f18529b
            java.util.Deque r1 = r1.f18530a
            monitor-enter(r1)
            com.facebook.litho.fr r3 = r10.f18529b     // Catch:{ all -> 0x0090 }
            r3.f18532c = r2     // Catch:{ all -> 0x0090 }
            monitor-exit(r1)     // Catch:{ all -> 0x0090 }
            throw r0
        L_0x0090:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0090 }
            goto L_0x0094
        L_0x0093:
            throw r0
        L_0x0094:
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6274fq.run():void");
    }
}
