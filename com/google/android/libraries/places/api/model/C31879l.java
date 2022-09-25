package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.places.api.model.l */
/* compiled from: PG */
final class C31879l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_LocalTime(parcel.readInt(), parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_LocalTime[i];
    }
}
