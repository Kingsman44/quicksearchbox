package com.google.android.apps.gsa.publicsearch;

import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.apps.gsa.publicsearch.d */
/* compiled from: PG */
public abstract class C84204d extends C8849b implements C84205e {
    public C84204d() {
        super("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
        /*
            r3 = this;
            r7 = 1
            if (r4 == r7) goto L_0x0026
            r0 = 2
            if (r4 == r0) goto L_0x0008
            r4 = 0
            return r4
        L_0x0008:
            java.lang.String r4 = r5.readString()
            android.os.IBinder r0 = r5.readStrongBinder()
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.p445a.C8850c.m23492a(r5, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r3.enforceNoDataAvail(r5)
            android.os.IBinder r4 = r3.mo77677e(r4, r0, r1)
            r6.writeNoException()
            r6.writeStrongBinder(r4)
            goto L_0x0056
        L_0x0026:
            java.lang.String r4 = r5.readString()
            android.os.IBinder r0 = r5.readStrongBinder()
            if (r0 != 0) goto L_0x0032
            r0 = 0
            goto L_0x0046
        L_0x0032:
            java.lang.String r1 = "com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSessionCallback"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.apps.gsa.publicsearch.C84212l
            if (r2 == 0) goto L_0x0040
            r0 = r1
            com.google.android.apps.gsa.publicsearch.l r0 = (com.google.android.apps.gsa.publicsearch.C84212l) r0
            goto L_0x0046
        L_0x0040:
            com.google.android.apps.gsa.publicsearch.j r1 = new com.google.android.apps.gsa.publicsearch.j
            r1.<init>(r0)
            r0 = r1
        L_0x0046:
            r5.createByteArray()
            r3.enforceNoDataAvail(r5)
            com.google.android.apps.gsa.publicsearch.i r4 = r3.mo77678f(r4, r0)
            r6.writeNoException()
            com.google.android.p445a.C8850c.m23499h(r6, r4)
        L_0x0056:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.publicsearch.C84204d.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
