package com.google.android.libraries.search.silk.web.close;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.close.a */
/* compiled from: PG */
final class C40725a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_SilkCloseFeature((WebFeatureConfig) parcel.readParcelable(SilkCloseFeature.class.getClassLoader()), (ProtoParsers.ParcelableProto) parcel.readParcelable(SilkCloseFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_SilkCloseFeature[i];
    }
}
