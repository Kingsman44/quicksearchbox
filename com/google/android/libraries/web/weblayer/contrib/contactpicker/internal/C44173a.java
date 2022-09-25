package com.google.android.libraries.web.weblayer.contrib.contactpicker.internal;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.contactpicker.internal.a */
/* compiled from: PG */
public final /* synthetic */ class C44173a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C44174b f114925a;

    public /* synthetic */ C44173a(C44174b bVar) {
        this.f114925a = bVar;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r6) {
        /*
            r5 = this;
            com.google.android.libraries.web.weblayer.contrib.contactpicker.internal.b r0 = r5.f114925a
            org.chromium.weblayer.d r6 = (org.chromium.weblayer.C72615d) r6
            org.chromium.weblayer.C72604bm.m107399a()
            r6.mo64487f()
            org.chromium.b.a.b r6 = r6.f193182e     // Catch:{ RemoteException -> 0x0078 }
            android.os.Parcel r1 = r6.mo17260gA()     // Catch:{ RemoteException -> 0x0078 }
            r2 = 1
            android.os.Parcel r6 = r6.mo17261gT(r2, r1)     // Catch:{ RemoteException -> 0x0078 }
            android.os.IBinder r1 = r6.readStrongBinder()     // Catch:{ RemoteException -> 0x0078 }
            if (r1 != 0) goto L_0x001d
            r1 = 0
            goto L_0x0031
        L_0x001d:
            java.lang.String r2 = "org.chromium.weblayer_private.interfaces.IProfile"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x0078 }
            boolean r3 = r2 instanceof org.chromium.p5643b.p5644a.C72319ao     // Catch:{ RemoteException -> 0x0078 }
            if (r3 == 0) goto L_0x002b
            r1 = r2
            org.chromium.b.a.ao r1 = (org.chromium.p5643b.p5644a.C72319ao) r1     // Catch:{ RemoteException -> 0x0078 }
            goto L_0x0031
        L_0x002b:
            org.chromium.b.a.ao r2 = new org.chromium.b.a.ao     // Catch:{ RemoteException -> 0x0078 }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x0078 }
            r1 = r2
        L_0x0031:
            r6.recycle()     // Catch:{ RemoteException -> 0x0078 }
            org.chromium.weblayer.aw r6 = org.chromium.weblayer.C72587aw.m107321d(r1)     // Catch:{ RemoteException -> 0x0078 }
            org.chromium.weblayer.aw r1 = r0.f114926a
            if (r1 == 0) goto L_0x003d
            return
        L_0x003d:
            r0.f114926a = r6
            com.google.android.libraries.web.weblayer.contrib.contactpicker.internal.h r6 = r0.f114927b
            com.google.apps.tiktok.concurrent.aj r1 = r6.f114940b
            com.google.common.util.concurrent.SettableFuture r1 = r1.f121487d
            boolean r1 = r1.isDone()
            r2 = 0
            if (r1 != 0) goto L_0x0059
            com.google.apps.tiktok.concurrent.aj r1 = r6.f114940b
            com.google.common.util.concurrent.cx r1 = r1.mo50395b()
            java.lang.String r3 = "Failed to retrieve user's account."
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r1, r3, r4)
        L_0x0059:
            com.google.apps.tiktok.concurrent.aj r1 = r6.f114941c
            com.google.common.util.concurrent.SettableFuture r1 = r1.f121487d
            boolean r1 = r1.isDone()
            if (r1 != 0) goto L_0x0070
            com.google.apps.tiktok.concurrent.aj r6 = r6.f114941c
            com.google.common.util.concurrent.cx r6 = r6.mo50395b()
            java.lang.String r1 = "Failed to retrieve user's GMSCore account name."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r6, r1, r2)
        L_0x0070:
            org.chromium.weblayer.aw r6 = r0.f114926a
            com.google.android.libraries.web.weblayer.contrib.contactpicker.internal.h r0 = r0.f114927b
            r6.mo64458b(r0)
            return
        L_0x0078:
            r6 = move-exception
            org.chromium.b.a.a r0 = new org.chromium.b.a.a
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.weblayer.contrib.contactpicker.internal.C44173a.accept(java.lang.Object):void");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
