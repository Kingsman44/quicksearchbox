package com.google.android.libraries.search.silk.web.channels;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public final class AutoValue_SilkChannelsFeature extends C$AutoValue_SilkChannelsFeature {
    public static final Parcelable.Creator CREATOR = new C40713a();

    public AutoValue_SilkChannelsFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f106782a, i);
        parcel.writeParcelable(this.f106783b, i);
    }
}
