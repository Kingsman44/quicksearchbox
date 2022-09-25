package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class AutoValue_PhotoMetadata extends C$AutoValue_PhotoMetadata {
    public static final Parcelable.Creator CREATOR = new C31882o();

    public AutoValue_PhotoMetadata(String str, int i, int i2, String str2) {
        super(str, i, i2, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f85524a);
        parcel.writeInt(this.f85525b);
        parcel.writeInt(this.f85526c);
        parcel.writeString(this.f85527d);
    }
}
