package com.google.android.gms.cloudmessaging;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.cloudmessaging.a */
/* compiled from: PG */
final class C143674a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new CloudMessagingMessengerCompat(parcel.readStrongBinder());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CloudMessagingMessengerCompat[i];
    }
}
