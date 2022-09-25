package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.aj */
/* compiled from: PG */
public final /* synthetic */ class C126196aj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126208av f347727a;

    /* renamed from: b */
    public final /* synthetic */ C126207au f347728b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f347729c;

    public /* synthetic */ C126196aj(C126208av avVar, C126207au auVar, Throwable th) {
        this.f347727a = avVar;
        this.f347728b = auVar;
        this.f347729c = th;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:55|56|57|61|62) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0193 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "ProcessingQueue already: "
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.av r1 = r13.f347727a
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.au r2 = r13.f347728b
            java.lang.Throwable r3 = r13.f347729c
            java.lang.String r4 = "SD.Oration.Stop"
            com.google.apps.tiktok.tracing.bi r4 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r4)
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.au r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126207au.KEYBOARD_RPC_ERROR     // Catch:{ all -> 0x0194 }
            r6 = 0
            if (r2 != r5) goto L_0x0086
            if (r3 == 0) goto L_0x001a
            io.grpc.Status r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126291d.m206500b(r3)     // Catch:{ all -> 0x0194 }
            goto L_0x001b
        L_0x001a:
            r5 = r6
        L_0x001b:
            boolean r7 = r1.f347769r     // Catch:{ all -> 0x0194 }
            if (r7 == 0) goto L_0x0028
            io.grpc.Status r7 = p5488io.grpc.Status.f186904b     // Catch:{ all -> 0x0194 }
            boolean r5 = p3186j$.util.Objects.equals(r5, r7)     // Catch:{ all -> 0x0194 }
            if (r5 == 0) goto L_0x0028
            goto L_0x0086
        L_0x0028:
            boolean r5 = r1.f347769r     // Catch:{ all -> 0x0194 }
            r7 = 2949124(0x2d0004, float:4.132603E-39)
            if (r5 == 0) goto L_0x005b
            com.google.common.f.e r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126208av.f347752a     // Catch:{ all -> 0x0194 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x0194 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0194 }
            com.google.common.f.aa r8 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101863a     // Catch:{ all -> 0x0194 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0194 }
            r5.mo56378ag(r8, r7)     // Catch:{ all -> 0x0194 }
            com.google.common.f.x r5 = r5.mo56382g(r3)     // Catch:{ all -> 0x0194 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0194 }
            r7 = 36934(0x9046, float:5.1756E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r7)     // Catch:{ all -> 0x0194 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0194 }
            java.lang.String r7 = "gRPC stream error %s in stopped %s [SD]"
            com.google.frameworks.client.a.a.b r3 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126291d.m206499a(r3)     // Catch:{ all -> 0x0194 }
            com.google.frameworks.client.a.a.b r8 = r1.f347766o     // Catch:{ all -> 0x0194 }
            r5.mo56354G(r7, r3, r8)     // Catch:{ all -> 0x0194 }
            goto L_0x0086
        L_0x005b:
            com.google.common.f.e r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126208av.f347752a     // Catch:{ all -> 0x0194 }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ all -> 0x0194 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0194 }
            com.google.common.f.aa r8 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101863a     // Catch:{ all -> 0x0194 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0194 }
            r5.mo56378ag(r8, r7)     // Catch:{ all -> 0x0194 }
            com.google.common.f.x r5 = r5.mo56382g(r3)     // Catch:{ all -> 0x0194 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0194 }
            r7 = 36933(0x9045, float:5.1754E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r7)     // Catch:{ all -> 0x0194 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0194 }
            java.lang.String r7 = "Stopping %s on error from Gboard: %s [SD]"
            com.google.frameworks.client.a.a.b r8 = r1.f347766o     // Catch:{ all -> 0x0194 }
            com.google.frameworks.client.a.a.b r3 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126291d.m206499a(r3)     // Catch:{ all -> 0x0194 }
            r5.mo56354G(r7, r8, r3)     // Catch:{ all -> 0x0194 }
        L_0x0086:
            boolean r3 = r1.f347769r     // Catch:{ all -> 0x0194 }
            if (r3 == 0) goto L_0x008c
            goto L_0x0171
        L_0x008c:
            com.google.common.f.e r3 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126208av.f347752a     // Catch:{ all -> 0x0194 }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x0194 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0194 }
            r5 = 36938(0x904a, float:5.1761E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r5)     // Catch:{ all -> 0x0194 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0194 }
            java.lang.String r5 = "Stopping %s due to %s [SD]"
            com.google.frameworks.client.a.a.b r7 = r1.f347766o     // Catch:{ all -> 0x0194 }
            com.google.frameworks.client.a.a.b r8 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r2)     // Catch:{ all -> 0x0194 }
            r3.mo56354G(r5, r7, r8)     // Catch:{ all -> 0x0194 }
            r3 = 1
            r1.f347769r = r3     // Catch:{ all -> 0x0194 }
            com.google.android.libraries.assistant.c.h.a.a.g r5 = r1.f347770s     // Catch:{ all -> 0x0194 }
            if (r5 == 0) goto L_0x00b3
            r5.mo20121a()     // Catch:{ all -> 0x0194 }
            goto L_0x00b8
        L_0x00b3:
            androidx.d.a.c r5 = r1.f347764m     // Catch:{ all -> 0x0194 }
            r5.mo5437b(r6)     // Catch:{ all -> 0x0194 }
        L_0x00b8:
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.t r5 = r1.f347768q     // Catch:{ all -> 0x0194 }
            java.lang.String r6 = "asrSession should have been initialized in %s"
            com.google.frameworks.client.a.a.b r7 = r1.f347766o     // Catch:{ all -> 0x0194 }
            com.google.common.base.C58838bb.m90867b(r5, r6, r7)     // Catch:{ all -> 0x0194 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.t r5 = r1.f347768q     // Catch:{ all -> 0x0194 }
            java.util.concurrent.Executor r6 = r5.f347938j     // Catch:{ all -> 0x0194 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.m r7 = new com.google.android.apps.search.assistant.surfaces.dictation.service.q.m     // Catch:{ all -> 0x0194 }
            r7.<init>(r5, r2)     // Catch:{ all -> 0x0194 }
            java.lang.Runnable r5 = com.google.apps.tiktok.tracing.C47810es.m84977q(r7)     // Catch:{ all -> 0x0194 }
            r6.execute(r5)     // Catch:{ all -> 0x0194 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.cq r5 = r1.f347759h     // Catch:{ all -> 0x0194 }
            java.lang.String r6 = "SD.OrationQueue.Shutdown"
            com.google.apps.tiktok.tracing.bi r6 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r6)     // Catch:{ all -> 0x0194 }
            r7 = 0
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.bu r8 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126234bu.f347850a     // Catch:{ all -> 0x0178 }
            java.lang.Object r9 = r5.f347888g     // Catch:{ all -> 0x0178 }
            monitor-enter(r9)     // Catch:{ all -> 0x0178 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.cj r10 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126250cj.PRISTINE     // Catch:{ all -> 0x0175 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.cj r10 = r5.f347890i     // Catch:{ all -> 0x0175 }
            int r10 = r10.ordinal()     // Catch:{ all -> 0x0175 }
            r11 = 2
            if (r10 == 0) goto L_0x0124
            if (r10 == r3) goto L_0x0117
            if (r10 == r11) goto L_0x010d
            r12 = 3
            if (r10 == r12) goto L_0x00f5
            r12 = 4
            if (r10 == r12) goto L_0x00f5
            goto L_0x012a
        L_0x00f5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0175 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.cj r2 = r5.f347890i     // Catch:{ all -> 0x0175 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0175 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r5.<init>(r0)     // Catch:{ all -> 0x0175 }
            r5.append(r2)     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0175 }
            r1.<init>(r0)     // Catch:{ all -> 0x0175 }
            throw r1     // Catch:{ all -> 0x0175 }
        L_0x010d:
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.cj r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126250cj.SHUTTING_DOWN     // Catch:{ all -> 0x0175 }
            r5.f347890i = r0     // Catch:{ all -> 0x0175 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.bx r8 = new com.google.android.apps.search.assistant.surfaces.dictation.service.q.bx     // Catch:{ all -> 0x0175 }
            r8.<init>(r5)     // Catch:{ all -> 0x0175 }
            goto L_0x012a
        L_0x0117:
            r5.mo107485e()     // Catch:{ all -> 0x0175 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.bw r8 = new com.google.android.apps.search.assistant.surfaces.dictation.service.q.bw     // Catch:{ all -> 0x0175 }
            r8.<init>(r5)     // Catch:{ all -> 0x0175 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.cj r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126250cj.SHUTTING_DOWN     // Catch:{ all -> 0x0175 }
            r5.f347890i = r0     // Catch:{ all -> 0x0175 }
            goto L_0x012a
        L_0x0124:
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.cj r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126250cj.SHUTDOWN     // Catch:{ all -> 0x0175 }
            r5.f347890i = r0     // Catch:{ all -> 0x0175 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.bv r8 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126235bv.f347851a     // Catch:{ all -> 0x0175 }
        L_0x012a:
            monitor-exit(r9)     // Catch:{ all -> 0x0175 }
            com.google.apps.tiktok.tracing.contrib.b.e r0 = r5.f347891j     // Catch:{ all -> 0x0178 }
            com.google.common.util.concurrent.r r8 = com.google.apps.tiktok.tracing.C47810es.m84965e(r8)     // Catch:{ all -> 0x0178 }
            com.google.common.util.concurrent.db r5 = r5.f347886e     // Catch:{ all -> 0x0178 }
            com.google.common.util.concurrent.cx r0 = r0.mo51512b(r8, r5)     // Catch:{ all -> 0x0178 }
            r6.mo51417a(r0)     // Catch:{ all -> 0x0178 }
            r6.close()     // Catch:{ all -> 0x0194 }
            com.google.common.util.concurrent.cx[] r5 = new com.google.common.util.concurrent.C60870cx[r11]     // Catch:{ all -> 0x0194 }
            r5[r7] = r0     // Catch:{ all -> 0x0194 }
            com.google.common.util.concurrent.cx r0 = r1.f347763l     // Catch:{ all -> 0x0194 }
            r5[r3] = r0     // Catch:{ all -> 0x0194 }
            java.util.List r0 = java.util.Arrays.asList(r5)     // Catch:{ all -> 0x0194 }
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar.m206525d(r0)     // Catch:{ all -> 0x0194 }
            com.google.protobuf.ar r3 = r1.f347758g     // Catch:{ all -> 0x0194 }
            com.google.common.util.concurrent.db r5 = r1.f347753b     // Catch:{ all -> 0x0194 }
            j$.time.Duration r3 = com.google.protobuf.p4750c.C62950b.m95473d(r3)     // Catch:{ all -> 0x0194 }
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar.m206526e(r0, r3, r5)     // Catch:{ all -> 0x0194 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.ao r3 = new com.google.android.apps.search.assistant.surfaces.dictation.service.q.ao     // Catch:{ all -> 0x0194 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0194 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.ap r5 = new com.google.android.apps.search.assistant.surfaces.dictation.service.q.ap     // Catch:{ all -> 0x0194 }
            r5.<init>(r1, r2)     // Catch:{ all -> 0x0194 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.s.aq r2 = new com.google.android.apps.search.assistant.surfaces.dictation.service.s.aq     // Catch:{ all -> 0x0194 }
            r2.<init>(r3, r5)     // Catch:{ all -> 0x0194 }
            com.google.common.util.concurrent.db r1 = r1.f347753b     // Catch:{ all -> 0x0194 }
            com.google.common.util.concurrent.bz r2 = com.google.apps.tiktok.tracing.C47810es.m84974n(r2)     // Catch:{ all -> 0x0194 }
            com.google.common.util.concurrent.C60856cj.m92911t(r0, r2, r1)     // Catch:{ all -> 0x0194 }
        L_0x0171:
            r4.close()
            return
        L_0x0175:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0175 }
            throw r0     // Catch:{ all -> 0x0178 }
        L_0x0178:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x017d }
            goto L_0x0193
        L_0x017d:
            r1 = move-exception
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0193 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r2[r7] = r5     // Catch:{ Exception -> 0x0193 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r2 = r5.getDeclaredMethod(r6, r2)     // Catch:{ Exception -> 0x0193 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0193 }
            r3[r7] = r1     // Catch:{ Exception -> 0x0193 }
            r2.invoke(r0, r3)     // Catch:{ Exception -> 0x0193 }
        L_0x0193:
            throw r0     // Catch:{ all -> 0x0194 }
        L_0x0194:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0199 }
            goto L_0x019d
        L_0x0199:
            r1 = move-exception
            com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126279w.m206479a(r0, r1)
        L_0x019d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126196aj.run():void");
    }
}
