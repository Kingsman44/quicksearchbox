package com.google.android.gms.car.p10750a.p10751a;

import android.os.IBinder;
import androidx.p104d.p105a.C2164c;

/* renamed from: com.google.android.gms.car.a.a.bb */
/* compiled from: PG */
public final /* synthetic */ class C143005bb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143011bh f388046a;

    /* renamed from: b */
    public final /* synthetic */ IBinder f388047b;

    /* renamed from: c */
    public final /* synthetic */ C2164c f388048c;

    public /* synthetic */ C143005bb(C143011bh bhVar, IBinder iBinder, C2164c cVar) {
        this.f388046a = bhVar;
        this.f388047b = iBinder;
        this.f388048c = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.android.gms.car.a.a.bh r0 = r8.f388046a
            android.os.IBinder r1 = r8.f388047b
            androidx.d.a.c r2 = r8.f388048c
            java.lang.String r3 = "com.google.android.gms.car.startup.IStartup"
            android.os.IInterface r3 = r1.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.car.p10767j.C143320a
            if (r4 == 0) goto L_0x0013
            com.google.android.gms.car.j.a r3 = (com.google.android.gms.car.p10767j.C143320a) r3
            goto L_0x0018
        L_0x0013:
            com.google.android.gms.car.j.a r3 = new com.google.android.gms.car.j.a
            r3.<init>(r1)
        L_0x0018:
            r1 = 0
            android.os.Parcel r4 = r3.mo17260gA()     // Catch:{ IllegalStateException -> 0x0066, RemoteException -> 0x005c, SecurityException -> 0x0052 }
            r5 = 13
            android.os.Parcel r3 = r3.mo17261gT(r5, r4)     // Catch:{ IllegalStateException -> 0x0066, RemoteException -> 0x005c, SecurityException -> 0x0052 }
            android.os.IBinder r4 = r3.readStrongBinder()     // Catch:{ IllegalStateException -> 0x0066, RemoteException -> 0x005c, SecurityException -> 0x0052 }
            if (r4 != 0) goto L_0x002b
            r5 = r1
            goto L_0x003d
        L_0x002b:
            java.lang.String r5 = "com.google.android.gms.car.ICar"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)     // Catch:{ IllegalStateException -> 0x0066, RemoteException -> 0x005c, SecurityException -> 0x0052 }
            boolean r6 = r5 instanceof com.google.android.gms.car.C143134br     // Catch:{ IllegalStateException -> 0x0066, RemoteException -> 0x005c, SecurityException -> 0x0052 }
            if (r6 == 0) goto L_0x0038
            com.google.android.gms.car.br r5 = (com.google.android.gms.car.C143134br) r5     // Catch:{ IllegalStateException -> 0x0066, RemoteException -> 0x005c, SecurityException -> 0x0052 }
            goto L_0x003d
        L_0x0038:
            com.google.android.gms.car.br r5 = new com.google.android.gms.car.br     // Catch:{ IllegalStateException -> 0x0066, RemoteException -> 0x005c, SecurityException -> 0x0052 }
            r5.<init>(r4)     // Catch:{ IllegalStateException -> 0x0066, RemoteException -> 0x005c, SecurityException -> 0x0052 }
        L_0x003d:
            r3.recycle()     // Catch:{ IllegalStateException -> 0x0066, RemoteException -> 0x005c, SecurityException -> 0x0052 }
            if (r5 != 0) goto L_0x0050
            com.google.android.gms.car.a.g r3 = new com.google.android.gms.car.a.g     // Catch:{ IllegalStateException -> 0x004e, RemoteException -> 0x004c, SecurityException -> 0x004a }
            java.lang.String r4 = "Car service unexpectedly null."
            r3.<init>(r4)     // Catch:{ IllegalStateException -> 0x004e, RemoteException -> 0x004c, SecurityException -> 0x004a }
            goto L_0x0070
        L_0x004a:
            r3 = move-exception
            goto L_0x0054
        L_0x004c:
            r3 = move-exception
            goto L_0x005e
        L_0x004e:
            r3 = move-exception
            goto L_0x0068
        L_0x0050:
            r3 = r1
            goto L_0x0070
        L_0x0052:
            r3 = move-exception
            r5 = r1
        L_0x0054:
            com.google.android.gms.car.a.g r4 = new com.google.android.gms.car.a.g
            java.lang.String r6 = "Not allowed to access the Gearhead Car Service."
            r4.<init>(r6, r3)
            goto L_0x006f
        L_0x005c:
            r3 = move-exception
            r5 = r1
        L_0x005e:
            com.google.android.gms.car.a.g r4 = new com.google.android.gms.car.a.g
            java.lang.String r6 = "Gearhead Car Startup Service failed to become ready."
            r4.<init>(r6, r3)
            goto L_0x006f
        L_0x0066:
            r3 = move-exception
            r5 = r1
        L_0x0068:
            com.google.android.gms.car.a.g r4 = new com.google.android.gms.car.a.g
            java.lang.String r6 = "Gearhead Car Startup Service had an internal failure."
            r4.<init>(r6, r3)
        L_0x006f:
            r3 = r4
        L_0x0070:
            r4 = 0
            if (r3 == 0) goto L_0x0081
            java.lang.String r1 = "GH.GhCarClientCtor"
            java.lang.String r5 = "fetchStartupService failed"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r6 = 5
            com.google.android.gms.car.p10764h.C143316a.m232514d(r6, r1, r3, r5, r4)
            r0.mo117959f(r3, r2)
            return
        L_0x0081:
            java.lang.String r3 = "GH.GhCarClientCtor"
            r6 = 4
            boolean r3 = com.google.android.gms.car.p10764h.C143316a.m232515e(r3, r6)
            if (r3 == 0) goto L_0x009a
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.google.frameworks.client.a.a.b r7 = com.google.frameworks.client.p4624a.p4625a.C61301b.m93812a(r5)
            r3[r4] = r7
            java.lang.String r4 = "GH.GhCarClientCtor"
            java.lang.String r7 = "Bound to startup service, got Car Service: %s"
            com.google.android.gms.car.p10764h.C143316a.m232514d(r6, r4, r1, r7, r3)
        L_0x009a:
            monitor-enter(r0)
            if (r2 == 0) goto L_0x00a3
            r5.getClass()
            r2.mo5437b(r5)     // Catch:{ all -> 0x00a5 }
        L_0x00a3:
            monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
            return
        L_0x00a5:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.car.p10750a.p10751a.C143005bb.run():void");
    }
}
