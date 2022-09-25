package com.google.common.android.concurrent;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.common.android.concurrent.v */
/* compiled from: PG */
final class C58297v implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ParcelableFuture(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableFuture[i];
    }
}
