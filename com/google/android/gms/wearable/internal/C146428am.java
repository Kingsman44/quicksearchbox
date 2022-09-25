package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.wearable.internal.am */
/* compiled from: PG */
public final class C146428am implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                i2 = C143946b.m234057f(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new DeleteDataItemsResponse(i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DeleteDataItemsResponse[i];
    }
}
