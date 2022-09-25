package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class AutoValue_PlaceLikelihood extends C$AutoValue_PlaceLikelihood {
    public static final Parcelable.Creator CREATOR = new C31884q();

    public AutoValue_PlaceLikelihood(Place place, double d) {
        super(place, d);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f85548a, i);
        parcel.writeDouble(this.f85549b);
    }
}
