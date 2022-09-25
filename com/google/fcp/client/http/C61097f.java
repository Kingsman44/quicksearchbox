package com.google.fcp.client.http;

/* renamed from: com.google.fcp.client.http.f */
/* compiled from: PG */
public final /* synthetic */ class C61097f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C61104m f165393a;

    public /* synthetic */ C61097f(C61104m mVar) {
        this.f165393a = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            com.google.fcp.client.http.m r0 = r4.f165393a
            monitor-enter(r0)
            int r1 = r0.f165411o     // Catch:{ all -> 0x0025 }
            r2 = 4
            if (r1 != r2) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x000a:
            r0.f165411o = r2     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = "request cancelled via close()"
            r3 = 3
            r0.mo57668l(r3, r2, r1)     // Catch:{ all -> 0x0025 }
            java.util.concurrent.Future r1 = r0.f165406j     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x001a
            r2 = 1
            r1.cancel(r2)     // Catch:{ all -> 0x0025 }
        L_0x001a:
            boolean r1 = r0.f165402f     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0023
            java.lang.Runnable r1 = r0.f165405i     // Catch:{ all -> 0x0025 }
            r1.run()     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fcp.client.http.C61097f.run():void");
    }
}
