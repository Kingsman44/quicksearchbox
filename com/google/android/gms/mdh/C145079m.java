package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.mdh.m */
/* compiled from: PG */
public final class C145079m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        Long l = null;
        Long l2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 2) {
                l = C143946b.m234068q(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                l2 = C143946b.m234068q(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new TimeSeriesFootprintsSubscriptionFilter(i, l, l2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TimeSeriesFootprintsSubscriptionFilter[i];
    }
}
