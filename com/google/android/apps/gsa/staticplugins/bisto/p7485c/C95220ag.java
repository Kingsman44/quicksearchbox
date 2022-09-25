package com.google.android.apps.gsa.staticplugins.bisto.p7485c;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.c.ag */
/* compiled from: PG */
public final /* synthetic */ class C95220ag implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95225al f266402a;

    public /* synthetic */ C95220ag(C95225al alVar) {
        this.f266402a = alVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        r0.f266411e.setMode(0);
        r0.f266411e.setBluetoothScoOn(true);
        r0.f266410d.set(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0062, code lost:
        if (r0.f266411e.isBluetoothScoAvailableOffCall() != false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        android.media.AudioManager.class.getMethod("startBluetoothScoVirtualCall", new java.lang.Class[0]).invoke(r0.f266411e, new java.lang.Object[0]);
        r0.f266411e.setMode(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0081, code lost:
        r1 = com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95225al.f266407a.mo56225c();
        r1.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "ScoAudioRouteManager");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(14784)).mo56386p("startBluetoothScoVirtualCall");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0095, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0096, code lost:
        r0.f266411e.startBluetoothSco();
        r0.f266411e.setMode(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            com.google.android.apps.gsa.staticplugins.bisto.c.al r0 = r5.f266402a
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95225al.f266407a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "ScoAudioRouteManager"
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "Switch to SCO"
            r3 = 14782(0x39be, float:2.0714E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            monitor-enter(r0)
            android.media.AudioManager r1 = r0.f266411e     // Catch:{ all -> 0x00a2 }
            if (r1 != 0) goto L_0x004a
            com.google.common.util.concurrent.SettableFuture r1 = r0.f266412f     // Catch:{ all -> 0x00a2 }
            if (r1 == 0) goto L_0x0048
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95225al.f266407a     // Catch:{ all -> 0x00a2 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x00a2 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00a2 }
            java.lang.String r4 = "ScoAudioRouteManager"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x00a2 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00a2 }
            r3 = 14785(0x39c1, float:2.0718E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x00a2 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = "null audioManager"
            r2.mo56386p(r3)     // Catch:{ all -> 0x00a2 }
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = "null audioManager"
            r2.<init>(r3)     // Catch:{ all -> 0x00a2 }
            r1.mo57357o(r2)     // Catch:{ all -> 0x00a2 }
            r1 = 0
            r0.f266412f = r1     // Catch:{ all -> 0x00a2 }
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x00a2 }
            return
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x00a2 }
            android.media.AudioManager r1 = r0.f266411e
            r2 = 0
            r1.setMode(r2)
            android.media.AudioManager r1 = r0.f266411e
            r3 = 1
            r1.setBluetoothScoOn(r3)
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f266410d
            r1.set(r3)
            android.media.AudioManager r1 = r0.f266411e
            boolean r1 = r1.isBluetoothScoAvailableOffCall()
            if (r1 != 0) goto L_0x0096
            java.lang.Class<android.media.AudioManager> r1 = android.media.AudioManager.class
            java.lang.String r3 = "startBluetoothScoVirtualCall"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ IllegalAccessException -> 0x0080, InvocationTargetException -> 0x007e, NoSuchMethodException -> 0x007c }
            java.lang.reflect.Method r1 = r1.getMethod(r3, r4)     // Catch:{ IllegalAccessException -> 0x0080, InvocationTargetException -> 0x007e, NoSuchMethodException -> 0x007c }
            android.media.AudioManager r3 = r0.f266411e     // Catch:{ IllegalAccessException -> 0x0080, InvocationTargetException -> 0x007e, NoSuchMethodException -> 0x007c }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x0080, InvocationTargetException -> 0x007e, NoSuchMethodException -> 0x007c }
            r1.invoke(r3, r2)     // Catch:{ IllegalAccessException -> 0x0080, InvocationTargetException -> 0x007e, NoSuchMethodException -> 0x007c }
            android.media.AudioManager r0 = r0.f266411e     // Catch:{ IllegalAccessException -> 0x0080, InvocationTargetException -> 0x007e, NoSuchMethodException -> 0x007c }
            r1 = 2
            r0.setMode(r1)     // Catch:{ IllegalAccessException -> 0x0080, InvocationTargetException -> 0x007e, NoSuchMethodException -> 0x007c }
            return
        L_0x007c:
            r0 = move-exception
            goto L_0x0081
        L_0x007e:
            r0 = move-exception
            goto L_0x0081
        L_0x0080:
            r0 = move-exception
        L_0x0081:
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95225al.f266407a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "ScoAudioRouteManager"
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "startBluetoothScoVirtualCall"
            r3 = 14784(0x39c0, float:2.0717E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x0096:
            android.media.AudioManager r1 = r0.f266411e
            r1.startBluetoothSco()
            android.media.AudioManager r0 = r0.f266411e
            r1 = 3
            r0.setMode(r1)
            return
        L_0x00a2:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a2 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95220ag.run():void");
    }
}
