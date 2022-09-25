package com.google.android.libraries.search.silk.web.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public final class AutoValue_SilkSettingsFeature extends C$AutoValue_SilkSettingsFeature {
    public static final Parcelable.Creator CREATOR = new C40899a();

    public AutoValue_SilkSettingsFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f107130a, i);
        parcel.writeParcelable(this.f107131b, i);
    }
}
