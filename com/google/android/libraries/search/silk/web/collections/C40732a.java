package com.google.android.libraries.search.silk.web.collections;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.collections.a */
/* compiled from: PG */
final class C40732a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_SilkCollectionsV2Feature((WebFeatureConfig) parcel.readParcelable(SilkCollectionsV2Feature.class.getClassLoader()), (ProtoParsers.ParcelableProto) parcel.readParcelable(SilkCollectionsV2Feature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_SilkCollectionsV2Feature[i];
    }
}
