package com.google.android.gms.learning.dynamite.proxy;

import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.gms.learning.dynamite.proxy.n */
/* compiled from: PG */
public abstract class C144644n extends C8849b implements C144645o {
    public C144644n() {
        super("com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingQueryCallback");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.learning.dynamite.proxy.g} */
    /* JADX WARNING: type inference failed for: r10v3, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        /*
            r6 = this;
            r10 = 2
            if (r7 == r10) goto L_0x0021
            r10 = 3
            if (r7 == r10) goto L_0x0008
            r7 = 0
            return r7
        L_0x0008:
            android.os.Parcelable$Creator r7 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r7 = com.google.android.p445a.C8850c.m23492a(r8, r7)
            r1 = r7
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            long r2 = r8.readLong()
            long r4 = r8.readLong()
            r6.enforceNoDataAvail(r8)
            r0 = r6
            r0.mo120098e(r1, r2, r4)
            goto L_0x004d
        L_0x0021:
            android.os.IBinder r7 = r8.readStrongBinder()
            if (r7 != 0) goto L_0x002a
            r7 = 0
        L_0x0028:
            r1 = r7
            goto L_0x003e
        L_0x002a:
            java.lang.String r10 = "com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingIterator"
            android.os.IInterface r10 = r7.queryLocalInterface(r10)
            boolean r0 = r10 instanceof com.google.android.gms.learning.dynamite.proxy.C144639i
            if (r0 == 0) goto L_0x0038
            r7 = r10
            com.google.android.gms.learning.dynamite.proxy.i r7 = (com.google.android.gms.learning.dynamite.proxy.C144639i) r7
            goto L_0x0028
        L_0x0038:
            com.google.android.gms.learning.dynamite.proxy.g r10 = new com.google.android.gms.learning.dynamite.proxy.g
            r10.<init>(r7)
            r1 = r10
        L_0x003e:
            long r2 = r8.readLong()
            long r4 = r8.readLong()
            r6.enforceNoDataAvail(r8)
            r0 = r6
            r0.mo120099f(r1, r2, r4)
        L_0x004d:
            r9.writeNoException()
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.dynamite.proxy.C144644n.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
