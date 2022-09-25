package com.google.android.libraries.search.silk.web.webglide;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.webglide.a */
/* compiled from: PG */
final class C41354a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_SilkWebGlideFeature((WebFeatureConfig) parcel.readParcelable(SilkWebGlideFeature.class.getClassLoader()), (ProtoParsers.ParcelableProto) parcel.readParcelable(SilkWebGlideFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_SilkWebGlideFeature[i];
    }
}
