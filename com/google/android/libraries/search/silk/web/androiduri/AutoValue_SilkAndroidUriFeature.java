package com.google.android.libraries.search.silk.web.androiduri;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
final class AutoValue_SilkAndroidUriFeature extends C$AutoValue_SilkAndroidUriFeature {
    public static final Parcelable.Creator CREATOR = new C40670a();

    public AutoValue_SilkAndroidUriFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f106703a, i);
        parcel.writeParcelable(this.f106704b, i);
    }
}
