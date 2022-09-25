package com.google.android.libraries.gcoreclient.cast.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.gcoreclient.cast.impl.b */
/* compiled from: PG */
final class C21481b implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new GcoreCastDeviceImpl(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GcoreCastDeviceImpl[i];
    }
}
