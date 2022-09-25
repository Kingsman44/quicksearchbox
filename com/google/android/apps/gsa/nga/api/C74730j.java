package com.google.android.apps.gsa.nga.api;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.nga.api.j */
/* compiled from: PG */
final class C74730j implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ForegroundSignalType.values()[parcel.readInt()];
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ForegroundSignalType[i];
    }
}
