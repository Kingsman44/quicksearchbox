package com.google.apps.tiktok.concurrent;

/* renamed from: com.google.apps.tiktok.concurrent.am */
/* compiled from: PG */
final class C46426am implements Runnable {

    /* renamed from: a */
    Runnable f121495a;

    /* renamed from: b */
    final /* synthetic */ C46427an f121496b;

    public C46426am(C46427an anVar) {
        this.f121496b = anVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        r6.f121496b.f121498b = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r3 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        r3 = r3 | java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r6.f121495a.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 1
            com.google.android.libraries.p1623at.p1632e.C19559g.m37304c()     // Catch:{ all -> 0x0060 }
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0007:
            com.google.apps.tiktok.concurrent.an r4 = r6.f121496b     // Catch:{ all -> 0x004d }
            java.util.Deque r4 = r4.f121497a     // Catch:{ all -> 0x004d }
            monitor-enter(r4)     // Catch:{ all -> 0x004d }
            if (r2 != 0) goto L_0x0020
            com.google.apps.tiktok.concurrent.an r2 = r6.f121496b     // Catch:{ all -> 0x0053 }
            int r2 = r2.f121498b     // Catch:{ all -> 0x0053 }
            r5 = 2
            if (r2 != r5) goto L_0x0017
            r2 = 1
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            com.google.common.base.C58838bb.m90883r(r2)     // Catch:{ all -> 0x0053 }
            com.google.apps.tiktok.concurrent.an r2 = r6.f121496b     // Catch:{ all -> 0x0053 }
            r5 = 3
            r2.f121498b = r5     // Catch:{ all -> 0x0053 }
        L_0x0020:
            com.google.apps.tiktok.concurrent.an r2 = r6.f121496b     // Catch:{ all -> 0x0053 }
            java.util.Deque r2 = r2.f121497a     // Catch:{ all -> 0x0053 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x0053 }
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ all -> 0x0053 }
            r6.f121495a = r2     // Catch:{ all -> 0x0053 }
            if (r2 != 0) goto L_0x003d
            com.google.apps.tiktok.concurrent.an r1 = r6.f121496b     // Catch:{ all -> 0x0053 }
            r1.f121498b = r0     // Catch:{ all -> 0x0053 }
            monitor-exit(r4)     // Catch:{ all -> 0x0053 }
            if (r3 == 0) goto L_0x003c
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0060 }
            r1.interrupt()     // Catch:{ all -> 0x0060 }
        L_0x003c:
            return
        L_0x003d:
            monitor-exit(r4)     // Catch:{ all -> 0x0053 }
            boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x004d }
            r3 = r3 | r2
            r2 = 0
            java.lang.Runnable r4 = r6.f121495a     // Catch:{ all -> 0x004f }
            r4.run()     // Catch:{ all -> 0x004f }
            r6.f121495a = r2     // Catch:{ all -> 0x004d }
            r2 = 1
            goto L_0x0007
        L_0x004d:
            r1 = move-exception
            goto L_0x0056
        L_0x004f:
            r1 = move-exception
            r6.f121495a = r2     // Catch:{ all -> 0x004d }
            throw r1     // Catch:{ all -> 0x004d }
        L_0x0053:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0053 }
            throw r1     // Catch:{ all -> 0x004d }
        L_0x0056:
            if (r3 == 0) goto L_0x005f
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0060 }
            r2.interrupt()     // Catch:{ all -> 0x0060 }
        L_0x005f:
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r1 = move-exception
            com.google.apps.tiktok.concurrent.an r2 = r6.f121496b
            java.util.Deque r2 = r2.f121497a
            monitor-enter(r2)
            com.google.apps.tiktok.concurrent.an r3 = r6.f121496b     // Catch:{ all -> 0x006c }
            r3.f121498b = r0     // Catch:{ all -> 0x006c }
            monitor-exit(r2)     // Catch:{ all -> 0x006c }
            throw r1
        L_0x006c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006c }
            goto L_0x0070
        L_0x006f:
            throw r0
        L_0x0070:
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.concurrent.C46426am.run():void");
    }

    public final String toString() {
        Runnable runnable = this.f121495a;
        if (runnable != null) {
            String obj = runnable.toString();
            return "SequentialExecutorWorker{running=" + obj + "}";
        }
        int i = this.f121496b.f121498b;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "RUNNING" : "QUEUED" : "IDLE";
        return "SequentialExecutorWorker{state=" + str + "}";
    }
}
