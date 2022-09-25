package com.google.android.p3545q.p3547b;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.q.b.b */
/* compiled from: PG */
final class C45209b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C45211d f117972a;

    /* renamed from: b */
    final /* synthetic */ SettableFuture f117973b;

    public C45209b(C45211d dVar, SettableFuture settableFuture) {
        this.f117972a = dVar;
        this.f117973b = settableFuture;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a0, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            java.lang.String r0 = "Failed to create cache file "
            com.google.android.q.b.d r1 = r9.f117972a
            android.graphics.Typeface r1 = r1.mo49053a()
            if (r1 == 0) goto L_0x0017
            com.google.common.util.concurrent.SettableFuture r0 = r9.f117973b
            com.google.android.q.b.g r2 = new com.google.android.q.b.g
            com.google.android.q.b.e r3 = com.google.android.p3545q.p3547b.C45212e.CACHE
            r2.<init>(r3, r1)
            r0.mo57356n(r2)
            return
        L_0x0017:
            com.google.android.q.b.d r1 = r9.f117972a
            com.google.common.util.concurrent.SettableFuture r2 = r9.f117973b
            com.google.android.q.b.a r3 = new com.google.android.q.b.a
            r3.<init>(r1)
            int r4 = android.net.TrafficStats.getThreadStatsTag()
            r5 = 352721512(0x15061a68, float:2.7081915E-26)
            android.net.TrafficStats.setThreadStatsTag(r5)
            java.lang.Object r3 = r3.mo5672a()     // Catch:{ all -> 0x00a1 }
            java.io.InputStream r3 = (java.io.InputStream) r3     // Catch:{ all -> 0x00a1 }
            java.io.File r5 = r1.mo49055c()     // Catch:{ all -> 0x00a1 }
            boolean r5 = r5.exists()     // Catch:{ all -> 0x00a1 }
            if (r5 != 0) goto L_0x005f
            java.io.File r5 = r1.mo49055c()     // Catch:{ all -> 0x00a1 }
            boolean r5 = r5.createNewFile()     // Catch:{ all -> 0x00a1 }
            if (r5 == 0) goto L_0x0045
            goto L_0x005f
        L_0x0045:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x00a1 }
            java.io.File r5 = r1.mo49055c()     // Catch:{ all -> 0x00a1 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a1 }
            r6.<init>(r0)     // Catch:{ all -> 0x00a1 }
            r6.append(r5)     // Catch:{ all -> 0x00a1 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = r0.concat(r5)     // Catch:{ all -> 0x00a1 }
            r3.<init>(r0)     // Catch:{ all -> 0x00a1 }
            throw r3     // Catch:{ all -> 0x00a1 }
        L_0x005f:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x00a1 }
            java.io.File r5 = r1.mo49055c()     // Catch:{ all -> 0x00a1 }
            r0.<init>(r5)     // Catch:{ all -> 0x00a1 }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r5]     // Catch:{ all -> 0x009a }
        L_0x006c:
            r7 = 0
            int r8 = r3.read(r6, r7, r5)     // Catch:{ all -> 0x009a }
            if (r8 <= 0) goto L_0x0077
            r0.write(r6, r7, r8)     // Catch:{ all -> 0x009a }
            goto L_0x006c
        L_0x0077:
            r3 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r3)     // Catch:{ all -> 0x00a1 }
            android.graphics.Typeface r0 = r1.mo49053a()     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x008c
            com.google.android.q.b.g r3 = new com.google.android.q.b.g     // Catch:{ all -> 0x00a1 }
            com.google.android.q.b.e r5 = com.google.android.p3545q.p3547b.C45212e.NETWORK     // Catch:{ all -> 0x00a1 }
            r3.<init>(r5, r0)     // Catch:{ all -> 0x00a1 }
            r2.mo57356n(r3)     // Catch:{ all -> 0x00a1 }
            goto L_0x0096
        L_0x008c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00a1 }
            java.lang.String r3 = "Failed to get font"
            r0.<init>(r3)     // Catch:{ all -> 0x00a1 }
            r2.mo57357o(r0)     // Catch:{ all -> 0x00a1 }
        L_0x0096:
            android.net.TrafficStats.setThreadStatsTag(r4)
            return
        L_0x009a:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x009c }
        L_0x009c:
            r5 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r3)     // Catch:{ all -> 0x00a1 }
            throw r5     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception
            com.google.common.f.e r3 = com.google.android.p3545q.p3547b.C45211d.f117975a     // Catch:{ all -> 0x00c9 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x00c9 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00c9 }
            com.google.common.f.x r3 = r3.mo56382g(r0)     // Catch:{ all -> 0x00c9 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00c9 }
            java.lang.String r5 = "Failed to load XITS front from '%s'"
            android.net.Uri r1 = r1.f117978d     // Catch:{ all -> 0x00c9 }
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ all -> 0x00c9 }
            r7 = 54677(0xd595, float:7.6619E-41)
            r6.<init>(r7)     // Catch:{ all -> 0x00c9 }
            r3.mo56379ah(r6)     // Catch:{ all -> 0x00c9 }
            r3.mo56389s(r5, r1)     // Catch:{ all -> 0x00c9 }
            r2.mo57357o(r0)     // Catch:{ all -> 0x00c9 }
            android.net.TrafficStats.setThreadStatsTag(r4)
            return
        L_0x00c9:
            r0 = move-exception
            android.net.TrafficStats.setThreadStatsTag(r4)
            goto L_0x00cf
        L_0x00ce:
            throw r0
        L_0x00cf:
            goto L_0x00ce
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.p3545q.p3547b.C45209b.run():void");
    }
}
