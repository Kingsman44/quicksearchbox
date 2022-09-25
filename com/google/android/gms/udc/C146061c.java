package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.udc.UdcCacheResponse;

/* renamed from: com.google.android.gms.udc.c */
/* compiled from: PG */
public final class C146061c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                z = C143946b.m234077z(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new UdcCacheResponse.SettingAvailability(z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UdcCacheResponse.SettingAvailability[i];
    }
}
