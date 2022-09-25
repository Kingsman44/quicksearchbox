package com.google.android.libraries.search.silk.web.lens;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public final class AutoValue_SilkLensFeature extends C$AutoValue_SilkLensFeature {
    public static final Parcelable.Creator CREATOR = new C40818a();

    public AutoValue_SilkLensFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f106980a, i);
        parcel.writeParcelable(this.f106981b, i);
    }
}
