package com.google.android.libraries.search.silk.web.footprintsconsent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public final class AutoValue_SilkFootprintsConsentFeature extends C$AutoValue_SilkFootprintsConsentFeature {
    public static final Parcelable.Creator CREATOR = new C40776a();

    public AutoValue_SilkFootprintsConsentFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f106904a, i);
        parcel.writeParcelable(this.f106905b, i);
    }
}
