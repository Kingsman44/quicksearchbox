package com.google.android.libraries.search.silk.web.xblendcontainer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.xblendcontainer.a */
/* compiled from: PG */
final class C41372a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_SilkXblendContainerFeature((WebFeatureConfig) parcel.readParcelable(SilkXblendContainerFeature.class.getClassLoader()), (ProtoParsers.ParcelableProto) parcel.readParcelable(SilkXblendContainerFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_SilkXblendContainerFeature[i];
    }
}
