package com.google.android.libraries.search.silk.web.prewarmplay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public final class AutoValue_SilkPrewarmPlayFeature extends C$AutoValue_SilkPrewarmPlayFeature {
    public static final Parcelable.Creator CREATOR = new C40882a();

    public AutoValue_SilkPrewarmPlayFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f107095a, i);
        parcel.writeParcelable(this.f107096b, i);
    }
}
