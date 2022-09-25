package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class AutoValue_TimeOfWeek extends C$AutoValue_TimeOfWeek {
    public static final Parcelable.Creator CREATOR = new C31887t();

    public AutoValue_TimeOfWeek(DayOfWeek dayOfWeek, LocalTime localTime) {
        super(dayOfWeek, localTime);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f85554a, i);
        parcel.writeParcelable(this.f85555b, i);
    }
}
