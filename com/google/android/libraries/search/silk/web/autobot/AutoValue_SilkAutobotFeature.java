package com.google.android.libraries.search.silk.web.autobot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public final class AutoValue_SilkAutobotFeature extends C$AutoValue_SilkAutobotFeature {
    public static final Parcelable.Creator CREATOR = new C40701a();

    public AutoValue_SilkAutobotFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f106753a, i);
        parcel.writeParcelable(this.f106754b, i);
    }
}
