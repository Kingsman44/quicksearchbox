package com.google.android.gms.usonia.directory.internal;

import android.os.Parcelable;

/* renamed from: com.google.android.gms.usonia.directory.internal.bt */
/* compiled from: PG */
public final class C146257bt implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.C143946b.m234059h(r10)
            r1 = 0
            r2 = 0
            r4 = r1
            r5 = r4
            r3 = 0
        L_0x0009:
            int r6 = r10.dataPosition()
            if (r6 >= r0) goto L_0x0038
            int r6 = r10.readInt()
            char r7 = (char) r6
            r8 = 1
            if (r7 == r8) goto L_0x0033
            r8 = 2
            if (r7 == r8) goto L_0x002e
            r8 = 3
            if (r7 == r8) goto L_0x0029
            r8 = 4
            if (r7 == r8) goto L_0x0024
            com.google.android.gms.common.internal.safeparcel.C143946b.m234076y(r10, r6)
            goto L_0x0009
        L_0x0024:
            android.os.IBinder r4 = com.google.android.gms.common.internal.safeparcel.C143946b.m234062k(r10, r6)
            goto L_0x0009
        L_0x0029:
            int r3 = com.google.android.gms.common.internal.safeparcel.C143946b.m234057f(r10, r6)
            goto L_0x0009
        L_0x002e:
            int r2 = com.google.android.gms.common.internal.safeparcel.C143946b.m234057f(r10, r6)
            goto L_0x0009
        L_0x0033:
            java.lang.String r5 = com.google.android.gms.common.internal.safeparcel.C143946b.m234069r(r10, r6)
            goto L_0x0009
        L_0x0038:
            com.google.android.gms.common.internal.safeparcel.C143946b.m234074w(r10, r0)
            com.google.android.gms.usonia.directory.internal.RegisterServiceParams r10 = new com.google.android.gms.usonia.directory.internal.RegisterServiceParams
            if (r4 != 0) goto L_0x0040
            goto L_0x0053
        L_0x0040:
            java.lang.String r0 = "com.google.android.gms.usonia.directory.internal.IUsoniaStatusCallback"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.usonia.directory.internal.C146215ae
            if (r1 == 0) goto L_0x004e
            r1 = r0
            com.google.android.gms.usonia.directory.internal.ae r1 = (com.google.android.gms.usonia.directory.internal.C146215ae) r1
            goto L_0x0053
        L_0x004e:
            com.google.android.gms.usonia.directory.internal.ac r1 = new com.google.android.gms.usonia.directory.internal.ac
            r1.<init>(r4)
        L_0x0053:
            r10.<init>(r5, r2, r3, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.usonia.directory.internal.C146257bt.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterServiceParams[i];
    }
}
