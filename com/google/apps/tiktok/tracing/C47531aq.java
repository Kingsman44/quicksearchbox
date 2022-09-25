package com.google.apps.tiktok.tracing;

/* renamed from: com.google.apps.tiktok.tracing.aq */
/* compiled from: PG */
final class C47531aq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C47534at f123369a;

    public C47531aq(C47534at atVar) {
        this.f123369a = atVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0069 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
        L_0x0000:
            com.google.apps.tiktok.tracing.at r0 = r4.f123369a     // Catch:{ InterruptedException -> 0x0069, all -> 0x0042 }
            java.util.concurrent.ExecutorService r0 = r0.f123375c     // Catch:{ InterruptedException -> 0x0069, all -> 0x0042 }
            boolean r0 = r0.isShutdown()     // Catch:{ InterruptedException -> 0x0069, all -> 0x0042 }
            if (r0 != 0) goto L_0x001d
            com.google.apps.tiktok.tracing.at r0 = r4.f123369a     // Catch:{ InterruptedException -> 0x0069, all -> 0x0042 }
            java.lang.ref.ReferenceQueue r0 = r0.f123374b     // Catch:{ InterruptedException -> 0x0069, all -> 0x0042 }
            java.lang.ref.Reference r0 = r0.remove()     // Catch:{ InterruptedException -> 0x0069, all -> 0x0042 }
            com.google.apps.tiktok.tracing.as r0 = (com.google.apps.tiktok.tracing.C47533as) r0     // Catch:{ InterruptedException -> 0x0069, all -> 0x0042 }
            com.google.apps.tiktok.tracing.ar r0 = r0.f123372a     // Catch:{ InterruptedException -> 0x0069, all -> 0x0042 }
            int r1 = com.google.apps.tiktok.tracing.C47532ar.f123370b     // Catch:{ InterruptedException -> 0x0069, all -> 0x0042 }
            r1 = 0
            r0.mo57356n(r1)     // Catch:{ InterruptedException -> 0x0069, all -> 0x0042 }
            goto L_0x0000
        L_0x001d:
            com.google.apps.tiktok.tracing.at r0 = r4.f123369a     // Catch:{ RejectedExecutionException -> 0x0025 }
            java.util.concurrent.ExecutorService r0 = r0.f123375c     // Catch:{ RejectedExecutionException -> 0x0025 }
            r0.execute(r4)     // Catch:{ RejectedExecutionException -> 0x0025 }
            return
        L_0x0025:
            r0 = move-exception
            j$.util.concurrent.ConcurrentHashMap r1 = com.google.apps.tiktok.tracing.C47534at.f123373a
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0030:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x008e
            java.lang.Object r2 = r1.next()
            com.google.apps.tiktok.tracing.as r2 = (com.google.apps.tiktok.tracing.C47533as) r2
            com.google.apps.tiktok.tracing.ar r2 = r2.f123372a
            r2.mo57357o(r0)
            goto L_0x0030
        L_0x0042:
            r0 = move-exception
            com.google.apps.tiktok.tracing.at r1 = r4.f123369a     // Catch:{ RejectedExecutionException -> 0x004b }
            java.util.concurrent.ExecutorService r1 = r1.f123375c     // Catch:{ RejectedExecutionException -> 0x004b }
            r1.execute(r4)     // Catch:{ RejectedExecutionException -> 0x004b }
            goto L_0x0068
        L_0x004b:
            r1 = move-exception
            j$.util.concurrent.ConcurrentHashMap r2 = com.google.apps.tiktok.tracing.C47534at.f123373a
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0056:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0068
            java.lang.Object r3 = r2.next()
            com.google.apps.tiktok.tracing.as r3 = (com.google.apps.tiktok.tracing.C47533as) r3
            com.google.apps.tiktok.tracing.ar r3 = r3.f123372a
            r3.mo57357o(r1)
            goto L_0x0056
        L_0x0068:
            throw r0
        L_0x0069:
            com.google.apps.tiktok.tracing.at r0 = r4.f123369a     // Catch:{ RejectedExecutionException -> 0x0071 }
            java.util.concurrent.ExecutorService r0 = r0.f123375c     // Catch:{ RejectedExecutionException -> 0x0071 }
            r0.execute(r4)     // Catch:{ RejectedExecutionException -> 0x0071 }
            return
        L_0x0071:
            r0 = move-exception
            j$.util.concurrent.ConcurrentHashMap r1 = com.google.apps.tiktok.tracing.C47534at.f123373a
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x007c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x008e
            java.lang.Object r2 = r1.next()
            com.google.apps.tiktok.tracing.as r2 = (com.google.apps.tiktok.tracing.C47533as) r2
            com.google.apps.tiktok.tracing.ar r2 = r2.f123372a
            r2.mo57357o(r0)
            goto L_0x007c
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.tracing.C47531aq.run():void");
    }
}
