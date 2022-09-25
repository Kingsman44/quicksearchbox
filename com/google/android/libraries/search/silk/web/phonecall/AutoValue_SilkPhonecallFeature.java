package com.google.android.libraries.search.silk.web.phonecall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
final class AutoValue_SilkPhonecallFeature extends C$AutoValue_SilkPhonecallFeature {
    public static final Parcelable.Creator CREATOR = new C40875a();

    public AutoValue_SilkPhonecallFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f107080a, i);
        parcel.writeParcelable(this.f107081b, i);
    }
}
