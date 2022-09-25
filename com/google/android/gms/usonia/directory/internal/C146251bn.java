package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.usonia.DeviceInfo;

/* renamed from: com.google.android.gms.usonia.directory.internal.bn */
/* compiled from: PG */
public final class C146251bn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        DeviceInfo deviceInfo = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C143946b.m234076y(parcel, readInt);
            } else {
                deviceInfo = (DeviceInfo) C143946b.m234063l(parcel, readInt, DeviceInfo.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new OnDeviceOfflineParams(deviceInfo);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OnDeviceOfflineParams[i];
    }
}
