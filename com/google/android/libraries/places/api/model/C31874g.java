package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.places.api.model.g */
/* compiled from: PG */
final class C31874g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_AddressComponent(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readArrayList(AddressComponent.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_AddressComponent[i];
    }
}
