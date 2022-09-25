package com.google.android.setupcompat.logging;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.setupcompat.logging.b */
/* compiled from: PG */
final class C45272b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MetricKey(parcel.readString(), parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MetricKey[i];
    }
}
