package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class AutoValue_LocalTime extends C$AutoValue_LocalTime {
    public static final Parcelable.Creator CREATOR = new C31879l();

    public AutoValue_LocalTime(int i, int i2) {
        super(i, i2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f85518a);
        parcel.writeInt(this.f85519b);
    }
}
