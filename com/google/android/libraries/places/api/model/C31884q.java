package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.places.api.model.q */
/* compiled from: PG */
final class C31884q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_PlaceLikelihood((Place) parcel.readParcelable(PlaceLikelihood.class.getClassLoader()), parcel.readDouble());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_PlaceLikelihood[i];
    }
}
