package com.google.android.remotesearch;

import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.remotesearch.c */
/* compiled from: PG */
public abstract class C45217c extends C8849b implements C45218d {
    public C45217c() {
        super("com.google.android.remotesearch.IRemoteSearchService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.google.android.remotesearch.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.remotesearch.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.remotesearch.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.android.remotesearch.g} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* JADX WARNING: type inference failed for: r0v27 */
    /* JADX WARNING: type inference failed for: r0v28 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
        /*
            r2 = this;
            java.lang.String r6 = "com.google.android.remotesearch.IRemoteSearchCallback"
            r0 = 0
            switch(r3) {
                case 1: goto L_0x00f6;
                case 2: goto L_0x00c4;
                case 3: goto L_0x00bd;
                case 4: goto L_0x00af;
                case 5: goto L_0x00a3;
                case 6: goto L_0x0095;
                case 7: goto L_0x0086;
                case 8: goto L_0x0053;
                case 9: goto L_0x004b;
                case 10: goto L_0x003f;
                case 11: goto L_0x0010;
                case 12: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r3 = 0
            return r3
        L_0x0008:
            r2.mo49075d()
            r5.writeNoException()
            goto L_0x0127
        L_0x0010:
            java.lang.String r3 = r4.readString()
            android.os.IBinder r6 = r4.readStrongBinder()
            if (r6 != 0) goto L_0x001b
            goto L_0x002d
        L_0x001b:
            java.lang.String r0 = "com.google.android.remotesearch.IRemoteSearchServiceSessionCallback"
            android.os.IInterface r0 = r6.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.remotesearch.C45221g
            if (r1 == 0) goto L_0x0028
            com.google.android.remotesearch.g r0 = (com.google.android.remotesearch.C45221g) r0
            goto L_0x002d
        L_0x0028:
            com.google.android.remotesearch.g r0 = new com.google.android.remotesearch.g
            r0.<init>(r6)
        L_0x002d:
            r4.createByteArray()
            r2.enforceNoDataAvail(r4)
            com.google.android.remotesearch.f r3 = r2.mo49083l(r3, r0)
            r5.writeNoException()
            com.google.android.p445a.C8850c.m23499h(r5, r3)
            goto L_0x0127
        L_0x003f:
            long r3 = r2.mo49072a()
            r5.writeNoException()
            r5.writeLong(r3)
            goto L_0x0127
        L_0x004b:
            r2.mo49077f()
            r5.writeNoException()
            goto L_0x0127
        L_0x0053:
            int r3 = r4.readInt()
            android.os.IBinder r1 = r4.readStrongBinder()
            if (r1 != 0) goto L_0x005e
            goto L_0x006f
        L_0x005e:
            android.os.IInterface r6 = r1.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.remotesearch.C45216b
            if (r0 == 0) goto L_0x006a
            r0 = r6
            com.google.android.remotesearch.b r0 = (com.google.android.remotesearch.C45216b) r0
            goto L_0x006f
        L_0x006a:
            com.google.android.remotesearch.b r0 = new com.google.android.remotesearch.b
            r0.<init>(r1)
        L_0x006f:
            java.lang.String r6 = r4.readString()
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.p445a.C8850c.m23492a(r4, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r2.enforceNoDataAvail(r4)
            r2.mo49080i(r3, r0, r6, r1)
            r5.writeNoException()
            goto L_0x0127
        L_0x0086:
            byte[] r3 = r4.createByteArray()
            r2.enforceNoDataAvail(r4)
            r2.mo49074c(r3)
            r5.writeNoException()
            goto L_0x0127
        L_0x0095:
            com.google.android.p445a.C8850c.m23500i(r4)
            r2.enforceNoDataAvail(r4)
            r2.mo49079h()
            r5.writeNoException()
            goto L_0x0127
        L_0x00a3:
            boolean r3 = r2.mo49078g()
            r5.writeNoException()
            com.google.android.p445a.C8850c.m23495d(r5, r3)
            goto L_0x0127
        L_0x00af:
            byte[] r3 = r4.createByteArray()
            r2.enforceNoDataAvail(r4)
            r2.mo49076e(r3)
            r5.writeNoException()
            goto L_0x0127
        L_0x00bd:
            r2.mo49073b()
            r5.writeNoException()
            goto L_0x0127
        L_0x00c4:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r3 = com.google.android.p445a.C8850c.m23492a(r4, r3)
            android.net.Uri r3 = (android.net.Uri) r3
            android.os.IBinder r1 = r4.readStrongBinder()
            if (r1 != 0) goto L_0x00d3
            goto L_0x00e4
        L_0x00d3:
            android.os.IInterface r6 = r1.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.remotesearch.C45216b
            if (r0 == 0) goto L_0x00df
            r0 = r6
            com.google.android.remotesearch.b r0 = (com.google.android.remotesearch.C45216b) r0
            goto L_0x00e4
        L_0x00df:
            com.google.android.remotesearch.b r0 = new com.google.android.remotesearch.b
            r0.<init>(r1)
        L_0x00e4:
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            android.os.Parcelable r6 = com.google.android.p445a.C8850c.m23492a(r4, r6)
            android.os.Bundle r6 = (android.os.Bundle) r6
            r2.enforceNoDataAvail(r4)
            r2.mo49081j(r3, r0, r6)
            r5.writeNoException()
            goto L_0x0127
        L_0x00f6:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r3 = com.google.android.p445a.C8850c.m23492a(r4, r3)
            android.net.Uri r3 = (android.net.Uri) r3
            android.os.IBinder r1 = r4.readStrongBinder()
            if (r1 != 0) goto L_0x0105
            goto L_0x0116
        L_0x0105:
            android.os.IInterface r6 = r1.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.remotesearch.C45216b
            if (r0 == 0) goto L_0x0111
            r0 = r6
            com.google.android.remotesearch.b r0 = (com.google.android.remotesearch.C45216b) r0
            goto L_0x0116
        L_0x0111:
            com.google.android.remotesearch.b r0 = new com.google.android.remotesearch.b
            r0.<init>(r1)
        L_0x0116:
            byte[] r6 = r4.createByteArray()
            java.lang.String r1 = r4.readString()
            r2.enforceNoDataAvail(r4)
            r2.mo49082k(r3, r0, r6, r1)
            r5.writeNoException()
        L_0x0127:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.remotesearch.C45217c.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
