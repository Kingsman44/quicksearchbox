package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: PG */
final class AutoValue_RectangularBounds extends C$AutoValue_RectangularBounds {
    public static final Parcelable.Creator CREATOR = new C31886s();

    public AutoValue_RectangularBounds(LatLng latLng, LatLng latLng2) {
        super(latLng, latLng2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f85552a, i);
        parcel.writeParcelable(this.f85553b, i);
    }
}
