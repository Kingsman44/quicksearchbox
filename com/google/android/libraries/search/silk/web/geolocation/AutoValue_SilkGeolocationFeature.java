package com.google.android.libraries.search.silk.web.geolocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
final class AutoValue_SilkGeolocationFeature extends C$AutoValue_SilkGeolocationFeature {
    public static final Parcelable.Creator CREATOR = new C40786a();

    public AutoValue_SilkGeolocationFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f106923a, i);
        parcel.writeParcelable(this.f106924b, i);
    }
}
