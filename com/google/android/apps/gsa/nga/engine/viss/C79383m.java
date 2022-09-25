package com.google.android.apps.gsa.nga.engine.viss;

import android.content.ComponentName;
import android.content.ServiceConnection;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nga.engine.viss.m */
/* compiled from: PG */
final class C79383m implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ NgaVoiceInteractionSessionService f218002a;

    public C79383m(NgaVoiceInteractionSessionService ngaVoiceInteractionSessionService) {
        this.f218002a = ngaVoiceInteractionSessionService;
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
            com.google.android.apps.gsa.nga.engine.viss.NgaVoiceInteractionSessionService r4 = r3.f218002a
            java.lang.Object r4 = r4.f217968o
            monitor-enter(r4)
            com.google.android.apps.gsa.nga.engine.viss.NgaVoiceInteractionSessionService r0 = r3.f218002a     // Catch:{ all -> 0x002c }
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
            r0.f217969p = r5     // Catch:{ all -> 0x002c }
            com.google.android.apps.gsa.nga.engine.viss.NgaVoiceInteractionSessionService r5 = r3.f218002a     // Catch:{ all -> 0x002c }
            r5.mo73926c()     // Catch:{ all -> 0x002c }
            monitor-exit(r4)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.viss.C79383m.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C59071e eVar = NgaVoiceInteractionSessionService.f217951a;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f218002a.f217968o) {
            this.f218002a.mo73925b();
            this.f218002a.f217969p = null;
        }
    }
}
