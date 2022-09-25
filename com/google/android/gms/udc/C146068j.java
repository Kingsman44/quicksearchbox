package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.udc.j */
/* compiled from: PG */
public final class C146068j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int[] iArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                iArr = C143946b.m234045B(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new UdcCacheRequest(iArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UdcCacheRequest[i];
    }
}
