package com.google.android.libraries.search.silk.web.uimodes;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
final class AutoValue_SilkUiModesFeature extends C$AutoValue_SilkUiModesFeature {
    public static final Parcelable.Creator CREATOR = new C40937a();

    public AutoValue_SilkUiModesFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f107206a, i);
        parcel.writeParcelable(this.f107207b, i);
    }
}
