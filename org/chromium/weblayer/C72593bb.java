package org.chromium.weblayer;

/* renamed from: org.chromium.weblayer.bb */
/* compiled from: PG */
public final class C72593bb extends C72590az {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v5, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.chromium.p5643b.p5644a.C72322ar mo64438a(android.content.Context r7) {
        /*
            r6 = this;
            android.os.Bundle r0 = r6.getArguments()     // Catch:{ Exception -> 0x0092 }
            if (r0 == 0) goto L_0x008a
            int r1 = org.chromium.weblayer.C72611bt.m107413a()     // Catch:{ Exception -> 0x0092 }
            r2 = 89
            r3 = 0
            java.lang.String r4 = "org.chromium.weblayer_private.interfaces.IRemoteFragment"
            r5 = 1
            if (r1 >= r2) goto L_0x004e
            org.chromium.weblayer.bt r7 = org.chromium.weblayer.C72611bt.m107419g(r7)     // Catch:{ Exception -> 0x0092 }
            org.chromium.weblayer.ax r1 = r6.f193130b     // Catch:{ Exception -> 0x0092 }
            org.chromium.b.a.bc r7 = r7.f193174f     // Catch:{ RemoteException -> 0x0047 }
            org.chromium.b.a.bj r2 = new org.chromium.b.a.bj     // Catch:{ RemoteException -> 0x0047 }
            r2.<init>(r0)     // Catch:{ RemoteException -> 0x0047 }
            org.chromium.b.a.av r7 = r7.mo63793z(r1, r2)     // Catch:{ RemoteException -> 0x0047 }
            android.os.Parcel r0 = r7.mo17260gA()     // Catch:{ Exception -> 0x0092 }
            android.os.Parcel r7 = r7.mo17261gT(r5, r0)     // Catch:{ Exception -> 0x0092 }
            android.os.IBinder r0 = r7.readStrongBinder()     // Catch:{ Exception -> 0x0092 }
            if (r0 != 0) goto L_0x0032
            goto L_0x0043
        L_0x0032:
            android.os.IInterface r1 = r0.queryLocalInterface(r4)     // Catch:{ Exception -> 0x0092 }
            boolean r2 = r1 instanceof org.chromium.p5643b.p5644a.C72322ar     // Catch:{ Exception -> 0x0092 }
            if (r2 == 0) goto L_0x003e
            r3 = r1
            org.chromium.b.a.ar r3 = (org.chromium.p5643b.p5644a.C72322ar) r3     // Catch:{ Exception -> 0x0092 }
            goto L_0x0043
        L_0x003e:
            org.chromium.b.a.ar r3 = new org.chromium.b.a.ar     // Catch:{ Exception -> 0x0092 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0092 }
        L_0x0043:
            r7.recycle()     // Catch:{ Exception -> 0x0092 }
            return r3
        L_0x0047:
            r7 = move-exception
            org.chromium.b.a.a r0 = new org.chromium.b.a.a     // Catch:{ Exception -> 0x0092 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x0092 }
            throw r0     // Catch:{ Exception -> 0x0092 }
        L_0x004e:
            org.chromium.weblayer.bt r7 = org.chromium.weblayer.C72611bt.m107419g(r7)     // Catch:{ Exception -> 0x0092 }
            org.chromium.weblayer.ax r1 = r6.f193130b     // Catch:{ Exception -> 0x0092 }
            org.chromium.b.a.bc r7 = r7.f193174f     // Catch:{ RemoteException -> 0x0083 }
            org.chromium.b.a.bj r2 = new org.chromium.b.a.bj     // Catch:{ RemoteException -> 0x0083 }
            r2.<init>(r0)     // Catch:{ RemoteException -> 0x0083 }
            org.chromium.b.a.au r7 = r7.mo63792y(r1, r2)     // Catch:{ RemoteException -> 0x0083 }
            android.os.Parcel r0 = r7.mo17260gA()     // Catch:{ Exception -> 0x0092 }
            android.os.Parcel r7 = r7.mo17261gT(r5, r0)     // Catch:{ Exception -> 0x0092 }
            android.os.IBinder r0 = r7.readStrongBinder()     // Catch:{ Exception -> 0x0092 }
            if (r0 != 0) goto L_0x006e
            goto L_0x007f
        L_0x006e:
            android.os.IInterface r1 = r0.queryLocalInterface(r4)     // Catch:{ Exception -> 0x0092 }
            boolean r2 = r1 instanceof org.chromium.p5643b.p5644a.C72322ar     // Catch:{ Exception -> 0x0092 }
            if (r2 == 0) goto L_0x007a
            r3 = r1
            org.chromium.b.a.ar r3 = (org.chromium.p5643b.p5644a.C72322ar) r3     // Catch:{ Exception -> 0x0092 }
            goto L_0x007f
        L_0x007a:
            org.chromium.b.a.ar r3 = new org.chromium.b.a.ar     // Catch:{ Exception -> 0x0092 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0092 }
        L_0x007f:
            r7.recycle()     // Catch:{ Exception -> 0x0092 }
            return r3
        L_0x0083:
            r7 = move-exception
            org.chromium.b.a.a r0 = new org.chromium.b.a.a     // Catch:{ Exception -> 0x0092 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x0092 }
            throw r0     // Catch:{ Exception -> 0x0092 }
        L_0x008a:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0092 }
            java.lang.String r0 = "SettingsFragment was created without arguments."
            r7.<init>(r0)     // Catch:{ Exception -> 0x0092 }
            throw r7     // Catch:{ Exception -> 0x0092 }
        L_0x0092:
            r7 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Failed to initialize WebLayer"
            r0.<init>(r1, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.weblayer.C72593bb.mo64438a(android.content.Context):org.chromium.b.a.ar");
    }
}
