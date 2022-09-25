package com.android.p275j;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.android.j.ac */
/* compiled from: PG */
final class C5189ac {

    /* renamed from: a */
    public final Map f16470a = new HashMap();

    /* renamed from: b */
    public final C5198j f16471b;

    /* renamed from: c */
    private final C5193e f16472c;

    /* renamed from: d */
    private final BlockingQueue f16473d;

    public C5189ac(C5193e eVar, BlockingQueue blockingQueue, C5198j jVar) {
        this.f16471b = jVar;
        this.f16472c = eVar;
        this.f16473d = blockingQueue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10277a(com.android.p275j.C5206r r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r6 = r6.f16514b     // Catch:{ all -> 0x0060 }
            java.util.Map r0 = r5.f16470a     // Catch:{ all -> 0x0060 }
            java.lang.Object r0 = r0.remove(r6)     // Catch:{ all -> 0x0060 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x005e
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0060 }
            if (r1 != 0) goto L_0x005e
            boolean r1 = com.android.p275j.C5188ab.f16468b     // Catch:{ all -> 0x0060 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002d
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0060 }
            int r4 = r0.size()     // Catch:{ all -> 0x0060 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0060 }
            r1[r3] = r4     // Catch:{ all -> 0x0060 }
            r1[r2] = r6     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "%d waiting requests for cacheKey=%s; resend to network"
            com.android.p275j.C5188ab.m14150e(r4, r1)     // Catch:{ all -> 0x0060 }
        L_0x002d:
            java.lang.Object r1 = r0.remove(r3)     // Catch:{ all -> 0x0060 }
            com.android.j.r r1 = (com.android.p275j.C5206r) r1     // Catch:{ all -> 0x0060 }
            java.util.Map r4 = r5.f16470a     // Catch:{ all -> 0x0060 }
            r4.put(r6, r0)     // Catch:{ all -> 0x0060 }
            r1.mo10299i(r5)     // Catch:{ all -> 0x0060 }
            java.util.concurrent.BlockingQueue r6 = r5.f16473d     // Catch:{ InterruptedException -> 0x0042 }
            r6.put(r1)     // Catch:{ InterruptedException -> 0x0042 }
            monitor-exit(r5)
            return
        L_0x0042:
            r6 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0060 }
            r0[r3] = r6     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = "Couldn't add request to queue. %s"
            com.android.p275j.C5188ab.m14148c(r6, r0)     // Catch:{ all -> 0x0060 }
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0060 }
            r6.interrupt()     // Catch:{ all -> 0x0060 }
            com.android.j.e r6 = r5.f16472c     // Catch:{ all -> 0x0060 }
            r6.mo10281a()     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)
            return
        L_0x005e:
            monitor-exit(r5)
            return
        L_0x0060:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p275j.C5189ac.mo10277a(com.android.j.r):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo10278b(com.android.p275j.C5206r r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r6.f16514b     // Catch:{ all -> 0x0050 }
            java.util.Map r1 = r5.f16470a     // Catch:{ all -> 0x0050 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0050 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0038
            java.util.Map r1 = r5.f16470a     // Catch:{ all -> 0x0050 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0050 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x001c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0050 }
            r1.<init>()     // Catch:{ all -> 0x0050 }
        L_0x001c:
            java.lang.String r4 = "waiting-for-response"
            r6.mo10293c(r4)     // Catch:{ all -> 0x0050 }
            r1.add(r6)     // Catch:{ all -> 0x0050 }
            java.util.Map r6 = r5.f16470a     // Catch:{ all -> 0x0050 }
            r6.put(r0, r1)     // Catch:{ all -> 0x0050 }
            boolean r6 = com.android.p275j.C5188ab.f16468b     // Catch:{ all -> 0x0050 }
            if (r6 == 0) goto L_0x0036
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0050 }
            r6[r3] = r0     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "Request for cacheKey=%s is in flight, putting on hold."
            com.android.p275j.C5188ab.m14147b(r0, r6)     // Catch:{ all -> 0x0050 }
        L_0x0036:
            monitor-exit(r5)
            return r2
        L_0x0038:
            java.util.Map r1 = r5.f16470a     // Catch:{ all -> 0x0050 }
            r4 = 0
            r1.put(r0, r4)     // Catch:{ all -> 0x0050 }
            r6.mo10299i(r5)     // Catch:{ all -> 0x0050 }
            boolean r6 = com.android.p275j.C5188ab.f16468b     // Catch:{ all -> 0x0050 }
            if (r6 == 0) goto L_0x004e
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0050 }
            r6[r3] = r0     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "new request, sending to network %s"
            com.android.p275j.C5188ab.m14147b(r0, r6)     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r5)
            return r3
        L_0x0050:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p275j.C5189ac.mo10278b(com.android.j.r):boolean");
    }
}
