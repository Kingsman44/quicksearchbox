package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public enum DayOfWeek implements Parcelable {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
    
    public static final Parcelable.Creator CREATOR = null;

    static {
        CREATOR = new C31889v();
    }

    /* renamed from: a */
    static DayOfWeek m59349a(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        return (DayOfWeek) Enum.valueOf(DayOfWeek.class, readString);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
