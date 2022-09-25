package com.google.android.libraries.web.contrib.googlesignin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* compiled from: PG */
final class AutoValue_GoogleSignInFeature extends C$AutoValue_GoogleSignInFeature {
    public static final Parcelable.Creator CREATOR = new C43584b();

    public AutoValue_GoogleSignInFeature(WebFeatureConfig webFeatureConfig, int i) {
        super(webFeatureConfig, i);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f113772a, i);
        parcel.writeString(C43587e.m76931a(this.f113773b));
    }
}
