package com.google.android.enterprise.connectedapps.parcelablewrappers;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.enterprise.connectedapps.parcelablewrappers.b */
/* compiled from: PG */
final class C142596b implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ParcelableGuavaOptional(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableGuavaOptional[i];
    }
}
