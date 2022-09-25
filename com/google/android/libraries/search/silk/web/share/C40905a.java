package com.google.android.libraries.search.silk.web.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.share.a */
/* compiled from: PG */
final class C40905a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_SilkShareFeature((WebFeatureConfig) parcel.readParcelable(SilkShareFeature.class.getClassLoader()), (ProtoParsers.ParcelableProto) parcel.readParcelable(SilkShareFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_SilkShareFeature[i];
    }
}
