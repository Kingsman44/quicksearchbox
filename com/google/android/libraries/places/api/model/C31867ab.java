package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.Place;

/* renamed from: com.google.android.libraries.places.api.model.ab */
/* compiled from: PG */
final class C31867ab implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        return Place.Type.valueOf(readString);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Place.Type[i];
    }
}
