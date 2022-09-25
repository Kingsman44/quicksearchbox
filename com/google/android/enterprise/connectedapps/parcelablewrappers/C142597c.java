package com.google.android.enterprise.connectedapps.parcelablewrappers;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.enterprise.connectedapps.parcelablewrappers.c */
/* compiled from: PG */
final class C142597c implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ParcelableList(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableList[i];
    }
}
