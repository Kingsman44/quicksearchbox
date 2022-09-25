package com.google.android.libraries.search.silk.web.download;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
final class AutoValue_SilkDownloadFeature extends C$AutoValue_SilkDownloadFeature {
    public static final Parcelable.Creator CREATOR = new C40761a();

    public AutoValue_SilkDownloadFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f106865a, i);
        parcel.writeParcelable(this.f106866b, i);
    }
}
