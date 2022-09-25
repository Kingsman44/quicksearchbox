package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.android.gms.maps.model.e */
/* compiled from: PG */
public final class C145021e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        double d = C59203do.f157270a;
        double d2 = 0.0d;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                d = C143946b.m234053b(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                d2 = C143946b.m234053b(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new LatLng(d, d2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLng[i];
    }
}
