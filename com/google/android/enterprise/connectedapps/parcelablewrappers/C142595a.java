package com.google.android.enterprise.connectedapps.parcelablewrappers;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.enterprise.connectedapps.parcelablewrappers.a */
/* compiled from: PG */
final class C142595a implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ParcelableBitmap(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableBitmap[i];
    }
}
