package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.places.api.model.j */
/* compiled from: PG */
final class C31877j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_AutocompletePrediction_SubstringMatch(parcel.readInt(), parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_AutocompletePrediction_SubstringMatch[i];
    }
}
