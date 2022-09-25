package com.google.android.apps.gsa.shared.logger.latency;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.shared.logger.latency.a */
/* compiled from: PG */
final class C89944a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new LatencyEvents(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LatencyEvents[i];
    }
}
