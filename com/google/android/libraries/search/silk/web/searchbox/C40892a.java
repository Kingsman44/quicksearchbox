package com.google.android.libraries.search.silk.web.searchbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.searchbox.a */
/* compiled from: PG */
final class C40892a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_SilkSearchboxFeature((WebFeatureConfig) parcel.readParcelable(SilkSearchboxFeature.class.getClassLoader()), (ProtoParsers.ParcelableProto) parcel.readParcelable(SilkSearchboxFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_SilkSearchboxFeature[i];
    }
}
