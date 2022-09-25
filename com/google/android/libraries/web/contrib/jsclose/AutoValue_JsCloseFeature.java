package com.google.android.libraries.web.contrib.jsclose;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* compiled from: PG */
final class AutoValue_JsCloseFeature extends C$AutoValue_JsCloseFeature {
    public static final Parcelable.Creator CREATOR = new C43670b();

    public AutoValue_JsCloseFeature(WebFeatureConfig webFeatureConfig) {
        super(webFeatureConfig);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f113950a, i);
    }
}
