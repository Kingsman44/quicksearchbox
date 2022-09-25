package com.google.android.apps.gsa.shared.bisto;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.shared.bisto.ay */
/* compiled from: PG */
public final /* synthetic */ class C89627ay implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C89644ba f242705a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f242706b;

    public /* synthetic */ C89627ay(C89644ba baVar, SettableFuture settableFuture) {
        this.f242705a = baVar;
        this.f242706b = settableFuture;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.google.android.apps.gsa.shared.bisto.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d5 A[SYNTHETIC, Splitter:B:32:0x00d5] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0125 A[Catch:{ IOException -> 0x00fc, all -> 0x015b }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0129 A[Catch:{ IOException -> 0x00fc, all -> 0x015b }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0135 A[Catch:{ IOException -> 0x00fc, all -> 0x015b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            com.google.android.apps.gsa.shared.bisto.ba r0 = r14.f242705a
            com.google.common.util.concurrent.SettableFuture r1 = r14.f242706b
            r2 = 0
            com.google.android.libraries.i.au r3 = com.google.android.libraries.p1963i.C23847av.m44395a(r2)
            java.util.UUID r4 = r0.f242733f     // Catch:{ all -> 0x015b }
            java.lang.String r5 = "ProtoExchangeSocketImpl"
            r6 = 0
            if (r4 == 0) goto L_0x011a
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x015b }
            r0.mo83528b()     // Catch:{ all -> 0x015b }
            java.util.concurrent.atomic.AtomicReference r4 = r0.f242734g     // Catch:{ all -> 0x015b }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.shared.bisto.h r4 = (com.google.android.apps.gsa.shared.bisto.C89653h) r4     // Catch:{ all -> 0x015b }
            com.google.common.f.e r7 = com.google.android.apps.gsa.shared.bisto.C89644ba.f242727b     // Catch:{ IOException -> 0x00fc }
            com.google.common.f.x r7 = r7.mo56224b()     // Catch:{ IOException -> 0x00fc }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x00fc }
            r7.mo56378ag(r8, r5)     // Catch:{ IOException -> 0x00fc }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ IOException -> 0x00fc }
            r8 = 10285(0x282d, float:1.4412E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r8)     // Catch:{ IOException -> 0x00fc }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ IOException -> 0x00fc }
            java.lang.String r8 = "Creating socket: %s"
            java.util.UUID r9 = r0.f242733f     // Catch:{ IOException -> 0x00fc }
            r7.mo56389s(r8, r9)     // Catch:{ IOException -> 0x00fc }
            com.google.android.apps.gsa.shared.bisto.h r7 = new com.google.android.apps.gsa.shared.bisto.h     // Catch:{ IOException -> 0x00fc }
            com.google.android.apps.search.assistant.surfaces.bisto.c.a.a r8 = r0.f242736i     // Catch:{ IOException -> 0x00fc }
            java.util.UUID r9 = r0.f242733f     // Catch:{ IOException -> 0x00fc }
            r7.<init>(r8, r9)     // Catch:{ IOException -> 0x00fc }
            com.google.android.apps.gsa.shared.bisto.az r8 = new com.google.android.apps.gsa.shared.bisto.az     // Catch:{ IOException -> 0x00d1 }
            r8.<init>(r7)     // Catch:{ IOException -> 0x00d1 }
            long r9 = com.google.android.apps.gsa.shared.bisto.C89644ba.f242704a     // Catch:{ IOException -> 0x00d1 }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IOException -> 0x00d1 }
            java.util.concurrent.ScheduledExecutorService r12 = r0.f242732e     // Catch:{ IOException -> 0x00d1 }
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92902k(r8, r9, r11, r12)     // Catch:{ IOException -> 0x00d1 }
            com.google.android.apps.search.assistant.surfaces.bisto.c.a.b r9 = r7.f242763d     // Catch:{ IOException -> 0x00cf }
            android.bluetooth.BluetoothAdapter r10 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ IOException -> 0x00cf }
            if (r10 == 0) goto L_0x0071
            com.google.common.f.e r11 = com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124540b.f343620a     // Catch:{ IOException -> 0x00cf }
            com.google.common.f.x r11 = r11.mo56224b()     // Catch:{ IOException -> 0x00cf }
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x00cf }
            java.lang.String r13 = "BtSocketWrapper"
            r11.mo56378ag(r12, r13)     // Catch:{ IOException -> 0x00cf }
            java.lang.String r12 = "Cancelling discovery"
            r13 = 36244(0x8d94, float:5.0789E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r13)).mo56386p(r12)     // Catch:{ IOException -> 0x00cf }
            r10.cancelDiscovery()     // Catch:{ IOException -> 0x00cf }
        L_0x0071:
            android.bluetooth.BluetoothSocket r9 = r9.f343621b     // Catch:{ NullPointerException -> 0x00c6 }
            r9.connect()     // Catch:{ NullPointerException -> 0x00c6 }
            r8.cancel(r2)     // Catch:{ IOException -> 0x00cf }
            java.util.concurrent.atomic.AtomicReference r9 = r0.f242734g     // Catch:{ IOException -> 0x00cf }
        L_0x007b:
            boolean r10 = r9.compareAndSet(r4, r7)     // Catch:{ IOException -> 0x00cf }
            if (r10 == 0) goto L_0x00a2
            com.google.common.f.e r4 = com.google.android.apps.gsa.shared.bisto.C89644ba.f242727b     // Catch:{ IOException -> 0x00cf }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ IOException -> 0x00cf }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x00cf }
            r4.mo56378ag(r9, r5)     // Catch:{ IOException -> 0x00cf }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ IOException -> 0x00cf }
            r9 = 10287(0x282f, float:1.4415E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r9)     // Catch:{ IOException -> 0x00cf }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ IOException -> 0x00cf }
            java.lang.String r9 = "Connected"
            r4.mo56386p(r9)     // Catch:{ IOException -> 0x00cf }
            com.google.android.apps.gsa.shared.bisto.ax r4 = r0.f242735h     // Catch:{ IOException -> 0x00cf }
            r4.mo83496a()     // Catch:{ IOException -> 0x00cf }
            goto L_0x0123
        L_0x00a2:
            java.lang.Object r10 = r9.get()     // Catch:{ IOException -> 0x00cf }
            if (r10 == r4) goto L_0x007b
            com.google.android.apps.gsa.shared.bisto.C89644ba.m145922f(r7)     // Catch:{ IOException -> 0x00cf }
            com.google.common.f.e r4 = com.google.android.apps.gsa.shared.bisto.C89644ba.f242727b     // Catch:{ IOException -> 0x00cf }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ IOException -> 0x00cf }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x00cf }
            r4.mo56378ag(r9, r5)     // Catch:{ IOException -> 0x00cf }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ IOException -> 0x00cf }
            r9 = 10289(0x2831, float:1.4418E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r9)     // Catch:{ IOException -> 0x00cf }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ IOException -> 0x00cf }
            java.lang.String r9 = "Expired socket got connected. b/140195014"
            r4.mo56386p(r9)     // Catch:{ IOException -> 0x00cf }
            goto L_0x0118
        L_0x00c6:
            r4 = move-exception
            java.io.IOException r9 = new java.io.IOException     // Catch:{ IOException -> 0x00cf }
            java.lang.String r10 = "NPE when trying to connect to bluetooth socket."
            r9.<init>(r10, r4)     // Catch:{ IOException -> 0x00cf }
            throw r9     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            r4 = move-exception
            goto L_0x00d3
        L_0x00d1:
            r4 = move-exception
            r8 = r6
        L_0x00d3:
            if (r8 == 0) goto L_0x00d8
            r8.cancel(r2)     // Catch:{ all -> 0x015b }
        L_0x00d8:
            if (r8 == 0) goto L_0x00e2
            com.google.common.util.concurrent.d r8 = (com.google.common.util.concurrent.C60873d) r8     // Catch:{ all -> 0x015b }
            java.lang.Object r8 = r8.value     // Catch:{ all -> 0x015b }
            boolean r8 = r8 instanceof com.google.common.util.concurrent.C60873d.C60875b     // Catch:{ all -> 0x015b }
            if (r8 == 0) goto L_0x0118
        L_0x00e2:
            com.google.common.f.e r8 = com.google.android.apps.gsa.shared.bisto.C89644ba.f242727b     // Catch:{ all -> 0x015b }
            com.google.common.f.x r8 = r8.mo56226d()     // Catch:{ all -> 0x015b }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x015b }
            r8.mo56378ag(r9, r5)     // Catch:{ all -> 0x015b }
            java.lang.String r9 = "Connecting failed for device %s"
            java.lang.String r10 = r0.mo83528b()     // Catch:{ all -> 0x015b }
            r11 = 10288(0x2830, float:1.4417E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56382g(r4)).mo56372aa(r11)).mo56389s(r9, r10)     // Catch:{ all -> 0x015b }
            r0.mo83532g(r7)     // Catch:{ all -> 0x015b }
            goto L_0x0118
        L_0x00fc:
            r4 = move-exception
            com.google.common.f.e r7 = com.google.android.apps.gsa.shared.bisto.C89644ba.f242727b     // Catch:{ all -> 0x015b }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ all -> 0x015b }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x015b }
            r7.mo56378ag(r8, r5)     // Catch:{ all -> 0x015b }
            java.lang.String r8 = "Create RFCOMM failed, device %s doesn't support Bisto protocol?"
            java.lang.String r9 = r0.mo83528b()     // Catch:{ all -> 0x015b }
            r10 = 10290(0x2832, float:1.442E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r4)).mo56372aa(r10)).mo56389s(r8, r9)     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.shared.bisto.ax r4 = r0.f242735h     // Catch:{ all -> 0x015b }
            r4.mo83499d()     // Catch:{ all -> 0x015b }
        L_0x0118:
            r7 = r6
            goto L_0x0123
        L_0x011a:
            java.util.concurrent.atomic.AtomicReference r4 = r0.f242734g     // Catch:{ all -> 0x015b }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x015b }
            r7 = r4
            com.google.android.apps.gsa.shared.bisto.h r7 = (com.google.android.apps.gsa.shared.bisto.C89653h) r7     // Catch:{ all -> 0x015b }
        L_0x0123:
            if (r7 == 0) goto L_0x0129
            r1.mo57356n(r6)     // Catch:{ all -> 0x015b }
            goto L_0x0133
        L_0x0129:
            java.lang.Exception r4 = new java.lang.Exception     // Catch:{ all -> 0x015b }
            java.lang.String r6 = "Failed to connect"
            r4.<init>(r6)     // Catch:{ all -> 0x015b }
            r1.mo57357o(r4)     // Catch:{ all -> 0x015b }
        L_0x0133:
            if (r7 == 0) goto L_0x0152
            com.google.common.f.e r1 = com.google.android.apps.gsa.shared.bisto.C89644ba.f242727b     // Catch:{ all -> 0x015b }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x015b }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x015b }
            r1.mo56378ag(r4, r5)     // Catch:{ all -> 0x015b }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x015b }
            r4 = 10312(0x2848, float:1.445E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r4)     // Catch:{ all -> 0x015b }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x015b }
            java.lang.String r4 = "readloop"
            r1.mo56386p(r4)     // Catch:{ all -> 0x015b }
            r0.mo83529c(r7)     // Catch:{ all -> 0x015b }
        L_0x0152:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x015b }
            r0.mo83532g(r7)     // Catch:{ all -> 0x015b }
            r3.close()
            return
        L_0x015b:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0160 }
            goto L_0x0177
        L_0x0160:
            r1 = move-exception
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0177 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r4[r2] = r5     // Catch:{ Exception -> 0x0177 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r4 = r5.getDeclaredMethod(r6, r4)     // Catch:{ Exception -> 0x0177 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0177 }
            r3[r2] = r1     // Catch:{ Exception -> 0x0177 }
            r4.invoke(r0, r3)     // Catch:{ Exception -> 0x0177 }
        L_0x0177:
            goto L_0x0179
        L_0x0178:
            throw r0
        L_0x0179:
            goto L_0x0178
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.bisto.C89627ay.run():void");
    }
}
