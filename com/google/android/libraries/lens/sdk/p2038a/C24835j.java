package com.google.android.libraries.lens.sdk.p2038a;

import android.os.IBinder;

/* renamed from: com.google.android.libraries.lens.sdk.a.j */
/* compiled from: PG */
public final /* synthetic */ class C24835j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C24838m f67870a;

    /* renamed from: b */
    public final /* synthetic */ IBinder f67871b;

    public /* synthetic */ C24835j(C24838m mVar, IBinder iBinder) {
        this.f67870a = mVar;
        this.f67871b = iBinder;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            com.google.android.libraries.lens.sdk.a.m r0 = r5.f67870a
            android.os.IBinder r1 = r5.f67871b
            java.lang.String r2 = "Lens service is connected."
            java.lang.String r3 = "LensSdk"
            android.util.Log.d(r3, r2)
            if (r1 != 0) goto L_0x000f
            r1 = 0
            goto L_0x0023
        L_0x000f:
            java.lang.String r2 = "com.google.android.libraries.lens.sdk.shared.ILensService"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.libraries.lens.sdk.p2047d.C24933c
            if (r4 == 0) goto L_0x001d
            r1 = r2
            com.google.android.libraries.lens.sdk.d.c r1 = (com.google.android.libraries.lens.sdk.p2047d.C24933c) r1
            goto L_0x0023
        L_0x001d:
            com.google.android.libraries.lens.sdk.d.a r2 = new com.google.android.libraries.lens.sdk.d.a
            r2.<init>(r1)
            r1 = r2
        L_0x0023:
            r0.f67878e = r1
            com.google.android.libraries.lens.sdk.d.c r1 = r0.f67878e     // Catch:{ RemoteException -> 0x0034, SecurityException -> 0x0032 }
            r1.getClass()
            r1.mo30146a(r0)     // Catch:{ RemoteException -> 0x0034, SecurityException -> 0x0032 }
            r1 = 4
            r0.mo30041d(r1)     // Catch:{ RemoteException -> 0x0034, SecurityException -> 0x0032 }
            return
        L_0x0032:
            r1 = move-exception
            goto L_0x0035
        L_0x0034:
            r1 = move-exception
        L_0x0035:
            java.lang.String r2 = "Unable to attach."
            android.util.Log.e(r3, r2, r1)
            r1 = 6
            r0.mo30041d(r1)
            r0.mo30039b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.sdk.p2038a.C24835j.run():void");
    }
}
