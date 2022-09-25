package androidx.camera.core.p069a.p070a.p071a;

/* renamed from: androidx.camera.core.a.a.a.l */
/* compiled from: PG */
final class C1249l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1250m f3644a;

    public C1249l(C1250m mVar) {
        this.f3644a = mVar;
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
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        r10.f3644a.f3647c = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0045, code lost:
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004d, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        androidx.camera.core.C1477bw.m3981d("SequentialExecutor", "Exception while executing runnable " + r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
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
            androidx.camera.core.a.a.a.m r3 = r10.f3644a     // Catch:{ all -> 0x004b }
            java.util.Deque r3 = r3.f3645a     // Catch:{ all -> 0x004b }
            monitor-enter(r3)     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x0025
            androidx.camera.core.a.a.a.m r0 = r10.f3644a     // Catch:{ all -> 0x0065 }
            int r4 = r0.f3647c     // Catch:{ all -> 0x0065 }
            r5 = 4
            if (r4 != r5) goto L_0x001c
            monitor-exit(r3)     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x003f
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ Error -> 0x0072 }
            r0.interrupt()     // Catch:{ Error -> 0x0072 }
            return
        L_0x001c:
            long r6 = r0.f3646b     // Catch:{ all -> 0x0065 }
            r8 = 1
            long r6 = r6 + r8
            r0.f3646b = r6     // Catch:{ all -> 0x0065 }
            r0.f3647c = r5     // Catch:{ all -> 0x0065 }
        L_0x0025:
            androidx.camera.core.a.a.a.m r0 = r10.f3644a     // Catch:{ all -> 0x0065 }
            java.util.Deque r0 = r0.f3645a     // Catch:{ all -> 0x0065 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0065 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0040
            androidx.camera.core.a.a.a.m r0 = r10.f3644a     // Catch:{ all -> 0x0065 }
            r0.f3647c = r2     // Catch:{ all -> 0x0065 }
            monitor-exit(r3)     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x003f
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ Error -> 0x0072 }
            r0.interrupt()     // Catch:{ Error -> 0x0072 }
        L_0x003f:
            return
        L_0x0040:
            monitor-exit(r3)     // Catch:{ all -> 0x0065 }
            boolean r3 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x004b }
            r1 = r1 | r3
            r0.run()     // Catch:{ RuntimeException -> 0x004d }
        L_0x0049:
            r0 = 1
            goto L_0x0002
        L_0x004b:
            r0 = move-exception
            goto L_0x0068
        L_0x004d:
            r3 = move-exception
            java.lang.String r4 = "SequentialExecutor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
            r5.<init>()     // Catch:{ all -> 0x004b }
            java.lang.String r6 = "Exception while executing runnable "
            r5.append(r6)     // Catch:{ all -> 0x004b }
            r5.append(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x004b }
            androidx.camera.core.C1477bw.m3981d(r4, r0, r3)     // Catch:{ all -> 0x004b }
            goto L_0x0049
        L_0x0065:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0065 }
            throw r0     // Catch:{ all -> 0x004b }
        L_0x0068:
            if (r1 == 0) goto L_0x0071
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ Error -> 0x0072 }
            r1.interrupt()     // Catch:{ Error -> 0x0072 }
        L_0x0071:
            throw r0     // Catch:{ Error -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            androidx.camera.core.a.a.a.m r1 = r10.f3644a
            java.util.Deque r1 = r1.f3645a
            monitor-enter(r1)
            androidx.camera.core.a.a.a.m r3 = r10.f3644a     // Catch:{ all -> 0x007e }
            r3.f3647c = r2     // Catch:{ all -> 0x007e }
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            throw r0
        L_0x007e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            goto L_0x0082
        L_0x0081:
            throw r0
        L_0x0082:
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.p069a.p070a.p071a.C1249l.run():void");
    }
}
