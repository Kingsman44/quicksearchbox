package com.google.android.libraries.search.silk.web.xblendcontainer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public final class AutoValue_SilkXblendContainerFeature extends C$AutoValue_SilkXblendContainerFeature {
    public static final Parcelable.Creator CREATOR = new C41372a();

    public AutoValue_SilkXblendContainerFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f108102a, i);
        parcel.writeParcelable(this.f108103b, i);
    }
}
