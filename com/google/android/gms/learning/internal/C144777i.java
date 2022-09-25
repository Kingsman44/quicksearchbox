package com.google.android.gms.learning.internal;

import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.gms.learning.internal.i */
/* compiled from: PG */
public abstract class C144777i extends C8849b implements C144778j {
    public C144777i() {
        super("com.google.android.gms.learning.internal.IExampleStoreIteratorV2");
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
        /*
            r1 = this;
            r5 = 2
            if (r2 == r5) goto L_0x001a
            r5 = 3
            if (r2 == r5) goto L_0x000f
            r3 = 4
            if (r2 == r3) goto L_0x000b
            r2 = 0
            return r2
        L_0x000b:
            r1.mo120197a()
            goto L_0x003c
        L_0x000f:
            int r2 = r3.readInt()
            r1.enforceNoDataAvail(r3)
            r1.mo120199c(r2)
            goto L_0x003c
        L_0x001a:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0022
            r2 = 0
            goto L_0x0036
        L_0x0022:
            java.lang.String r5 = "com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.learning.internal.C144775g
            if (r0 == 0) goto L_0x0030
            r2 = r5
            com.google.android.gms.learning.internal.g r2 = (com.google.android.gms.learning.internal.C144775g) r2
            goto L_0x0036
        L_0x0030:
            com.google.android.gms.learning.internal.e r5 = new com.google.android.gms.learning.internal.e
            r5.<init>(r2)
            r2 = r5
        L_0x0036:
            r1.enforceNoDataAvail(r3)
            r1.mo120198b(r2)
        L_0x003c:
            r4.writeNoException()
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.internal.C144777i.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
