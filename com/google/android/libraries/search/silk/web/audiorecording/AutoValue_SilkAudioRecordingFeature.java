package com.google.android.libraries.search.silk.web.audiorecording;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public final class AutoValue_SilkAudioRecordingFeature extends C$AutoValue_SilkAudioRecordingFeature {
    public static final Parcelable.Creator CREATOR = new C40687a();

    public AutoValue_SilkAudioRecordingFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f106730a, i);
        parcel.writeParcelable(this.f106731b, i);
    }
}
