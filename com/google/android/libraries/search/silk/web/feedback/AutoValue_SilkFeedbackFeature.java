package com.google.android.libraries.search.silk.web.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public final class AutoValue_SilkFeedbackFeature extends C$AutoValue_SilkFeedbackFeature {
    public static final Parcelable.Creator CREATOR = new C40770a();

    public AutoValue_SilkFeedbackFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f106889a, i);
        parcel.writeParcelable(this.f106890b, i);
    }
}
