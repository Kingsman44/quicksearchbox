package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class AutoValue_Period extends C$AutoValue_Period {
    public static final Parcelable.Creator CREATOR = new C31881n();

    public AutoValue_Period(TimeOfWeek timeOfWeek, TimeOfWeek timeOfWeek2) {
        super(timeOfWeek, timeOfWeek2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f85522a, i);
        parcel.writeParcelable(this.f85523b, i);
    }
}
