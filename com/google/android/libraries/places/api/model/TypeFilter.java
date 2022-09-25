package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public enum TypeFilter implements Parcelable {
    ADDRESS,
    CITIES,
    ESTABLISHMENT,
    GEOCODE,
    REGIONS;
    
    public static final Parcelable.Creator CREATOR = null;

    static {
        CREATOR = new C31868ac();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
