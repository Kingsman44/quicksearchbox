package com.google.android.gms.usonia.directory.internal;

import android.os.Parcelable;

/* renamed from: com.google.android.gms.usonia.directory.internal.bv */
/* compiled from: PG */
public final class C146259bv implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r9) {
        /*
            r8 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.C143946b.m234059h(r9)
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L_0x0008:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L_0x0033
            int r5 = r9.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x002e
            r7 = 2
            if (r6 == r7) goto L_0x0025
            r7 = 3
            if (r6 == r7) goto L_0x0020
            com.google.android.gms.common.internal.safeparcel.C143946b.m234076y(r9, r5)
            goto L_0x0008
        L_0x0020:
            android.os.IBinder r2 = com.google.android.gms.common.internal.safeparcel.C143946b.m234062k(r9, r5)
            goto L_0x0008
        L_0x0025:
            android.os.Parcelable$Creator r3 = com.google.android.gms.usonia.PeerAddress.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.common.internal.safeparcel.C143946b.m234063l(r9, r5, r3)
            com.google.android.gms.usonia.PeerAddress r3 = (com.google.android.gms.usonia.PeerAddress) r3
            goto L_0x0008
        L_0x002e:
            java.lang.String r4 = com.google.android.gms.common.internal.safeparcel.C143946b.m234069r(r9, r5)
            goto L_0x0008
        L_0x0033:
            com.google.android.gms.common.internal.safeparcel.C143946b.m234074w(r9, r0)
            com.google.android.gms.usonia.directory.internal.ResolvePeerAddressParams r9 = new com.google.android.gms.usonia.directory.internal.ResolvePeerAddressParams
            if (r2 != 0) goto L_0x003b
            goto L_0x004e
        L_0x003b:
            java.lang.String r0 = "com.google.android.gms.usonia.directory.internal.IResolvePeerAddressCallback"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.usonia.directory.internal.C146212ab
            if (r1 == 0) goto L_0x0049
            r1 = r0
            com.google.android.gms.usonia.directory.internal.ab r1 = (com.google.android.gms.usonia.directory.internal.C146212ab) r1
            goto L_0x004e
        L_0x0049:
            com.google.android.gms.usonia.directory.internal.z r1 = new com.google.android.gms.usonia.directory.internal.z
            r1.<init>(r2)
        L_0x004e:
            r9.<init>(r4, r3, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.usonia.directory.internal.C146259bv.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ResolvePeerAddressParams[i];
    }
}
