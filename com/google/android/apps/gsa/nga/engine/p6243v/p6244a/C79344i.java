package com.google.android.apps.gsa.nga.engine.p6243v.p6244a;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.v.a.i */
/* compiled from: PG */
public final /* synthetic */ class C79344i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C79351p f217866a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f217867b;

    public /* synthetic */ C79344i(C79351p pVar, C60870cx cxVar) {
        this.f217866a = pVar;
        this.f217867b = cxVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        ((com.google.android.apps.gsa.nga.engine.p6260x.C79863k) r0.f217880e.mo27525b()).mo74248n(com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_LIFECYCLE_FAILURE, r6.mo71205o());
        r7 = r0.f217887l.mo85102a();
        r1 = r0.f217881f;
        r9 = com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82610lo.m131735h();
        r9.mo75951c(false);
        r6 = r6.mo71204l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        if (r6 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        ((com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82380da) r9).f225066c = r6;
        r9.mo75950b(r0.f217882g.getAndSet(false));
        ((com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82380da) r9).f225065b = java.lang.Double.valueOf((double) r7);
        r1.mo75579d(r9.mo75949a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148477k(r3, java.lang.Throwable.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1 = new com.google.android.apps.gsa.nga.engine.p6243v.p6244a.C79350o(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ce, code lost:
        throw new java.lang.NullPointerException("Null failedComponent");
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d2 A[Catch:{ all -> 0x009c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            com.google.android.apps.gsa.nga.engine.v.a.p r0 = r11.f217866a
            com.google.common.util.concurrent.cx r1 = r11.f217867b
            java.lang.Object r2 = r0.f217883h
            monitor-enter(r2)
            java.util.Set r3 = r0.f217885j     // Catch:{ all -> 0x0127 }
            boolean r1 = r3.remove(r1)     // Catch:{ all -> 0x0127 }
            if (r1 != 0) goto L_0x0011
            monitor-exit(r2)     // Catch:{ all -> 0x0127 }
            return
        L_0x0011:
            java.util.Set r1 = r0.f217885j     // Catch:{ all -> 0x0127 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0127 }
            if (r1 != 0) goto L_0x001d
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a     // Catch:{ all -> 0x0127 }
            goto L_0x0125
        L_0x001d:
            java.util.IdentityHashMap r1 = r0.f217884i     // Catch:{ all -> 0x0127 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x0127 }
            com.google.common.b.ij r1 = com.google.common.p4522b.C58528ij.m90006F(r1)     // Catch:{ all -> 0x0127 }
            java.util.IdentityHashMap r3 = r0.f217884i     // Catch:{ all -> 0x0127 }
            r3.clear()     // Catch:{ all -> 0x0127 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0127 }
        L_0x0030:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0127 }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x00cf
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0127 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0127 }
            java.lang.Object r6 = r3.getKey()     // Catch:{ all -> 0x0127 }
            com.google.android.apps.gsa.nga.engine.g.d r6 = (com.google.android.apps.gsa.nga.engine.p6029g.C76088d) r6     // Catch:{ all -> 0x0127 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0127 }
            com.google.common.util.concurrent.cx r3 = (com.google.common.util.concurrent.C60870cx) r3     // Catch:{ all -> 0x0127 }
            boolean r7 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148480n(r3)     // Catch:{ all -> 0x0127 }
            if (r7 != 0) goto L_0x0030
            dagger.a r1 = r0.f217880e     // Catch:{ all -> 0x0127 }
            java.lang.Object r1 = r1.mo27525b()     // Catch:{ all -> 0x0127 }
            com.google.android.apps.gsa.nga.engine.x.k r1 = (com.google.android.apps.gsa.nga.engine.p6260x.C79863k) r1     // Catch:{ all -> 0x0127 }
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_LIFECYCLE_FAILURE     // Catch:{ all -> 0x0127 }
            int r8 = r6.mo71205o()     // Catch:{ all -> 0x0127 }
            r1.mo74248n(r7, r8)     // Catch:{ all -> 0x0127 }
            com.google.android.apps.gsa.shared.util.bf r1 = r0.f217887l     // Catch:{ all -> 0x0127 }
            long r7 = r1.mo85102a()     // Catch:{ all -> 0x0127 }
            com.google.android.apps.gsa.nga.shared.v.i r1 = r0.f217881f     // Catch:{ all -> 0x0127 }
            com.google.android.apps.gsa.nga.shared.v.c.ln r9 = com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82610lo.m131735h()     // Catch:{ all -> 0x0127 }
            r9.mo75951c(r5)     // Catch:{ all -> 0x0127 }
            java.lang.String r6 = r6.mo71204l()     // Catch:{ all -> 0x0127 }
            if (r6 == 0) goto L_0x00c7
            r10 = r9
            com.google.android.apps.gsa.nga.shared.v.c.da r10 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82380da) r10     // Catch:{ all -> 0x0127 }
            r10.f225066c = r6     // Catch:{ all -> 0x0127 }
            java.util.concurrent.atomic.AtomicBoolean r6 = r0.f217882g     // Catch:{ all -> 0x0127 }
            boolean r6 = r6.getAndSet(r5)     // Catch:{ all -> 0x0127 }
            r9.mo75950b(r6)     // Catch:{ all -> 0x0127 }
            double r6 = (double) r7     // Catch:{ all -> 0x0127 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ all -> 0x0127 }
            r7 = r9
            com.google.android.apps.gsa.nga.shared.v.c.da r7 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82380da) r7     // Catch:{ all -> 0x0127 }
            r7.f225065b = r6     // Catch:{ all -> 0x0127 }
            com.google.android.apps.gsa.nga.shared.v.c.lo r6 = r9.mo75949a()     // Catch:{ all -> 0x0127 }
            r1.mo75579d(r6)     // Catch:{ all -> 0x0127 }
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            java.lang.Throwable r1 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148477k(r3, r1)     // Catch:{ all -> 0x009c }
            goto L_0x00a3
        L_0x009c:
            r1 = move-exception
            com.google.android.apps.gsa.nga.engine.v.a.o r3 = new com.google.android.apps.gsa.nga.engine.v.a.o     // Catch:{ all -> 0x0127 }
            r3.<init>(r1)     // Catch:{ all -> 0x0127 }
            r1 = r3
        L_0x00a3:
            com.google.common.f.a.d r3 = com.google.android.apps.gsa.nga.engine.p6243v.p6244a.C79351p.f217876a     // Catch:{ all -> 0x0127 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x0127 }
            java.lang.String r6 = "Finished NGA lifecycle with failure"
            r7 = 3973(0xf85, float:5.567E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56382g(r1)).mo56372aa(r7)).mo56386p(r6)     // Catch:{ all -> 0x0127 }
            com.google.common.util.concurrent.SettableFuture r3 = r0.f217886k     // Catch:{ all -> 0x0127 }
            r3.mo57357o(r1)     // Catch:{ all -> 0x0127 }
            com.google.android.apps.gsa.shared.util.v.g r3 = r0.f217878c     // Catch:{ all -> 0x0127 }
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251724oH     // Catch:{ all -> 0x0127 }
            boolean r3 = r3.mo85405j(r6)     // Catch:{ all -> 0x0127 }
            if (r3 != 0) goto L_0x00c1
            r1 = 0
            goto L_0x00d0
        L_0x00c1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0127 }
            r0.<init>(r1)     // Catch:{ all -> 0x0127 }
            throw r0     // Catch:{ all -> 0x0127 }
        L_0x00c7:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0127 }
            java.lang.String r1 = "Null failedComponent"
            r0.<init>(r1)     // Catch:{ all -> 0x0127 }
            throw r0     // Catch:{ all -> 0x0127 }
        L_0x00cf:
            r1 = 1
        L_0x00d0:
            if (r1 == 0) goto L_0x0116
            com.google.android.apps.gsa.shared.util.bf r3 = r0.f217887l     // Catch:{ all -> 0x0127 }
            long r6 = r3.mo85102a()     // Catch:{ all -> 0x0127 }
            com.google.android.apps.gsa.nga.shared.v.i r3 = r0.f217881f     // Catch:{ all -> 0x0127 }
            com.google.android.apps.gsa.nga.shared.v.c.ln r8 = com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82610lo.m131735h()     // Catch:{ all -> 0x0127 }
            r8.mo75951c(r4)     // Catch:{ all -> 0x0127 }
            java.lang.String r4 = ""
            r9 = r8
            com.google.android.apps.gsa.nga.shared.v.c.da r9 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82380da) r9     // Catch:{ all -> 0x0127 }
            r9.f225066c = r4     // Catch:{ all -> 0x0127 }
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.f217882g     // Catch:{ all -> 0x0127 }
            boolean r4 = r4.getAndSet(r5)     // Catch:{ all -> 0x0127 }
            r8.mo75950b(r4)     // Catch:{ all -> 0x0127 }
            double r4 = (double) r6     // Catch:{ all -> 0x0127 }
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch:{ all -> 0x0127 }
            r5 = r8
            com.google.android.apps.gsa.nga.shared.v.c.da r5 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82380da) r5     // Catch:{ all -> 0x0127 }
            r5.f225065b = r4     // Catch:{ all -> 0x0127 }
            com.google.android.apps.gsa.nga.shared.v.c.lo r4 = r8.mo75949a()     // Catch:{ all -> 0x0127 }
            r3.mo75579d(r4)     // Catch:{ all -> 0x0127 }
            dagger.a r3 = r0.f217880e     // Catch:{ all -> 0x0127 }
            java.lang.Object r3 = r3.mo27525b()     // Catch:{ all -> 0x0127 }
            com.google.android.apps.gsa.nga.engine.x.k r3 = (com.google.android.apps.gsa.nga.engine.p6260x.C79863k) r3     // Catch:{ all -> 0x0127 }
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_LIFECYCLE_SUCCESS     // Catch:{ all -> 0x0127 }
            r3.mo74247m(r4)     // Catch:{ all -> 0x0127 }
            com.google.common.util.concurrent.SettableFuture r3 = r0.f217886k     // Catch:{ all -> 0x0127 }
            com.google.android.apps.gsa.x.c r4 = com.google.android.apps.gsa.p8883x.C118826c.f331422a     // Catch:{ all -> 0x0127 }
            r3.mo57356n(r4)     // Catch:{ all -> 0x0127 }
        L_0x0116:
            r3 = 0
            r0.f217886k = r3     // Catch:{ all -> 0x0127 }
            com.google.android.apps.gsa.nga.engine.v.a.f r0 = r0.f217879d     // Catch:{ all -> 0x0127 }
            com.google.android.apps.gsa.nga.engine.v.a.d r3 = new com.google.android.apps.gsa.nga.engine.v.a.d     // Catch:{ all -> 0x0127 }
            r3.<init>(r1)     // Catch:{ all -> 0x0127 }
            r0.mo75091b(r3)     // Catch:{ all -> 0x0127 }
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a     // Catch:{ all -> 0x0127 }
        L_0x0125:
            monitor-exit(r2)     // Catch:{ all -> 0x0127 }
            return
        L_0x0127:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0127 }
            goto L_0x012b
        L_0x012a:
            throw r0
        L_0x012b:
            goto L_0x012a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6243v.p6244a.C79344i.run():void");
    }
}
