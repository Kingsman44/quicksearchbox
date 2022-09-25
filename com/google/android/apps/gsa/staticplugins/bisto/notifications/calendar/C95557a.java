package com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.a */
/* compiled from: PG */
final class C95557a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_AnnounceableEvent(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_AnnounceableEvent[i];
    }
}
