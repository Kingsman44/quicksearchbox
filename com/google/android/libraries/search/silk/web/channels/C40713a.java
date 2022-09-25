package com.google.android.libraries.search.silk.web.channels;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.channels.a */
/* compiled from: PG */
final class C40713a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_SilkChannelsFeature((WebFeatureConfig) parcel.readParcelable(SilkChannelsFeature.class.getClassLoader()), (ProtoParsers.ParcelableProto) parcel.readParcelable(SilkChannelsFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_SilkChannelsFeature[i];
    }
}
