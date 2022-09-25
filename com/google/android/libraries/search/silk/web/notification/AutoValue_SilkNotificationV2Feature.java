package com.google.android.libraries.search.silk.web.notification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public final class AutoValue_SilkNotificationV2Feature extends C$AutoValue_SilkNotificationV2Feature {
    public static final Parcelable.Creator CREATOR = new C40838a();

    public AutoValue_SilkNotificationV2Feature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f107018a, i);
        parcel.writeParcelable(this.f107019b, i);
    }
}
