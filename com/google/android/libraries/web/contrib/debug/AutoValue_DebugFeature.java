package com.google.android.libraries.web.contrib.debug;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
final class AutoValue_DebugFeature extends C$AutoValue_DebugFeature {
    public static final Parcelable.Creator CREATOR = new C43470b();

    public AutoValue_DebugFeature(C43474f fVar, boolean z, int i) {
        super(fVar, z, i);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f113552a.name());
        parcel.writeInt(this.f113553b ? 1 : 0);
        parcel.writeInt(this.f113554c);
    }
}
