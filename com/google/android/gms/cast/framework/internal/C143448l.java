package com.google.android.gms.cast.framework.internal;

import android.os.RemoteException;
import androidx.mediarouter.p175a.C3665aa;
import androidx.mediarouter.p175a.C3685au;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.cast.framework.internal.l */
/* compiled from: PG */
public final class C143448l extends C3665aa {

    /* renamed from: a */
    private static final C143566ae f388979a = new C143566ae("MediaRouterCallback");

    /* renamed from: b */
    private final C143447k f388980b;

    public C143448l(C143447k kVar) {
        C143919bh.m233958a(kVar);
        this.f388980b = kVar;
    }

    /* renamed from: d */
    public final void mo7712d(C3685au auVar) {
        try {
            this.f388980b.mo118685f(auVar.f11863c, auVar.f11876p);
        } catch (RemoteException e) {
            f388979a.mo118885c(e, "Unable to call %s on %s.", "onRouteAdded", C143447k.class.getSimpleName());
        }
    }

    /* renamed from: e */
    public final void mo7713e(C3685au auVar) {
        try {
            this.f388980b.mo118686g(auVar.f11863c, auVar.f11876p);
        } catch (RemoteException e) {
            f388979a.mo118885c(e, "Unable to call %s on %s.", "onRouteChanged", C143447k.class.getSimpleName());
        }
    }

    /* renamed from: f */
    public final void mo7714f(C3685au auVar) {
        try {
            this.f388980b.mo118687h(auVar.f11863c, auVar.f11876p);
        } catch (RemoteException e) {
            f388979a.mo118885c(e, "Unable to call %s on %s.", "onRouteRemoved", C143447k.class.getSimpleName());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082 A[Catch:{ RemoteException -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008a A[Catch:{ RemoteException -> 0x0092 }] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7719k(androidx.mediarouter.p175a.C3687aw r8, androidx.mediarouter.p175a.C3685au r9, int r10) {
        /*
            r7 = this;
            java.lang.String r0 = "-groupRoute"
            com.google.android.gms.cast.internal.ae r1 = f388979a
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r4 = 0
            r3[r4] = r10
            java.lang.String r10 = r9.f11863c
            r5 = 1
            r3[r5] = r10
            java.lang.String r10 = "onRouteSelected with reason = %d, routeId = %s"
            r1.mo118884b(r10, r3)
            int r10 = r9.f11870j
            if (r10 != r5) goto L_0x00a8
            java.lang.String r10 = r9.f11863c     // Catch:{ RemoteException -> 0x0092 }
            if (r10 == 0) goto L_0x0076
            boolean r1 = r10.endsWith(r0)     // Catch:{ RemoteException -> 0x0092 }
            if (r1 != 0) goto L_0x0027
            goto L_0x0076
        L_0x0027:
            android.os.Bundle r1 = r9.f11876p     // Catch:{ RemoteException -> 0x0092 }
            com.google.android.gms.cast.CastDevice r1 = com.google.android.gms.cast.CastDevice.m232553a(r1)     // Catch:{ RemoteException -> 0x0092 }
            if (r1 != 0) goto L_0x0030
            goto L_0x0076
        L_0x0030:
            java.lang.String r1 = r1.mo118383c()     // Catch:{ RemoteException -> 0x0092 }
            java.util.List r8 = r8.mo7772g()     // Catch:{ RemoteException -> 0x0092 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ RemoteException -> 0x0092 }
        L_0x003c:
            boolean r3 = r8.hasNext()     // Catch:{ RemoteException -> 0x0092 }
            if (r3 == 0) goto L_0x0076
            java.lang.Object r3 = r8.next()     // Catch:{ RemoteException -> 0x0092 }
            androidx.mediarouter.a.au r3 = (androidx.mediarouter.p175a.C3685au) r3     // Catch:{ RemoteException -> 0x0092 }
            java.lang.String r6 = r3.f11863c     // Catch:{ RemoteException -> 0x0092 }
            if (r6 == 0) goto L_0x003c
            boolean r6 = r6.endsWith(r0)     // Catch:{ RemoteException -> 0x0092 }
            if (r6 != 0) goto L_0x003c
            android.os.Bundle r6 = r3.f11876p     // Catch:{ RemoteException -> 0x0092 }
            com.google.android.gms.cast.CastDevice r6 = com.google.android.gms.cast.CastDevice.m232553a(r6)     // Catch:{ RemoteException -> 0x0092 }
            if (r6 == 0) goto L_0x003c
            java.lang.String r6 = r6.mo118383c()     // Catch:{ RemoteException -> 0x0092 }
            boolean r6 = android.text.TextUtils.equals(r6, r1)     // Catch:{ RemoteException -> 0x0092 }
            if (r6 == 0) goto L_0x003c
            com.google.android.gms.cast.internal.ae r8 = f388979a     // Catch:{ RemoteException -> 0x0092 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x0092 }
            r0[r4] = r10     // Catch:{ RemoteException -> 0x0092 }
            java.lang.String r1 = r3.f11863c     // Catch:{ RemoteException -> 0x0092 }
            r0[r5] = r1     // Catch:{ RemoteException -> 0x0092 }
            java.lang.String r1 = "routeId is changed from %s to %s"
            r8.mo118884b(r1, r0)     // Catch:{ RemoteException -> 0x0092 }
            java.lang.String r8 = r3.f11863c     // Catch:{ RemoteException -> 0x0092 }
            goto L_0x0077
        L_0x0076:
            r8 = r10
        L_0x0077:
            com.google.android.gms.cast.framework.internal.k r0 = r7.f388980b     // Catch:{ RemoteException -> 0x0092 }
            int r0 = r0.mo118684e()     // Catch:{ RemoteException -> 0x0092 }
            r1 = 220400000(0xd230980, float:5.023969E-31)
            if (r0 < r1) goto L_0x008a
            com.google.android.gms.cast.framework.internal.k r0 = r7.f388980b     // Catch:{ RemoteException -> 0x0092 }
            android.os.Bundle r9 = r9.f11876p     // Catch:{ RemoteException -> 0x0092 }
            r0.mo118689j(r8, r10, r9)     // Catch:{ RemoteException -> 0x0092 }
            return
        L_0x008a:
            com.google.android.gms.cast.framework.internal.k r10 = r7.f388980b     // Catch:{ RemoteException -> 0x0092 }
            android.os.Bundle r9 = r9.f11876p     // Catch:{ RemoteException -> 0x0092 }
            r10.mo118688i(r8, r9)     // Catch:{ RemoteException -> 0x0092 }
            return
        L_0x0092:
            r8 = move-exception
            com.google.android.gms.cast.internal.ae r9 = f388979a
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.String r0 = "onRouteSelected"
            r10[r4] = r0
            java.lang.Class<com.google.android.gms.cast.framework.internal.k> r0 = com.google.android.gms.cast.framework.internal.C143447k.class
            java.lang.String r0 = r0.getSimpleName()
            r10[r5] = r0
            java.lang.String r0 = "Unable to call %s on %s."
            r9.mo118885c(r8, r0, r10)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.internal.C143448l.mo7719k(androidx.mediarouter.a.aw, androidx.mediarouter.a.au, int):void");
    }

    /* renamed from: l */
    public final void mo7720l(C3685au auVar, int i) {
        C143566ae aeVar = f388979a;
        aeVar.mo118884b("onRouteUnselected with reason = %d, routeId = %s", Integer.valueOf(i), auVar.f11863c);
        if (auVar.f11870j != 1) {
            aeVar.mo118884b("skip route unselection for non-cast route", new Object[0]);
            return;
        }
        try {
            this.f388980b.mo118690k(auVar.f11863c, auVar.f11876p, i);
        } catch (RemoteException e) {
            f388979a.mo118885c(e, "Unable to call %s on %s.", "onRouteUnselected", C143447k.class.getSimpleName());
        }
    }
}
