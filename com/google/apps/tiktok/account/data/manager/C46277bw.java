package com.google.apps.tiktok.account.data.manager;

import com.google.android.p445a.C8849b;

/* renamed from: com.google.apps.tiktok.account.data.manager.bw */
/* compiled from: PG */
public abstract class C46277bw extends C8849b implements C46278bx {
    public C46277bw() {
        super("com.google.apps.tiktok.account.data.manager.IAccountSyncService");
    }

    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2, types: [com.google.apps.tiktok.account.data.manager.cd] */
    /* JADX WARNING: type inference failed for: r5v7, types: [com.google.apps.tiktok.account.data.manager.cd] */
    /* JADX WARNING: type inference failed for: r5v12, types: [com.google.apps.tiktok.account.data.manager.cd] */
    /* JADX WARNING: type inference failed for: r5v17, types: [com.google.apps.tiktok.account.data.manager.cd] */
    /* JADX WARNING: type inference failed for: r5v22, types: [com.google.apps.tiktok.account.data.manager.ca] */
    /* JADX WARNING: type inference failed for: r5v27, types: [com.google.apps.tiktok.account.data.manager.cd] */
    /* JADX WARNING: type inference failed for: r5v32 */
    /* JADX WARNING: type inference failed for: r5v33 */
    /* JADX WARNING: type inference failed for: r5v34 */
    /* JADX WARNING: type inference failed for: r5v35 */
    /* JADX WARNING: type inference failed for: r5v36 */
    /* JADX WARNING: type inference failed for: r5v37 */
    /* JADX WARNING: type inference failed for: r5v38 */
    /* JADX WARNING: type inference failed for: r5v39 */
    /* JADX WARNING: type inference failed for: r5v40 */
    /* JADX WARNING: type inference failed for: r5v41 */
    /* JADX WARNING: type inference failed for: r5v42 */
    /* JADX WARNING: type inference failed for: r5v43 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
        /*
            r1 = this;
            java.lang.String r4 = "com.google.apps.tiktok.account.data.manager.IAccountSyncServiceCallback"
            r5 = 0
            switch(r2) {
                case 1: goto L_0x00c7;
                case 2: goto L_0x00a4;
                case 3: goto L_0x007d;
                case 4: goto L_0x0055;
                case 5: goto L_0x002c;
                case 6: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r2 = 0
            return r2
        L_0x0008:
            int[] r2 = r3.createIntArray()
            android.os.IBinder r0 = r3.readStrongBinder()
            if (r0 != 0) goto L_0x0013
            goto L_0x0024
        L_0x0013:
            android.os.IInterface r4 = r0.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.apps.tiktok.account.data.manager.C46285cd
            if (r5 == 0) goto L_0x001f
            r5 = r4
            com.google.apps.tiktok.account.data.manager.cd r5 = (com.google.apps.tiktok.account.data.manager.C46285cd) r5
            goto L_0x0024
        L_0x001f:
            com.google.apps.tiktok.account.data.manager.cb r5 = new com.google.apps.tiktok.account.data.manager.cb
            r5.<init>(r0)
        L_0x0024:
            r1.enforceNoDataAvail(r3)
            r1.mo50303d(r2, r5)
            goto L_0x00e9
        L_0x002c:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.p445a.C8850c.m23492a(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x003b
            goto L_0x004d
        L_0x003b:
            java.lang.String r5 = "com.google.apps.tiktok.account.data.manager.IAccountSyncServiceAddAccountsCallback"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.apps.tiktok.account.data.manager.C46282ca
            if (r0 == 0) goto L_0x0048
            com.google.apps.tiktok.account.data.manager.ca r5 = (com.google.apps.tiktok.account.data.manager.C46282ca) r5
            goto L_0x004d
        L_0x0048:
            com.google.apps.tiktok.account.data.manager.by r5 = new com.google.apps.tiktok.account.data.manager.by
            r5.<init>(r4)
        L_0x004d:
            r1.enforceNoDataAvail(r3)
            r1.mo50300a(r2, r5)
            goto L_0x00e9
        L_0x0055:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.p445a.C8850c.m23492a(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            android.os.IBinder r0 = r3.readStrongBinder()
            if (r0 != 0) goto L_0x0064
            goto L_0x0075
        L_0x0064:
            android.os.IInterface r4 = r0.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.apps.tiktok.account.data.manager.C46285cd
            if (r5 == 0) goto L_0x0070
            r5 = r4
            com.google.apps.tiktok.account.data.manager.cd r5 = (com.google.apps.tiktok.account.data.manager.C46285cd) r5
            goto L_0x0075
        L_0x0070:
            com.google.apps.tiktok.account.data.manager.cb r5 = new com.google.apps.tiktok.account.data.manager.cb
            r5.<init>(r0)
        L_0x0075:
            r1.enforceNoDataAvail(r3)
            r1.mo50305f(r2, r5)
            goto L_0x00e9
        L_0x007d:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.p445a.C8850c.m23492a(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            android.os.IBinder r0 = r3.readStrongBinder()
            if (r0 != 0) goto L_0x008c
            goto L_0x009d
        L_0x008c:
            android.os.IInterface r4 = r0.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.apps.tiktok.account.data.manager.C46285cd
            if (r5 == 0) goto L_0x0098
            r5 = r4
            com.google.apps.tiktok.account.data.manager.cd r5 = (com.google.apps.tiktok.account.data.manager.C46285cd) r5
            goto L_0x009d
        L_0x0098:
            com.google.apps.tiktok.account.data.manager.cb r5 = new com.google.apps.tiktok.account.data.manager.cb
            r5.<init>(r0)
        L_0x009d:
            r1.enforceNoDataAvail(r3)
            r1.mo50304e(r2, r5)
            goto L_0x00e9
        L_0x00a4:
            int r2 = r3.readInt()
            android.os.IBinder r0 = r3.readStrongBinder()
            if (r0 != 0) goto L_0x00af
            goto L_0x00c0
        L_0x00af:
            android.os.IInterface r4 = r0.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.apps.tiktok.account.data.manager.C46285cd
            if (r5 == 0) goto L_0x00bb
            r5 = r4
            com.google.apps.tiktok.account.data.manager.cd r5 = (com.google.apps.tiktok.account.data.manager.C46285cd) r5
            goto L_0x00c0
        L_0x00bb:
            com.google.apps.tiktok.account.data.manager.cb r5 = new com.google.apps.tiktok.account.data.manager.cb
            r5.<init>(r0)
        L_0x00c0:
            r1.enforceNoDataAvail(r3)
            r1.mo50301b(r2, r5)
            goto L_0x00e9
        L_0x00c7:
            int r2 = r3.readInt()
            android.os.IBinder r0 = r3.readStrongBinder()
            if (r0 != 0) goto L_0x00d2
            goto L_0x00e3
        L_0x00d2:
            android.os.IInterface r4 = r0.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.apps.tiktok.account.data.manager.C46285cd
            if (r5 == 0) goto L_0x00de
            r5 = r4
            com.google.apps.tiktok.account.data.manager.cd r5 = (com.google.apps.tiktok.account.data.manager.C46285cd) r5
            goto L_0x00e3
        L_0x00de:
            com.google.apps.tiktok.account.data.manager.cb r5 = new com.google.apps.tiktok.account.data.manager.cb
            r5.<init>(r0)
        L_0x00e3:
            r1.enforceNoDataAvail(r3)
            r1.mo50302c(r2, r5)
        L_0x00e9:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.account.data.manager.C46277bw.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
