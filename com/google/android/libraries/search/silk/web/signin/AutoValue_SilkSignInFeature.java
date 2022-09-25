package com.google.android.libraries.search.silk.web.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public final class AutoValue_SilkSignInFeature extends C$AutoValue_SilkSignInFeature {
    public static final Parcelable.Creator CREATOR = new C40923a();

    public AutoValue_SilkSignInFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f107175a, i);
        parcel.writeParcelable(this.f107176b, i);
    }
}
