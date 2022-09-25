package com.google.android.libraries.web.webview.contrib.geolocationpermission;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* renamed from: com.google.android.libraries.web.webview.contrib.geolocationpermission.a */
/* compiled from: PG */
final class C44368a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_GeolocationPermissionFeature((WebFeatureConfig) parcel.readParcelable(GeolocationPermissionFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_GeolocationPermissionFeature[i];
    }
}
