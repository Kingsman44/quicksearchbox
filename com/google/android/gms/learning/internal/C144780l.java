package com.google.android.gms.learning.internal;

import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.gms.learning.internal.l */
/* compiled from: PG */
public abstract class C144780l extends C8849b implements C144781m {
    public C144780l() {
        super("com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
        /*
            r2 = this;
            r6 = 2
            if (r3 == r6) goto L_0x001b
            r6 = 3
            if (r3 == r6) goto L_0x0008
            r3 = 0
            return r3
        L_0x0008:
            android.os.Parcelable$Creator r3 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r3 = com.google.android.p445a.C8850c.m23492a(r4, r3)
            com.google.android.gms.common.api.Status r3 = (com.google.android.gms.common.api.Status) r3
            long r0 = r4.readLong()
            r2.enforceNoDataAvail(r4)
            r2.mo120094a(r3, r0)
            goto L_0x0041
        L_0x001b:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0023
            r3 = 0
            goto L_0x0037
        L_0x0023:
            java.lang.String r6 = "com.google.android.gms.learning.internal.IExampleStoreIteratorV2"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.learning.internal.C144778j
            if (r0 == 0) goto L_0x0031
            r3 = r6
            com.google.android.gms.learning.internal.j r3 = (com.google.android.gms.learning.internal.C144778j) r3
            goto L_0x0037
        L_0x0031:
            com.google.android.gms.learning.internal.h r6 = new com.google.android.gms.learning.internal.h
            r6.<init>(r3)
            r3 = r6
        L_0x0037:
            long r0 = r4.readLong()
            r2.enforceNoDataAvail(r4)
            r2.mo120095b(r3, r0)
        L_0x0041:
            r5.writeNoException()
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.internal.C144780l.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
