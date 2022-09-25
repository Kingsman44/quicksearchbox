package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
public final class AutoValue_AddressComponents extends C$AutoValue_AddressComponents {
    public static final Parcelable.Creator CREATOR = new C31875h();

    public AutoValue_AddressComponents(List list) {
        super(list);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f85505a);
    }
}
