package com.google.android.libraries.search.silk.web.timestamp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public final class AutoValue_SilkTimestampFeature extends C$AutoValue_SilkTimestampFeature {
    public static final Parcelable.Creator CREATOR = new C40931a();

    public AutoValue_SilkTimestampFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f107191a, i);
        parcel.writeParcelable(this.f107192b, i);
    }
}
