package org.chromium.weblayer;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import org.chromium.p5643b.p5644a.C72304a;

/* compiled from: PG */
public class PaymentDetailsUpdateServiceWrapper extends Service {

    /* renamed from: a */
    private Service f193090a;

    public final IBinder onBind(Intent intent) {
        Service service = this.f193090a;
        if (service == null) {
            return null;
        }
        try {
            return service.onBind(intent);
        } catch (Exception e) {
            throw new C72304a(e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.app.Service} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
            r2 = this;
            org.chromium.weblayer.C72604bm.m107399a()
            int r0 = org.chromium.weblayer.C72611bt.m107413a()
            r1 = 92
            if (r0 < r1) goto L_0x003f
            boolean r0 = org.chromium.weblayer.C72611bt.m107421i()
            r1 = 0
            if (r0 != 0) goto L_0x0013
            goto L_0x002c
        L_0x0013:
            org.chromium.weblayer.bt r0 = org.chromium.weblayer.C72611bt.m107418f(r2)
            if (r0 != 0) goto L_0x001a
            goto L_0x002c
        L_0x001a:
            org.chromium.b.a.bc r0 = r0.f193174f
            org.chromium.b.a.am r0 = r0.mo63776i()     // Catch:{ RemoteException -> 0x0038 }
            if (r0 != 0) goto L_0x0023
            goto L_0x002c
        L_0x0023:
            java.lang.Class<android.app.Service> r1 = android.app.Service.class
            java.lang.Object r0 = org.chromium.p5643b.p5644a.C72341bj.m106988a(r0, r1)
            r1 = r0
            android.app.Service r1 = (android.app.Service) r1
        L_0x002c:
            if (r1 != 0) goto L_0x0032
            r2.stopSelf()
            return
        L_0x0032:
            r2.f193090a = r1
            r1.onCreate()
            return
        L_0x0038:
            r0 = move-exception
            org.chromium.b.a.a r1 = new org.chromium.b.a.a
            r1.<init>(r0)
            throw r1
        L_0x003f:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.weblayer.PaymentDetailsUpdateServiceWrapper.onCreate():void");
    }
}
