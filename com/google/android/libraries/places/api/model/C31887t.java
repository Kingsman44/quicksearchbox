package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.places.api.model.t */
/* compiled from: PG */
final class C31887t implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_TimeOfWeek((DayOfWeek) parcel.readParcelable(TimeOfWeek.class.getClassLoader()), (LocalTime) parcel.readParcelable(TimeOfWeek.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_TimeOfWeek[i];
    }
}
