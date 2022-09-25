package com.google.android.apps.gsa.nga.engine.p6273z;

import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.nga.engine.z.i */
/* compiled from: PG */
public final /* synthetic */ class C80038i implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C80042m f219631a;

    public /* synthetic */ C80038i(C80042m mVar) {
        this.f219631a = mVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        throw r6;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x009f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00a0 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17947a() {
        /*
            r11 = this;
            com.google.android.apps.gsa.nga.engine.z.m r0 = r11.f219631a
            android.app.ActivityManager$RunningAppProcessInfo r1 = new android.app.ActivityManager$RunningAppProcessInfo
            r1.<init>()
            android.app.ActivityManager.getMyMemoryState(r1)
            com.google.android.apps.gsa.nga.shared.v.i r2 = r0.f219642g
            java.lang.String r3 = r2.mo75577b()
            if (r3 == 0) goto L_0x017a
            int r1 = r1.lastTrimLevel
            com.google.android.apps.gsa.nga.shared.v.c.dg r4 = new com.google.android.apps.gsa.nga.shared.v.c.dg
            java.lang.String r5 = "NGA_MEMORY_LAST_TRIM_LEVEL"
            r4.<init>(r5, r3, r1)
            r2.mo75579d(r4)
            java.lang.Object r1 = r0.f219643h
            monitor-enter(r1)
            com.google.android.apps.gsa.nga.engine.z.g r2 = r0.f219639d     // Catch:{ all -> 0x0177 }
            j$.util.Optional r3 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0177 }
            j$.util.Optional r4 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0177 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00a0 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00a0 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r2 = r2.f219629c     // Catch:{ Exception -> 0x00a0 }
            r7.<init>(r2)     // Catch:{ Exception -> 0x00a0 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x00a0 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00a0 }
        L_0x003c:
            r2 = 1
            java.lang.String r6 = r5.readLine()     // Catch:{ all -> 0x007e }
            if (r6 == 0) goto L_0x0080
            com.google.br.r r7 = com.google.android.apps.gsa.nga.engine.p6273z.C80036g.f219627a     // Catch:{ all -> 0x007e }
            com.google.br.k r8 = new com.google.br.k     // Catch:{ all -> 0x007e }
            r8.<init>(r7, r6)     // Catch:{ all -> 0x007e }
            boolean r7 = r8.mo54386g()     // Catch:{ all -> 0x007e }
            if (r7 == 0) goto L_0x0060
            java.lang.String r7 = r8.mo54384e(r2)     // Catch:{ all -> 0x007e }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ all -> 0x007e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x007e }
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r7)     // Catch:{ all -> 0x007e }
        L_0x0060:
            com.google.br.r r7 = com.google.android.apps.gsa.nga.engine.p6273z.C80036g.f219628b     // Catch:{ all -> 0x007e }
            com.google.br.k r8 = new com.google.br.k     // Catch:{ all -> 0x007e }
            r8.<init>(r7, r6)     // Catch:{ all -> 0x007e }
            boolean r6 = r8.mo54386g()     // Catch:{ all -> 0x007e }
            if (r6 == 0) goto L_0x003c
            java.lang.String r6 = r8.mo54384e(r2)     // Catch:{ all -> 0x007e }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ all -> 0x007e }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x007e }
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r6)     // Catch:{ all -> 0x007e }
            goto L_0x003c
        L_0x007e:
            r6 = move-exception
            goto L_0x0084
        L_0x0080:
            r5.close()     // Catch:{ Exception -> 0x00a0 }
            goto L_0x00a0
        L_0x0084:
            r5.close()     // Catch:{ all -> 0x0088 }
            goto L_0x009f
        L_0x0088:
            r5 = move-exception
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x009f }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            r9 = 0
            r7[r9] = r8     // Catch:{ Exception -> 0x009f }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            java.lang.String r10 = "addSuppressed"
            java.lang.reflect.Method r7 = r8.getDeclaredMethod(r10, r7)     // Catch:{ Exception -> 0x009f }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x009f }
            r2[r9] = r5     // Catch:{ Exception -> 0x009f }
            r7.invoke(r6, r2)     // Catch:{ Exception -> 0x009f }
        L_0x009f:
            throw r6     // Catch:{ Exception -> 0x00a0 }
        L_0x00a0:
            com.google.android.apps.gsa.nga.engine.z.a r2 = new com.google.android.apps.gsa.nga.engine.z.a     // Catch:{ all -> 0x0177 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0177 }
            j$.util.Optional r3 = r2.f219621a     // Catch:{ all -> 0x0177 }
            boolean r3 = r3.isPresent()     // Catch:{ all -> 0x0177 }
            if (r3 == 0) goto L_0x00d7
            com.google.android.apps.gsa.nga.shared.v.i r3 = r0.f219642g     // Catch:{ all -> 0x0177 }
            com.google.android.apps.gsa.nga.shared.v.c.lu r4 = com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82617lv.m131766f()     // Catch:{ all -> 0x0177 }
            java.lang.String r5 = "RSS"
            r6 = r4
            com.google.android.apps.gsa.nga.shared.v.c.dh r6 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82387dh) r6     // Catch:{ all -> 0x0177 }
            r6.f225091c = r5     // Catch:{ all -> 0x0177 }
            j$.util.Optional r5 = r2.f219621a     // Catch:{ all -> 0x0177 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0177 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x0177 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0177 }
            double r5 = (double) r5     // Catch:{ all -> 0x0177 }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ all -> 0x0177 }
            r6 = r4
            com.google.android.apps.gsa.nga.shared.v.c.dh r6 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82387dh) r6     // Catch:{ all -> 0x0177 }
            r6.f225090b = r5     // Catch:{ all -> 0x0177 }
            com.google.android.apps.gsa.nga.shared.v.c.lv r4 = r4.mo75980a()     // Catch:{ all -> 0x0177 }
            r3.mo75579d(r4)     // Catch:{ all -> 0x0177 }
        L_0x00d7:
            j$.util.Optional r3 = r2.f219622b     // Catch:{ all -> 0x0177 }
            boolean r3 = r3.isPresent()     // Catch:{ all -> 0x0177 }
            if (r3 == 0) goto L_0x0109
            com.google.android.apps.gsa.nga.shared.v.i r3 = r0.f219642g     // Catch:{ all -> 0x0177 }
            com.google.android.apps.gsa.nga.shared.v.c.lu r4 = com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82617lv.m131766f()     // Catch:{ all -> 0x0177 }
            java.lang.String r5 = "RSS_HWM"
            r6 = r4
            com.google.android.apps.gsa.nga.shared.v.c.dh r6 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82387dh) r6     // Catch:{ all -> 0x0177 }
            r6.f225091c = r5     // Catch:{ all -> 0x0177 }
            j$.util.Optional r5 = r2.f219622b     // Catch:{ all -> 0x0177 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0177 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x0177 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0177 }
            double r5 = (double) r5     // Catch:{ all -> 0x0177 }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ all -> 0x0177 }
            r6 = r4
            com.google.android.apps.gsa.nga.shared.v.c.dh r6 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82387dh) r6     // Catch:{ all -> 0x0177 }
            r6.f225090b = r5     // Catch:{ all -> 0x0177 }
            com.google.android.apps.gsa.nga.shared.v.c.lv r4 = r4.mo75980a()     // Catch:{ all -> 0x0177 }
            r3.mo75579d(r4)     // Catch:{ all -> 0x0177 }
        L_0x0109:
            j$.util.Optional r3 = r2.f219621a     // Catch:{ all -> 0x0177 }
            boolean r3 = r3.isPresent()     // Catch:{ all -> 0x0177 }
            if (r3 == 0) goto L_0x0152
            j$.util.Optional r2 = r2.f219621a     // Catch:{ all -> 0x0177 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0177 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0177 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0177 }
            long r2 = (long) r2     // Catch:{ all -> 0x0177 }
            com.google.android.apps.gsa.shared.util.v.g r4 = r0.f219637b     // Catch:{ all -> 0x0177 }
            com.google.android.apps.gsa.shared.m.f r5 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251525kU     // Catch:{ all -> 0x0177 }
            long r4 = r4.mo85399d(r5)     // Catch:{ all -> 0x0177 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0152
            com.google.android.apps.gsa.shared.util.v.g r2 = r0.f219637b     // Catch:{ all -> 0x0177 }
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251524kT     // Catch:{ all -> 0x0177 }
            boolean r2 = r2.mo85405j(r3)     // Catch:{ all -> 0x0177 }
            if (r2 == 0) goto L_0x0152
            android.content.Context r2 = r0.f219636a     // Catch:{ all -> 0x0177 }
            com.google.android.apps.gsa.nga.engine.n.g r3 = r0.f219640e     // Catch:{ all -> 0x0177 }
            android.content.Intent r3 = r3.mo71200a()     // Catch:{ all -> 0x0177 }
            r4 = 104(0x68, float:1.46E-43)
            r5 = 335544320(0x14000000, float:6.4623485E-27)
            android.app.PendingIntent r2 = android.app.PendingIntent.getBroadcast(r2, r4, r3, r5)     // Catch:{ all -> 0x0177 }
            com.google.android.apps.gsa.nga.shared.android.a.e r3 = r0.f219638c     // Catch:{ all -> 0x0177 }
            com.google.android.apps.gsa.shared.ae.c r4 = com.google.android.apps.gsa.shared.p6974ae.C89094c.NGA_ABNORMAL_MEMORY     // Catch:{ all -> 0x0177 }
            com.google.android.apps.gsa.nga.shared.android.a.c r5 = com.google.android.apps.gsa.nga.shared.android.p6325a.C80942c.NGA_DEV_MEMORY     // Catch:{ all -> 0x0177 }
            com.google.android.apps.gsa.nga.engine.z.l r6 = new com.google.android.apps.gsa.nga.engine.z.l     // Catch:{ all -> 0x0177 }
            r6.<init>(r0, r2)     // Catch:{ all -> 0x0177 }
            r3.mo74730c(r4, r5, r6)     // Catch:{ all -> 0x0177 }
        L_0x0152:
            boolean r2 = r0.mo71201gC()     // Catch:{ all -> 0x0177 }
            if (r2 == 0) goto L_0x0173
            com.google.android.libraries.gsa.k.g r2 = r0.f219641f     // Catch:{ all -> 0x0177 }
            java.lang.String r3 = "[NGA] NgaInteractorMemoryMonitor.scheduleMonitorEvent"
            com.google.android.apps.gsa.shared.util.v.g r4 = r0.f219637b     // Catch:{ all -> 0x0177 }
            com.google.android.apps.gsa.shared.m.f r5 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251523kS     // Catch:{ all -> 0x0177 }
            long r4 = r4.mo85399d(r5)     // Catch:{ all -> 0x0177 }
            com.google.android.apps.gsa.nga.engine.z.i r6 = new com.google.android.apps.gsa.nga.engine.z.i     // Catch:{ all -> 0x0177 }
            r6.<init>(r0)     // Catch:{ all -> 0x0177 }
            com.google.common.util.concurrent.cx r2 = r2.mo28204d(r3, r4, r6)     // Catch:{ all -> 0x0177 }
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)     // Catch:{ all -> 0x0177 }
            r0.f219644i = r2     // Catch:{ all -> 0x0177 }
        L_0x0173:
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a     // Catch:{ all -> 0x0177 }
            monitor-exit(r1)     // Catch:{ all -> 0x0177 }
            return r0
        L_0x0177:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0177 }
            throw r0
        L_0x017a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null deviceRamGb"
            r0.<init>(r1)
            goto L_0x0183
        L_0x0182:
            throw r0
        L_0x0183:
            goto L_0x0182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6273z.C80038i.mo17947a():java.lang.Object");
    }
}
