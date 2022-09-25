package com.google.android.gms.car.p10760f.p10761a;

import android.os.RemoteException;
import com.google.android.gms.car.C143112ax;
import com.google.android.gms.car.p10757d.C143172a;
import com.google.android.gms.car.p10764h.C143316a;

/* renamed from: com.google.android.gms.car.f.a.b */
/* compiled from: PG */
public final class C143236b {
    /* renamed from: a */
    public static void m232383a(IllegalStateException illegalStateException) {
        try {
            m232384b(illegalStateException);
        } catch (C143112ax unused) {
        }
        throw illegalStateException;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m232384b(java.lang.IllegalStateException r6) {
        /*
            java.lang.String r0 = r6.getMessage()
            if (r0 == 0) goto L_0x008d
            int r1 = r0.hashCode()
            r2 = 191842363(0xb6f483b, float:4.6084066E-32)
            r3 = 0
            r4 = 1
            r5 = 2
            if (r1 == r2) goto L_0x0031
            r2 = 1028412234(0x3d4c534a, float:0.04988412)
            if (r1 == r2) goto L_0x0027
            r2 = 1587819759(0x5ea434ef, float:5.9161725E18)
            if (r1 == r2) goto L_0x001d
            goto L_0x003b
        L_0x001d:
            java.lang.String r1 = "CarNotSupported"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003b
            r0 = 2
            goto L_0x003c
        L_0x0027:
            java.lang.String r1 = "CarNotConnected"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003b
            r0 = 0
            goto L_0x003c
        L_0x0031:
            java.lang.String r1 = "OutOfCarLifecycle"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003b
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = -1
        L_0x003c:
            java.lang.String r1 = "IllegalStateException from car service: %s"
            java.lang.String r2 = "CAR.CLIENT"
            if (r0 == 0) goto L_0x0076
            if (r0 == r4) goto L_0x005f
            if (r0 != r5) goto L_0x005e
            boolean r0 = com.google.android.gms.car.p10764h.C143316a.m232515e(r2, r5)
            if (r0 != 0) goto L_0x004d
            goto L_0x0058
        L_0x004d:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r4 = r6.getMessage()
            r0[r3] = r4
            com.google.android.gms.car.p10764h.C143316a.m232514d(r5, r2, r6, r1, r0)
        L_0x0058:
            com.google.android.gms.car.ax r0 = new com.google.android.gms.car.ax
            r0.<init>(r6)
            throw r0
        L_0x005e:
            throw r6
        L_0x005f:
            boolean r0 = com.google.android.gms.car.p10764h.C143316a.m232515e(r2, r5)
            if (r0 == 0) goto L_0x0070
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r4 = r6.getMessage()
            r0[r3] = r4
            com.google.android.gms.car.p10764h.C143316a.m232514d(r5, r2, r6, r1, r0)
        L_0x0070:
            com.google.android.gms.car.d.b r0 = new com.google.android.gms.car.d.b
            r0.<init>(r6)
            throw r0
        L_0x0076:
            boolean r0 = com.google.android.gms.car.p10764h.C143316a.m232515e(r2, r5)
            if (r0 == 0) goto L_0x0087
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r4 = r6.getMessage()
            r0[r3] = r4
            com.google.android.gms.car.p10764h.C143316a.m232514d(r5, r2, r6, r1, r0)
        L_0x0087:
            com.google.android.gms.car.aw r0 = new com.google.android.gms.car.aw
            r0.<init>(r6)
            throw r0
        L_0x008d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.car.p10760f.p10761a.C143236b.m232384b(java.lang.IllegalStateException):void");
    }

    /* renamed from: c */
    public static void m232385c(RemoteException remoteException) {
        if (C143316a.m232515e("CAR.CLIENT", 2)) {
            C143316a.m232514d(2, "CAR.CLIENT", remoteException, "RemoteException from car service: %s", remoteException.getMessage());
        }
        throw new C143172a(remoteException);
    }
}
