package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class AutoValue_AutocompletePrediction_SubstringMatch extends C$AutoValue_AutocompletePrediction_SubstringMatch {
    public static final Parcelable.Creator CREATOR = new C31877j();

    public AutoValue_AutocompletePrediction_SubstringMatch(int i, int i2) {
        super(i, i2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f85515a);
        parcel.writeInt(this.f85516b);
    }
}
