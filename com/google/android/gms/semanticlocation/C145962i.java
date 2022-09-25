package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.semanticlocation.DevicePersonalizedPlaceInfo;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.semanticlocation.i */
/* compiled from: PG */
public final class C145962i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        ArrayList arrayList = null;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 2) {
                i2 = C143946b.m234057f(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                arrayList = C143946b.m234071t(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new DevicePersonalizedPlaceInfo.DeviceInteractionTypeSummary(i, i2, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DevicePersonalizedPlaceInfo.DeviceInteractionTypeSummary[i];
    }
}
