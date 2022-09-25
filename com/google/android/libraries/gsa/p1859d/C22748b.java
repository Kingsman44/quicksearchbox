package com.google.android.libraries.gsa.p1859d;

import android.content.ComponentName;
import android.content.ServiceConnection;

/* renamed from: com.google.android.libraries.gsa.d.b */
/* compiled from: PG */
final class C22748b implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C22782d f62597a;

    /* renamed from: b */
    private final C22781c f62598b;

    public C22748b(C22782d dVar, C22781c cVar) {
        this.f62597a = dVar;
        this.f62598b = cVar;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
        /*
            r2 = this;
            com.google.android.libraries.gsa.d.c r3 = r2.f62598b     // Catch:{ RemoteException -> 0x002b }
            if (r4 != 0) goto L_0x0006
            r4 = 0
            goto L_0x001a
        L_0x0006:
            java.lang.String r0 = "com.google.android.libraries.launcherclient.ILauncherOverlay"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)     // Catch:{ RemoteException -> 0x002b }
            boolean r1 = r0 instanceof com.google.android.libraries.p10922ab.C146707c     // Catch:{ RemoteException -> 0x002b }
            if (r1 == 0) goto L_0x0014
            r4 = r0
            com.google.android.libraries.ab.c r4 = (com.google.android.libraries.p10922ab.C146707c) r4     // Catch:{ RemoteException -> 0x002b }
            goto L_0x001a
        L_0x0014:
            com.google.android.libraries.ab.a r0 = new com.google.android.libraries.ab.a     // Catch:{ RemoteException -> 0x002b }
            r0.<init>(r4)     // Catch:{ RemoteException -> 0x002b }
            r4 = r0
        L_0x001a:
            boolean r4 = r4.mo28076G()     // Catch:{ RemoteException -> 0x002b }
            r3.mo28114a(r4)     // Catch:{ RemoteException -> 0x002b }
            com.google.android.libraries.gsa.d.d r3 = r2.f62597a
            android.content.Context r3 = r3.f62715a
            r3.unbindService(r2)
            return
        L_0x0029:
            r3 = move-exception
            goto L_0x0041
        L_0x002b:
            r3 = move-exception
            java.lang.String r4 = "AbsServiceStatusChecker"
            java.lang.String r0 = "isServiceRunning - remote call failed"
            android.util.Log.w(r4, r0, r3)     // Catch:{ all -> 0x0029 }
            com.google.android.libraries.gsa.d.d r3 = r2.f62597a
            android.content.Context r3 = r3.f62715a
            r3.unbindService(r2)
            com.google.android.libraries.gsa.d.c r3 = r2.f62598b
            r4 = 0
            r3.mo28114a(r4)
            return
        L_0x0041:
            com.google.android.libraries.gsa.d.d r4 = r2.f62597a
            android.content.Context r4 = r4.f62715a
            r4.unbindService(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.p1859d.C22748b.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }
}
