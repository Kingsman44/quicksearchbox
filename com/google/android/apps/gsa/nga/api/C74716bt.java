package com.google.android.apps.gsa.nga.api;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.nga.api.bt */
/* compiled from: PG */
final class C74716bt implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return NgaState.values()[parcel.readInt()];
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new NgaState[i];
    }
}
