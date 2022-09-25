package com.google.android.apps.gsa.staticplugins.bisto.p7485c;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.c.s */
/* compiled from: PG */
public final /* synthetic */ class C95243s implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95248x f266469a;

    public /* synthetic */ C95243s(C95248x xVar) {
        this.f266469a = xVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.apps.gsa.staticplugins.bisto.c.x r0 = r7.f266469a
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95248x.f266475a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "BvraAudioRouteManager"
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "Switch to SCO"
            r3 = 14752(0x39a0, float:2.0672E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            monitor-enter(r0)
            r1 = 0
            r0.f266481g = r1     // Catch:{ all -> 0x00a9 }
            com.google.android.apps.gsa.staticplugins.bisto.c.w r2 = r0.f266480f     // Catch:{ all -> 0x00a9 }
            if (r2 != 0) goto L_0x001f
            goto L_0x0054
        L_0x001f:
            android.bluetooth.BluetoothHeadset r3 = r2.f266474a     // Catch:{ all -> 0x00a9 }
            java.util.List r3 = r3.getConnectedDevices()     // Catch:{ all -> 0x00a9 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00a9 }
        L_0x0029:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00a9 }
            if (r4 == 0) goto L_0x0054
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00a9 }
            android.bluetooth.BluetoothDevice r4 = (android.bluetooth.BluetoothDevice) r4     // Catch:{ all -> 0x00a9 }
            android.bluetooth.BluetoothHeadset r5 = r2.f266474a     // Catch:{ all -> 0x00a9 }
            int r5 = r5.getConnectionState(r4)     // Catch:{ all -> 0x00a9 }
            r6 = 2
            if (r5 != r6) goto L_0x0029
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95248x.f266475a     // Catch:{ all -> 0x00a9 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x00a9 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00a9 }
            java.lang.String r5 = "BvraAudioRouteManager"
            r2.mo56378ag(r3, r5)     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = "Found connected headset"
            r5 = 14756(0x39a4, float:2.0678E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r3)     // Catch:{ all -> 0x00a9 }
            r0.f266481g = r4     // Catch:{ all -> 0x00a9 }
        L_0x0054:
            com.google.android.apps.gsa.staticplugins.bisto.c.w r2 = r0.f266480f     // Catch:{ all -> 0x00a9 }
            if (r2 == 0) goto L_0x007b
            android.bluetooth.BluetoothDevice r2 = r0.f266481g     // Catch:{ all -> 0x00a9 }
            if (r2 == 0) goto L_0x007b
            android.media.AudioManager r2 = r0.f266479e     // Catch:{ all -> 0x00a9 }
            if (r2 == 0) goto L_0x007b
            com.google.android.apps.gsa.staticplugins.bisto.c.w r2 = r0.f266480f     // Catch:{ all -> 0x00a9 }
            android.bluetooth.BluetoothDevice r3 = r0.f266481g     // Catch:{ all -> 0x00a9 }
            android.bluetooth.BluetoothHeadset r2 = r2.f266474a     // Catch:{ all -> 0x00a9 }
            boolean r2 = r2.startVoiceRecognition(r3)     // Catch:{ all -> 0x00a9 }
            if (r2 != 0) goto L_0x006d
            goto L_0x007b
        L_0x006d:
            android.media.AudioManager r1 = r0.f266479e     // Catch:{ all -> 0x00a9 }
            r2 = 1
            r1.setBluetoothScoOn(r2)     // Catch:{ all -> 0x00a9 }
            android.media.AudioManager r1 = r0.f266479e     // Catch:{ all -> 0x00a9 }
            r2 = 3
            r1.setMode(r2)     // Catch:{ all -> 0x00a9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
            return
        L_0x007b:
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95248x.f266475a     // Catch:{ all -> 0x00a9 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x00a9 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = "BvraAudioRouteManager"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x00a9 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00a9 }
            r3 = 14753(0x39a1, float:2.0673E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x00a9 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = "error switching to SCO"
            r2.mo56386p(r3)     // Catch:{ all -> 0x00a9 }
            com.google.common.util.concurrent.SettableFuture r2 = r0.f266483i     // Catch:{ all -> 0x00a9 }
            if (r2 == 0) goto L_0x00a7
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = "null profile or headset"
            r3.<init>(r4)     // Catch:{ all -> 0x00a9 }
            r2.mo57357o(r3)     // Catch:{ all -> 0x00a9 }
            r0.f266483i = r1     // Catch:{ all -> 0x00a9 }
        L_0x00a7:
            monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
            return
        L_0x00a9:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
            goto L_0x00ad
        L_0x00ac:
            throw r1
        L_0x00ad:
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95243s.run():void");
    }
}
