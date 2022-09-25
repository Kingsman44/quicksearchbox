package com.google.apps.tiktok.concurrent.futuresmixin;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.apps.tiktok.concurrent.futuresmixin.r */
/* compiled from: PG */
final class C46452r implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ParcelableFuture(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableFuture[i];
    }
}
