package com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
final class AutoValue_AnnounceableEvent extends C$AutoValue_AnnounceableEvent {
    public static final Parcelable.Creator CREATOR = new C95557a();

    public AutoValue_AnnounceableEvent(long j, long j2, String str, String str2, String str3, long j3) {
        super(j, j2, str, str2, str3, j3);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f267422a);
        parcel.writeLong(this.f267423b);
        parcel.writeString(this.f267424c);
        parcel.writeString(this.f267425d);
        parcel.writeString(this.f267426e);
        parcel.writeLong(this.f267427f);
    }
}
