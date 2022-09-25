package com.google.android.gms.usonia.directory.internal;

import android.os.Parcelable;

/* renamed from: com.google.android.gms.usonia.directory.internal.o */
/* compiled from: PG */
public final class C146279o implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r8) {
        /*
            r7 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.C143946b.m234059h(r8)
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0007:
            int r4 = r8.dataPosition()
            if (r4 >= r0) goto L_0x0026
            int r4 = r8.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x0021
            r6 = 2
            if (r5 == r6) goto L_0x001c
            com.google.android.gms.common.internal.safeparcel.C143946b.m234076y(r8, r4)
            goto L_0x0007
        L_0x001c:
            android.os.IBinder r2 = com.google.android.gms.common.internal.safeparcel.C143946b.m234062k(r8, r4)
            goto L_0x0007
        L_0x0021:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.C143946b.m234069r(r8, r4)
            goto L_0x0007
        L_0x0026:
            com.google.android.gms.common.internal.safeparcel.C143946b.m234074w(r8, r0)
            com.google.android.gms.usonia.directory.internal.FetchAllPeerAddressesParams r8 = new com.google.android.gms.usonia.directory.internal.FetchAllPeerAddressesParams
            if (r2 != 0) goto L_0x002e
            goto L_0x0041
        L_0x002e:
            java.lang.String r0 = "com.google.android.gms.usonia.directory.internal.IFetchAllPeerAddressesCallback"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.usonia.directory.internal.C146289y
            if (r1 == 0) goto L_0x003c
            r1 = r0
            com.google.android.gms.usonia.directory.internal.y r1 = (com.google.android.gms.usonia.directory.internal.C146289y) r1
            goto L_0x0041
        L_0x003c:
            com.google.android.gms.usonia.directory.internal.w r1 = new com.google.android.gms.usonia.directory.internal.w
            r1.<init>(r2)
        L_0x0041:
            r8.<init>(r3, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.usonia.directory.internal.C146279o.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FetchAllPeerAddressesParams[i];
    }
}
