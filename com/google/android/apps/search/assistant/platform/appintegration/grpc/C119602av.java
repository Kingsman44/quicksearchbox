package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.av */
/* compiled from: PG */
final class C119602av implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ParcelableBinder(parcel.readStrongBinder());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableBinder[i];
    }
}
