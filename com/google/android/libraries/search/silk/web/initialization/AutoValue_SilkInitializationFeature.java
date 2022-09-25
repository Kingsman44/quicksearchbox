package com.google.android.libraries.search.silk.web.initialization;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public final class AutoValue_SilkInitializationFeature extends C$AutoValue_SilkInitializationFeature {
    public static final Parcelable.Creator CREATOR = new C40806a();

    public AutoValue_SilkInitializationFeature(ProtoParsers.ParcelableProto parcelableProto, WebFeatureConfig webFeatureConfig) {
        super(parcelableProto, webFeatureConfig);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f106961a, i);
        parcel.writeParcelable(this.f106962b, i);
    }
}
