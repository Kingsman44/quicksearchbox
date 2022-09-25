package com.google.android.gms.usonia.auth.internal;

import android.os.Parcelable;

/* renamed from: com.google.android.gms.usonia.auth.internal.w */
/* compiled from: PG */
public final class C146150w implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r7) {
        /*
            r6 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.C143946b.m234059h(r7)
            r1 = 0
            r2 = r1
        L_0x0006:
            int r3 = r7.dataPosition()
            if (r3 >= r0) goto L_0x001d
            int r3 = r7.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x0018
            com.google.android.gms.common.internal.safeparcel.C143946b.m234076y(r7, r3)
            goto L_0x0006
        L_0x0018:
            android.os.IBinder r2 = com.google.android.gms.common.internal.safeparcel.C143946b.m234062k(r7, r3)
            goto L_0x0006
        L_0x001d:
            com.google.android.gms.common.internal.safeparcel.C143946b.m234074w(r7, r0)
            com.google.android.gms.usonia.auth.internal.RegisterStructureInfoCallbackParams r7 = new com.google.android.gms.usonia.auth.internal.RegisterStructureInfoCallbackParams
            if (r2 != 0) goto L_0x0025
            goto L_0x0038
        L_0x0025:
            java.lang.String r0 = "com.google.android.gms.usonia.auth.internal.IStructureInfoCallback"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.usonia.auth.internal.C146138k
            if (r1 == 0) goto L_0x0033
            r1 = r0
            com.google.android.gms.usonia.auth.internal.k r1 = (com.google.android.gms.usonia.auth.internal.C146138k) r1
            goto L_0x0038
        L_0x0033:
            com.google.android.gms.usonia.auth.internal.i r1 = new com.google.android.gms.usonia.auth.internal.i
            r1.<init>(r2)
        L_0x0038:
            r7.<init>(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.usonia.auth.internal.C146150w.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterStructureInfoCallbackParams[i];
    }
}
