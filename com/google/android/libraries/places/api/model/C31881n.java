package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.places.api.model.n */
/* compiled from: PG */
final class C31881n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_Period((TimeOfWeek) parcel.readParcelable(Period.class.getClassLoader()), (TimeOfWeek) parcel.readParcelable(Period.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_Period[i];
    }
}
