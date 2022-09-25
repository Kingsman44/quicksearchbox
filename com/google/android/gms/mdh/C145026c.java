package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.mdh.c */
/* compiled from: PG */
public final class C145026c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        byte[] bArr = null;
        long j = 0;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bArr = C143946b.m234044A(parcel, readInt);
            } else if (c == 2) {
                bArr2 = C143946b.m234044A(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                j = C143946b.m234060i(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new MdhFootprint(bArr, bArr2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MdhFootprint[i];
    }
}
