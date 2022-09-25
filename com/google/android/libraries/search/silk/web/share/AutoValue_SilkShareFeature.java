package com.google.android.libraries.search.silk.web.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
final class AutoValue_SilkShareFeature extends C$AutoValue_SilkShareFeature {
    public static final Parcelable.Creator CREATOR = new C40905a();

    public AutoValue_SilkShareFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f107145a, i);
        parcel.writeParcelable(this.f107146b, i);
    }
}
