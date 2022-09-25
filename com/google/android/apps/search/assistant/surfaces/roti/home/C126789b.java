package com.google.android.apps.search.assistant.surfaces.roti.home;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.b */
/* compiled from: PG */
final class C126789b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_ResultState((Intent) parcel.readParcelable(ResultState.class.getClassLoader()), (Intent) parcel.readParcelable(ResultState.class.getClassLoader()), parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_ResultState[i];
    }
}
