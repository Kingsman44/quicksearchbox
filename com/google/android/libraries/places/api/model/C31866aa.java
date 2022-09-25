package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.Place;

/* renamed from: com.google.android.libraries.places.api.model.aa */
/* compiled from: PG */
final class C31866aa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        return Place.Field.valueOf(readString);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Place.Field[i];
    }
}
