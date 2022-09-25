package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.places.api.model.i */
/* compiled from: PG */
final class C31876i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_AutocompletePrediction(parcel.readString(), parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readArrayList(AutocompletePrediction.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readArrayList(AutocompletePrediction.class.getClassLoader()), parcel.readArrayList(AutocompletePrediction.class.getClassLoader()), parcel.readArrayList(AutocompletePrediction.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_AutocompletePrediction[i];
    }
}
