package com.google.android.libraries.search.silk.web.panes;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public final class AutoValue_SilkPanesFeature extends C$AutoValue_SilkPanesFeature {
    public static final Parcelable.Creator CREATOR = new C40857a();

    public AutoValue_SilkPanesFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f107049a, i);
        parcel.writeParcelable(this.f107050b, i);
    }
}
