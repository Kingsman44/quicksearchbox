package com.google.android.setupcompat.logging;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.setupcompat.logging.a */
/* compiled from: PG */
final class C45270a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new CustomEvent(parcel.readLong(), (MetricKey) parcel.readParcelable(MetricKey.class.getClassLoader()), parcel.readPersistableBundle(MetricKey.class.getClassLoader()), parcel.readPersistableBundle(MetricKey.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CustomEvent[i];
    }
}
