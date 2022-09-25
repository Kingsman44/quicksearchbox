package com.google.android.apps.gsa.nga.engine.viss;

import android.content.ServiceConnection;

/* renamed from: com.google.android.apps.gsa.nga.engine.viss.n */
/* compiled from: PG */
final class C79384n implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ NgaVoiceInteractionSessionService f218003a;

    public C79384n(NgaVoiceInteractionSessionService ngaVoiceInteractionSessionService) {
        this.f218003a = ngaVoiceInteractionSessionService;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            com.google.common.f.e r4 = com.google.android.apps.gsa.nga.engine.viss.NgaVoiceInteractionSessionService.f217951a
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.nga.engine.viss.NgaVoiceInteractionSessionService r4 = r3.f218003a
            java.lang.Object r4 = r4.f217968o
            monitor-enter(r4)
            com.google.android.apps.gsa.nga.engine.viss.NgaVoiceInteractionSessionService r0 = r3.f218003a     // Catch:{ all -> 0x002c }
            if (r5 != 0) goto L_0x000f
            r5 = 0
            goto L_0x0023
        L_0x000f:
            java.lang.String r1 = "android.service.voice.IVoiceInteractionSessionService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ all -> 0x002c }
            boolean r2 = r1 instanceof com.google.android.apps.gsa.nga.engine.viss.C79374d     // Catch:{ all -> 0x002c }
            if (r2 == 0) goto L_0x001d
            r5 = r1
            com.google.android.apps.gsa.nga.engine.viss.d r5 = (com.google.android.apps.gsa.nga.engine.viss.C79374d) r5     // Catch:{ all -> 0x002c }
            goto L_0x0023
        L_0x001d:
            com.google.android.apps.gsa.nga.engine.viss.b r1 = new com.google.android.apps.gsa.nga.engine.viss.b     // Catch:{ all -> 0x002c }
            r1.<init>(r5)     // Catch:{ all -> 0x002c }
            r5 = r1
        L_0x0023:
            r0.f217970q = r5     // Catch:{ all -> 0x002c }
            com.google.android.apps.gsa.nga.engine.viss.NgaVoiceInteractionSessionService r5 = r3.f218003a     // Catch:{ all -> 0x002c }
            r5.mo73926c()     // Catch:{ all -> 0x002c }
            monitor-exit(r4)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.viss.C79384n.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x006f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceDisconnected(android.content.ComponentName r8) {
        /*
            r7 = this;
            com.google.common.f.e r8 = com.google.android.apps.gsa.nga.engine.viss.NgaVoiceInteractionSessionService.f217951a
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.nga.engine.viss.NgaVoiceInteractionSessionService r8 = r7.f218003a
            java.lang.Object r8 = r8.f217968o
            monitor-enter(r8)
            com.google.android.apps.gsa.nga.engine.viss.NgaVoiceInteractionSessionService r0 = r7.f218003a     // Catch:{ all -> 0x0072 }
            r0.mo73925b()     // Catch:{ all -> 0x0072 }
            com.google.android.apps.gsa.nga.engine.viss.NgaVoiceInteractionSessionService r0 = r7.f218003a     // Catch:{ all -> 0x0072 }
            r1 = 0
            r0.f217970q = r1     // Catch:{ all -> 0x0072 }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.a.c r2 = r0.f217965l     // Catch:{ all -> 0x0072 }
            if (r2 == 0) goto L_0x0070
            com.google.apps.tiktok.tracing.dh r0 = r0.f217966m     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0070
            java.lang.String r2 = "onSessionProcessDied"
            com.google.apps.tiktok.tracing.ax r0 = r0.mo51613c(r2)     // Catch:{ all -> 0x0072 }
            com.google.android.apps.gsa.nga.engine.viss.NgaVoiceInteractionSessionService r2 = r7.f218003a     // Catch:{ all -> 0x0050 }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.a.c r2 = r2.f217965l     // Catch:{ all -> 0x0050 }
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.an r3 = new com.google.android.libraries.search.assistant.invocation.f.c.a.a.an     // Catch:{ all -> 0x0050 }
            r4 = r2
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.ao r4 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33775ao) r4     // Catch:{ all -> 0x0050 }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x0050 }
            r4 = r2
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.ao r4 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33775ao) r4     // Catch:{ all -> 0x0050 }
            com.google.apps.tiktok.concurrent.k r4 = r4.f90217d     // Catch:{ all -> 0x0050 }
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.ao r2 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33775ao) r2     // Catch:{ all -> 0x0050 }
            kotlinx.coroutines.aw r2 = r2.f90218e     // Catch:{ all -> 0x0050 }
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.ak r5 = new com.google.android.libraries.search.assistant.invocation.f.c.a.a.ak     // Catch:{ all -> 0x0050 }
            r5.<init>(r3, r1)     // Catch:{ all -> 0x0050 }
            com.google.common.util.concurrent.cx r1 = com.google.android.libraries.search.assistant.p2511d.C32561x.m60381a(r2, r5)     // Catch:{ all -> 0x0050 }
            long r2 = com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33775ao.f90215b     // Catch:{ all -> 0x0050 }
            long r2 = p5462h.p5484n.C69779a.m101237a(r2)     // Catch:{ all -> 0x0050 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0050 }
            r4.mo50458f(r1, r2, r5)     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0070
            r0.close()     // Catch:{ all -> 0x0072 }
            goto L_0x0070
        L_0x0050:
            r1 = move-exception
            if (r0 == 0) goto L_0x006f
            r0.close()     // Catch:{ all -> 0x0057 }
            goto L_0x006f
        L_0x0057:
            r0 = move-exception
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x006f }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x006f }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r6, r3)     // Catch:{ Exception -> 0x006f }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x006f }
            r2[r5] = r0     // Catch:{ Exception -> 0x006f }
            r3.invoke(r1, r2)     // Catch:{ Exception -> 0x006f }
        L_0x006f:
            throw r1     // Catch:{ all -> 0x0072 }
        L_0x0070:
            monitor-exit(r8)     // Catch:{ all -> 0x0072 }
            return
        L_0x0072:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0072 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.viss.C79384n.onServiceDisconnected(android.content.ComponentName):void");
    }
}
