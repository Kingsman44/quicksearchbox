package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.udc.UdcCacheResponse;

/* renamed from: com.google.android.gms.udc.n */
/* compiled from: PG */
public final class C146072n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        UdcCacheResponse.SettingAvailability settingAvailability = null;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 3) {
                i2 = C143946b.m234057f(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                settingAvailability = (UdcCacheResponse.SettingAvailability) C143946b.m234063l(parcel, readInt, UdcCacheResponse.SettingAvailability.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new UdcCacheResponse.UdcSetting(i, i2, settingAvailability);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UdcCacheResponse.UdcSetting[i];
    }
}
