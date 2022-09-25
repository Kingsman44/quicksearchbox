package com.google.android.gms.car;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.car.a */
/* compiled from: PG */
public final class C142973a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Intent intent = null;
        CarRegionId carRegionId = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                intent = (Intent) C143946b.m234063l(parcel, readInt, Intent.CREATOR);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                carRegionId = (CarRegionId) C143946b.m234063l(parcel, readInt, CarRegionId.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ActivityLaunchInfo(intent, carRegionId);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityLaunchInfo[i];
    }
}
