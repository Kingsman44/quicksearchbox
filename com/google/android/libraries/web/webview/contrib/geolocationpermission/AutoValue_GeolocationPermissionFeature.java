package com.google.android.libraries.web.webview.contrib.geolocationpermission;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* compiled from: PG */
public final class AutoValue_GeolocationPermissionFeature extends C$AutoValue_GeolocationPermissionFeature {
    public static final Parcelable.Creator CREATOR = new C44368a();

    public AutoValue_GeolocationPermissionFeature(WebFeatureConfig webFeatureConfig) {
        super(webFeatureConfig);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f115357a, i);
    }
}
