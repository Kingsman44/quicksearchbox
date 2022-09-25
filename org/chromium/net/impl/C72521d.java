package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.d */
/* compiled from: PG */
final class C72521d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f192967a;

    /* renamed from: b */
    final /* synthetic */ CronetBidirectionalStream f192968b;

    public C72521d(CronetBidirectionalStream cronetBidirectionalStream, boolean z) {
        this.f192968b = cronetBidirectionalStream;
        this.f192967a = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r3.f192968b;
        r0.f192665a.f192961a.onStreamReady(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        r3.f192968b.mo64165c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            org.chromium.net.impl.CronetBidirectionalStream r0 = r3.f192968b
            java.lang.Object r0 = r0.f192667c
            monitor-enter(r0)
            org.chromium.net.impl.CronetBidirectionalStream r1 = r3.f192968b     // Catch:{ all -> 0x0041 }
            boolean r2 = r1.mo64166e()     // Catch:{ all -> 0x0041 }
            if (r2 != 0) goto L_0x003f
            boolean r2 = r3.f192967a     // Catch:{ all -> 0x0041 }
            r1.f192668d = r2     // Catch:{ all -> 0x0041 }
            r2 = 2
            r1.f192669e = r2     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = r1.f192666b     // Catch:{ all -> 0x0041 }
            boolean r1 = org.chromium.net.impl.CronetBidirectionalStream.m107120d(r1)     // Catch:{ all -> 0x0041 }
            if (r1 != 0) goto L_0x0027
            org.chromium.net.impl.CronetBidirectionalStream r1 = r3.f192968b     // Catch:{ all -> 0x0041 }
            boolean r2 = r1.f192668d     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0027
            r2 = 10
            r1.f192670f = r2     // Catch:{ all -> 0x0041 }
            goto L_0x002d
        L_0x0027:
            org.chromium.net.impl.CronetBidirectionalStream r1 = r3.f192968b     // Catch:{ all -> 0x0041 }
            r2 = 8
            r1.f192670f = r2     // Catch:{ all -> 0x0041 }
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            org.chromium.net.impl.CronetBidirectionalStream r0 = r3.f192968b     // Catch:{ Exception -> 0x0038 }
            org.chromium.net.impl.cu r1 = r0.f192665a     // Catch:{ Exception -> 0x0038 }
            org.chromium.net.BidirectionalStream$Callback r1 = r1.f192961a     // Catch:{ Exception -> 0x0038 }
            r1.onStreamReady(r0)     // Catch:{ Exception -> 0x0038 }
            return
        L_0x0038:
            r0 = move-exception
            org.chromium.net.impl.CronetBidirectionalStream r1 = r3.f192968b
            r1.mo64165c(r0)
            return
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x0041:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.C72521d.run():void");
    }
}
