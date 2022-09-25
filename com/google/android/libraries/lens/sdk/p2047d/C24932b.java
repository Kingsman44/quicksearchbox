package com.google.android.libraries.lens.sdk.p2047d;

import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.libraries.lens.sdk.d.b */
/* compiled from: PG */
public abstract class C24932b extends C8849b implements C24933c {
    public C24932b() {
        super("com.google.android.libraries.lens.sdk.shared.ILensService");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
        /*
            r2 = this;
            r6 = 1
            if (r3 == r6) goto L_0x0032
            r0 = 2
            if (r3 == r0) goto L_0x000f
            r4 = 3
            if (r3 == r4) goto L_0x000b
            r3 = 0
            return r3
        L_0x000b:
            r2.mo30147b()
            goto L_0x0040
        L_0x000f:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0017
            r3 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r0 = "com.google.android.libraries.lens.sdk.shared.ILensServiceCallback"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.libraries.lens.sdk.p2047d.C24936f
            if (r1 == 0) goto L_0x0025
            r3 = r0
            com.google.android.libraries.lens.sdk.d.f r3 = (com.google.android.libraries.lens.sdk.p2047d.C24936f) r3
            goto L_0x002b
        L_0x0025:
            com.google.android.libraries.lens.sdk.d.d r0 = new com.google.android.libraries.lens.sdk.d.d
            r0.<init>(r3)
            r3 = r0
        L_0x002b:
            r2.enforceNoDataAvail(r4)
            r2.mo30146a(r3)
            goto L_0x0040
        L_0x0032:
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.p445a.C8850c.m23492a(r4, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r2.enforceNoDataAvail(r4)
            r2.mo30148c(r3)
        L_0x0040:
            r5.writeNoException()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.sdk.p2047d.C24932b.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
