package com.google.android.libraries.search.silk.web.amp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
final class AutoValue_SilkAmpFeature extends C$AutoValue_SilkAmpFeature {
    public static final Parcelable.Creator CREATOR = new C40660a();

    public AutoValue_SilkAmpFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f106684a, i);
        parcel.writeParcelable(this.f106685b, i);
    }
}
