package com.google.android.libraries.web.webview.contrib.setup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* compiled from: PG */
final class AutoValue_WebViewSetupFeature extends C$AutoValue_WebViewSetupFeature {
    public static final Parcelable.Creator CREATOR = new C44382a();

    public AutoValue_WebViewSetupFeature(WebFeatureConfig webFeatureConfig) {
        super(webFeatureConfig);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f115389a, i);
    }
}
