package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.analytics.internal.p */
/* compiled from: PG */
public final class C142746p implements ServiceConnection {

    /* renamed from: a */
    public volatile boolean f387361a;

    /* renamed from: b */
    final /* synthetic */ C142747q f387362b;

    /* renamed from: c */
    public volatile C142719ap f387363c;

    protected C142746p(C142747q qVar) {
        this.f387362b = qVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:21|22) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:9|10|11|(4:13|(1:15)(1:17)|16|18)(1:19)|(2:24|25)(3:26|27|(1:29)(1:30))|31|32|33|34) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r6.f387362b.mo117536i(6, "Service connect failed to get IAnalyticsService", (java.lang.Object) null, (java.lang.Object) null, (java.lang.Object) null);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0091 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r7, android.os.IBinder r8) {
        /*
            r6 = this;
            java.lang.String r7 = "AnalyticsServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C143919bh.m233964g(r7)
            monitor-enter(r6)
            if (r8 != 0) goto L_0x0018
            com.google.android.gms.analytics.internal.q r0 = r6.f387362b     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "Service connected with null binder"
            r1 = 6
            r3 = 0
            r4 = 0
            r5 = 0
            r0.mo117536i(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0050 }
            r6.notifyAll()     // Catch:{ all -> 0x009a }
            monitor-exit(r6)     // Catch:{ all -> 0x009a }
            return
        L_0x0018:
            r7 = 0
            java.lang.String r3 = r8.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0052 }
            java.lang.String r0 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            boolean r0 = r0.equals(r3)     // Catch:{ RemoteException -> 0x0052 }
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            android.os.IInterface r0 = r8.queryLocalInterface(r0)     // Catch:{ RemoteException -> 0x0052 }
            boolean r1 = r0 instanceof com.google.android.gms.analytics.internal.C142719ap     // Catch:{ RemoteException -> 0x0052 }
            if (r1 == 0) goto L_0x0033
            com.google.android.gms.analytics.internal.ap r0 = (com.google.android.gms.analytics.internal.C142719ap) r0     // Catch:{ RemoteException -> 0x0052 }
        L_0x0031:
            r7 = r0
            goto L_0x0039
        L_0x0033:
            com.google.android.gms.analytics.internal.ap r0 = new com.google.android.gms.analytics.internal.ap     // Catch:{ RemoteException -> 0x0052 }
            r0.<init>(r8)     // Catch:{ RemoteException -> 0x0052 }
            goto L_0x0031
        L_0x0039:
            com.google.android.gms.analytics.internal.q r0 = r6.f387362b     // Catch:{ RemoteException -> 0x0052 }
            java.lang.String r2 = "Bound to IAnalyticsService interface"
            r1 = 2
            r3 = 0
            r4 = 0
            r5 = 0
            r0.mo117536i(r1, r2, r3, r4, r5)     // Catch:{ RemoteException -> 0x0052 }
            goto L_0x005d
        L_0x0045:
            com.google.android.gms.analytics.internal.q r0 = r6.f387362b     // Catch:{ RemoteException -> 0x0052 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r1 = 6
            r4 = 0
            r5 = 0
            r0.mo117536i(r1, r2, r3, r4, r5)     // Catch:{ RemoteException -> 0x0052 }
            goto L_0x005d
        L_0x0050:
            r7 = move-exception
            goto L_0x0096
        L_0x0052:
            com.google.android.gms.analytics.internal.q r0 = r6.f387362b     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "Service connect failed to get IAnalyticsService"
            r1 = 6
            r3 = 0
            r4 = 0
            r5 = 0
            r0.mo117536i(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0050 }
        L_0x005d:
            if (r7 != 0) goto L_0x006f
            com.google.android.gms.common.d.a r7 = com.google.android.gms.common.p10781d.C143860a.m233845a()     // Catch:{ IllegalArgumentException -> 0x0091 }
            com.google.android.gms.analytics.internal.q r8 = r6.f387362b     // Catch:{ IllegalArgumentException -> 0x0091 }
            com.google.android.gms.analytics.internal.j r0 = r8.f387328e     // Catch:{ IllegalArgumentException -> 0x0091 }
            android.content.Context r0 = r0.f387334b     // Catch:{ IllegalArgumentException -> 0x0091 }
            com.google.android.gms.analytics.internal.p r8 = r8.f387364a     // Catch:{ IllegalArgumentException -> 0x0091 }
            r7.mo119311b(r0, r8)     // Catch:{ IllegalArgumentException -> 0x0091 }
            goto L_0x0091
        L_0x006f:
            boolean r8 = r6.f387361a     // Catch:{ all -> 0x0050 }
            if (r8 != 0) goto L_0x008f
            com.google.android.gms.analytics.internal.q r0 = r6.f387362b     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "onServiceConnected received after the timeout limit"
            r1 = 5
            r3 = 0
            r4 = 0
            r5 = 0
            r0.mo117536i(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0050 }
            com.google.android.gms.analytics.internal.q r8 = r6.f387362b     // Catch:{ all -> 0x0050 }
            com.google.android.gms.analytics.internal.j r8 = r8.f387328e     // Catch:{ all -> 0x0050 }
            com.google.android.gms.analytics.q r8 = r8.mo117542b()     // Catch:{ all -> 0x0050 }
            com.google.android.gms.analytics.internal.n r0 = new com.google.android.gms.analytics.internal.n     // Catch:{ all -> 0x0050 }
            r0.<init>(r6, r7)     // Catch:{ all -> 0x0050 }
            r8.mo117603c(r0)     // Catch:{ all -> 0x0050 }
            goto L_0x0091
        L_0x008f:
            r6.f387363c = r7     // Catch:{ all -> 0x0050 }
        L_0x0091:
            r6.notifyAll()     // Catch:{ all -> 0x009a }
            monitor-exit(r6)     // Catch:{ all -> 0x009a }
            return
        L_0x0096:
            r6.notifyAll()     // Catch:{ all -> 0x009a }
            throw r7     // Catch:{ all -> 0x009a }
        L_0x009a:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x009a }
            goto L_0x009e
        L_0x009d:
            throw r7
        L_0x009e:
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.C142746p.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C143919bh.m233964g("AnalyticsServiceConnection.onServiceDisconnected");
        this.f387362b.f387328e.mo117542b().mo117603c(new C142745o(this, componentName));
    }
}
