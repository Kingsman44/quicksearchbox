package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.places.api.model.ac */
/* compiled from: PG */
final class C31868ac implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        return TypeFilter.valueOf(readString);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TypeFilter[i];
    }
}
