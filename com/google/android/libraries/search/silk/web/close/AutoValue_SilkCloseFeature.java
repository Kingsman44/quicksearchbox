package com.google.android.libraries.search.silk.web.close;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
final class AutoValue_SilkCloseFeature extends C$AutoValue_SilkCloseFeature {
    public static final Parcelable.Creator CREATOR = new C40725a();

    public AutoValue_SilkCloseFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f106805a, i);
        parcel.writeParcelable(this.f106806b, i);
    }
}
