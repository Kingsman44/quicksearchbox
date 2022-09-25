package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
final class AutoValue_OpeningHours extends C$AutoValue_OpeningHours {
    public static final Parcelable.Creator CREATOR = new C31880m();

    public AutoValue_OpeningHours(List list, List list2) {
        super(list, list2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f85520a);
        parcel.writeList(this.f85521b);
    }
}
