package com.google.android.libraries.places.widget.internal.common;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public enum AutocompleteActivityOrigin implements Parcelable {
    FRAGMENT,
    INTENT;
    
    public static final Parcelable.Creator CREATOR = null;

    static {
        CREATOR = new C31917e();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
