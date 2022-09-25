package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.maps.model.c */
/* compiled from: PG */
public final class C145019c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        LatLng latLng = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                latLng = (LatLng) C143946b.m234063l(parcel, readInt, LatLng.CREATOR);
            } else if (c == 3) {
                f = C143946b.m234054c(parcel, readInt);
            } else if (c == 4) {
                f2 = C143946b.m234054c(parcel, readInt);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                f3 = C143946b.m234054c(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new CameraPosition(latLng, f, f2, f3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CameraPosition[i];
    }
}
