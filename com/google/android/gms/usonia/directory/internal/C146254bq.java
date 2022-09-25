package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.usonia.DeviceInfo;

/* renamed from: com.google.android.gms.usonia.directory.internal.bq */
/* compiled from: PG */
public final class C146254bq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        DeviceInfo deviceInfo = null;
        String str = null;
        byte[] bArr = null;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                deviceInfo = (DeviceInfo) C143946b.m234063l(parcel, readInt, DeviceInfo.CREATOR);
            } else if (c == 2) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 3) {
                bArr = C143946b.m234044A(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                z = C143946b.m234077z(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new OnDistributedStateChangeParams(deviceInfo, str, bArr, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OnDistributedStateChangeParams[i];
    }
}
