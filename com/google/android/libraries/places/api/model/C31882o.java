package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.places.api.model.o */
/* compiled from: PG */
final class C31882o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_PhotoMetadata(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_PhotoMetadata[i];
    }
}
