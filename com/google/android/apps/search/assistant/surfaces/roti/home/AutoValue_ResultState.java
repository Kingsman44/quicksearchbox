package com.google.android.apps.search.assistant.surfaces.roti.home;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
final class AutoValue_ResultState extends C$AutoValue_ResultState {
    public static final Parcelable.Creator CREATOR = new C126789b();

    public AutoValue_ResultState(Intent intent, Intent intent2, String str) {
        super(intent, intent2, str);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f349083a, i);
        parcel.writeParcelable(this.f349084b, i);
        parcel.writeString(this.f349085c);
    }
}
