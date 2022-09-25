package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;

/* compiled from: PG */
final class AutoValue_AutocompleteSessionToken extends C$AutoValue_AutocompleteSessionToken {
    public static final Parcelable.Creator CREATOR = new C31878k();

    public AutoValue_AutocompleteSessionToken(ParcelUuid parcelUuid) {
        super(parcelUuid);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f85517a, i);
    }
}
