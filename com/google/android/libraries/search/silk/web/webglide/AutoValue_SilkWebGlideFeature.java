package com.google.android.libraries.search.silk.web.webglide;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public final class AutoValue_SilkWebGlideFeature extends C$AutoValue_SilkWebGlideFeature {
    public static final Parcelable.Creator CREATOR = new C41354a();

    public AutoValue_SilkWebGlideFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f108074a, i);
        parcel.writeParcelable(this.f108075b, i);
    }
}
