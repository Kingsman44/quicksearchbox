package org.chromium.weblayer;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import org.chromium.p5643b.p5644a.C72304a;

/* compiled from: PG */
public class GooglePayDataCallbacksServiceWrapper extends Service {

    /* renamed from: a */
    private Service f193087a;

    public final IBinder onBind(Intent intent) {
        Service service = this.f193087a;
        if (service == null) {
            return null;
        }
        try {
            return service.onBind(intent);
        } catch (Exception e) {
            throw new C72304a(e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.app.Service} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
            r3 = this;
            org.chromium.weblayer.C72604bm.m107399a()
            int r0 = org.chromium.weblayer.C72611bt.m107413a()
            r1 = 90
            r2 = 0
            if (r0 >= r1) goto L_0x000d
            goto L_0x002d
        L_0x000d:
            boolean r0 = org.chromium.weblayer.C72611bt.m107421i()
            if (r0 != 0) goto L_0x0014
            goto L_0x002d
        L_0x0014:
            org.chromium.weblayer.bt r0 = org.chromium.weblayer.C72611bt.m107418f(r3)
            if (r0 != 0) goto L_0x001b
            goto L_0x002d
        L_0x001b:
            org.chromium.b.a.bc r0 = r0.f193174f
            org.chromium.b.a.am r0 = r0.mo63775h()     // Catch:{ RemoteException -> 0x0039 }
            if (r0 != 0) goto L_0x0024
            goto L_0x002d
        L_0x0024:
            java.lang.Class<android.app.Service> r1 = android.app.Service.class
            java.lang.Object r0 = org.chromium.p5643b.p5644a.C72341bj.m106988a(r0, r1)
            r2 = r0
            android.app.Service r2 = (android.app.Service) r2
        L_0x002d:
            if (r2 != 0) goto L_0x0033
            r3.stopSelf()
            return
        L_0x0033:
            r3.f193087a = r2
            r2.onCreate()
            return
        L_0x0039:
            r0 = move-exception
            org.chromium.b.a.a r1 = new org.chromium.b.a.a
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.weblayer.GooglePayDataCallbacksServiceWrapper.onCreate():void");
    }
}
