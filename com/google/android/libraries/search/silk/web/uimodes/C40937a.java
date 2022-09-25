package com.google.android.libraries.search.silk.web.uimodes;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.uimodes.a */
/* compiled from: PG */
final class C40937a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_SilkUiModesFeature((WebFeatureConfig) parcel.readParcelable(SilkUiModesFeature.class.getClassLoader()), (ProtoParsers.ParcelableProto) parcel.readParcelable(SilkUiModesFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_SilkUiModesFeature[i];
    }
}
