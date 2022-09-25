package com.google.android.libraries.search.silk.web.collections;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
final class AutoValue_SilkCollectionsV2Feature extends C$AutoValue_SilkCollectionsV2Feature {
    public static final Parcelable.Creator CREATOR = new C40732a();

    public AutoValue_SilkCollectionsV2Feature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f106820a, i);
        parcel.writeParcelable(this.f106821b, i);
    }
}
