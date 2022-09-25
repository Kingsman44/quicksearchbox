package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: com.google.android.libraries.places.api.model.s */
/* compiled from: PG */
final class C31886s implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_RectangularBounds((LatLng) parcel.readParcelable(RectangularBounds.class.getClassLoader()), (LatLng) parcel.readParcelable(RectangularBounds.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_RectangularBounds[i];
    }
}
