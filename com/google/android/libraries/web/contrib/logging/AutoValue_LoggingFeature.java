package com.google.android.libraries.web.contrib.logging;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* compiled from: PG */
final class AutoValue_LoggingFeature extends C$AutoValue_LoggingFeature {
    public static final Parcelable.Creator CREATOR = new C43707j();

    public AutoValue_LoggingFeature(WebFeatureConfig webFeatureConfig) {
        super(webFeatureConfig);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f113997a, i);
    }
}
