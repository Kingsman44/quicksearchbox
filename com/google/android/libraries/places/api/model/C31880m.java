package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.places.api.model.m */
/* compiled from: PG */
final class C31880m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_OpeningHours(parcel.readArrayList(OpeningHours.class.getClassLoader()), parcel.readArrayList(OpeningHours.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_OpeningHours[i];
    }
}
