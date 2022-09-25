package org.chromium.net.impl;

import java.nio.ByteBuffer;

/* renamed from: org.chromium.net.impl.i */
/* compiled from: PG */
final class C72527i implements Runnable {

    /* renamed from: a */
    ByteBuffer f192976a;

    /* renamed from: b */
    boolean f192977b;

    /* renamed from: c */
    final /* synthetic */ CronetBidirectionalStream f192978c;

    public C72527i(CronetBidirectionalStream cronetBidirectionalStream) {
        this.f192978c = cronetBidirectionalStream;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1 = r6.f192978c;
        r2 = r1.f192665a;
        r2.f192961a.onReadCompleted(r1, r1.f192671g, r0, r6.f192977b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r4 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r6.f192978c.mo64164b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            java.nio.ByteBuffer r0 = r6.f192976a     // Catch:{ Exception -> 0x0040 }
            r1 = 0
            r6.f192976a = r1     // Catch:{ Exception -> 0x0040 }
            org.chromium.net.impl.CronetBidirectionalStream r1 = r6.f192978c     // Catch:{ Exception -> 0x0040 }
            java.lang.Object r1 = r1.f192667c     // Catch:{ Exception -> 0x0040 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x0040 }
            org.chromium.net.impl.CronetBidirectionalStream r2 = r6.f192978c     // Catch:{ all -> 0x003d }
            boolean r3 = r2.mo64166e()     // Catch:{ all -> 0x003d }
            if (r3 == 0) goto L_0x0014
            monitor-exit(r1)     // Catch:{ all -> 0x003d }
            return
        L_0x0014:
            boolean r3 = r6.f192977b     // Catch:{ all -> 0x003d }
            r4 = 0
            if (r3 == 0) goto L_0x0024
            r3 = 4
            r2.f192669e = r3     // Catch:{ all -> 0x003d }
            int r2 = r2.f192670f     // Catch:{ all -> 0x003d }
            r3 = 10
            if (r2 != r3) goto L_0x0027
            r4 = 1
            goto L_0x0027
        L_0x0024:
            r3 = 2
            r2.f192669e = r3     // Catch:{ all -> 0x003d }
        L_0x0027:
            monitor-exit(r1)     // Catch:{ all -> 0x003d }
            org.chromium.net.impl.CronetBidirectionalStream r1 = r6.f192978c     // Catch:{ Exception -> 0x0040 }
            org.chromium.net.impl.cu r2 = r1.f192665a     // Catch:{ Exception -> 0x0040 }
            org.chromium.net.impl.cs r3 = r1.f192671g     // Catch:{ Exception -> 0x0040 }
            boolean r5 = r6.f192977b     // Catch:{ Exception -> 0x0040 }
            org.chromium.net.BidirectionalStream$Callback r2 = r2.f192961a     // Catch:{ Exception -> 0x0040 }
            r2.onReadCompleted(r1, r3, r0, r5)     // Catch:{ Exception -> 0x0040 }
            if (r4 == 0) goto L_0x003c
            org.chromium.net.impl.CronetBidirectionalStream r0 = r6.f192978c     // Catch:{ Exception -> 0x0040 }
            r0.mo64164b()     // Catch:{ Exception -> 0x0040 }
        L_0x003c:
            return
        L_0x003d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            org.chromium.net.impl.CronetBidirectionalStream r1 = r6.f192978c
            r1.mo64165c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.C72527i.run():void");
    }
}
