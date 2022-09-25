package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;

/* renamed from: com.google.ads.interactivemedia.v3.internal.api */
/* compiled from: PG */
final class C6800api implements Runnable {

    /* renamed from: a */
    private Context f21350a;

    public C6800api(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f21350a = applicationContext;
        if (applicationContext == null) {
            this.f21350a = context;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0036, code lost:
        com.google.ads.interactivemedia.p367v3.internal.apj.f21352e.countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0040, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x0016, B:17:0x002c] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            java.lang.Class<com.google.ads.interactivemedia.v3.internal.apj> r0 = com.google.ads.interactivemedia.p367v3.internal.apj.class
            monitor-enter(r0)
            com.google.android.gms.a.b.d r1 = com.google.ads.interactivemedia.p367v3.internal.apj.f21351d     // Catch:{ y -> 0x002c, IOException -> 0x0027, z -> 0x0022 }
            if (r1 != 0) goto L_0x0016
            com.google.android.gms.a.b.d r1 = new com.google.android.gms.a.b.d     // Catch:{ y -> 0x002c, IOException -> 0x0027, z -> 0x0022 }
            android.content.Context r2 = r6.f21350a     // Catch:{ y -> 0x002c, IOException -> 0x0027, z -> 0x0022 }
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 0
            r1.<init>(r2, r3, r5)     // Catch:{ y -> 0x002c, IOException -> 0x0027, z -> 0x0022 }
            com.google.ads.interactivemedia.p367v3.internal.apj.f21351d = r1     // Catch:{ y -> 0x002c, IOException -> 0x0027, z -> 0x0022 }
        L_0x0016:
            java.util.concurrent.CountDownLatch r1 = com.google.ads.interactivemedia.p367v3.internal.apj.f21352e     // Catch:{ all -> 0x001e }
        L_0x001a:
            r1.countDown()     // Catch:{ all -> 0x001e }
            goto L_0x0034
        L_0x001e:
            r1 = move-exception
            goto L_0x003e
        L_0x0020:
            r1 = move-exception
            goto L_0x0036
        L_0x0022:
            java.util.concurrent.CountDownLatch r1 = com.google.ads.interactivemedia.p367v3.internal.apj.f21352e     // Catch:{ all -> 0x001e }
            goto L_0x001a
        L_0x0027:
            java.util.concurrent.CountDownLatch r1 = com.google.ads.interactivemedia.p367v3.internal.apj.f21352e     // Catch:{ all -> 0x001e }
            goto L_0x001a
        L_0x002c:
            com.google.ads.interactivemedia.p367v3.internal.apj.f21353f = true     // Catch:{ all -> 0x0020 }
            java.util.concurrent.CountDownLatch r1 = com.google.ads.interactivemedia.p367v3.internal.apj.f21352e     // Catch:{ all -> 0x001e }
            goto L_0x001a
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x0036:
            java.util.concurrent.CountDownLatch r2 = com.google.ads.interactivemedia.p367v3.internal.apj.f21352e     // Catch:{ all -> 0x001e }
            r2.countDown()     // Catch:{ all -> 0x001e }
            throw r1     // Catch:{ all -> 0x001e }
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            goto L_0x0041
        L_0x0040:
            throw r1
        L_0x0041:
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C6800api.run():void");
    }
}
