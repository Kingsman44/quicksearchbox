package org.chromium.net.impl;

import java.nio.ByteBuffer;

/* renamed from: org.chromium.net.impl.j */
/* compiled from: PG */
final class C72528j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CronetBidirectionalStream f192979a;

    /* renamed from: b */
    private ByteBuffer f192980b;

    /* renamed from: c */
    private final boolean f192981c;

    public C72528j(CronetBidirectionalStream cronetBidirectionalStream, ByteBuffer byteBuffer, boolean z) {
        this.f192979a = cronetBidirectionalStream;
        this.f192980b = byteBuffer;
        this.f192981c = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1 = r6.f192979a;
        r2 = r1.f192665a;
        r2.f192961a.onWriteCompleted(r1, r1.f192671g, r0, r6.f192981c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r4 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r6.f192979a.mo64164b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            java.nio.ByteBuffer r0 = r6.f192980b     // Catch:{ Exception -> 0x003c }
            r1 = 0
            r6.f192980b = r1     // Catch:{ Exception -> 0x003c }
            org.chromium.net.impl.CronetBidirectionalStream r1 = r6.f192979a     // Catch:{ Exception -> 0x003c }
            java.lang.Object r1 = r1.f192667c     // Catch:{ Exception -> 0x003c }
            monitor-enter(r1)     // Catch:{ Exception -> 0x003c }
            org.chromium.net.impl.CronetBidirectionalStream r2 = r6.f192979a     // Catch:{ all -> 0x0039 }
            boolean r3 = r2.mo64166e()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x0014
            monitor-exit(r1)     // Catch:{ all -> 0x0039 }
            return
        L_0x0014:
            boolean r3 = r6.f192981c     // Catch:{ all -> 0x0039 }
            r4 = 0
            if (r3 == 0) goto L_0x0023
            r3 = 10
            r2.f192670f = r3     // Catch:{ all -> 0x0039 }
            int r2 = r2.f192669e     // Catch:{ all -> 0x0039 }
            r3 = 4
            if (r2 != r3) goto L_0x0023
            r4 = 1
        L_0x0023:
            monitor-exit(r1)     // Catch:{ all -> 0x0039 }
            org.chromium.net.impl.CronetBidirectionalStream r1 = r6.f192979a     // Catch:{ Exception -> 0x003c }
            org.chromium.net.impl.cu r2 = r1.f192665a     // Catch:{ Exception -> 0x003c }
            org.chromium.net.impl.cs r3 = r1.f192671g     // Catch:{ Exception -> 0x003c }
            boolean r5 = r6.f192981c     // Catch:{ Exception -> 0x003c }
            org.chromium.net.BidirectionalStream$Callback r2 = r2.f192961a     // Catch:{ Exception -> 0x003c }
            r2.onWriteCompleted(r1, r3, r0, r5)     // Catch:{ Exception -> 0x003c }
            if (r4 == 0) goto L_0x0038
            org.chromium.net.impl.CronetBidirectionalStream r0 = r6.f192979a     // Catch:{ Exception -> 0x003c }
            r0.mo64164b()     // Catch:{ Exception -> 0x003c }
        L_0x0038:
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0039 }
            throw r0     // Catch:{ Exception -> 0x003c }
        L_0x003c:
            r0 = move-exception
            org.chromium.net.impl.CronetBidirectionalStream r1 = r6.f192979a
            r1.mo64165c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.C72528j.run():void");
    }
}
