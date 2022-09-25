package com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a;

import android.content.ComponentName;
import android.content.ServiceConnection;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.e.a.g */
/* compiled from: PG */
public final class C91723g implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C91725i f255818a;

    public C91723g(C91725i iVar) {
        this.f255818a = iVar;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f255818a.f255822b) {
            this.f255818a.f255831k = null;
        }
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r5, android.os.IBinder r6) {
        /*
            r4 = this;
            com.google.android.apps.gsa.sidekick.shared.e.a.i r5 = r4.f255818a
            java.lang.Object r5 = r5.f255822b
            monitor-enter(r5)
            com.google.android.apps.gsa.sidekick.shared.e.a.i r0 = r4.f255818a     // Catch:{ all -> 0x00a4 }
            if (r6 != 0) goto L_0x000b
            r6 = 0
            goto L_0x001f
        L_0x000b:
            java.lang.String r1 = "com.google.android.apps.gsa.sidekick.shared.remoteapi.INowService"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)     // Catch:{ all -> 0x00a4 }
            boolean r2 = r1 instanceof com.google.android.apps.gsa.sidekick.shared.remoteapi.C91907e     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x0019
            r6 = r1
            com.google.android.apps.gsa.sidekick.shared.remoteapi.e r6 = (com.google.android.apps.gsa.sidekick.shared.remoteapi.C91907e) r6     // Catch:{ all -> 0x00a4 }
            goto L_0x001f
        L_0x0019:
            com.google.android.apps.gsa.sidekick.shared.remoteapi.c r1 = new com.google.android.apps.gsa.sidekick.shared.remoteapi.c     // Catch:{ all -> 0x00a4 }
            r1.<init>(r6)     // Catch:{ all -> 0x00a4 }
            r6 = r1
        L_0x001f:
            r0.f255831k = r6     // Catch:{ all -> 0x00a4 }
            com.google.android.apps.gsa.sidekick.shared.e.a.i r6 = r4.f255818a     // Catch:{ all -> 0x00a4 }
            com.google.android.apps.gsa.shared.y.au r6 = r6.f255824d     // Catch:{ all -> 0x00a4 }
            r6.mo85432v()     // Catch:{ all -> 0x00a4 }
            com.google.android.apps.gsa.sidekick.shared.e.a.i r6 = r4.f255818a     // Catch:{ all -> 0x00a4 }
            java.lang.Object r6 = r6.f255827g     // Catch:{ all -> 0x00a4 }
            monitor-enter(r6)     // Catch:{ all -> 0x00a4 }
            com.google.android.apps.gsa.sidekick.shared.e.a.i r0 = r4.f255818a     // Catch:{ all -> 0x00a1 }
            java.util.List r0 = r0.f255829i     // Catch:{ all -> 0x00a1 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a1 }
            if (r0 != 0) goto L_0x0060
            com.google.android.apps.gsa.sidekick.shared.e.a.i r0 = r4.f255818a     // Catch:{ all -> 0x00a1 }
            java.util.List r0 = r0.f255829i     // Catch:{ all -> 0x00a1 }
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89842j(r0)     // Catch:{ all -> 0x00a1 }
            com.google.android.apps.gsa.sidekick.shared.e.a.i r1 = r4.f255818a     // Catch:{ all -> 0x00a1 }
            java.util.List r1 = r1.f255829i     // Catch:{ all -> 0x00a1 }
            r1.clear()     // Catch:{ all -> 0x00a1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00a1 }
        L_0x004a:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00a1 }
            if (r1 == 0) goto L_0x0060
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00a1 }
            com.google.android.apps.gsa.sidekick.shared.e.a.h r1 = (com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91724h) r1     // Catch:{ all -> 0x00a1 }
            com.google.android.apps.gsa.sidekick.shared.e.a.i r2 = r4.f255818a     // Catch:{ all -> 0x00a1 }
            int r3 = r1.f255819a     // Catch:{ all -> 0x00a1 }
            android.os.Bundle r1 = r1.f255820b     // Catch:{ all -> 0x00a1 }
            r2.mo86224k(r3, r1)     // Catch:{ all -> 0x00a1 }
            goto L_0x004a
        L_0x0060:
            monitor-exit(r6)     // Catch:{ all -> 0x00a1 }
            com.google.android.apps.gsa.sidekick.shared.e.a.i r6 = r4.f255818a     // Catch:{ all -> 0x00a4 }
            java.util.List r6 = r6.f255830j     // Catch:{ all -> 0x00a4 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x00a4 }
            if (r6 != 0) goto L_0x007f
            com.google.android.apps.gsa.sidekick.shared.e.a.i r6 = r4.f255818a     // Catch:{ all -> 0x00a4 }
            java.util.List r6 = r6.f255830j     // Catch:{ all -> 0x00a4 }
            com.google.common.b.gu r6 = com.google.common.p4522b.C58485gu.m89842j(r6)     // Catch:{ all -> 0x00a4 }
            com.google.android.apps.gsa.sidekick.shared.e.a.i r0 = r4.f255818a     // Catch:{ all -> 0x00a4 }
            java.util.List r0 = r0.f255830j     // Catch:{ all -> 0x00a4 }
            r0.clear()     // Catch:{ all -> 0x00a4 }
            com.google.android.apps.gsa.sidekick.shared.e.a.i r0 = r4.f255818a     // Catch:{ all -> 0x00a4 }
            r0.mo86220g(r6)     // Catch:{ all -> 0x00a4 }
        L_0x007f:
            com.google.android.apps.gsa.sidekick.shared.e.a.i r6 = r4.f255818a     // Catch:{ all -> 0x00a4 }
            com.google.android.apps.gsa.sidekick.shared.e.a.g r0 = r6.f255832l     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x009f
            java.util.List r6 = r6.f255826f     // Catch:{ all -> 0x00a4 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x00a4 }
        L_0x008b:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x009f
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x00a4 }
            com.google.android.apps.gsa.shared.util.c.cf r0 = (com.google.android.apps.gsa.shared.util.p7159c.C90936cf) r0     // Catch:{ all -> 0x00a4 }
            com.google.android.apps.gsa.sidekick.shared.e.a.i r1 = r4.f255818a     // Catch:{ all -> 0x00a4 }
            com.google.android.apps.gsa.shared.util.c.bz r1 = r1.f255825e     // Catch:{ all -> 0x00a4 }
            r1.mo85151p(r0)     // Catch:{ all -> 0x00a4 }
            goto L_0x008b
        L_0x009f:
            monitor-exit(r5)     // Catch:{ all -> 0x00a4 }
            return
        L_0x00a1:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00a1 }
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00a4 }
            goto L_0x00a8
        L_0x00a7:
            throw r6
        L_0x00a8:
            goto L_0x00a7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91723g.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }
}
