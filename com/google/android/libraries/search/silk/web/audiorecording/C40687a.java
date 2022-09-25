package com.google.android.libraries.search.silk.web.audiorecording;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.audiorecording.a */
/* compiled from: PG */
final class C40687a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_SilkAudioRecordingFeature((WebFeatureConfig) parcel.readParcelable(SilkAudioRecordingFeature.class.getClassLoader()), (ProtoParsers.ParcelableProto) parcel.readParcelable(SilkAudioRecordingFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_SilkAudioRecordingFeature[i];
    }
}
