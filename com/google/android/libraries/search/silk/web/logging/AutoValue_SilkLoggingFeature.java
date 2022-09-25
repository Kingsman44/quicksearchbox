package com.google.android.libraries.search.silk.web.logging;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public final class AutoValue_SilkLoggingFeature extends C$AutoValue_SilkLoggingFeature {
    public static final Parcelable.Creator CREATOR = new C40828a();

    public AutoValue_SilkLoggingFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f106999a, i);
        parcel.writeParcelable(this.f107000b, i);
    }
}
