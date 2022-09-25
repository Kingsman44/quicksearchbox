package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.udc.k */
/* compiled from: PG */
public final class C146069k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        int[] iArr = null;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                arrayList = C143946b.m234073v(parcel, readInt, UdcCacheResponse.UdcSetting.CREATOR);
            } else if (c == 3) {
                iArr = C143946b.m234045B(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                z = C143946b.m234077z(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new UdcCacheResponse(arrayList, iArr, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UdcCacheResponse[i];
    }
}
