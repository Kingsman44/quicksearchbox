package com.google.android.libraries.web.contrib.contextmenu;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* compiled from: PG */
public final class AutoValue_ContextMenuFeature extends C$AutoValue_ContextMenuFeature {
    public static final Parcelable.Creator CREATOR = new C43413a();

    public AutoValue_ContextMenuFeature(WebFeatureConfig webFeatureConfig) {
        super(webFeatureConfig);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f113420a, i);
    }
}
