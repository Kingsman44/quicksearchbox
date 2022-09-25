package com.google.android.libraries.web.weblayer.contrib.footprints;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* compiled from: PG */
public final class AutoValue_FootprintsFeature extends C$AutoValue_FootprintsFeature {
    public static final Parcelable.Creator CREATOR = new C44204a();

    public AutoValue_FootprintsFeature(WebFeatureConfig webFeatureConfig) {
        super(webFeatureConfig);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f114983a, i);
    }
}
