package com.google.apps.tiktok.experiments.phenotype;

import android.os.MessageQueue;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.dw */
/* compiled from: PG */
final class C47010dw implements MessageQueue.IdleHandler {

    /* renamed from: a */
    final /* synthetic */ C47013dz f122554a;

    public C47010dw(C47013dz dzVar) {
        this.f122554a = dzVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean queueIdle() {
        /*
            r4 = this;
            com.google.apps.tiktok.experiments.phenotype.dz r0 = r4.f122554a
            boolean r1 = r0.f122561e
            if (r1 != 0) goto L_0x005d
            java.util.Set r0 = r0.f122558b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "Recreating all activities"
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r0)
            com.google.apps.tiktok.experiments.phenotype.dz r1 = r4.f122554a
            boolean r2 = r1.mo50977a()     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x0051
            r2 = 1
            r1.f122561e = r2     // Catch:{ all -> 0x0056 }
            com.google.apps.tiktok.experiments.phenotype.dx r2 = new com.google.apps.tiktok.experiments.phenotype.dx     // Catch:{ all -> 0x0056 }
            r2.<init>(r1)     // Catch:{ all -> 0x0056 }
            java.lang.Runnable r2 = com.google.apps.tiktok.tracing.C47810es.m84977q(r2)     // Catch:{ all -> 0x0056 }
            android.os.Handler r3 = com.google.android.libraries.p1623at.p1632e.C19559g.m37302a()     // Catch:{ all -> 0x0056 }
            r3.post(r2)     // Catch:{ all -> 0x0056 }
            java.util.Set r2 = r1.f122557a     // Catch:{ all -> 0x0056 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0056 }
        L_0x0035:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0056 }
            if (r3 == 0) goto L_0x0045
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0056 }
            android.app.Activity r3 = (android.app.Activity) r3     // Catch:{ all -> 0x0056 }
            r3.recreate()     // Catch:{ all -> 0x0056 }
            goto L_0x0035
        L_0x0045:
            com.google.apps.tiktok.experiments.phenotype.dy r2 = new com.google.apps.tiktok.experiments.phenotype.dy     // Catch:{ all -> 0x0056 }
            r2.<init>(r1)     // Catch:{ all -> 0x0056 }
            android.os.Handler r1 = com.google.android.libraries.p1623at.p1632e.C19559g.m37302a()     // Catch:{ all -> 0x0056 }
            r1.post(r2)     // Catch:{ all -> 0x0056 }
        L_0x0051:
            r1 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r1)
            goto L_0x005d
        L_0x0056:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r2 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r1)
            throw r2
        L_0x005d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.experiments.phenotype.C47010dw.queueIdle():boolean");
    }
}
