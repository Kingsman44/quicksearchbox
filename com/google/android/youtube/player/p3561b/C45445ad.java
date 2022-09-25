package com.google.android.youtube.player.p3561b;

import android.content.ComponentName;
import android.content.ServiceConnection;

/* renamed from: com.google.android.youtube.player.b.ad */
final class C45445ad implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C45446ae f118854a;

    public C45445ad(C45446ae aeVar) {
        this.f118854a = aeVar;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
        /*
            r2 = this;
            com.google.android.youtube.player.b.ae r3 = r2.f118854a
            if (r4 != 0) goto L_0x0006
            r4 = 0
            goto L_0x001a
        L_0x0006:
            java.lang.String r0 = "com.google.android.youtube.player.internal.IServiceBroker"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)     // Catch:{ RemoteException -> 0x0023 }
            boolean r1 = r0 instanceof com.google.android.youtube.player.p3561b.C45479bk     // Catch:{ RemoteException -> 0x0023 }
            if (r1 == 0) goto L_0x0014
            r4 = r0
            com.google.android.youtube.player.b.bk r4 = (com.google.android.youtube.player.p3561b.C45479bk) r4     // Catch:{ RemoteException -> 0x0023 }
            goto L_0x001a
        L_0x0014:
            com.google.android.youtube.player.b.bk r0 = new com.google.android.youtube.player.b.bk     // Catch:{ RemoteException -> 0x0023 }
            r0.<init>(r4)     // Catch:{ RemoteException -> 0x0023 }
            r4 = r0
        L_0x001a:
            com.google.android.youtube.player.b.ac r0 = new com.google.android.youtube.player.b.ac     // Catch:{ RemoteException -> 0x0023 }
            r0.<init>(r3)     // Catch:{ RemoteException -> 0x0023 }
            r3.mo49597g(r4, r0)     // Catch:{ RemoteException -> 0x0023 }
            return
        L_0x0023:
            java.lang.String r3 = "YouTubeClient"
            java.lang.String r4 = "service died"
            android.util.Log.w(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.player.p3561b.C45445ad.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f118854a.mo49596f();
    }
}
