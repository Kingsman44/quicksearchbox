package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.semanticlocation.DevicePersonalizedPlaceInfo;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.semanticlocation.j */
/* compiled from: PG */
public final class C145972j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        long j = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                j = C143946b.m234060i(parcel, readInt);
            } else if (c == 2) {
                arrayList = C143946b.m234073v(parcel, readInt, DevicePersonalizedPlaceInfo.PersonalPlace.CREATOR);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                arrayList2 = C143946b.m234073v(parcel, readInt, DevicePersonalizedPlaceInfo.DeviceInteractionTypeSummary.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new DevicePersonalizedPlaceInfo(j, arrayList, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DevicePersonalizedPlaceInfo[i];
    }
}
