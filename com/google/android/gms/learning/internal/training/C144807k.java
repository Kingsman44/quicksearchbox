package com.google.android.gms.learning.internal.training;

import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.gms.learning.internal.training.k */
/* compiled from: PG */
public abstract class C144807k extends C8849b implements C144808l {
    public C144807k() {
        super("com.google.android.gms.learning.internal.training.IInAppResultHandler");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
        /*
            r3 = this;
            r7 = 2
            if (r4 == r7) goto L_0x003d
            r6 = 3
            if (r4 == r6) goto L_0x0008
            r4 = 0
            return r4
        L_0x0008:
            android.os.Parcelable$Creator r4 = com.google.android.gms.learning.InAppTrainerOptions.CREATOR
            android.os.Parcelable r4 = com.google.android.p445a.C8850c.m23492a(r5, r4)
            com.google.android.gms.learning.InAppTrainerOptions r4 = (com.google.android.gms.learning.InAppTrainerOptions) r4
            boolean r6 = com.google.android.p445a.C8850c.m23500i(r5)
            android.os.Parcelable$Creator r7 = com.google.android.gms.learning.ExampleConsumption.CREATOR
            java.util.ArrayList r7 = r5.createTypedArrayList(r7)
            android.os.IBinder r0 = r5.readStrongBinder()
            if (r0 != 0) goto L_0x0022
            r0 = 0
            goto L_0x0036
        L_0x0022:
            java.lang.String r1 = "com.google.android.gms.common.api.internal.IStatusCallback"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.common.api.internal.C143773bu
            if (r2 == 0) goto L_0x0030
            r0 = r1
            com.google.android.gms.common.api.internal.bu r0 = (com.google.android.gms.common.api.internal.C143773bu) r0
            goto L_0x0036
        L_0x0030:
            com.google.android.gms.common.api.internal.bs r1 = new com.google.android.gms.common.api.internal.bs
            r1.<init>(r0)
            r0 = r1
        L_0x0036:
            r3.enforceNoDataAvail(r5)
            r3.mo120231b(r4, r6, r7, r0)
            goto L_0x0047
        L_0x003d:
            r6.writeNoException()
            int r4 = r3.mo120230a()
            r6.writeInt(r4)
        L_0x0047:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.internal.training.C144807k.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
